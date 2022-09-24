package io.github.pgabrieldev.adjafebd.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Aula {
    
    @Id
    private String id;
    private String nome;
    private String assunto;
    private Date data;
    private Classe classe;

}
