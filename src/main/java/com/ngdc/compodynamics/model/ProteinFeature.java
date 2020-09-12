package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:ProteinFeature构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="protein_feature")
public class ProteinFeature implements Serializable{

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

    @Column(name = "mw")
	private Double mw;//

    @Column(name = "sa")
	private Double sa;//

    @Column(name = "rv")
	private Double rv;//

    @Column(name = "kdhydrophobicity")
	private Double kdhydrophobicity;//

    @Column(name = "wwhydrophobicity")
	private Double wwhydrophobicity;//

    @Column(name = "hhhydrophobicity")
	private Double hhhydrophobicity;//

    @Column(name = "positive")
	private Double positive;//

    @Column(name = "negative")
	private Double negative;//

    @Column(name = "neutral")
	private Double neutral;//

    @Column(name = "alpha")
	private Double alpha;//

    @Column(name = "beta")
	private Double beta;//

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
	public Double getMw() {
		return mw;
	}

	//set方法
	public void setMw(Double mw) {
		this.mw = mw;
	}
	//get方法
	public Double getSa() {
		return sa;
	}

	//set方法
	public void setSa(Double sa) {
		this.sa = sa;
	}
	//get方法
	public Double getRv() {
		return rv;
	}

	//set方法
	public void setRv(Double rv) {
		this.rv = rv;
	}
	//get方法
	public Double getKdhydrophobicity() {
		return kdhydrophobicity;
	}

	//set方法
	public void setKdhydrophobicity(Double kdhydrophobicity) {
		this.kdhydrophobicity = kdhydrophobicity;
	}
	//get方法
	public Double getWwhydrophobicity() {
		return wwhydrophobicity;
	}

	//set方法
	public void setWwhydrophobicity(Double wwhydrophobicity) {
		this.wwhydrophobicity = wwhydrophobicity;
	}
	//get方法
	public Double getHhhydrophobicity() {
		return hhhydrophobicity;
	}

	//set方法
	public void setHhhydrophobicity(Double hhhydrophobicity) {
		this.hhhydrophobicity = hhhydrophobicity;
	}
	//get方法
	public Double getPositive() {
		return positive;
	}

	//set方法
	public void setPositive(Double positive) {
		this.positive = positive;
	}
	//get方法
	public Double getNegative() {
		return negative;
	}

	//set方法
	public void setNegative(Double negative) {
		this.negative = negative;
	}
	//get方法
	public Double getNeutral() {
		return neutral;
	}

	//set方法
	public void setNeutral(Double neutral) {
		this.neutral = neutral;
	}
	//get方法
	public Double getAlpha() {
		return alpha;
	}

	//set方法
	public void setAlpha(Double alpha) {
		this.alpha = alpha;
	}
	//get方法
	public Double getBeta() {
		return beta;
	}

	//set方法
	public void setBeta(Double beta) {
		this.beta = beta;
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
