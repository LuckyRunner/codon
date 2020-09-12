package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodingPotential构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="coding_potential")
public class CodingPotential implements Serializable{

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "cds_index")
	private Integer cdsIndex;//

    @Column(name = "gene_id")
	private String geneId;//

    @Column(name = "protein_id")
	private String proteinId;//

    @Column(name = "fickett_score")
	private Double fickettScore;//

    @Column(name = "cpc2_coding_probability")
	private Double cpc2CodingProbability;//

    @Column(name = "cpc2_label")
	private String cpc2Label;//

    @Column(name = "lgc_coding_probability")
	private Double lgcCodingProbability;//

    @Column(name = "lgc_label")
	private String lgcLabel;//

    @Column(name = "specise_index")
	private Integer speciseIndex;//

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//



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
	public Integer getCdsIndex() {
		return cdsIndex;
	}

	//set方法
	public void setCdsIndex(Integer cdsIndex) {
		this.cdsIndex = cdsIndex;
	}
	//get方法
	public String getGeneId() {
		return geneId;
	}

	//set方法
	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}
	//get方法
	public String getProteinId() {
		return proteinId;
	}

	//set方法
	public void setProteinId(String proteinId) {
		this.proteinId = proteinId;
	}
	//get方法
	public Double getFickettScore() {
		return fickettScore;
	}

	//set方法
	public void setFickettScore(Double fickettScore) {
		this.fickettScore = fickettScore;
	}
	//get方法
	public Double getCpc2CodingProbability() {
		return cpc2CodingProbability;
	}

	//set方法
	public void setCpc2CodingProbability(Double cpc2CodingProbability) {
		this.cpc2CodingProbability = cpc2CodingProbability;
	}
	//get方法
	public String getCpc2Label() {
		return cpc2Label;
	}

	//set方法
	public void setCpc2Label(String cpc2Label) {
		this.cpc2Label = cpc2Label;
	}
	//get方法
	public Double getLgcCodingProbability() {
		return lgcCodingProbability;
	}

	//set方法
	public void setLgcCodingProbability(Double lgcCodingProbability) {
		this.lgcCodingProbability = lgcCodingProbability;
	}
	//get方法
	public String getLgcLabel() {
		return lgcLabel;
	}

	//set方法
	public void setLgcLabel(String lgcLabel) {
		this.lgcLabel = lgcLabel;
	}
	//get方法
	public Integer getSpeciseIndex() {
		return speciseIndex;
	}

	//set方法
	public void setSpeciseIndex(Integer speciseIndex) {
		this.speciseIndex = speciseIndex;
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
