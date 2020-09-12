package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:AminoAcidsUsageG构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="amino_acids_usage_g")
public class AminoAcidsUsageG implements Serializable{

    @Column(name = "species_index")
	private Integer speciesIndex;//

    @Column(name = "cds_count")
	private Integer cdsCount;//

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "observed_ala")
	private Double observedAla;//

    @Column(name = "observed_cys")
	private Double observedCys;//

    @Column(name = "observed_asp")
	private Double observedAsp;//

    @Column(name = "observed_glu")
	private Double observedGlu;//

    @Column(name = "observed_phe")
	private Double observedPhe;//

    @Column(name = "observed_gly")
	private Double observedGly;//

    @Column(name = "observed_his")
	private Double observedHis;//

    @Column(name = "observed_ile")
	private Double observedIle;//

    @Column(name = "observed_lys")
	private Double observedLys;//

    @Column(name = "observed_leu")
	private Double observedLeu;//

    @Column(name = "observed_met")
	private Double observedMet;//

    @Column(name = "observed_asn")
	private Double observedAsn;//

    @Column(name = "observed_pro")
	private Double observedPro;//

    @Column(name = "observed_gln")
	private Double observedGln;//

    @Column(name = "observed_arg")
	private Double observedArg;//

    @Column(name = "observed_ser")
	private Double observedSer;//

    @Column(name = "observed_thr")
	private Double observedThr;//

    @Column(name = "observed_val")
	private Double observedVal;//

    @Column(name = "observed_trp")
	private Double observedTrp;//

    @Column(name = "observed_tyr")
	private Double observedTyr;//

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//



	//get方法
	public Integer getSpeciesIndex() {
		return speciesIndex;
	}

	//set方法
	public void setSpeciesIndex(Integer speciesIndex) {
		this.speciesIndex = speciesIndex;
	}
	//get方法
	public Integer getCdsCount() {
		return cdsCount;
	}

	//set方法
	public void setCdsCount(Integer cdsCount) {
		this.cdsCount = cdsCount;
	}
	//get方法
	public String getTaxonomy() {
		return taxonomy;
	}

	//set方法
	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}
	//get方法
	public String getOrganism() {
		return organism;
	}

	//set方法
	public void setOrganism(String organism) {
		this.organism = organism;
	}
	//get方法
	public String getAssemblyAccession() {
		return assemblyAccession;
	}

	//set方法
	public void setAssemblyAccession(String assemblyAccession) {
		this.assemblyAccession = assemblyAccession;
	}
	//get方法
	public Double getObservedAla() {
		return observedAla;
	}

	//set方法
	public void setObservedAla(Double observedAla) {
		this.observedAla = observedAla;
	}
	//get方法
	public Double getObservedCys() {
		return observedCys;
	}

	//set方法
	public void setObservedCys(Double observedCys) {
		this.observedCys = observedCys;
	}
	//get方法
	public Double getObservedAsp() {
		return observedAsp;
	}

	//set方法
	public void setObservedAsp(Double observedAsp) {
		this.observedAsp = observedAsp;
	}
	//get方法
	public Double getObservedGlu() {
		return observedGlu;
	}

	//set方法
	public void setObservedGlu(Double observedGlu) {
		this.observedGlu = observedGlu;
	}
	//get方法
	public Double getObservedPhe() {
		return observedPhe;
	}

	//set方法
	public void setObservedPhe(Double observedPhe) {
		this.observedPhe = observedPhe;
	}
	//get方法
	public Double getObservedGly() {
		return observedGly;
	}

	//set方法
	public void setObservedGly(Double observedGly) {
		this.observedGly = observedGly;
	}
	//get方法
	public Double getObservedHis() {
		return observedHis;
	}

	//set方法
	public void setObservedHis(Double observedHis) {
		this.observedHis = observedHis;
	}
	//get方法
	public Double getObservedIle() {
		return observedIle;
	}

	//set方法
	public void setObservedIle(Double observedIle) {
		this.observedIle = observedIle;
	}
	//get方法
	public Double getObservedLys() {
		return observedLys;
	}

	//set方法
	public void setObservedLys(Double observedLys) {
		this.observedLys = observedLys;
	}
	//get方法
	public Double getObservedLeu() {
		return observedLeu;
	}

	//set方法
	public void setObservedLeu(Double observedLeu) {
		this.observedLeu = observedLeu;
	}
	//get方法
	public Double getObservedMet() {
		return observedMet;
	}

	//set方法
	public void setObservedMet(Double observedMet) {
		this.observedMet = observedMet;
	}
	//get方法
	public Double getObservedAsn() {
		return observedAsn;
	}

	//set方法
	public void setObservedAsn(Double observedAsn) {
		this.observedAsn = observedAsn;
	}
	//get方法
	public Double getObservedPro() {
		return observedPro;
	}

	//set方法
	public void setObservedPro(Double observedPro) {
		this.observedPro = observedPro;
	}
	//get方法
	public Double getObservedGln() {
		return observedGln;
	}

	//set方法
	public void setObservedGln(Double observedGln) {
		this.observedGln = observedGln;
	}
	//get方法
	public Double getObservedArg() {
		return observedArg;
	}

	//set方法
	public void setObservedArg(Double observedArg) {
		this.observedArg = observedArg;
	}
	//get方法
	public Double getObservedSer() {
		return observedSer;
	}

	//set方法
	public void setObservedSer(Double observedSer) {
		this.observedSer = observedSer;
	}
	//get方法
	public Double getObservedThr() {
		return observedThr;
	}

	//set方法
	public void setObservedThr(Double observedThr) {
		this.observedThr = observedThr;
	}
	//get方法
	public Double getObservedVal() {
		return observedVal;
	}

	//set方法
	public void setObservedVal(Double observedVal) {
		this.observedVal = observedVal;
	}
	//get方法
	public Double getObservedTrp() {
		return observedTrp;
	}

	//set方法
	public void setObservedTrp(Double observedTrp) {
		this.observedTrp = observedTrp;
	}
	//get方法
	public Double getObservedTyr() {
		return observedTyr;
	}

	//set方法
	public void setObservedTyr(Double observedTyr) {
		this.observedTyr = observedTyr;
	}
	//get方法
	public Long getId() {
		return id;
	}

	//set方法
	public void setId(Long id) {
		this.id = id;
	}


}
