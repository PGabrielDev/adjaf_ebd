package io.github.pgabrieldev.adjafebd.services;

import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AlunoPresencaService {
    Mono<AlunoPresenca> save(AlunoPresenca alunoPresenca);

    Mono<AlunoPresenca> findAlunoPresencaById(String id);

    Flux<AlunoPresenca> findAllAlunoPresenca();

    Mono<Void> delete(AlunoPresenca alunoPresenca);    
}
