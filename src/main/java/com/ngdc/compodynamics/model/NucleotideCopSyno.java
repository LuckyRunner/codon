package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCopSyno构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="nucleotide_syno")
public class NucleotideCopSyno implements Serializable{

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

    @Column(name = "t3s")
	private Double t3s;//

    @Column(name = "c3s")
	private Double c3s;//

    @Column(name = "a3s")
	private Double a3s;//

    @Column(name = "g3s")
	private Double g3s;//

    @Column(name = "gc3s")
	private Double gc3s;//

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
	public Double getT3s() {
		return t3s;
	}

	//set方法
	public void setT3s(Double t3s) {
		this.t3s = t3s;
	}
	//get方法
	public Double getC3s() {
		return c3s;
	}

	//set方法
	public void setC3s(Double c3s) {
		this.c3s = c3s;
	}
	//get方法
	public Double getA3s() {
		return a3s;
	}

	//set方法
	public void setA3s(Double a3s) {
		this.a3s = a3s;
	}
	//get方法
	public Double getG3s() {
		return g3s;
	}

	//set方法
	public void setG3s(Double g3s) {
		this.g3s = g3s;
	}
	//get方法
	public Double getGc3s() {
		return gc3s;
	}

	//set方法
	public void setGc3s(Double gc3s) {
		this.gc3s = gc3s;
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
