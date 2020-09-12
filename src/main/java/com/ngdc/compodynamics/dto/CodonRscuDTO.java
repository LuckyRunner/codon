package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class CodonRscuDTO {
    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//

    private Double cdcStart;//
    private Double cdcEnd;//
    private Double encStart;//
    private Double encEnd;//
}
