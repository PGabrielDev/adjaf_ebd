package io.github.pgabrieldev.adjafebd.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.Chamada;
import io.github.pgabrieldev.adjafebd.repository.ChamadaRepository;
import io.github.pgabrieldev.adjafebd.services.ChamadaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ChamadaServiceImpl implements  ChamadaService {

    private final ChamadaRepository chamadaRepository;

    @Override
    public Mono<Chamada> save(Chamada chamada) {
        return chamadaRepository.save(chamada);
    }

    @Override
    public Mono<Chamada> findChamadaById(String id) {
        return chamadaRepository.findById(id);
    }

    @Override
    public Flux<Chamada> findAllChamada() {
        return chamadaRepository.findAll();
    }

    @Override
    public Mono<Void> delete(Chamada chamada) {
        return chamadaRepository.delete(chamada);
    }
    
}
