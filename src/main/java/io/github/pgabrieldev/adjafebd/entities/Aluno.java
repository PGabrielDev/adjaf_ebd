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
public class Aluno {

    @Id
    private String id;
    private String nome;
    private Integer idade;
    private Classe classe;


    public Aluno(String nome, Integer idade, Classe classe) {
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;
    }


}
