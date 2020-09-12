package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class GeneInfoDTO {
    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//
    private String geneName;//
    private String proteinName;//
    private String lowQuality;//
}
