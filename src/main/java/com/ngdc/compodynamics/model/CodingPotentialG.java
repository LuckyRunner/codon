package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodingPotentialG构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="coding_potential_g")
public class CodingPotentialG implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//specise_index

    @Column(name = "cds_count")
	private Integer cdsCount;//

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "fickett_score")
	private Double fickettScore;//

    @Column(name = "cpc2_coding_probability")
	private Double cpc2CodingProbability;//

    @Column(name = "lgc_coding_probability")
	private Double lgcCodingProbability;//

    @Column(name = "cpc_2_label")
	private Double cpc2Label;//

    @Column(name = "lgc_label")
	private Double lgcLabel;//

	public Double getCodingInBoth() {
		return codingInBoth;
	}

	public void setCodingInBoth(Double codingInBoth) {
		this.codingInBoth = codingInBoth;
	}

	@Column(name = "coding_in_both")
	private Double codingInBoth;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//



	//get方法
	public Integer getSpeciseIndex() {
		return speciseIndex;
	}

	//set方法
	public void setSpeciseIndex(Integer speciseIndex) {
		this.speciseIndex = speciseIndex;
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
	public Double getLgcCodingProbability() {
		return lgcCodingProbability;
	}

	//set方法
	public void setLgcCodingProbability(Double lgcCodingProbability) {
		this.lgcCodingProbability = lgcCodingProbability;
	}
	//get方法
	public Double getCpc2Label() {
		return cpc2Label;
	}

	//set方法
	public void setCpc2Label(Double cpc2Label) {
		this.cpc2Label = cpc2Label;
	}
	//get方法
	public Double getLgcLabel() {
		return lgcLabel;
	}

	//set方法
	public void setLgcLabel(Double lgcLabel) {
		this.lgcLabel = lgcLabel;
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
