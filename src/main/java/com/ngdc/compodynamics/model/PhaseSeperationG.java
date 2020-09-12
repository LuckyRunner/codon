package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:PhaseSeperationG构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="phase_seperation_g")
public class PhaseSeperationG implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "cds_count")
	private Integer cdsCount;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "llr")
	private Double llr;//

    @Column(name = "core_score")
	private Double coreScore;//

    @Column(name = "papa_prop")
	private Double papaProp;//

    @Column(name = "papa_fi")
	private Double papaFi;//

    @Column(name = "aa_length")
	private Integer aaLength;//

    @Column(name = "disorder_percent")
	private Double disorderPercent;//

    @Column(name = "disorder_30aa_num")
	private Integer disorder30aaNum;//

    @Column(name = "disorder_50aa_num")
	private Integer disorder50aaNum;//

    @Column(name = "disorder_segment_num")
	private Integer disorderSegmentNum;//

    @Column(name = "ps_core")
	private Double psCore;//

    @Column(name = "taxonomy")
	private String taxonomy;//

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
	public Double getLlr() {
		return llr;
	}

	//set方法
	public void setLlr(Double llr) {
		this.llr = llr;
	}
	//get方法
	public Double getCoreScore() {
		return coreScore;
	}

	//set方法
	public void setCoreScore(Double coreScore) {
		this.coreScore = coreScore;
	}
	//get方法
	public Double getPapaProp() {
		return papaProp;
	}

	//set方法
	public void setPapaProp(Double papaProp) {
		this.papaProp = papaProp;
	}
	//get方法
	public Double getPapaFi() {
		return papaFi;
	}

	//set方法
	public void setPapaFi(Double papaFi) {
		this.papaFi = papaFi;
	}
	//get方法
	public Integer getAaLength() {
		return aaLength;
	}

	//set方法
	public void setAaLength(Integer aaLength) {
		this.aaLength = aaLength;
	}
	//get方法
	public Double getDisorderPercent() {
		return disorderPercent;
	}

	//set方法
	public void setDisorderPercent(Double disorderPercent) {
		this.disorderPercent = disorderPercent;
	}
	//get方法
	public Integer getDisorder30aaNum() {
		return disorder30aaNum;
	}

	//set方法
	public void setDisorder30aaNum(Integer disorder30aaNum) {
		this.disorder30aaNum = disorder30aaNum;
	}
	//get方法
	public Integer getDisorder50aaNum() {
		return disorder50aaNum;
	}

	//set方法
	public void setDisorder50aaNum(Integer disorder50aaNum) {
		this.disorder50aaNum = disorder50aaNum;
	}
	//get方法
	public Integer getDisorderSegmentNum() {
		return disorderSegmentNum;
	}

	//set方法
	public void setDisorderSegmentNum(Integer disorderSegmentNum) {
		this.disorderSegmentNum = disorderSegmentNum;
	}
	//get方法
	public Double getPsCore() {
		return psCore;
	}

	//set方法
	public void setPsCore(Double psCore) {
		this.psCore = psCore;
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
	public Long getId() {
		return id;
	}

	//set方法
	public void setId(Long id) {
		this.id = id;
	}


}
