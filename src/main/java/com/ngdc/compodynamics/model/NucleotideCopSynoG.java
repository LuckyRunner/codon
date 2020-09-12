package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCopSynoG构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="nucleotide_cop_syno_g")
public class NucleotideCopSynoG implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "cds_count")
	private Integer cdsCount;//

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

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
	public Long getId() {
		return id;
	}

	//set方法
	public void setId(Long id) {
		this.id = id;
	}


}
