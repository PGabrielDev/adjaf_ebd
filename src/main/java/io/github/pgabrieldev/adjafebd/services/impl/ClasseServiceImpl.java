package io.github.pgabrieldev.adjafebd.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.repository.ClasseRepository;
import io.github.pgabrieldev.adjafebd.services.ClasseService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClasseServiceImpl implements ClasseService {

    private final ClasseRepository classeRepository;

    @Override
    public Mono<Classe> save(Classe classe) {
        return classeRepository.save(classe);
    }

    @Override
    public Mono<Classe> findClasseById(String id) {
        return classeRepository.findById(id);
    }

    @Override
    public Flux<Classe> findAllClasses() {
        return classeRepository.findAll();
    }

    @Override
    public Mono<Void> delete(Classe classe) {
        return classeRepository.delete(classe);
    }
    
}
