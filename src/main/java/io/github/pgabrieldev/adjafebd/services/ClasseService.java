package io.github.pgabrieldev.adjafebd.services;


import io.github.pgabrieldev.adjafebd.entities.Classe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ClasseService {

    Mono<Classe> save(Classe classe);

    Mono<Classe> findClasseById(String id);

    Flux<Classe> findAllClasses();

    Mono<Void> delete(Classe classe);
    
}
