package io.github.pgabrieldev.adjafebd.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Aula {
    
    @Id
    private String id;
    private String nome;
    private String assunto;
    private Date data;
    private Classe classe;

    public Aula(String nome, String assunto, Date data, Classe classe) {
        this.nome = nome;
        this.assunto = assunto;
        this.data = data;
        this.classe = classe;
    }



}
