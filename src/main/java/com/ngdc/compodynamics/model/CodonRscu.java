package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodonRscu构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="codon_rscu")
public class CodonRscu implements Serializable{

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "organism")
	private String organism;//

    @Column(name = "assembly_accession")
	private String assemblyAccession;//

    @Column(name = "cds_index")
	private Integer cdsIndex;//

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "gene_id")
	private String geneId;//

    @Column(name = "protein_id")
	private String proteinId;//

    @Column(name = "cdc")
	private Double cdc;//

    @Column(name = "enc")
	private Double enc;//

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
	public Integer getSpeciseIndex() {
		return speciseIndex;
	}

	//set方法
	public void setSpeciseIndex(Integer speciseIndex) {
		this.speciseIndex = speciseIndex;
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
	public Double getCdc() {
		return cdc;
	}

	//set方法
	public void setCdc(Double cdc) {
		this.cdc = cdc;
	}
	//get方法
	public Double getEnc() {
		return enc;
	}

	//set方法
	public void setEnc(Double enc) {
		this.enc = enc;
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
	public Long getId() {
		return id;
	}

	//set方法
	public void setId(Long id) {
		this.id = id;
	}


}
