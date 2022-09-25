package io.github.pgabrieldev.adjafebd.services.facade;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import io.github.pgabrieldev.adjafebd.entities.*;


public interface EbdFacade {

    Mono<Classe> saveClasse(Classe classe);

    Mono<Classe> findClasseById(String id);

    Flux<Classe> findAllClasses();

    Mono<Void> deleteClasse(Classe classe);

    Mono<Aluno> saveAluno(Aluno aluno);

    Mono<Aluno> findAlunoById(String id);

    Flux<Aluno> findAllAluno();

    Mono<Void> deleteAluno(Aluno aluno);

    Mono<Aula> saveAula(Aula aula);

    Mono<Aula> findAulaById(String id);

    Flux<Aula> findAllAula();

    Mono<Void> deleteAula(Aula aula);

    Mono<AlunoPresenca> saveAlunoPresenca(AlunoPresenca alunoPresenca);

    Mono<AlunoPresenca> findAlunoPresencaById(String id);

    Flux<AlunoPresenca> findAllAlunoPresenca();

    Mono<Void> deleteAlunoPresenca(AlunoPresenca alunoPresenca);

    Mono<Chamada> saveChamada(Chamada chamada);

    Mono<Chamada> findChamadaById(String id);

    Flux<Chamada> findAllChamada();

    Mono<Void> deleteChamada(Chamada chamada);

    
}
