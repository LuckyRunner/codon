package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class CodingProDTO {
    private String taxonomy;
    private String organism;
    private String assemblyAccession;
    private String geneId;
    private String proteinId;

    private String cpcLabel;
    private String lgcLabel;

    private Double cpcPStart;
    private Double cpcPEnd;
    private Double lgcPStart;
    private Double lgcPEnd;

    private Double fickettStart;
    private Double fickettEnd;
    private Double cpcProStart;
    private Double cpcProEnd;
    private Double lgcProStart;
    private Double lgcProEnd;
    private Double codingInBothStart;
    private Double codingInBothEnd;
}
