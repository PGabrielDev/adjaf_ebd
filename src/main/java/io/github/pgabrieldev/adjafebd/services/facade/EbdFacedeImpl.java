package io.github.pgabrieldev.adjafebd.services.facade;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;
import io.github.pgabrieldev.adjafebd.entities.Aula;
import io.github.pgabrieldev.adjafebd.entities.Chamada;
import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.services.AlunoPresencaService;
import io.github.pgabrieldev.adjafebd.services.AlunoService;
import io.github.pgabrieldev.adjafebd.services.AulaService;
import io.github.pgabrieldev.adjafebd.services.ChamadaService;
import io.github.pgabrieldev.adjafebd.services.ClasseService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EbdFacedeImpl implements EbdFacade {

    private final ClasseService classeService;
    private final AulaService aulaService;
    private final AlunoService alunoService;
    private final AlunoPresencaService alunoPresencaService;
    private final ChamadaService chamadaService;

    @Override
    public Mono<Classe> saveClasse(Classe classe) {
        return classeService.save(classe);
    }
    @Override
    public Mono<Classe> findClasseById(String id) {
        return classeService.findClasseById(id);
    }
    @Override
    public Flux<Classe> findAllClasses() {
        return classeService.findAllClasses();
    }
    @Override
    public Mono<Void> deleteClasse(Classe classe) {
        return classeService.delete(classe);
    }
    @Override
    public Mono<Aluno> saveAluno(Aluno aluno) {
        return alunoService.save(aluno);
    }
    @Override
    public Mono<Aluno> findAlunoById(String id) {
        return alunoService.findAlunoById(id);
    }
    @Override
    public Flux<Aluno> findAllAluno() {
        return alunoService.findAllAluno();
    }
    @Override
    public Mono<Void> deleteAluno(Aluno aluno) {
        return alunoService.delete(aluno);
    }
    @Override
    public Mono<Aula> saveAula(Aula aula) {
        return aulaService.save(aula);
    }
    @Override
    public Mono<Aula> findAulaById(String id) {
        return aulaService.findAulaById(id);
    }
    @Override
    public Flux<Aula> findAllAula() {
        return aulaService.findAllAula();
    }
    @Override
    public Mono<Void> deleteAula(Aula aula) {
        return aulaService.delete(aula);
    }
    @Override
    public Mono<AlunoPresenca> saveAlunoPresenca(AlunoPresenca alunoPresenca) {
        return alunoPresencaService.save(alunoPresenca);
    }
    @Override
    public Mono<AlunoPresenca> findAlunoPresencaById(String id) {
        return alunoPresencaService.findAlunoPresencaById(id);
    }
    @Override
    public Flux<AlunoPresenca> findAllAlunoPresenca() {
        return alunoPresencaService.findAllAlunoPresenca();
    }
    @Override
    public Mono<Void> deleteAlunoPresenca(AlunoPresenca alunoPresenca) {
        return alunoPresencaService.delete(alunoPresenca);
    }
    @Override
    public Mono<Chamada> saveChamada(Chamada chamada) {
        return chamadaService.save(chamada);
    }
    @Override
    public Mono<Chamada> findChamadaById(String id) {
        return chamadaService.findChamadaById(id);
    }
    @Override
    public Flux<Chamada> findAllChamada() {
        return chamadaService.findAllChamada();
    }
    @Override
    public Mono<Void> deleteChamada(Chamada chamada) {
        return chamadaService.delete(chamada);
    }

    
    
    
}
