package io.github.pgabrieldev.adjafebd.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class AlunoPresenca  {
    
    @Id
    private String id;
    private Aluno aluno;
    private Boolean presenca;

}
