package io.github.pgabrieldev.adjafebd.dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ChamadaRequest {
    
    private List<AlunoPresencaRequest> alunoPresenca = new ArrayList<>();
    private Date dataChamada;
    private AulaRequest aula;

}
