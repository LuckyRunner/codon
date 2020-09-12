package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:StatisticsHotmap构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="statistics_hotmap")
public class StatisticsHotmap implements Serializable{

    @Column(name = "species_index")
	private Integer speciesIndex;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "taxid")
	private Integer taxid;//

    @Column(name = "file_d")
	private String fileD;//

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

    @Column(name = "cdc")
	private Double cdc;//

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

    @Column(name = "rscu_aaa")
	private Double rscuAaa;//

    @Column(name = "rscu_aag")
	private Double rscuAag;//

    @Column(name = "rscu_aat")
	private Double rscuAat;//

    @Column(name = "rscu_aac")
	private Double rscuAac;//

    @Column(name = "rscu_taa")
	private Double rscuTaa;//

    @Column(name = "rscu_tag")
	private Double rscuTag;//

    @Column(name = "rscu_tat")
	private Double rscuTat;//

    @Column(name = "rscu_tac")
	private Double rscuTac;//

    @Column(name = "rscu_ata")
	private Double rscuAta;//

    @Column(name = "rscu_atg")
	private Double rscuAtg;//

    @Column(name = "rscu_att")
	private Double rscuAtt;//

    @Column(name = "rscu_atc")
	private Double rscuAtc;//

    @Column(name = "rscu_tta")
	private Double rscuTta;//

    @Column(name = "rscu_ttg")
	private Double rscuTtg;//

    @Column(name = "rscu_ttt")
	private Double rscuTtt;//

    @Column(name = "rscu_ttc")
	private Double rscuTtc;//

    @Column(name = "rscu_gaa")
	private Double rscuGaa;//

    @Column(name = "rscu_gag")
	private Double rscuGag;//

    @Column(name = "rscu_gat")
	private Double rscuGat;//

    @Column(name = "rscu_gac")
	private Double rscuGac;//

    @Column(name = "rscu_caa")
	private Double rscuCaa;//

    @Column(name = "rscu_cag")
	private Double rscuCag;//

    @Column(name = "rscu_cat")
	private Double rscuCat;//

    @Column(name = "rscu_cac")
	private Double rscuCac;//

    @Column(name = "rscu_gta")
	private Double rscuGta;//

    @Column(name = "rscu_gtg")
	private Double rscuGtg;//

    @Column(name = "rscu_gtt")
	private Double rscuGtt;//

    @Column(name = "rscu_gtc")
	private Double rscuGtc;//

    @Column(name = "rscu_cta")
	private Double rscuCta;//

    @Column(name = "rscu_ctg")
	private Double rscuCtg;//

    @Column(name = "rscu_ctt")
	private Double rscuCtt;//

    @Column(name = "rscu_ctc")
	private Double rscuCtc;//

    @Column(name = "rscu_aga")
	private Double rscuAga;//

    @Column(name = "rscu_agg")
	private Double rscuAgg;//

    @Column(name = "rscu_agt")
	private Double rscuAgt;//

    @Column(name = "rscu_agc")
	private Double rscuAgc;//

    @Column(name = "rscu_tga")
	private Double rscuTga;//

    @Column(name = "rscu_tgg")
	private Double rscuTgg;//

    @Column(name = "rscu_tgt")
	private Double rscuTgt;//

    @Column(name = "rscu_tgc")
	private Double rscuTgc;//

    @Column(name = "rscu_aca")
	private Double rscuAca;//

    @Column(name = "rscu_acg")
	private Double rscuAcg;//

    @Column(name = "rscu_act")
	private Double rscuAct;//

    @Column(name = "rscu_acc")
	private Double rscuAcc;//

    @Column(name = "rscu_tca")
	private Double rscuTca;//

    @Column(name = "rscu_tcg")
	private Double rscuTcg;//

    @Column(name = "rscu_tct")
	private Double rscuTct;//

    @Column(name = "rscu_tcc")
	private Double rscuTcc;//

    @Column(name = "rscu_gga")
	private Double rscuGga;//

    @Column(name = "rscu_ggg")
	private Double rscuGgg;//

    @Column(name = "rscu_ggt")
	private Double rscuGgt;//

    @Column(name = "rscu_ggc")
	private Double rscuGgc;//

    @Column(name = "rscu_cga")
	private Double rscuCga;//

    @Column(name = "rscu_cgg")
	private Double rscuCgg;//

    @Column(name = "rscu_cgt")
	private Double rscuCgt;//

    @Column(name = "rscu_cgc")
	private Double rscuCgc;//

    @Column(name = "rscu_gca")
	private Double rscuGca;//

    @Column(name = "rscu_gcg")
	private Double rscuGcg;//

    @Column(name = "rscu_gct")
	private Double rscuGct;//

    @Column(name = "rscu_gcc")
	private Double rscuGcc;//

    @Column(name = "rscu_cca")
	private Double rscuCca;//

    @Column(name = "rscu_ccg")
	private Double rscuCcg;//

    @Column(name = "rscu_cct")
	private Double rscuCct;//

    @Column(name = "rscu_ccc")
	private Double rscuCcc;//

    @Column(name = "observed_ala")
	private Double observedAla;//

    @Column(name = "observed_cys")
	private Double observedCys;//

    @Column(name = "observed_asp")
	private Double observedAsp;//

    @Column(name = "observed_glu")
	private Double observedGlu;//

    @Column(name = "observed_phe")
	private Double observedPhe;//

    @Column(name = "observed_gly")
	private Double observedGly;//

    @Column(name = "observed_his")
	private Double observedHis;//

    @Column(name = "observed_ile")
	private Double observedIle;//

    @Column(name = "observed_lys")
	private Double observedLys;//

    @Column(name = "observed_leu")
	private Double observedLeu;//

    @Column(name = "observed_met")
	private Double observedMet;//

    @Column(name = "observed_asn")
	private Double observedAsn;//

    @Column(name = "observed_pro")
	private Double observedPro;//

    @Column(name = "observed_gln")
	private Double observedGln;//

    @Column(name = "observed_arg")
	private Double observedArg;//

    @Column(name = "observed_ser")
	private Double observedSer;//

    @Column(name = "observed_thr")
	private Double observedThr;//

    @Column(name = "observed_val")
	private Double observedVal;//

    @Column(name = "observed_trp")
	private Double observedTrp;//

    @Column(name = "observed_tyr")
	private Double observedTyr;//

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//



	//get方法
	public Integer getSpeciesIndex() {
		return speciesIndex;
	}

	//set方法
	public void setSpeciesIndex(Integer speciesIndex) {
		this.speciesIndex = speciesIndex;
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
	public String getFileD() {
		return fileD;
	}

	//set方法
	public void setFileD(String fileD) {
		this.fileD = fileD;
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
	public Double getCdc() {
		return cdc;
	}

	//set方法
	public void setCdc(Double cdc) {
		this.cdc = cdc;
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
	public Double getRscuAaa() {
		return rscuAaa;
	}

	//set方法
	public void setRscuAaa(Double rscuAaa) {
		this.rscuAaa = rscuAaa;
	}
	//get方法
	public Double getRscuAag() {
		return rscuAag;
	}

	//set方法
	public void setRscuAag(Double rscuAag) {
		this.rscuAag = rscuAag;
	}
	//get方法
	public Double getRscuAat() {
		return rscuAat;
	}

	//set方法
	public void setRscuAat(Double rscuAat) {
		this.rscuAat = rscuAat;
	}
	//get方法
	public Double getRscuAac() {
		return rscuAac;
	}

	//set方法
	public void setRscuAac(Double rscuAac) {
		this.rscuAac = rscuAac;
	}
	//get方法
	public Double getRscuTaa() {
		return rscuTaa;
	}

	//set方法
	public void setRscuTaa(Double rscuTaa) {
		this.rscuTaa = rscuTaa;
	}
	//get方法
	public Double getRscuTag() {
		return rscuTag;
	}

	//set方法
	public void setRscuTag(Double rscuTag) {
		this.rscuTag = rscuTag;
	}
	//get方法
	public Double getRscuTat() {
		return rscuTat;
	}

	//set方法
	public void setRscuTat(Double rscuTat) {
		this.rscuTat = rscuTat;
	}
	//get方法
	public Double getRscuTac() {
		return rscuTac;
	}

	//set方法
	public void setRscuTac(Double rscuTac) {
		this.rscuTac = rscuTac;
	}
	//get方法
	public Double getRscuAta() {
		return rscuAta;
	}

	//set方法
	public void setRscuAta(Double rscuAta) {
		this.rscuAta = rscuAta;
	}
	//get方法
	public Double getRscuAtg() {
		return rscuAtg;
	}

	//set方法
	public void setRscuAtg(Double rscuAtg) {
		this.rscuAtg = rscuAtg;
	}
	//get方法
	public Double getRscuAtt() {
		return rscuAtt;
	}

	//set方法
	public void setRscuAtt(Double rscuAtt) {
		this.rscuAtt = rscuAtt;
	}
	//get方法
	public Double getRscuAtc() {
		return rscuAtc;
	}

	//set方法
	public void setRscuAtc(Double rscuAtc) {
		this.rscuAtc = rscuAtc;
	}
	//get方法
	public Double getRscuTta() {
		return rscuTta;
	}

	//set方法
	public void setRscuTta(Double rscuTta) {
		this.rscuTta = rscuTta;
	}
	//get方法
	public Double getRscuTtg() {
		return rscuTtg;
	}

	//set方法
	public void setRscuTtg(Double rscuTtg) {
		this.rscuTtg = rscuTtg;
	}
	//get方法
	public Double getRscuTtt() {
		return rscuTtt;
	}

	//set方法
	public void setRscuTtt(Double rscuTtt) {
		this.rscuTtt = rscuTtt;
	}
	//get方法
	public Double getRscuTtc() {
		return rscuTtc;
	}

	//set方法
	public void setRscuTtc(Double rscuTtc) {
		this.rscuTtc = rscuTtc;
	}
	//get方法
	public Double getRscuGaa() {
		return rscuGaa;
	}

	//set方法
	public void setRscuGaa(Double rscuGaa) {
		this.rscuGaa = rscuGaa;
	}
	//get方法
	public Double getRscuGag() {
		return rscuGag;
	}

	//set方法
	public void setRscuGag(Double rscuGag) {
		this.rscuGag = rscuGag;
	}
	//get方法
	public Double getRscuGat() {
		return rscuGat;
	}

	//set方法
	public void setRscuGat(Double rscuGat) {
		this.rscuGat = rscuGat;
	}
	//get方法
	public Double getRscuGac() {
		return rscuGac;
	}

	//set方法
	public void setRscuGac(Double rscuGac) {
		this.rscuGac = rscuGac;
	}
	//get方法
	public Double getRscuCaa() {
		return rscuCaa;
	}

	//set方法
	public void setRscuCaa(Double rscuCaa) {
		this.rscuCaa = rscuCaa;
	}
	//get方法
	public Double getRscuCag() {
		return rscuCag;
	}

	//set方法
	public void setRscuCag(Double rscuCag) {
		this.rscuCag = rscuCag;
	}
	//get方法
	public Double getRscuCat() {
		return rscuCat;
	}

	//set方法
	public void setRscuCat(Double rscuCat) {
		this.rscuCat = rscuCat;
	}
	//get方法
	public Double getRscuCac() {
		return rscuCac;
	}

	//set方法
	public void setRscuCac(Double rscuCac) {
		this.rscuCac = rscuCac;
	}
	//get方法
	public Double getRscuGta() {
		return rscuGta;
	}

	//set方法
	public void setRscuGta(Double rscuGta) {
		this.rscuGta = rscuGta;
	}
	//get方法
	public Double getRscuGtg() {
		return rscuGtg;
	}

	//set方法
	public void setRscuGtg(Double rscuGtg) {
		this.rscuGtg = rscuGtg;
	}
	//get方法
	public Double getRscuGtt() {
		return rscuGtt;
	}

	//set方法
	public void setRscuGtt(Double rscuGtt) {
		this.rscuGtt = rscuGtt;
	}
	//get方法
	public Double getRscuGtc() {
		return rscuGtc;
	}

	//set方法
	public void setRscuGtc(Double rscuGtc) {
		this.rscuGtc = rscuGtc;
	}
	//get方法
	public Double getRscuCta() {
		return rscuCta;
	}

	//set方法
	public void setRscuCta(Double rscuCta) {
		this.rscuCta = rscuCta;
	}
	//get方法
	public Double getRscuCtg() {
		return rscuCtg;
	}

	//set方法
	public void setRscuCtg(Double rscuCtg) {
		this.rscuCtg = rscuCtg;
	}
	//get方法
	public Double getRscuCtt() {
		return rscuCtt;
	}

	//set方法
	public void setRscuCtt(Double rscuCtt) {
		this.rscuCtt = rscuCtt;
	}
	//get方法
	public Double getRscuCtc() {
		return rscuCtc;
	}

	//set方法
	public void setRscuCtc(Double rscuCtc) {
		this.rscuCtc = rscuCtc;
	}
	//get方法
	public Double getRscuAga() {
		return rscuAga;
	}

	//set方法
	public void setRscuAga(Double rscuAga) {
		this.rscuAga = rscuAga;
	}
	//get方法
	public Double getRscuAgg() {
		return rscuAgg;
	}

	//set方法
	public void setRscuAgg(Double rscuAgg) {
		this.rscuAgg = rscuAgg;
	}
	//get方法
	public Double getRscuAgt() {
		return rscuAgt;
	}

	//set方法
	public void setRscuAgt(Double rscuAgt) {
		this.rscuAgt = rscuAgt;
	}
	//get方法
	public Double getRscuAgc() {
		return rscuAgc;
	}

	//set方法
	public void setRscuAgc(Double rscuAgc) {
		this.rscuAgc = rscuAgc;
	}
	//get方法
	public Double getRscuTga() {
		return rscuTga;
	}

	//set方法
	public void setRscuTga(Double rscuTga) {
		this.rscuTga = rscuTga;
	}
	//get方法
	public Double getRscuTgg() {
		return rscuTgg;
	}

	//set方法
	public void setRscuTgg(Double rscuTgg) {
		this.rscuTgg = rscuTgg;
	}
	//get方法
	public Double getRscuTgt() {
		return rscuTgt;
	}

	//set方法
	public void setRscuTgt(Double rscuTgt) {
		this.rscuTgt = rscuTgt;
	}
	//get方法
	public Double getRscuTgc() {
		return rscuTgc;
	}

	//set方法
	public void setRscuTgc(Double rscuTgc) {
		this.rscuTgc = rscuTgc;
	}
	//get方法
	public Double getRscuAca() {
		return rscuAca;
	}

	//set方法
	public void setRscuAca(Double rscuAca) {
		this.rscuAca = rscuAca;
	}
	//get方法
	public Double getRscuAcg() {
		return rscuAcg;
	}

	//set方法
	public void setRscuAcg(Double rscuAcg) {
		this.rscuAcg = rscuAcg;
	}
	//get方法
	public Double getRscuAct() {
		return rscuAct;
	}

	//set方法
	public void setRscuAct(Double rscuAct) {
		this.rscuAct = rscuAct;
	}
	//get方法
	public Double getRscuAcc() {
		return rscuAcc;
	}

	//set方法
	public void setRscuAcc(Double rscuAcc) {
		this.rscuAcc = rscuAcc;
	}
	//get方法
	public Double getRscuTca() {
		return rscuTca;
	}

	//set方法
	public void setRscuTca(Double rscuTca) {
		this.rscuTca = rscuTca;
	}
	//get方法
	public Double getRscuTcg() {
		return rscuTcg;
	}

	//set方法
	public void setRscuTcg(Double rscuTcg) {
		this.rscuTcg = rscuTcg;
	}
	//get方法
	public Double getRscuTct() {
		return rscuTct;
	}

	//set方法
	public void setRscuTct(Double rscuTct) {
		this.rscuTct = rscuTct;
	}
	//get方法
	public Double getRscuTcc() {
		return rscuTcc;
	}

	//set方法
	public void setRscuTcc(Double rscuTcc) {
		this.rscuTcc = rscuTcc;
	}
	//get方法
	public Double getRscuGga() {
		return rscuGga;
	}

	//set方法
	public void setRscuGga(Double rscuGga) {
		this.rscuGga = rscuGga;
	}
	//get方法
	public Double getRscuGgg() {
		return rscuGgg;
	}

	//set方法
	public void setRscuGgg(Double rscuGgg) {
		this.rscuGgg = rscuGgg;
	}
	//get方法
	public Double getRscuGgt() {
		return rscuGgt;
	}

	//set方法
	public void setRscuGgt(Double rscuGgt) {
		this.rscuGgt = rscuGgt;
	}
	//get方法
	public Double getRscuGgc() {
		return rscuGgc;
	}

	//set方法
	public void setRscuGgc(Double rscuGgc) {
		this.rscuGgc = rscuGgc;
	}
	//get方法
	public Double getRscuCga() {
		return rscuCga;
	}

	//set方法
	public void setRscuCga(Double rscuCga) {
		this.rscuCga = rscuCga;
	}
	//get方法
	public Double getRscuCgg() {
		return rscuCgg;
	}

	//set方法
	public void setRscuCgg(Double rscuCgg) {
		this.rscuCgg = rscuCgg;
	}
	//get方法
	public Double getRscuCgt() {
		return rscuCgt;
	}

	//set方法
	public void setRscuCgt(Double rscuCgt) {
		this.rscuCgt = rscuCgt;
	}
	//get方法
	public Double getRscuCgc() {
		return rscuCgc;
	}

	//set方法
	public void setRscuCgc(Double rscuCgc) {
		this.rscuCgc = rscuCgc;
	}
	//get方法
	public Double getRscuGca() {
		return rscuGca;
	}

	//set方法
	public void setRscuGca(Double rscuGca) {
		this.rscuGca = rscuGca;
	}
	//get方法
	public Double getRscuGcg() {
		return rscuGcg;
	}

	//set方法
	public void setRscuGcg(Double rscuGcg) {
		this.rscuGcg = rscuGcg;
	}
	//get方法
	public Double getRscuGct() {
		return rscuGct;
	}

	//set方法
	public void setRscuGct(Double rscuGct) {
		this.rscuGct = rscuGct;
	}
	//get方法
	public Double getRscuGcc() {
		return rscuGcc;
	}

	//set方法
	public void setRscuGcc(Double rscuGcc) {
		this.rscuGcc = rscuGcc;
	}
	//get方法
	public Double getRscuCca() {
		return rscuCca;
	}

	//set方法
	public void setRscuCca(Double rscuCca) {
		this.rscuCca = rscuCca;
	}
	//get方法
	public Double getRscuCcg() {
		return rscuCcg;
	}

	//set方法
	public void setRscuCcg(Double rscuCcg) {
		this.rscuCcg = rscuCcg;
	}
	//get方法
	public Double getRscuCct() {
		return rscuCct;
	}

	//set方法
	public void setRscuCct(Double rscuCct) {
		this.rscuCct = rscuCct;
	}
	//get方法
	public Double getRscuCcc() {
		return rscuCcc;
	}

	//set方法
	public void setRscuCcc(Double rscuCcc) {
		this.rscuCcc = rscuCcc;
	}
	//get方法
	public Double getObservedAla() {
		return observedAla;
	}

	//set方法
	public void setObservedAla(Double observedAla) {
		this.observedAla = observedAla;
	}
	//get方法
	public Double getObservedCys() {
		return observedCys;
	}

	//set方法
	public void setObservedCys(Double observedCys) {
		this.observedCys = observedCys;
	}
	//get方法
	public Double getObservedAsp() {
		return observedAsp;
	}

	//set方法
	public void setObservedAsp(Double observedAsp) {
		this.observedAsp = observedAsp;
	}
	//get方法
	public Double getObservedGlu() {
		return observedGlu;
	}

	//set方法
	public void setObservedGlu(Double observedGlu) {
		this.observedGlu = observedGlu;
	}
	//get方法
	public Double getObservedPhe() {
		return observedPhe;
	}

	//set方法
	public void setObservedPhe(Double observedPhe) {
		this.observedPhe = observedPhe;
	}
	//get方法
	public Double getObservedGly() {
		return observedGly;
	}

	//set方法
	public void setObservedGly(Double observedGly) {
		this.observedGly = observedGly;
	}
	//get方法
	public Double getObservedHis() {
		return observedHis;
	}

	//set方法
	public void setObservedHis(Double observedHis) {
		this.observedHis = observedHis;
	}
	//get方法
	public Double getObservedIle() {
		return observedIle;
	}

	//set方法
	public void setObservedIle(Double observedIle) {
		this.observedIle = observedIle;
	}
	//get方法
	public Double getObservedLys() {
		return observedLys;
	}

	//set方法
	public void setObservedLys(Double observedLys) {
		this.observedLys = observedLys;
	}
	//get方法
	public Double getObservedLeu() {
		return observedLeu;
	}

	//set方法
	public void setObservedLeu(Double observedLeu) {
		this.observedLeu = observedLeu;
	}
	//get方法
	public Double getObservedMet() {
		return observedMet;
	}

	//set方法
	public void setObservedMet(Double observedMet) {
		this.observedMet = observedMet;
	}
	//get方法
	public Double getObservedAsn() {
		return observedAsn;
	}

	//set方法
	public void setObservedAsn(Double observedAsn) {
		this.observedAsn = observedAsn;
	}
	//get方法
	public Double getObservedPro() {
		return observedPro;
	}

	//set方法
	public void setObservedPro(Double observedPro) {
		this.observedPro = observedPro;
	}
	//get方法
	public Double getObservedGln() {
		return observedGln;
	}

	//set方法
	public void setObservedGln(Double observedGln) {
		this.observedGln = observedGln;
	}
	//get方法
	public Double getObservedArg() {
		return observedArg;
	}

	//set方法
	public void setObservedArg(Double observedArg) {
		this.observedArg = observedArg;
	}
	//get方法
	public Double getObservedSer() {
		return observedSer;
	}

	//set方法
	public void setObservedSer(Double observedSer) {
		this.observedSer = observedSer;
	}
	//get方法
	public Double getObservedThr() {
		return observedThr;
	}

	//set方法
	public void setObservedThr(Double observedThr) {
		this.observedThr = observedThr;
	}
	//get方法
	public Double getObservedVal() {
		return observedVal;
	}

	//set方法
	public void setObservedVal(Double observedVal) {
		this.observedVal = observedVal;
	}
	//get方法
	public Double getObservedTrp() {
		return observedTrp;
	}

	//set方法
	public void setObservedTrp(Double observedTrp) {
		this.observedTrp = observedTrp;
	}
	//get方法
	public Double getObservedTyr() {
		return observedTyr;
	}

	//set方法
	public void setObservedTyr(Double observedTyr) {
		this.observedTyr = observedTyr;
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
