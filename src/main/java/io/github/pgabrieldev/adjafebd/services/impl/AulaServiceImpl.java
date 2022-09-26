package io.github.pgabrieldev.adjafebd.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.Aula;
import io.github.pgabrieldev.adjafebd.repository.AulaRepository;
import io.github.pgabrieldev.adjafebd.services.AulaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AulaServiceImpl implements AulaService {
    
    private final AulaRepository aulaRepository;

    @Override
    public Mono<Aula> save(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public Mono<Aula> findAulaById(String id) {
        return aulaRepository.findById(id);
    }

    @Override
    public Flux<Aula> findAllAula() {
        return aulaRepository.findAll();
    }

    @Override
    public Mono<Void> delete(Aula aula) {
        return aulaRepository.delete(aula);
    }
    

    


}
