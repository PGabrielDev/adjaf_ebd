package io.github.pgabrieldev.adjafebd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;
import io.github.pgabrieldev.adjafebd.entities.Aula;
import io.github.pgabrieldev.adjafebd.entities.Chamada;
import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.repository.AlunoPresencaRepository;
import io.github.pgabrieldev.adjafebd.repository.AlunoRepository;
import io.github.pgabrieldev.adjafebd.repository.AulaRepository;
import io.github.pgabrieldev.adjafebd.repository.ChamadaRepository;
import io.github.pgabrieldev.adjafebd.repository.ClasseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class AdjafebdApplication implements CommandLineRunner {

	private final AlunoPresencaRepository alunoPresencaRepository;
	private final AulaRepository aulaRepository;
	private final ClasseRepository classeRepository;
	private final AlunoRepository alunoRepository;
	private final ChamadaRepository chamadaRepository;
	private final ReactiveMongoTemplate mongoTemplate;


	public static void main(String[] args) {
		SpringApplication.run(AdjafebdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mongoTemplate.dropCollection("chamada");
		mongoTemplate.dropCollection("alunoPresenca");
		mongoTemplate.dropCollection("aula");
		mongoTemplate.dropCollection("aluno");
		mongoTemplate.dropCollection("classe");

		log.info("iniciando app");
		
		Classe jovens = new Classe("Jovens");
		Classe senhores = new Classe("Senhores");
		Classe senhoras = new Classe("Senhoras");

		Aluno gabriel =  new Aluno("Gabriel",22, jovens);
		Aluno socorro = new Aluno("Socorro",59, senhoras);
		Aluno francisco = new Aluno("Francisco",59, senhores);

		Aula aulaSansao = new Aula("Aula ebd", "Como surgio Sansão", new Date(), jovens);
		Aula aulaElias = new Aula("Aula ebd", "Como surgio Sansão", new Date(), senhores);
		Aula aulaElias3 = new Aula("Aula ebd", "elias", new Date(), jovens);
		Aula aulaElias2 = new Aula("Aula ebd", "Como surgio Sansão", new Date(), senhoras);

		Flux.just(
				jovens,
				senhoras,
				senhores
			 ).flatMap(classeRepository::save)
			 .doOnNext(c -> log.info("classe dos(a) " + c.getNome() + " cadastrada com sucesso !"))
			 .thenMany(
				Flux.just(
						gabriel,
						socorro,
						francisco
					).flatMap(alunoRepository::save)
					.doOnNext(a -> log.info("Aluno dos(a) " + a.getNome() + " cadastrado com sucesso !"))
			  ).thenMany(
				Flux.just(aulaElias,aulaSansao,aulaElias2,aulaElias3).flatMap(aulaRepository::save)
				.doOnNext(c -> log.info("Aula de assunto " + c.getAssunto() + " cadastrada com sucesso !"))
				.flatMap( a -> { 
					if( a.getAssunto().equalsIgnoreCase("elias")){
						var alunoGabriel  = new AlunoPresenca(gabriel,a, true);
						return alunoPresencaRepository.save(alunoGabriel);
					}
					var alunoGabriel  = new AlunoPresenca(gabriel,a, false);
						return alunoPresencaRepository.save(alunoGabriel);
				})
				).flatMap(p -> {
					List<AlunoPresenca> listadePresenca = new ArrayList<AlunoPresenca>();
					var lista = alunoPresencaRepository.findAll();
					lista.subscribe(l -> {
 						listadePresenca.add(l);
					});
					return chamadaRepository.save(new Chamada(listadePresenca, new Date()));
				})
			  .subscribe();
		
	}

}
