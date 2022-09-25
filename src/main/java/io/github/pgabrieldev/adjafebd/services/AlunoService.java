package io.github.pgabrieldev.adjafebd.services;

import io.github.pgabrieldev.adjafebd.entities.Aluno;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AlunoService {
    Mono<Aluno> save(Aluno aluno);

    Mono<Aluno> findAlunoById(String id);

    Flux<Aluno> findAllAluno();

    Mono<Void> delete(Aluno aluno);
}
