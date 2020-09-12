package com.ngdc.compodynamics.dto;

import lombok.Data;


@Data
public class ProteinFeatureDTO {
    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//

    private Double mwStart;//
    private Double mwEnd;//
    private Double saStart;//
    private Double saEnd;//
    private Double rvStart;//
    private Double rvEnd;//
    private Double kdStart;//
    private Double kdEnd;//
    private Double wwStart;//
    private Double wwEnd;//
    private Double hhStart;//
    private Double hhEnd;//
    private Double positiveStart;//
    private Double positiveEnd;//
    private Double negativeStart;//
    private Double negativeEnd;//
    private Double neutralStart;//
    private Double neutralEnd;//
    private Double alphaStart;
    private Double alphaEnd;//
    private Double betaStart;//
    private Double betaEnd;//

}
