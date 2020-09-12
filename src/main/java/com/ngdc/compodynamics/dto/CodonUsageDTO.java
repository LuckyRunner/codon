package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class CodonUsageDTO {
    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//
}
