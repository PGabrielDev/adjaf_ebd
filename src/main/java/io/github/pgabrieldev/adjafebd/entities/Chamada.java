package io.github.pgabrieldev.adjafebd.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Chamada {

    @Id
    private String id;
    private List<AlunoPresenca> AlunoPresenca;
    private Date dataChamada;




    public Chamada(List<AlunoPresenca> AlunoPresenca, Date dataChamada) {
        this.AlunoPresenca = AlunoPresenca;
        this.dataChamada = dataChamada;
    }


    
}
