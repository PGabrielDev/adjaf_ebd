package io.github.pgabrieldev.adjafebd.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class AulaRequest {
    
    private String id;
    private String nome;
    private String assunto;
    private Date data;
    private ClasseRequest classe;
    
}
