package io.github.pgabrieldev.adjafebd.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;
import io.github.pgabrieldev.adjafebd.repository.AlunoPresencaRepository;
import io.github.pgabrieldev.adjafebd.services.AlunoPresencaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AlunoPresecaServiceImpl implements AlunoPresencaService {

    private final AlunoPresencaRepository alunoPresencaRepository;

    @Override
    public Mono<AlunoPresenca> save(AlunoPresenca alunoPresenca) {
        return alunoPresencaRepository.save(alunoPresenca);
    }

    @Override
    public Mono<AlunoPresenca> findAlunoPresencaById(String id) {
        return alunoPresencaRepository.findById(id);
    }

    @Override
    public Flux<AlunoPresenca> findAllAlunoPresenca() {
        return alunoPresencaRepository.findAll();
    }
    
    @Override
    public Mono<Void> delete(AlunoPresenca alunoPresenca) {
        return alunoPresencaRepository.delete(alunoPresenca);
    }
    
}
