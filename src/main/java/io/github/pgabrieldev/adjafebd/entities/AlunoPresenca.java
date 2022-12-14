package io.github.pgabrieldev.adjafebd.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class AlunoPresenca  {
    
    @Id
    private String id;
    private Aluno aluno;
    private Boolean presenca;


    public AlunoPresenca(Aluno aluno, Boolean presenca) {
        this.aluno = aluno;
        this.presenca = presenca;
    }


}
