package io.github.pgabrieldev.adjafebd.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.repository.AlunoRepository;
import io.github.pgabrieldev.adjafebd.repository.ClasseRepository;
import io.github.pgabrieldev.adjafebd.services.AlunoService;
import io.github.pgabrieldev.adjafebd.services.ClasseService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    @Override
    public Mono<Aluno> save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Mono<Void> delete(Aluno aluno) {
        return alunoRepository.delete(aluno);
    }

    @Override
    public Mono<Aluno> findAlunoById(String id) {
        return alunoRepository.findById(id);
    }

    @Override
    public Flux<Aluno> findAllAluno() {
        return alunoRepository.findAll();
    }
    
}
