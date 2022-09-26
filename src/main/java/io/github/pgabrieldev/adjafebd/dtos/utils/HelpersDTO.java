package io.github.pgabrieldev.adjafebd.dtos.utils;

import java.util.stream.Collectors;

import io.github.pgabrieldev.adjafebd.dtos.AlunoPresencaRequest;
import io.github.pgabrieldev.adjafebd.dtos.AlunoRequest;
import io.github.pgabrieldev.adjafebd.dtos.AulaRequest;
import io.github.pgabrieldev.adjafebd.dtos.ChamadaRequest;
import io.github.pgabrieldev.adjafebd.dtos.ClasseRequest;
import io.github.pgabrieldev.adjafebd.entities.Aluno;
import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;
import io.github.pgabrieldev.adjafebd.entities.Aula;
import io.github.pgabrieldev.adjafebd.entities.Chamada;
import io.github.pgabrieldev.adjafebd.entities.Classe;

public class HelpersDTO {
    

    public static Classe classeRequestToClasseEntity(ClasseRequest request){
        return new Classe(request.getId(),request.getNome());
    }

    public static Aluno alunoRequestToAlunoEntity(AlunoRequest request){
        return new Aluno(
                request.getId(),
                request.getNome(),
                request.getIdade(), 
                classeRequestToClasseEntity(request.getClasse())
            );
    }

    public static Aula aulaRequestToAulaEntity(AulaRequest request){
        return new Aula(
                request.getId(),
                request.getNome(), 
                request.getAssunto(),
                request.getData(),
                classeRequestToClasseEntity(request.getClasse())
            );
    }

    public static AlunoPresenca alunoPresencaRequestToAulonoPresencaEnity(AlunoPresencaRequest request){
        return new AlunoPresenca(
                request.getId(),
                alunoRequestToAlunoEntity(request.getAluno()),
                request.getPresenca()
            );
    }

    public static Chamada chamadaRequestToChamadaEntity(ChamadaRequest request){
        var list = request.getAlunoPresenca()
            .stream()
            .map(ap -> new AlunoPresenca(alunoRequestToAlunoEntity(ap.getAluno()),  ap.getPresenca())).collect(Collectors.toList());
        return new Chamada(list, request.getDataChamada(), aulaRequestToAulaEntity(request.getAula()));
    }
}
