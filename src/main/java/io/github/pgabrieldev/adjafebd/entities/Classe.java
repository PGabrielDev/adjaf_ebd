package io.github.pgabrieldev.adjafebd.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Classe {
    
    @Id
    private String id;
    private String nome;


    public Classe(String nome) {
        this.nome = nome;
    }

    


}
