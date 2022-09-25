package io.github.pgabrieldev.adjafebd.dtos;

import lombok.Data;

@Data
public class AlunoPresencaRequest {
    private String id;
    private AlunoRequest aluno;
    private AulaRequest aula;
    private Boolean presenca;
}
