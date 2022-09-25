package io.github.pgabrieldev.adjafebd.dtos;

import lombok.Data;

@Data
public class AlunoRequest {
    private String id;
    private String nome;
    private Integer idade;
    private ClasseRequest classe;

    
}
