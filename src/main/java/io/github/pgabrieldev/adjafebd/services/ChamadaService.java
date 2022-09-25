package io.github.pgabrieldev.adjafebd.services;

import io.github.pgabrieldev.adjafebd.entities.Chamada;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ChamadaService {

    Mono<Chamada> save(Chamada chamada);

    Mono<Chamada> findChamadaById(String id);

    Flux<Chamada> findAllChamada();

    Mono<Void> delete(Chamada chamada);
        
}
