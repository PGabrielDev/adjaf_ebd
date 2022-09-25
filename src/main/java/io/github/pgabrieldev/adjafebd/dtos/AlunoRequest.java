package io.github.pgabrieldev.adjafebd.dtos;

import lombok.Data;

@Data
public class AlunoRequest {

    private String nome;
    private Integer idade;
    private ClasseRequest classe;

    
}
