package io.github.pgabrieldev.adjafebd.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Chamada {

    private String id;
    private List<AlunoPresenca> AlunoPresenca;
    private Date dataChamada;
    
}
