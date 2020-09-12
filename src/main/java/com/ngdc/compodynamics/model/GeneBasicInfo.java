package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:GeneBasicInfo构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="gene_basic_info")
public class GeneBasicInfo implements Serializable{

    @Column(name = "gene_index")
	private Long geneIndex;//

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "gene_id")
	private String geneId;//

    @Column(name = "protein_id")
	private String proteinId;//

    @Column(name = "gene_name")
	private String geneName;//

    @Column(name = "protein_name")
	private String proteinName;//

    @Column(name = "location")
	private String location;//

    @Column(name = "low_quality")
	private String lowQuality;//

    @Column(name = "file_index")
	private Long fileIndex;//

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//



	//get方法
	public Long getGeneIndex() {
		return geneIndex;
	}

	//set方法
	public void setGeneIndex(Long geneIndex) {
		this.geneIndex = geneIndex;
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
	public String getGeneName() {
		return geneName;
	}

	//set方法
	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}
	//get方法
	public String getProteinName() {
		return proteinName;
	}

	//set方法
	public void setProteinName(String proteinName) {
		this.proteinName = proteinName;
	}
	//get方法
	public String getLocation() {
		return location;
	}

	//set方法
	public void setLocation(String location) {
		this.location = location;
	}
	//get方法
	public String getLowQuality() {
		return lowQuality;
	}

	//set方法
	public void setLowQuality(String lowQuality) {
		this.lowQuality = lowQuality;
	}
	//get方法
	public Long getFileIndex() {
		return fileIndex;
	}

	//set方法
	public void setFileIndex(Long fileIndex) {
		this.fileIndex = fileIndex;
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
