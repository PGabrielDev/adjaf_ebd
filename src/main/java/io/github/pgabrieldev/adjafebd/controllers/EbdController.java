package io.github.pgabrieldev.adjafebd.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.pgabrieldev.adjafebd.dtos.AlunoRequest;
import io.github.pgabrieldev.adjafebd.dtos.AulaRequest;
import io.github.pgabrieldev.adjafebd.dtos.ChamadaRequest;
import io.github.pgabrieldev.adjafebd.dtos.ClasseRequest;
import io.github.pgabrieldev.adjafebd.dtos.utils.HelpersDTO;
import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.Aula;
import io.github.pgabrieldev.adjafebd.entities.Chamada;
import io.github.pgabrieldev.adjafebd.entities.Classe;
import io.github.pgabrieldev.adjafebd.services.facade.EbdFacade;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/aluno")
    public Flux<Aluno> findAllAlunos() {
        return service.findAllAluno();
    }

    @PostMapping("/aula")
    public Mono<Aula> saveAula(@RequestBody AulaRequest request) {
        return service.saveAula(HelpersDTO.aulaRequestToAulaEntity(request));
    }

    @PostMapping("/chamada")
    public Mono<Chamada> saveChamada(@RequestBody ChamadaRequest request){
        return service.saveChamada(HelpersDTO.chamadaRequestToChamadaEntity(request));
    }

    
    

}
