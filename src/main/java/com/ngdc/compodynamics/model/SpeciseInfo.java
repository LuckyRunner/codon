package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:SpeciseInfo构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="specise_info")
public class SpeciseInfo implements Serializable{

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "taxid")
	private Integer taxid;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "bioproject")
	private String bioproject;//

    @Column(name = "biosample")
	private String biosample;//

    @Column(name = "refseq_category")
	private String refseqCategory;//

    @Column(name = "version_status")
	private String versionStatus;//

    @Column(name = "assembly_level")
	private String assemblyLevel;//

    @Column(name = "genetic_code")
	private Integer geneticCode;//

    @Column(name = "specise_index")
	private Long speciseIndex;//

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
	public Integer getTaxid() {
		return taxid;
	}

	//set方法
	public void setTaxid(Integer taxid) {
		this.taxid = taxid;
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
	public String getBioproject() {
		return bioproject;
	}

	//set方法
	public void setBioproject(String bioproject) {
		this.bioproject = bioproject;
	}
	//get方法
	public String getBiosample() {
		return biosample;
	}

	//set方法
	public void setBiosample(String biosample) {
		this.biosample = biosample;
	}
	//get方法
	public String getRefseqCategory() {
		return refseqCategory;
	}

	//set方法
	public void setRefseqCategory(String refseqCategory) {
		this.refseqCategory = refseqCategory;
	}
	//get方法
	public String getVersionStatus() {
		return versionStatus;
	}

	//set方法
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}
	//get方法
	public String getAssemblyLevel() {
		return assemblyLevel;
	}

	//set方法
	public void setAssemblyLevel(String assemblyLevel) {
		this.assemblyLevel = assemblyLevel;
	}
	//get方法
	public Integer getGeneticCode() {
		return geneticCode;
	}

	//set方法
	public void setGeneticCode(Integer geneticCode) {
		this.geneticCode = geneticCode;
	}
	//get方法
	public Long getSpeciseIndex() {
		return speciseIndex;
	}

	//set方法
	public void setSpeciseIndex(Long speciseIndex) {
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
