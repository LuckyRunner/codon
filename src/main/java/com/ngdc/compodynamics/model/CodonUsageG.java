package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodonUsageG构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="codon_usage_g")
public class CodonUsageG implements Serializable{

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

    @Column(name = "observed_aaa")
	private Double observedAaa;//

    @Column(name = "observed_aag")
	private Double observedAag;//

    @Column(name = "observed_aat")
	private Double observedAat;//

    @Column(name = "observed_aac")
	private Double observedAac;//

    @Column(name = "observed_taa")
	private Double observedTaa;//

    @Column(name = "observed_tag")
	private Double observedTag;//

    @Column(name = "observed_tat")
	private Double observedTat;//

    @Column(name = "observed_tac")
	private Double observedTac;//

    @Column(name = "observed_ata")
	private Double observedAta;//

    @Column(name = "observed_atg")
	private Double observedAtg;//

    @Column(name = "observed_att")
	private Double observedAtt;//

    @Column(name = "observed_atc")
	private Double observedAtc;//

    @Column(name = "observed_tta")
	private Double observedTta;//

    @Column(name = "observed_ttg")
	private Double observedTtg;//

    @Column(name = "observed_ttt")
	private Double observedTtt;//

    @Column(name = "observed_ttc")
	private Double observedTtc;//

    @Column(name = "observed_gaa")
	private Double observedGaa;//

    @Column(name = "observed_gag")
	private Double observedGag;//

    @Column(name = "observed_gat")
	private Double observedGat;//

    @Column(name = "observed_gac")
	private Double observedGac;//

    @Column(name = "observed_caa")
	private Double observedCaa;//

    @Column(name = "observed_cag")
	private Double observedCag;//

    @Column(name = "observed_cat")
	private Double observedCat;//

    @Column(name = "observed_cac")
	private Double observedCac;//

    @Column(name = "observed_gta")
	private Double observedGta;//

    @Column(name = "observed_gtg")
	private Double observedGtg;//

    @Column(name = "observed_gtt")
	private Double observedGtt;//

    @Column(name = "observed_gtc")
	private Double observedGtc;//

    @Column(name = "observed_cta")
	private Double observedCta;//

    @Column(name = "observed_ctg")
	private Double observedCtg;//

    @Column(name = "observed_ctt")
	private Double observedCtt;//

    @Column(name = "observed_ctc")
	private Double observedCtc;//

    @Column(name = "observed_aga")
	private Double observedAga;//

    @Column(name = "observed_agg")
	private Double observedAgg;//

    @Column(name = "observed_agt")
	private Double observedAgt;//

    @Column(name = "observed_agc")
	private Double observedAgc;//

    @Column(name = "observed_tga")
	private Double observedTga;//

    @Column(name = "observed_tgg")
	private Double observedTgg;//

    @Column(name = "observed_tgt")
	private Double observedTgt;//

    @Column(name = "observed_tgc")
	private Double observedTgc;//

    @Column(name = "observed_aca")
	private Double observedAca;//

    @Column(name = "observed_acg")
	private Double observedAcg;//

    @Column(name = "observed_act")
	private Double observedAct;//

    @Column(name = "observed_acc")
	private Double observedAcc;//

    @Column(name = "observed_tca")
	private Double observedTca;//

    @Column(name = "observed_tcg")
	private Double observedTcg;//

    @Column(name = "observed_tct")
	private Double observedTct;//

    @Column(name = "observed_tcc")
	private Double observedTcc;//

    @Column(name = "observed_gga")
	private Double observedGga;//

    @Column(name = "observed_ggg")
	private Double observedGgg;//

    @Column(name = "observed_ggt")
	private Double observedGgt;//

    @Column(name = "observed_ggc")
	private Double observedGgc;//

    @Column(name = "observed_cga")
	private Double observedCga;//

    @Column(name = "observed_cgg")
	private Double observedCgg;//

    @Column(name = "observed_cgt")
	private Double observedCgt;//

    @Column(name = "observed_cgc")
	private Double observedCgc;//

    @Column(name = "observed_gca")
	private Double observedGca;//

    @Column(name = "observed_gcg")
	private Double observedGcg;//

    @Column(name = "observed_gct")
	private Double observedGct;//

    @Column(name = "observed_gcc")
	private Double observedGcc;//

    @Column(name = "observed_cca")
	private Double observedCca;//

    @Column(name = "observed_ccg")
	private Double observedCcg;//

    @Column(name = "observed_cct")
	private Double observedCct;//

    @Column(name = "observed_ccc")
	private Double observedCcc;//

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
	public Double getObservedAaa() {
		return observedAaa;
	}

	//set方法
	public void setObservedAaa(Double observedAaa) {
		this.observedAaa = observedAaa;
	}
	//get方法
	public Double getObservedAag() {
		return observedAag;
	}

	//set方法
	public void setObservedAag(Double observedAag) {
		this.observedAag = observedAag;
	}
	//get方法
	public Double getObservedAat() {
		return observedAat;
	}

	//set方法
	public void setObservedAat(Double observedAat) {
		this.observedAat = observedAat;
	}
	//get方法
	public Double getObservedAac() {
		return observedAac;
	}

	//set方法
	public void setObservedAac(Double observedAac) {
		this.observedAac = observedAac;
	}
	//get方法
	public Double getObservedTaa() {
		return observedTaa;
	}

	//set方法
	public void setObservedTaa(Double observedTaa) {
		this.observedTaa = observedTaa;
	}
	//get方法
	public Double getObservedTag() {
		return observedTag;
	}

	//set方法
	public void setObservedTag(Double observedTag) {
		this.observedTag = observedTag;
	}
	//get方法
	public Double getObservedTat() {
		return observedTat;
	}

	//set方法
	public void setObservedTat(Double observedTat) {
		this.observedTat = observedTat;
	}
	//get方法
	public Double getObservedTac() {
		return observedTac;
	}

	//set方法
	public void setObservedTac(Double observedTac) {
		this.observedTac = observedTac;
	}
	//get方法
	public Double getObservedAta() {
		return observedAta;
	}

	//set方法
	public void setObservedAta(Double observedAta) {
		this.observedAta = observedAta;
	}
	//get方法
	public Double getObservedAtg() {
		return observedAtg;
	}

	//set方法
	public void setObservedAtg(Double observedAtg) {
		this.observedAtg = observedAtg;
	}
	//get方法
	public Double getObservedAtt() {
		return observedAtt;
	}

	//set方法
	public void setObservedAtt(Double observedAtt) {
		this.observedAtt = observedAtt;
	}
	//get方法
	public Double getObservedAtc() {
		return observedAtc;
	}

	//set方法
	public void setObservedAtc(Double observedAtc) {
		this.observedAtc = observedAtc;
	}
	//get方法
	public Double getObservedTta() {
		return observedTta;
	}

	//set方法
	public void setObservedTta(Double observedTta) {
		this.observedTta = observedTta;
	}
	//get方法
	public Double getObservedTtg() {
		return observedTtg;
	}

	//set方法
	public void setObservedTtg(Double observedTtg) {
		this.observedTtg = observedTtg;
	}
	//get方法
	public Double getObservedTtt() {
		return observedTtt;
	}

	//set方法
	public void setObservedTtt(Double observedTtt) {
		this.observedTtt = observedTtt;
	}
	//get方法
	public Double getObservedTtc() {
		return observedTtc;
	}

	//set方法
	public void setObservedTtc(Double observedTtc) {
		this.observedTtc = observedTtc;
	}
	//get方法
	public Double getObservedGaa() {
		return observedGaa;
	}

	//set方法
	public void setObservedGaa(Double observedGaa) {
		this.observedGaa = observedGaa;
	}
	//get方法
	public Double getObservedGag() {
		return observedGag;
	}

	//set方法
	public void setObservedGag(Double observedGag) {
		this.observedGag = observedGag;
	}
	//get方法
	public Double getObservedGat() {
		return observedGat;
	}

	//set方法
	public void setObservedGat(Double observedGat) {
		this.observedGat = observedGat;
	}
	//get方法
	public Double getObservedGac() {
		return observedGac;
	}

	//set方法
	public void setObservedGac(Double observedGac) {
		this.observedGac = observedGac;
	}
	//get方法
	public Double getObservedCaa() {
		return observedCaa;
	}

	//set方法
	public void setObservedCaa(Double observedCaa) {
		this.observedCaa = observedCaa;
	}
	//get方法
	public Double getObservedCag() {
		return observedCag;
	}

	//set方法
	public void setObservedCag(Double observedCag) {
		this.observedCag = observedCag;
	}
	//get方法
	public Double getObservedCat() {
		return observedCat;
	}

	//set方法
	public void setObservedCat(Double observedCat) {
		this.observedCat = observedCat;
	}
	//get方法
	public Double getObservedCac() {
		return observedCac;
	}

	//set方法
	public void setObservedCac(Double observedCac) {
		this.observedCac = observedCac;
	}
	//get方法
	public Double getObservedGta() {
		return observedGta;
	}

	//set方法
	public void setObservedGta(Double observedGta) {
		this.observedGta = observedGta;
	}
	//get方法
	public Double getObservedGtg() {
		return observedGtg;
	}

	//set方法
	public void setObservedGtg(Double observedGtg) {
		this.observedGtg = observedGtg;
	}
	//get方法
	public Double getObservedGtt() {
		return observedGtt;
	}

	//set方法
	public void setObservedGtt(Double observedGtt) {
		this.observedGtt = observedGtt;
	}
	//get方法
	public Double getObservedGtc() {
		return observedGtc;
	}

	//set方法
	public void setObservedGtc(Double observedGtc) {
		this.observedGtc = observedGtc;
	}
	//get方法
	public Double getObservedCta() {
		return observedCta;
	}

	//set方法
	public void setObservedCta(Double observedCta) {
		this.observedCta = observedCta;
	}
	//get方法
	public Double getObservedCtg() {
		return observedCtg;
	}

	//set方法
	public void setObservedCtg(Double observedCtg) {
		this.observedCtg = observedCtg;
	}
	//get方法
	public Double getObservedCtt() {
		return observedCtt;
	}

	//set方法
	public void setObservedCtt(Double observedCtt) {
		this.observedCtt = observedCtt;
	}
	//get方法
	public Double getObservedCtc() {
		return observedCtc;
	}

	//set方法
	public void setObservedCtc(Double observedCtc) {
		this.observedCtc = observedCtc;
	}
	//get方法
	public Double getObservedAga() {
		return observedAga;
	}

	//set方法
	public void setObservedAga(Double observedAga) {
		this.observedAga = observedAga;
	}
	//get方法
	public Double getObservedAgg() {
		return observedAgg;
	}

	//set方法
	public void setObservedAgg(Double observedAgg) {
		this.observedAgg = observedAgg;
	}
	//get方法
	public Double getObservedAgt() {
		return observedAgt;
	}

	//set方法
	public void setObservedAgt(Double observedAgt) {
		this.observedAgt = observedAgt;
	}
	//get方法
	public Double getObservedAgc() {
		return observedAgc;
	}

	//set方法
	public void setObservedAgc(Double observedAgc) {
		this.observedAgc = observedAgc;
	}
	//get方法
	public Double getObservedTga() {
		return observedTga;
	}

	//set方法
	public void setObservedTga(Double observedTga) {
		this.observedTga = observedTga;
	}
	//get方法
	public Double getObservedTgg() {
		return observedTgg;
	}

	//set方法
	public void setObservedTgg(Double observedTgg) {
		this.observedTgg = observedTgg;
	}
	//get方法
	public Double getObservedTgt() {
		return observedTgt;
	}

	//set方法
	public void setObservedTgt(Double observedTgt) {
		this.observedTgt = observedTgt;
	}
	//get方法
	public Double getObservedTgc() {
		return observedTgc;
	}

	//set方法
	public void setObservedTgc(Double observedTgc) {
		this.observedTgc = observedTgc;
	}
	//get方法
	public Double getObservedAca() {
		return observedAca;
	}

	//set方法
	public void setObservedAca(Double observedAca) {
		this.observedAca = observedAca;
	}
	//get方法
	public Double getObservedAcg() {
		return observedAcg;
	}

	//set方法
	public void setObservedAcg(Double observedAcg) {
		this.observedAcg = observedAcg;
	}
	//get方法
	public Double getObservedAct() {
		return observedAct;
	}

	//set方法
	public void setObservedAct(Double observedAct) {
		this.observedAct = observedAct;
	}
	//get方法
	public Double getObservedAcc() {
		return observedAcc;
	}

	//set方法
	public void setObservedAcc(Double observedAcc) {
		this.observedAcc = observedAcc;
	}
	//get方法
	public Double getObservedTca() {
		return observedTca;
	}

	//set方法
	public void setObservedTca(Double observedTca) {
		this.observedTca = observedTca;
	}
	//get方法
	public Double getObservedTcg() {
		return observedTcg;
	}

	//set方法
	public void setObservedTcg(Double observedTcg) {
		this.observedTcg = observedTcg;
	}
	//get方法
	public Double getObservedTct() {
		return observedTct;
	}

	//set方法
	public void setObservedTct(Double observedTct) {
		this.observedTct = observedTct;
	}
	//get方法
	public Double getObservedTcc() {
		return observedTcc;
	}

	//set方法
	public void setObservedTcc(Double observedTcc) {
		this.observedTcc = observedTcc;
	}
	//get方法
	public Double getObservedGga() {
		return observedGga;
	}

	//set方法
	public void setObservedGga(Double observedGga) {
		this.observedGga = observedGga;
	}
	//get方法
	public Double getObservedGgg() {
		return observedGgg;
	}

	//set方法
	public void setObservedGgg(Double observedGgg) {
		this.observedGgg = observedGgg;
	}
	//get方法
	public Double getObservedGgt() {
		return observedGgt;
	}

	//set方法
	public void setObservedGgt(Double observedGgt) {
		this.observedGgt = observedGgt;
	}
	//get方法
	public Double getObservedGgc() {
		return observedGgc;
	}

	//set方法
	public void setObservedGgc(Double observedGgc) {
		this.observedGgc = observedGgc;
	}
	//get方法
	public Double getObservedCga() {
		return observedCga;
	}

	//set方法
	public void setObservedCga(Double observedCga) {
		this.observedCga = observedCga;
	}
	//get方法
	public Double getObservedCgg() {
		return observedCgg;
	}

	//set方法
	public void setObservedCgg(Double observedCgg) {
		this.observedCgg = observedCgg;
	}
	//get方法
	public Double getObservedCgt() {
		return observedCgt;
	}

	//set方法
	public void setObservedCgt(Double observedCgt) {
		this.observedCgt = observedCgt;
	}
	//get方法
	public Double getObservedCgc() {
		return observedCgc;
	}

	//set方法
	public void setObservedCgc(Double observedCgc) {
		this.observedCgc = observedCgc;
	}
	//get方法
	public Double getObservedGca() {
		return observedGca;
	}

	//set方法
	public void setObservedGca(Double observedGca) {
		this.observedGca = observedGca;
	}
	//get方法
	public Double getObservedGcg() {
		return observedGcg;
	}

	//set方法
	public void setObservedGcg(Double observedGcg) {
		this.observedGcg = observedGcg;
	}
	//get方法
	public Double getObservedGct() {
		return observedGct;
	}

	//set方法
	public void setObservedGct(Double observedGct) {
		this.observedGct = observedGct;
	}
	//get方法
	public Double getObservedGcc() {
		return observedGcc;
	}

	//set方法
	public void setObservedGcc(Double observedGcc) {
		this.observedGcc = observedGcc;
	}
	//get方法
	public Double getObservedCca() {
		return observedCca;
	}

	//set方法
	public void setObservedCca(Double observedCca) {
		this.observedCca = observedCca;
	}
	//get方法
	public Double getObservedCcg() {
		return observedCcg;
	}

	//set方法
	public void setObservedCcg(Double observedCcg) {
		this.observedCcg = observedCcg;
	}
	//get方法
	public Double getObservedCct() {
		return observedCct;
	}

	//set方法
	public void setObservedCct(Double observedCct) {
		this.observedCct = observedCct;
	}
	//get方法
	public Double getObservedCcc() {
		return observedCcc;
	}

	//set方法
	public void setObservedCcc(Double observedCcc) {
		this.observedCcc = observedCcc;
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
