package io.github.pgabrieldev.adjafebd.services;

import io.github.pgabrieldev.adjafebd.entities.Aula;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AulaService {

    Mono<Aula> save(Aula aula);

    Mono<Aula> findAulaById(String id);

    Flux<Aula> findAllAula();

    Mono<Void> delete(Aula aula);
    
}
