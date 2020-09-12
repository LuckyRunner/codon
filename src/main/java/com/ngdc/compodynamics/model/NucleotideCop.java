package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCop构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="nucleotide_cop")
public class NucleotideCop implements Serializable{

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

    @Column(name = "length")
	private Integer length;//

    @Column(name = "gc")
	private Double gc;//

    @Column(name = "ag")
	private Double ag;//

    @Column(name = "gc1")
	private Double gc1;//

    @Column(name = "ag1")
	private Double ag1;//

    @Column(name = "gc2")
	private Double gc2;//

    @Column(name = "ag2")
	private Double ag2;//

    @Column(name = "gc3")
	private Double gc3;//

    @Column(name = "ag3")
	private Double ag3;//

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
	public Integer getLength() {
		return length;
	}

	//set方法
	public void setLength(Integer length) {
		this.length = length;
	}
	//get方法
	public Double getGc() {
		return gc;
	}

	//set方法
	public void setGc(Double gc) {
		this.gc = gc;
	}
	//get方法
	public Double getAg() {
		return ag;
	}

	//set方法
	public void setAg(Double ag) {
		this.ag = ag;
	}
	//get方法
	public Double getGc1() {
		return gc1;
	}

	//set方法
	public void setGc1(Double gc1) {
		this.gc1 = gc1;
	}
	//get方法
	public Double getAg1() {
		return ag1;
	}

	//set方法
	public void setAg1(Double ag1) {
		this.ag1 = ag1;
	}
	//get方法
	public Double getGc2() {
		return gc2;
	}

	//set方法
	public void setGc2(Double gc2) {
		this.gc2 = gc2;
	}
	//get方法
	public Double getAg2() {
		return ag2;
	}

	//set方法
	public void setAg2(Double ag2) {
		this.ag2 = ag2;
	}
	//get方法
	public Double getGc3() {
		return gc3;
	}

	//set方法
	public void setGc3(Double gc3) {
		this.gc3 = gc3;
	}
	//get方法
	public Double getAg3() {
		return ag3;
	}

	//set方法
	public void setAg3(Double ag3) {
		this.ag3 = ag3;
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
