package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class NucleotideCopSynoDTO {
    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//

    private Double t3sStart;
    private Double t3sEnd;
    private Double c3sStart;
    private Double c3sEnd;
    private Double a3sStart;
    private Double a3sEnd;
    private Double g3sStart;
    private Double g3sEnd;
    private Double gc3sStart;
    private Double gc3sEnd;
}
