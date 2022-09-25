package io.github.pgabrieldev.adjafebd.dtos;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ChamadaRequest {
    
    private List<AlunoPresencaRequest> AlunoPresenca;
    private Date dataChamada;

}
