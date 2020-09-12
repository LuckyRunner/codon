package com.ngdc.compodynamics.dto;

import lombok.Data;

@Data
public class NucleotideCopDTO {

    private String taxonomy;//
    private String organism;//
    private String assemblyAccession;//
    private String geneId;//
    private String proteinId;//
    private Integer lenStart;
    private Integer lenEnd;

    private Double gcStart;
    private Double gcEnd;
    private Double gc1Start;
    private Double gc1End;
    private Double gc2Start;
    private Double gc2End;
    private Double gc3Start;
    private Double gc3End;
    private Double agStart;
    private Double agEnd;
    private Double ag1Start;
    private Double ag1End;
    private Double ag2Start;
    private Double ag2End;
    private Double ag3Start;
    private Double ag3End;
}
