package com.ngdc.compodynamics.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AminoHotmapDTO {
    private Long id;
    private String organism;
    private Double observedAla;
    private Double observedCys;
    private Double observedAsp;
    private Double observedGlu;
    private Double observedPhe;
    private Double observedGly;
    private Double observedHis;
    private Double observedIle;
    private Double observedLys;
    private Double observedLeu;
    private Double observedMet;
    private Double observedAsn;
    private Double observedPro;
    private Double observedGln;
    private Double observedArg;
    private Double observedSer;
    private Double observedThr;
    private Double observedVal;
    private Double observedTrp;
    private Double observedTyr;
}
