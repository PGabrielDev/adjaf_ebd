package io.github.pgabrieldev.adjafebd.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.pgabrieldev.adjafebd.dtos.AlunoRequest;
import io.github.pgabrieldev.adjafebd.dtos.ClasseRequest;
import io.github.pgabrieldev.adjafebd.dtos.utils.HelpersDTO;
import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.services.facade.EbdFacade;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

@RequestMapping("adjafebd/v1/ebd")
@RequiredArgsConstructor
public class EbdController {
    

    private final EbdFacade service;

    @PostMapping("/classe")
    public Mono<Classe> saveClasse(@RequestBody ClasseRequest request) {
        return service.saveClasse(HelpersDTO.classeRequestToClasseEntity(request));
    }
    @PostMapping("/aluno")
    public Mono<Aluno> saveAluno(@RequestBody AlunoRequest request) {
        return service.saveAluno(HelpersDTO.alunoRequestToAlunoEntity(request));
    }
    

}
