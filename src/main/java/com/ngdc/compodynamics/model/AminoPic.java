package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:AminoPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="amino_pic")
public class AminoPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_observed_ala")
	private Double minObservedAla;//

    @Column(name = "min_observed_cys")
	private Double minObservedCys;//

    @Column(name = "min_observed_asp")
	private Double minObservedAsp;//

    @Column(name = "min_observed_glu")
	private Double minObservedGlu;//

    @Column(name = "min_observed_phe")
	private Double minObservedPhe;//

    @Column(name = "min_observed_gly")
	private Double minObservedGly;//

    @Column(name = "min_observed_his")
	private Double minObservedHis;//

    @Column(name = "min_observed_ile")
	private Double minObservedIle;//

    @Column(name = "min_observed_lys")
	private Double minObservedLys;//

    @Column(name = "min_observed_leu")
	private Double minObservedLeu;//

    @Column(name = "min_observed_met")
	private Double minObservedMet;//

    @Column(name = "min_observed_asn")
	private Double minObservedAsn;//

    @Column(name = "min_observed_pro")
	private Double minObservedPro;//

    @Column(name = "min_observed_gln")
	private Double minObservedGln;//

    @Column(name = "min_observed_arg")
	private Double minObservedArg;//

    @Column(name = "min_observed_ser")
	private Double minObservedSer;//

    @Column(name = "min_observed_thr")
	private Double minObservedThr;//

    @Column(name = "min_observed_val")
	private Double minObservedVal;//

    @Column(name = "min_observed_trp")
	private Double minObservedTrp;//

    @Column(name = "min_observed_tyr")
	private Double minObservedTyr;//

    @Column(name = "truemin_observed_ala")
	private Double trueminObservedAla;//

    @Column(name = "truemin_observed_cys")
	private Double trueminObservedCys;//

    @Column(name = "truemin_observed_asp")
	private Double trueminObservedAsp;//

    @Column(name = "truemin_observed_glu")
	private Double trueminObservedGlu;//

    @Column(name = "truemin_observed_phe")
	private Double trueminObservedPhe;//

    @Column(name = "truemin_observed_gly")
	private Double trueminObservedGly;//

    @Column(name = "truemin_observed_his")
	private Double trueminObservedHis;//

    @Column(name = "truemin_observed_ile")
	private Double trueminObservedIle;//

    @Column(name = "truemin_observed_lys")
	private Double trueminObservedLys;//

    @Column(name = "truemin_observed_leu")
	private Double trueminObservedLeu;//

    @Column(name = "truemin_observed_met")
	private Double trueminObservedMet;//

    @Column(name = "truemin_observed_asn")
	private Double trueminObservedAsn;//

    @Column(name = "truemin_observed_pro")
	private Double trueminObservedPro;//

    @Column(name = "truemin_observed_gln")
	private Double trueminObservedGln;//

    @Column(name = "truemin_observed_arg")
	private Double trueminObservedArg;//

    @Column(name = "truemin_observed_ser")
	private Double trueminObservedSer;//

    @Column(name = "truemin_observed_thr")
	private Double trueminObservedThr;//

    @Column(name = "truemin_observed_val")
	private Double trueminObservedVal;//

    @Column(name = "truemin_observed_trp")
	private Double trueminObservedTrp;//

    @Column(name = "truemin_observed_tyr")
	private Double trueminObservedTyr;//

    @Column(name = "q05_observed_ala")
	private Double q05ObservedAla;//

    @Column(name = "q05_observed_cys")
	private Double q05ObservedCys;//

    @Column(name = "q05_observed_asp")
	private Double q05ObservedAsp;//

    @Column(name = "q05_observed_glu")
	private Double q05ObservedGlu;//

    @Column(name = "q05_observed_phe")
	private Double q05ObservedPhe;//

    @Column(name = "q05_observed_gly")
	private Double q05ObservedGly;//

    @Column(name = "q05_observed_his")
	private Double q05ObservedHis;//

    @Column(name = "q05_observed_ile")
	private Double q05ObservedIle;//

    @Column(name = "q05_observed_lys")
	private Double q05ObservedLys;//

    @Column(name = "q05_observed_leu")
	private Double q05ObservedLeu;//

    @Column(name = "q05_observed_met")
	private Double q05ObservedMet;//

    @Column(name = "q05_observed_asn")
	private Double q05ObservedAsn;//

    @Column(name = "q05_observed_pro")
	private Double q05ObservedPro;//

    @Column(name = "q05_observed_gln")
	private Double q05ObservedGln;//

    @Column(name = "q05_observed_arg")
	private Double q05ObservedArg;//

    @Column(name = "q05_observed_ser")
	private Double q05ObservedSer;//

    @Column(name = "q05_observed_thr")
	private Double q05ObservedThr;//

    @Column(name = "q05_observed_val")
	private Double q05ObservedVal;//

    @Column(name = "q05_observed_trp")
	private Double q05ObservedTrp;//

    @Column(name = "q05_observed_tyr")
	private Double q05ObservedTyr;//

    @Column(name = "q25_observed_ala")
	private Double q25ObservedAla;//

    @Column(name = "q25_observed_cys")
	private Double q25ObservedCys;//

    @Column(name = "q25_observed_asp")
	private Double q25ObservedAsp;//

    @Column(name = "q25_observed_glu")
	private Double q25ObservedGlu;//

    @Column(name = "q25_observed_phe")
	private Double q25ObservedPhe;//

    @Column(name = "q25_observed_gly")
	private Double q25ObservedGly;//

    @Column(name = "q25_observed_his")
	private Double q25ObservedHis;//

    @Column(name = "q25_observed_ile")
	private Double q25ObservedIle;//

    @Column(name = "q25_observed_lys")
	private Double q25ObservedLys;//

    @Column(name = "q25_observed_leu")
	private Double q25ObservedLeu;//

    @Column(name = "q25_observed_met")
	private Double q25ObservedMet;//

    @Column(name = "q25_observed_asn")
	private Double q25ObservedAsn;//

    @Column(name = "q25_observed_pro")
	private Double q25ObservedPro;//

    @Column(name = "q25_observed_gln")
	private Double q25ObservedGln;//

    @Column(name = "q25_observed_arg")
	private Double q25ObservedArg;//

    @Column(name = "q25_observed_ser")
	private Double q25ObservedSer;//

    @Column(name = "q25_observed_thr")
	private Double q25ObservedThr;//

    @Column(name = "q25_observed_val")
	private Double q25ObservedVal;//

    @Column(name = "q25_observed_trp")
	private Double q25ObservedTrp;//

    @Column(name = "q25_observed_tyr")
	private Double q25ObservedTyr;//

    @Column(name = "q50_observed_ala")
	private Double q50ObservedAla;//

    @Column(name = "q50_observed_cys")
	private Double q50ObservedCys;//

    @Column(name = "q50_observed_asp")
	private Double q50ObservedAsp;//

    @Column(name = "q50_observed_glu")
	private Double q50ObservedGlu;//

    @Column(name = "q50_observed_phe")
	private Double q50ObservedPhe;//

    @Column(name = "q50_observed_gly")
	private Double q50ObservedGly;//

    @Column(name = "q50_observed_his")
	private Double q50ObservedHis;//

    @Column(name = "q50_observed_ile")
	private Double q50ObservedIle;//

    @Column(name = "q50_observed_lys")
	private Double q50ObservedLys;//

    @Column(name = "q50_observed_leu")
	private Double q50ObservedLeu;//

    @Column(name = "q50_observed_met")
	private Double q50ObservedMet;//

    @Column(name = "q50_observed_asn")
	private Double q50ObservedAsn;//

    @Column(name = "q50_observed_pro")
	private Double q50ObservedPro;//

    @Column(name = "q50_observed_gln")
	private Double q50ObservedGln;//

    @Column(name = "q50_observed_arg")
	private Double q50ObservedArg;//

    @Column(name = "q50_observed_ser")
	private Double q50ObservedSer;//

    @Column(name = "q50_observed_thr")
	private Double q50ObservedThr;//

    @Column(name = "q50_observed_val")
	private Double q50ObservedVal;//

    @Column(name = "q50_observed_trp")
	private Double q50ObservedTrp;//

    @Column(name = "q50_observed_tyr")
	private Double q50ObservedTyr;//

    @Column(name = "q75_observed_ala")
	private Double q75ObservedAla;//

    @Column(name = "q75_observed_cys")
	private Double q75ObservedCys;//

    @Column(name = "q75_observed_asp")
	private Double q75ObservedAsp;//

    @Column(name = "q75_observed_glu")
	private Double q75ObservedGlu;//

    @Column(name = "q75_observed_phe")
	private Double q75ObservedPhe;//

    @Column(name = "q75_observed_gly")
	private Double q75ObservedGly;//

    @Column(name = "q75_observed_his")
	private Double q75ObservedHis;//

    @Column(name = "q75_observed_ile")
	private Double q75ObservedIle;//

    @Column(name = "q75_observed_lys")
	private Double q75ObservedLys;//

    @Column(name = "q75_observed_leu")
	private Double q75ObservedLeu;//

    @Column(name = "q75_observed_met")
	private Double q75ObservedMet;//

    @Column(name = "q75_observed_asn")
	private Double q75ObservedAsn;//

    @Column(name = "q75_observed_pro")
	private Double q75ObservedPro;//

    @Column(name = "q75_observed_gln")
	private Double q75ObservedGln;//

    @Column(name = "q75_observed_arg")
	private Double q75ObservedArg;//

    @Column(name = "q75_observed_ser")
	private Double q75ObservedSer;//

    @Column(name = "q75_observed_thr")
	private Double q75ObservedThr;//

    @Column(name = "q75_observed_val")
	private Double q75ObservedVal;//

    @Column(name = "q75_observed_trp")
	private Double q75ObservedTrp;//

    @Column(name = "q75_observed_tyr")
	private Double q75ObservedTyr;//

    @Column(name = "q95_observed_ala")
	private Double q95ObservedAla;//

    @Column(name = "q95_observed_cys")
	private Double q95ObservedCys;//

    @Column(name = "q95_observed_asp")
	private Double q95ObservedAsp;//

    @Column(name = "q95_observed_glu")
	private Double q95ObservedGlu;//

    @Column(name = "q95_observed_phe")
	private Double q95ObservedPhe;//

    @Column(name = "q95_observed_gly")
	private Double q95ObservedGly;//

    @Column(name = "q95_observed_his")
	private Double q95ObservedHis;//

    @Column(name = "q95_observed_ile")
	private Double q95ObservedIle;//

    @Column(name = "q95_observed_lys")
	private Double q95ObservedLys;//

    @Column(name = "q95_observed_leu")
	private Double q95ObservedLeu;//

    @Column(name = "q95_observed_met")
	private Double q95ObservedMet;//

    @Column(name = "q95_observed_asn")
	private Double q95ObservedAsn;//

    @Column(name = "q95_observed_pro")
	private Double q95ObservedPro;//

    @Column(name = "q95_observed_gln")
	private Double q95ObservedGln;//

    @Column(name = "q95_observed_arg")
	private Double q95ObservedArg;//

    @Column(name = "q95_observed_ser")
	private Double q95ObservedSer;//

    @Column(name = "q95_observed_thr")
	private Double q95ObservedThr;//

    @Column(name = "q95_observed_val")
	private Double q95ObservedVal;//

    @Column(name = "q95_observed_trp")
	private Double q95ObservedTrp;//

    @Column(name = "q95_observed_tyr")
	private Double q95ObservedTyr;//

    @Column(name = "truemax_observed_ala")
	private Double truemaxObservedAla;//

    @Column(name = "truemax_observed_cys")
	private Double truemaxObservedCys;//

    @Column(name = "truemax_observed_asp")
	private Double truemaxObservedAsp;//

    @Column(name = "truemax_observed_glu")
	private Double truemaxObservedGlu;//

    @Column(name = "truemax_observed_phe")
	private Double truemaxObservedPhe;//

    @Column(name = "truemax_observed_gly")
	private Double truemaxObservedGly;//

    @Column(name = "truemax_observed_his")
	private Double truemaxObservedHis;//

    @Column(name = "truemax_observed_ile")
	private Double truemaxObservedIle;//

    @Column(name = "truemax_observed_lys")
	private Double truemaxObservedLys;//

    @Column(name = "truemax_observed_leu")
	private Double truemaxObservedLeu;//

    @Column(name = "truemax_observed_met")
	private Double truemaxObservedMet;//

    @Column(name = "truemax_observed_asn")
	private Double truemaxObservedAsn;//

    @Column(name = "truemax_observed_pro")
	private Double truemaxObservedPro;//

    @Column(name = "truemax_observed_gln")
	private Double truemaxObservedGln;//

    @Column(name = "truemax_observed_arg")
	private Double truemaxObservedArg;//

    @Column(name = "truemax_observed_ser")
	private Double truemaxObservedSer;//

    @Column(name = "truemax_observed_thr")
	private Double truemaxObservedThr;//

    @Column(name = "truemax_observed_val")
	private Double truemaxObservedVal;//

    @Column(name = "truemax_observed_trp")
	private Double truemaxObservedTrp;//

    @Column(name = "truemax_observed_tyr")
	private Double truemaxObservedTyr;//

    @Column(name = "max_observed_ala")
	private Double maxObservedAla;//

    @Column(name = "max_observed_cys")
	private Double maxObservedCys;//

    @Column(name = "max_observed_asp")
	private Double maxObservedAsp;//

    @Column(name = "max_observed_glu")
	private Double maxObservedGlu;//

    @Column(name = "max_observed_phe")
	private Double maxObservedPhe;//

    @Column(name = "max_observed_gly")
	private Double maxObservedGly;//

    @Column(name = "max_observed_his")
	private Double maxObservedHis;//

    @Column(name = "max_observed_ile")
	private Double maxObservedIle;//

    @Column(name = "max_observed_lys")
	private Double maxObservedLys;//

    @Column(name = "max_observed_leu")
	private Double maxObservedLeu;//

    @Column(name = "max_observed_met")
	private Double maxObservedMet;//

    @Column(name = "max_observed_asn")
	private Double maxObservedAsn;//

    @Column(name = "max_observed_pro")
	private Double maxObservedPro;//

    @Column(name = "max_observed_gln")
	private Double maxObservedGln;//

    @Column(name = "max_observed_arg")
	private Double maxObservedArg;//

    @Column(name = "max_observed_ser")
	private Double maxObservedSer;//

    @Column(name = "max_observed_thr")
	private Double maxObservedThr;//

    @Column(name = "max_observed_val")
	private Double maxObservedVal;//

    @Column(name = "max_observed_trp")
	private Double maxObservedTrp;//

    @Column(name = "max_observed_tyr")
	private Double maxObservedTyr;//

    @Column(name = "mean_observed_ala")
	private Double meanObservedAla;//

    @Column(name = "mean_observed_cys")
	private Double meanObservedCys;//

    @Column(name = "mean_observed_asp")
	private Double meanObservedAsp;//

    @Column(name = "mean_observed_glu")
	private Double meanObservedGlu;//

    @Column(name = "mean_observed_phe")
	private Double meanObservedPhe;//

    @Column(name = "mean_observed_gly")
	private Double meanObservedGly;//

    @Column(name = "mean_observed_his")
	private Double meanObservedHis;//

    @Column(name = "mean_observed_ile")
	private Double meanObservedIle;//

    @Column(name = "mean_observed_lys")
	private Double meanObservedLys;//

    @Column(name = "mean_observed_leu")
	private Double meanObservedLeu;//

    @Column(name = "mean_observed_met")
	private Double meanObservedMet;//

    @Column(name = "mean_observed_asn")
	private Double meanObservedAsn;//

    @Column(name = "mean_observed_pro")
	private Double meanObservedPro;//

    @Column(name = "mean_observed_gln")
	private Double meanObservedGln;//

    @Column(name = "mean_observed_arg")
	private Double meanObservedArg;//

    @Column(name = "mean_observed_ser")
	private Double meanObservedSer;//

    @Column(name = "mean_observed_thr")
	private Double meanObservedThr;//

    @Column(name = "mean_observed_val")
	private Double meanObservedVal;//

    @Column(name = "mean_observed_trp")
	private Double meanObservedTrp;//

    @Column(name = "mean_observed_tyr")
	private Double meanObservedTyr;//

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
	public Double getMinObservedAla() {
		return minObservedAla;
	}

	//set方法
	public void setMinObservedAla(Double minObservedAla) {
		this.minObservedAla = minObservedAla;
	}
	//get方法
	public Double getMinObservedCys() {
		return minObservedCys;
	}

	//set方法
	public void setMinObservedCys(Double minObservedCys) {
		this.minObservedCys = minObservedCys;
	}
	//get方法
	public Double getMinObservedAsp() {
		return minObservedAsp;
	}

	//set方法
	public void setMinObservedAsp(Double minObservedAsp) {
		this.minObservedAsp = minObservedAsp;
	}
	//get方法
	public Double getMinObservedGlu() {
		return minObservedGlu;
	}

	//set方法
	public void setMinObservedGlu(Double minObservedGlu) {
		this.minObservedGlu = minObservedGlu;
	}
	//get方法
	public Double getMinObservedPhe() {
		return minObservedPhe;
	}

	//set方法
	public void setMinObservedPhe(Double minObservedPhe) {
		this.minObservedPhe = minObservedPhe;
	}
	//get方法
	public Double getMinObservedGly() {
		return minObservedGly;
	}

	//set方法
	public void setMinObservedGly(Double minObservedGly) {
		this.minObservedGly = minObservedGly;
	}
	//get方法
	public Double getMinObservedHis() {
		return minObservedHis;
	}

	//set方法
	public void setMinObservedHis(Double minObservedHis) {
		this.minObservedHis = minObservedHis;
	}
	//get方法
	public Double getMinObservedIle() {
		return minObservedIle;
	}

	//set方法
	public void setMinObservedIle(Double minObservedIle) {
		this.minObservedIle = minObservedIle;
	}
	//get方法
	public Double getMinObservedLys() {
		return minObservedLys;
	}

	//set方法
	public void setMinObservedLys(Double minObservedLys) {
		this.minObservedLys = minObservedLys;
	}
	//get方法
	public Double getMinObservedLeu() {
		return minObservedLeu;
	}

	//set方法
	public void setMinObservedLeu(Double minObservedLeu) {
		this.minObservedLeu = minObservedLeu;
	}
	//get方法
	public Double getMinObservedMet() {
		return minObservedMet;
	}

	//set方法
	public void setMinObservedMet(Double minObservedMet) {
		this.minObservedMet = minObservedMet;
	}
	//get方法
	public Double getMinObservedAsn() {
		return minObservedAsn;
	}

	//set方法
	public void setMinObservedAsn(Double minObservedAsn) {
		this.minObservedAsn = minObservedAsn;
	}
	//get方法
	public Double getMinObservedPro() {
		return minObservedPro;
	}

	//set方法
	public void setMinObservedPro(Double minObservedPro) {
		this.minObservedPro = minObservedPro;
	}
	//get方法
	public Double getMinObservedGln() {
		return minObservedGln;
	}

	//set方法
	public void setMinObservedGln(Double minObservedGln) {
		this.minObservedGln = minObservedGln;
	}
	//get方法
	public Double getMinObservedArg() {
		return minObservedArg;
	}

	//set方法
	public void setMinObservedArg(Double minObservedArg) {
		this.minObservedArg = minObservedArg;
	}
	//get方法
	public Double getMinObservedSer() {
		return minObservedSer;
	}

	//set方法
	public void setMinObservedSer(Double minObservedSer) {
		this.minObservedSer = minObservedSer;
	}
	//get方法
	public Double getMinObservedThr() {
		return minObservedThr;
	}

	//set方法
	public void setMinObservedThr(Double minObservedThr) {
		this.minObservedThr = minObservedThr;
	}
	//get方法
	public Double getMinObservedVal() {
		return minObservedVal;
	}

	//set方法
	public void setMinObservedVal(Double minObservedVal) {
		this.minObservedVal = minObservedVal;
	}
	//get方法
	public Double getMinObservedTrp() {
		return minObservedTrp;
	}

	//set方法
	public void setMinObservedTrp(Double minObservedTrp) {
		this.minObservedTrp = minObservedTrp;
	}
	//get方法
	public Double getMinObservedTyr() {
		return minObservedTyr;
	}

	//set方法
	public void setMinObservedTyr(Double minObservedTyr) {
		this.minObservedTyr = minObservedTyr;
	}
	//get方法
	public Double getTrueminObservedAla() {
		return trueminObservedAla;
	}

	//set方法
	public void setTrueminObservedAla(Double trueminObservedAla) {
		this.trueminObservedAla = trueminObservedAla;
	}
	//get方法
	public Double getTrueminObservedCys() {
		return trueminObservedCys;
	}

	//set方法
	public void setTrueminObservedCys(Double trueminObservedCys) {
		this.trueminObservedCys = trueminObservedCys;
	}
	//get方法
	public Double getTrueminObservedAsp() {
		return trueminObservedAsp;
	}

	//set方法
	public void setTrueminObservedAsp(Double trueminObservedAsp) {
		this.trueminObservedAsp = trueminObservedAsp;
	}
	//get方法
	public Double getTrueminObservedGlu() {
		return trueminObservedGlu;
	}

	//set方法
	public void setTrueminObservedGlu(Double trueminObservedGlu) {
		this.trueminObservedGlu = trueminObservedGlu;
	}
	//get方法
	public Double getTrueminObservedPhe() {
		return trueminObservedPhe;
	}

	//set方法
	public void setTrueminObservedPhe(Double trueminObservedPhe) {
		this.trueminObservedPhe = trueminObservedPhe;
	}
	//get方法
	public Double getTrueminObservedGly() {
		return trueminObservedGly;
	}

	//set方法
	public void setTrueminObservedGly(Double trueminObservedGly) {
		this.trueminObservedGly = trueminObservedGly;
	}
	//get方法
	public Double getTrueminObservedHis() {
		return trueminObservedHis;
	}

	//set方法
	public void setTrueminObservedHis(Double trueminObservedHis) {
		this.trueminObservedHis = trueminObservedHis;
	}
	//get方法
	public Double getTrueminObservedIle() {
		return trueminObservedIle;
	}

	//set方法
	public void setTrueminObservedIle(Double trueminObservedIle) {
		this.trueminObservedIle = trueminObservedIle;
	}
	//get方法
	public Double getTrueminObservedLys() {
		return trueminObservedLys;
	}

	//set方法
	public void setTrueminObservedLys(Double trueminObservedLys) {
		this.trueminObservedLys = trueminObservedLys;
	}
	//get方法
	public Double getTrueminObservedLeu() {
		return trueminObservedLeu;
	}

	//set方法
	public void setTrueminObservedLeu(Double trueminObservedLeu) {
		this.trueminObservedLeu = trueminObservedLeu;
	}
	//get方法
	public Double getTrueminObservedMet() {
		return trueminObservedMet;
	}

	//set方法
	public void setTrueminObservedMet(Double trueminObservedMet) {
		this.trueminObservedMet = trueminObservedMet;
	}
	//get方法
	public Double getTrueminObservedAsn() {
		return trueminObservedAsn;
	}

	//set方法
	public void setTrueminObservedAsn(Double trueminObservedAsn) {
		this.trueminObservedAsn = trueminObservedAsn;
	}
	//get方法
	public Double getTrueminObservedPro() {
		return trueminObservedPro;
	}

	//set方法
	public void setTrueminObservedPro(Double trueminObservedPro) {
		this.trueminObservedPro = trueminObservedPro;
	}
	//get方法
	public Double getTrueminObservedGln() {
		return trueminObservedGln;
	}

	//set方法
	public void setTrueminObservedGln(Double trueminObservedGln) {
		this.trueminObservedGln = trueminObservedGln;
	}
	//get方法
	public Double getTrueminObservedArg() {
		return trueminObservedArg;
	}

	//set方法
	public void setTrueminObservedArg(Double trueminObservedArg) {
		this.trueminObservedArg = trueminObservedArg;
	}
	//get方法
	public Double getTrueminObservedSer() {
		return trueminObservedSer;
	}

	//set方法
	public void setTrueminObservedSer(Double trueminObservedSer) {
		this.trueminObservedSer = trueminObservedSer;
	}
	//get方法
	public Double getTrueminObservedThr() {
		return trueminObservedThr;
	}

	//set方法
	public void setTrueminObservedThr(Double trueminObservedThr) {
		this.trueminObservedThr = trueminObservedThr;
	}
	//get方法
	public Double getTrueminObservedVal() {
		return trueminObservedVal;
	}

	//set方法
	public void setTrueminObservedVal(Double trueminObservedVal) {
		this.trueminObservedVal = trueminObservedVal;
	}
	//get方法
	public Double getTrueminObservedTrp() {
		return trueminObservedTrp;
	}

	//set方法
	public void setTrueminObservedTrp(Double trueminObservedTrp) {
		this.trueminObservedTrp = trueminObservedTrp;
	}
	//get方法
	public Double getTrueminObservedTyr() {
		return trueminObservedTyr;
	}

	//set方法
	public void setTrueminObservedTyr(Double trueminObservedTyr) {
		this.trueminObservedTyr = trueminObservedTyr;
	}
	//get方法
	public Double getQ05ObservedAla() {
		return q05ObservedAla;
	}

	//set方法
	public void setQ05ObservedAla(Double q05ObservedAla) {
		this.q05ObservedAla = q05ObservedAla;
	}
	//get方法
	public Double getQ05ObservedCys() {
		return q05ObservedCys;
	}

	//set方法
	public void setQ05ObservedCys(Double q05ObservedCys) {
		this.q05ObservedCys = q05ObservedCys;
	}
	//get方法
	public Double getQ05ObservedAsp() {
		return q05ObservedAsp;
	}

	//set方法
	public void setQ05ObservedAsp(Double q05ObservedAsp) {
		this.q05ObservedAsp = q05ObservedAsp;
	}
	//get方法
	public Double getQ05ObservedGlu() {
		return q05ObservedGlu;
	}

	//set方法
	public void setQ05ObservedGlu(Double q05ObservedGlu) {
		this.q05ObservedGlu = q05ObservedGlu;
	}
	//get方法
	public Double getQ05ObservedPhe() {
		return q05ObservedPhe;
	}

	//set方法
	public void setQ05ObservedPhe(Double q05ObservedPhe) {
		this.q05ObservedPhe = q05ObservedPhe;
	}
	//get方法
	public Double getQ05ObservedGly() {
		return q05ObservedGly;
	}

	//set方法
	public void setQ05ObservedGly(Double q05ObservedGly) {
		this.q05ObservedGly = q05ObservedGly;
	}
	//get方法
	public Double getQ05ObservedHis() {
		return q05ObservedHis;
	}

	//set方法
	public void setQ05ObservedHis(Double q05ObservedHis) {
		this.q05ObservedHis = q05ObservedHis;
	}
	//get方法
	public Double getQ05ObservedIle() {
		return q05ObservedIle;
	}

	//set方法
	public void setQ05ObservedIle(Double q05ObservedIle) {
		this.q05ObservedIle = q05ObservedIle;
	}
	//get方法
	public Double getQ05ObservedLys() {
		return q05ObservedLys;
	}

	//set方法
	public void setQ05ObservedLys(Double q05ObservedLys) {
		this.q05ObservedLys = q05ObservedLys;
	}
	//get方法
	public Double getQ05ObservedLeu() {
		return q05ObservedLeu;
	}

	//set方法
	public void setQ05ObservedLeu(Double q05ObservedLeu) {
		this.q05ObservedLeu = q05ObservedLeu;
	}
	//get方法
	public Double getQ05ObservedMet() {
		return q05ObservedMet;
	}

	//set方法
	public void setQ05ObservedMet(Double q05ObservedMet) {
		this.q05ObservedMet = q05ObservedMet;
	}
	//get方法
	public Double getQ05ObservedAsn() {
		return q05ObservedAsn;
	}

	//set方法
	public void setQ05ObservedAsn(Double q05ObservedAsn) {
		this.q05ObservedAsn = q05ObservedAsn;
	}
	//get方法
	public Double getQ05ObservedPro() {
		return q05ObservedPro;
	}

	//set方法
	public void setQ05ObservedPro(Double q05ObservedPro) {
		this.q05ObservedPro = q05ObservedPro;
	}
	//get方法
	public Double getQ05ObservedGln() {
		return q05ObservedGln;
	}

	//set方法
	public void setQ05ObservedGln(Double q05ObservedGln) {
		this.q05ObservedGln = q05ObservedGln;
	}
	//get方法
	public Double getQ05ObservedArg() {
		return q05ObservedArg;
	}

	//set方法
	public void setQ05ObservedArg(Double q05ObservedArg) {
		this.q05ObservedArg = q05ObservedArg;
	}
	//get方法
	public Double getQ05ObservedSer() {
		return q05ObservedSer;
	}

	//set方法
	public void setQ05ObservedSer(Double q05ObservedSer) {
		this.q05ObservedSer = q05ObservedSer;
	}
	//get方法
	public Double getQ05ObservedThr() {
		return q05ObservedThr;
	}

	//set方法
	public void setQ05ObservedThr(Double q05ObservedThr) {
		this.q05ObservedThr = q05ObservedThr;
	}
	//get方法
	public Double getQ05ObservedVal() {
		return q05ObservedVal;
	}

	//set方法
	public void setQ05ObservedVal(Double q05ObservedVal) {
		this.q05ObservedVal = q05ObservedVal;
	}
	//get方法
	public Double getQ05ObservedTrp() {
		return q05ObservedTrp;
	}

	//set方法
	public void setQ05ObservedTrp(Double q05ObservedTrp) {
		this.q05ObservedTrp = q05ObservedTrp;
	}
	//get方法
	public Double getQ05ObservedTyr() {
		return q05ObservedTyr;
	}

	//set方法
	public void setQ05ObservedTyr(Double q05ObservedTyr) {
		this.q05ObservedTyr = q05ObservedTyr;
	}
	//get方法
	public Double getQ25ObservedAla() {
		return q25ObservedAla;
	}

	//set方法
	public void setQ25ObservedAla(Double q25ObservedAla) {
		this.q25ObservedAla = q25ObservedAla;
	}
	//get方法
	public Double getQ25ObservedCys() {
		return q25ObservedCys;
	}

	//set方法
	public void setQ25ObservedCys(Double q25ObservedCys) {
		this.q25ObservedCys = q25ObservedCys;
	}
	//get方法
	public Double getQ25ObservedAsp() {
		return q25ObservedAsp;
	}

	//set方法
	public void setQ25ObservedAsp(Double q25ObservedAsp) {
		this.q25ObservedAsp = q25ObservedAsp;
	}
	//get方法
	public Double getQ25ObservedGlu() {
		return q25ObservedGlu;
	}

	//set方法
	public void setQ25ObservedGlu(Double q25ObservedGlu) {
		this.q25ObservedGlu = q25ObservedGlu;
	}
	//get方法
	public Double getQ25ObservedPhe() {
		return q25ObservedPhe;
	}

	//set方法
	public void setQ25ObservedPhe(Double q25ObservedPhe) {
		this.q25ObservedPhe = q25ObservedPhe;
	}
	//get方法
	public Double getQ25ObservedGly() {
		return q25ObservedGly;
	}

	//set方法
	public void setQ25ObservedGly(Double q25ObservedGly) {
		this.q25ObservedGly = q25ObservedGly;
	}
	//get方法
	public Double getQ25ObservedHis() {
		return q25ObservedHis;
	}

	//set方法
	public void setQ25ObservedHis(Double q25ObservedHis) {
		this.q25ObservedHis = q25ObservedHis;
	}
	//get方法
	public Double getQ25ObservedIle() {
		return q25ObservedIle;
	}

	//set方法
	public void setQ25ObservedIle(Double q25ObservedIle) {
		this.q25ObservedIle = q25ObservedIle;
	}
	//get方法
	public Double getQ25ObservedLys() {
		return q25ObservedLys;
	}

	//set方法
	public void setQ25ObservedLys(Double q25ObservedLys) {
		this.q25ObservedLys = q25ObservedLys;
	}
	//get方法
	public Double getQ25ObservedLeu() {
		return q25ObservedLeu;
	}

	//set方法
	public void setQ25ObservedLeu(Double q25ObservedLeu) {
		this.q25ObservedLeu = q25ObservedLeu;
	}
	//get方法
	public Double getQ25ObservedMet() {
		return q25ObservedMet;
	}

	//set方法
	public void setQ25ObservedMet(Double q25ObservedMet) {
		this.q25ObservedMet = q25ObservedMet;
	}
	//get方法
	public Double getQ25ObservedAsn() {
		return q25ObservedAsn;
	}

	//set方法
	public void setQ25ObservedAsn(Double q25ObservedAsn) {
		this.q25ObservedAsn = q25ObservedAsn;
	}
	//get方法
	public Double getQ25ObservedPro() {
		return q25ObservedPro;
	}

	//set方法
	public void setQ25ObservedPro(Double q25ObservedPro) {
		this.q25ObservedPro = q25ObservedPro;
	}
	//get方法
	public Double getQ25ObservedGln() {
		return q25ObservedGln;
	}

	//set方法
	public void setQ25ObservedGln(Double q25ObservedGln) {
		this.q25ObservedGln = q25ObservedGln;
	}
	//get方法
	public Double getQ25ObservedArg() {
		return q25ObservedArg;
	}

	//set方法
	public void setQ25ObservedArg(Double q25ObservedArg) {
		this.q25ObservedArg = q25ObservedArg;
	}
	//get方法
	public Double getQ25ObservedSer() {
		return q25ObservedSer;
	}

	//set方法
	public void setQ25ObservedSer(Double q25ObservedSer) {
		this.q25ObservedSer = q25ObservedSer;
	}
	//get方法
	public Double getQ25ObservedThr() {
		return q25ObservedThr;
	}

	//set方法
	public void setQ25ObservedThr(Double q25ObservedThr) {
		this.q25ObservedThr = q25ObservedThr;
	}
	//get方法
	public Double getQ25ObservedVal() {
		return q25ObservedVal;
	}

	//set方法
	public void setQ25ObservedVal(Double q25ObservedVal) {
		this.q25ObservedVal = q25ObservedVal;
	}
	//get方法
	public Double getQ25ObservedTrp() {
		return q25ObservedTrp;
	}

	//set方法
	public void setQ25ObservedTrp(Double q25ObservedTrp) {
		this.q25ObservedTrp = q25ObservedTrp;
	}
	//get方法
	public Double getQ25ObservedTyr() {
		return q25ObservedTyr;
	}

	//set方法
	public void setQ25ObservedTyr(Double q25ObservedTyr) {
		this.q25ObservedTyr = q25ObservedTyr;
	}
	//get方法
	public Double getQ50ObservedAla() {
		return q50ObservedAla;
	}

	//set方法
	public void setQ50ObservedAla(Double q50ObservedAla) {
		this.q50ObservedAla = q50ObservedAla;
	}
	//get方法
	public Double getQ50ObservedCys() {
		return q50ObservedCys;
	}

	//set方法
	public void setQ50ObservedCys(Double q50ObservedCys) {
		this.q50ObservedCys = q50ObservedCys;
	}
	//get方法
	public Double getQ50ObservedAsp() {
		return q50ObservedAsp;
	}

	//set方法
	public void setQ50ObservedAsp(Double q50ObservedAsp) {
		this.q50ObservedAsp = q50ObservedAsp;
	}
	//get方法
	public Double getQ50ObservedGlu() {
		return q50ObservedGlu;
	}

	//set方法
	public void setQ50ObservedGlu(Double q50ObservedGlu) {
		this.q50ObservedGlu = q50ObservedGlu;
	}
	//get方法
	public Double getQ50ObservedPhe() {
		return q50ObservedPhe;
	}

	//set方法
	public void setQ50ObservedPhe(Double q50ObservedPhe) {
		this.q50ObservedPhe = q50ObservedPhe;
	}
	//get方法
	public Double getQ50ObservedGly() {
		return q50ObservedGly;
	}

	//set方法
	public void setQ50ObservedGly(Double q50ObservedGly) {
		this.q50ObservedGly = q50ObservedGly;
	}
	//get方法
	public Double getQ50ObservedHis() {
		return q50ObservedHis;
	}

	//set方法
	public void setQ50ObservedHis(Double q50ObservedHis) {
		this.q50ObservedHis = q50ObservedHis;
	}
	//get方法
	public Double getQ50ObservedIle() {
		return q50ObservedIle;
	}

	//set方法
	public void setQ50ObservedIle(Double q50ObservedIle) {
		this.q50ObservedIle = q50ObservedIle;
	}
	//get方法
	public Double getQ50ObservedLys() {
		return q50ObservedLys;
	}

	//set方法
	public void setQ50ObservedLys(Double q50ObservedLys) {
		this.q50ObservedLys = q50ObservedLys;
	}
	//get方法
	public Double getQ50ObservedLeu() {
		return q50ObservedLeu;
	}

	//set方法
	public void setQ50ObservedLeu(Double q50ObservedLeu) {
		this.q50ObservedLeu = q50ObservedLeu;
	}
	//get方法
	public Double getQ50ObservedMet() {
		return q50ObservedMet;
	}

	//set方法
	public void setQ50ObservedMet(Double q50ObservedMet) {
		this.q50ObservedMet = q50ObservedMet;
	}
	//get方法
	public Double getQ50ObservedAsn() {
		return q50ObservedAsn;
	}

	//set方法
	public void setQ50ObservedAsn(Double q50ObservedAsn) {
		this.q50ObservedAsn = q50ObservedAsn;
	}
	//get方法
	public Double getQ50ObservedPro() {
		return q50ObservedPro;
	}

	//set方法
	public void setQ50ObservedPro(Double q50ObservedPro) {
		this.q50ObservedPro = q50ObservedPro;
	}
	//get方法
	public Double getQ50ObservedGln() {
		return q50ObservedGln;
	}

	//set方法
	public void setQ50ObservedGln(Double q50ObservedGln) {
		this.q50ObservedGln = q50ObservedGln;
	}
	//get方法
	public Double getQ50ObservedArg() {
		return q50ObservedArg;
	}

	//set方法
	public void setQ50ObservedArg(Double q50ObservedArg) {
		this.q50ObservedArg = q50ObservedArg;
	}
	//get方法
	public Double getQ50ObservedSer() {
		return q50ObservedSer;
	}

	//set方法
	public void setQ50ObservedSer(Double q50ObservedSer) {
		this.q50ObservedSer = q50ObservedSer;
	}
	//get方法
	public Double getQ50ObservedThr() {
		return q50ObservedThr;
	}

	//set方法
	public void setQ50ObservedThr(Double q50ObservedThr) {
		this.q50ObservedThr = q50ObservedThr;
	}
	//get方法
	public Double getQ50ObservedVal() {
		return q50ObservedVal;
	}

	//set方法
	public void setQ50ObservedVal(Double q50ObservedVal) {
		this.q50ObservedVal = q50ObservedVal;
	}
	//get方法
	public Double getQ50ObservedTrp() {
		return q50ObservedTrp;
	}

	//set方法
	public void setQ50ObservedTrp(Double q50ObservedTrp) {
		this.q50ObservedTrp = q50ObservedTrp;
	}
	//get方法
	public Double getQ50ObservedTyr() {
		return q50ObservedTyr;
	}

	//set方法
	public void setQ50ObservedTyr(Double q50ObservedTyr) {
		this.q50ObservedTyr = q50ObservedTyr;
	}
	//get方法
	public Double getQ75ObservedAla() {
		return q75ObservedAla;
	}

	//set方法
	public void setQ75ObservedAla(Double q75ObservedAla) {
		this.q75ObservedAla = q75ObservedAla;
	}
	//get方法
	public Double getQ75ObservedCys() {
		return q75ObservedCys;
	}

	//set方法
	public void setQ75ObservedCys(Double q75ObservedCys) {
		this.q75ObservedCys = q75ObservedCys;
	}
	//get方法
	public Double getQ75ObservedAsp() {
		return q75ObservedAsp;
	}

	//set方法
	public void setQ75ObservedAsp(Double q75ObservedAsp) {
		this.q75ObservedAsp = q75ObservedAsp;
	}
	//get方法
	public Double getQ75ObservedGlu() {
		return q75ObservedGlu;
	}

	//set方法
	public void setQ75ObservedGlu(Double q75ObservedGlu) {
		this.q75ObservedGlu = q75ObservedGlu;
	}
	//get方法
	public Double getQ75ObservedPhe() {
		return q75ObservedPhe;
	}

	//set方法
	public void setQ75ObservedPhe(Double q75ObservedPhe) {
		this.q75ObservedPhe = q75ObservedPhe;
	}
	//get方法
	public Double getQ75ObservedGly() {
		return q75ObservedGly;
	}

	//set方法
	public void setQ75ObservedGly(Double q75ObservedGly) {
		this.q75ObservedGly = q75ObservedGly;
	}
	//get方法
	public Double getQ75ObservedHis() {
		return q75ObservedHis;
	}

	//set方法
	public void setQ75ObservedHis(Double q75ObservedHis) {
		this.q75ObservedHis = q75ObservedHis;
	}
	//get方法
	public Double getQ75ObservedIle() {
		return q75ObservedIle;
	}

	//set方法
	public void setQ75ObservedIle(Double q75ObservedIle) {
		this.q75ObservedIle = q75ObservedIle;
	}
	//get方法
	public Double getQ75ObservedLys() {
		return q75ObservedLys;
	}

	//set方法
	public void setQ75ObservedLys(Double q75ObservedLys) {
		this.q75ObservedLys = q75ObservedLys;
	}
	//get方法
	public Double getQ75ObservedLeu() {
		return q75ObservedLeu;
	}

	//set方法
	public void setQ75ObservedLeu(Double q75ObservedLeu) {
		this.q75ObservedLeu = q75ObservedLeu;
	}
	//get方法
	public Double getQ75ObservedMet() {
		return q75ObservedMet;
	}

	//set方法
	public void setQ75ObservedMet(Double q75ObservedMet) {
		this.q75ObservedMet = q75ObservedMet;
	}
	//get方法
	public Double getQ75ObservedAsn() {
		return q75ObservedAsn;
	}

	//set方法
	public void setQ75ObservedAsn(Double q75ObservedAsn) {
		this.q75ObservedAsn = q75ObservedAsn;
	}
	//get方法
	public Double getQ75ObservedPro() {
		return q75ObservedPro;
	}

	//set方法
	public void setQ75ObservedPro(Double q75ObservedPro) {
		this.q75ObservedPro = q75ObservedPro;
	}
	//get方法
	public Double getQ75ObservedGln() {
		return q75ObservedGln;
	}

	//set方法
	public void setQ75ObservedGln(Double q75ObservedGln) {
		this.q75ObservedGln = q75ObservedGln;
	}
	//get方法
	public Double getQ75ObservedArg() {
		return q75ObservedArg;
	}

	//set方法
	public void setQ75ObservedArg(Double q75ObservedArg) {
		this.q75ObservedArg = q75ObservedArg;
	}
	//get方法
	public Double getQ75ObservedSer() {
		return q75ObservedSer;
	}

	//set方法
	public void setQ75ObservedSer(Double q75ObservedSer) {
		this.q75ObservedSer = q75ObservedSer;
	}
	//get方法
	public Double getQ75ObservedThr() {
		return q75ObservedThr;
	}

	//set方法
	public void setQ75ObservedThr(Double q75ObservedThr) {
		this.q75ObservedThr = q75ObservedThr;
	}
	//get方法
	public Double getQ75ObservedVal() {
		return q75ObservedVal;
	}

	//set方法
	public void setQ75ObservedVal(Double q75ObservedVal) {
		this.q75ObservedVal = q75ObservedVal;
	}
	//get方法
	public Double getQ75ObservedTrp() {
		return q75ObservedTrp;
	}

	//set方法
	public void setQ75ObservedTrp(Double q75ObservedTrp) {
		this.q75ObservedTrp = q75ObservedTrp;
	}
	//get方法
	public Double getQ75ObservedTyr() {
		return q75ObservedTyr;
	}

	//set方法
	public void setQ75ObservedTyr(Double q75ObservedTyr) {
		this.q75ObservedTyr = q75ObservedTyr;
	}
	//get方法
	public Double getQ95ObservedAla() {
		return q95ObservedAla;
	}

	//set方法
	public void setQ95ObservedAla(Double q95ObservedAla) {
		this.q95ObservedAla = q95ObservedAla;
	}
	//get方法
	public Double getQ95ObservedCys() {
		return q95ObservedCys;
	}

	//set方法
	public void setQ95ObservedCys(Double q95ObservedCys) {
		this.q95ObservedCys = q95ObservedCys;
	}
	//get方法
	public Double getQ95ObservedAsp() {
		return q95ObservedAsp;
	}

	//set方法
	public void setQ95ObservedAsp(Double q95ObservedAsp) {
		this.q95ObservedAsp = q95ObservedAsp;
	}
	//get方法
	public Double getQ95ObservedGlu() {
		return q95ObservedGlu;
	}

	//set方法
	public void setQ95ObservedGlu(Double q95ObservedGlu) {
		this.q95ObservedGlu = q95ObservedGlu;
	}
	//get方法
	public Double getQ95ObservedPhe() {
		return q95ObservedPhe;
	}

	//set方法
	public void setQ95ObservedPhe(Double q95ObservedPhe) {
		this.q95ObservedPhe = q95ObservedPhe;
	}
	//get方法
	public Double getQ95ObservedGly() {
		return q95ObservedGly;
	}

	//set方法
	public void setQ95ObservedGly(Double q95ObservedGly) {
		this.q95ObservedGly = q95ObservedGly;
	}
	//get方法
	public Double getQ95ObservedHis() {
		return q95ObservedHis;
	}

	//set方法
	public void setQ95ObservedHis(Double q95ObservedHis) {
		this.q95ObservedHis = q95ObservedHis;
	}
	//get方法
	public Double getQ95ObservedIle() {
		return q95ObservedIle;
	}

	//set方法
	public void setQ95ObservedIle(Double q95ObservedIle) {
		this.q95ObservedIle = q95ObservedIle;
	}
	//get方法
	public Double getQ95ObservedLys() {
		return q95ObservedLys;
	}

	//set方法
	public void setQ95ObservedLys(Double q95ObservedLys) {
		this.q95ObservedLys = q95ObservedLys;
	}
	//get方法
	public Double getQ95ObservedLeu() {
		return q95ObservedLeu;
	}

	//set方法
	public void setQ95ObservedLeu(Double q95ObservedLeu) {
		this.q95ObservedLeu = q95ObservedLeu;
	}
	//get方法
	public Double getQ95ObservedMet() {
		return q95ObservedMet;
	}

	//set方法
	public void setQ95ObservedMet(Double q95ObservedMet) {
		this.q95ObservedMet = q95ObservedMet;
	}
	//get方法
	public Double getQ95ObservedAsn() {
		return q95ObservedAsn;
	}

	//set方法
	public void setQ95ObservedAsn(Double q95ObservedAsn) {
		this.q95ObservedAsn = q95ObservedAsn;
	}
	//get方法
	public Double getQ95ObservedPro() {
		return q95ObservedPro;
	}

	//set方法
	public void setQ95ObservedPro(Double q95ObservedPro) {
		this.q95ObservedPro = q95ObservedPro;
	}
	//get方法
	public Double getQ95ObservedGln() {
		return q95ObservedGln;
	}

	//set方法
	public void setQ95ObservedGln(Double q95ObservedGln) {
		this.q95ObservedGln = q95ObservedGln;
	}
	//get方法
	public Double getQ95ObservedArg() {
		return q95ObservedArg;
	}

	//set方法
	public void setQ95ObservedArg(Double q95ObservedArg) {
		this.q95ObservedArg = q95ObservedArg;
	}
	//get方法
	public Double getQ95ObservedSer() {
		return q95ObservedSer;
	}

	//set方法
	public void setQ95ObservedSer(Double q95ObservedSer) {
		this.q95ObservedSer = q95ObservedSer;
	}
	//get方法
	public Double getQ95ObservedThr() {
		return q95ObservedThr;
	}

	//set方法
	public void setQ95ObservedThr(Double q95ObservedThr) {
		this.q95ObservedThr = q95ObservedThr;
	}
	//get方法
	public Double getQ95ObservedVal() {
		return q95ObservedVal;
	}

	//set方法
	public void setQ95ObservedVal(Double q95ObservedVal) {
		this.q95ObservedVal = q95ObservedVal;
	}
	//get方法
	public Double getQ95ObservedTrp() {
		return q95ObservedTrp;
	}

	//set方法
	public void setQ95ObservedTrp(Double q95ObservedTrp) {
		this.q95ObservedTrp = q95ObservedTrp;
	}
	//get方法
	public Double getQ95ObservedTyr() {
		return q95ObservedTyr;
	}

	//set方法
	public void setQ95ObservedTyr(Double q95ObservedTyr) {
		this.q95ObservedTyr = q95ObservedTyr;
	}
	//get方法
	public Double getTruemaxObservedAla() {
		return truemaxObservedAla;
	}

	//set方法
	public void setTruemaxObservedAla(Double truemaxObservedAla) {
		this.truemaxObservedAla = truemaxObservedAla;
	}
	//get方法
	public Double getTruemaxObservedCys() {
		return truemaxObservedCys;
	}

	//set方法
	public void setTruemaxObservedCys(Double truemaxObservedCys) {
		this.truemaxObservedCys = truemaxObservedCys;
	}
	//get方法
	public Double getTruemaxObservedAsp() {
		return truemaxObservedAsp;
	}

	//set方法
	public void setTruemaxObservedAsp(Double truemaxObservedAsp) {
		this.truemaxObservedAsp = truemaxObservedAsp;
	}
	//get方法
	public Double getTruemaxObservedGlu() {
		return truemaxObservedGlu;
	}

	//set方法
	public void setTruemaxObservedGlu(Double truemaxObservedGlu) {
		this.truemaxObservedGlu = truemaxObservedGlu;
	}
	//get方法
	public Double getTruemaxObservedPhe() {
		return truemaxObservedPhe;
	}

	//set方法
	public void setTruemaxObservedPhe(Double truemaxObservedPhe) {
		this.truemaxObservedPhe = truemaxObservedPhe;
	}
	//get方法
	public Double getTruemaxObservedGly() {
		return truemaxObservedGly;
	}

	//set方法
	public void setTruemaxObservedGly(Double truemaxObservedGly) {
		this.truemaxObservedGly = truemaxObservedGly;
	}
	//get方法
	public Double getTruemaxObservedHis() {
		return truemaxObservedHis;
	}

	//set方法
	public void setTruemaxObservedHis(Double truemaxObservedHis) {
		this.truemaxObservedHis = truemaxObservedHis;
	}
	//get方法
	public Double getTruemaxObservedIle() {
		return truemaxObservedIle;
	}

	//set方法
	public void setTruemaxObservedIle(Double truemaxObservedIle) {
		this.truemaxObservedIle = truemaxObservedIle;
	}
	//get方法
	public Double getTruemaxObservedLys() {
		return truemaxObservedLys;
	}

	//set方法
	public void setTruemaxObservedLys(Double truemaxObservedLys) {
		this.truemaxObservedLys = truemaxObservedLys;
	}
	//get方法
	public Double getTruemaxObservedLeu() {
		return truemaxObservedLeu;
	}

	//set方法
	public void setTruemaxObservedLeu(Double truemaxObservedLeu) {
		this.truemaxObservedLeu = truemaxObservedLeu;
	}
	//get方法
	public Double getTruemaxObservedMet() {
		return truemaxObservedMet;
	}

	//set方法
	public void setTruemaxObservedMet(Double truemaxObservedMet) {
		this.truemaxObservedMet = truemaxObservedMet;
	}
	//get方法
	public Double getTruemaxObservedAsn() {
		return truemaxObservedAsn;
	}

	//set方法
	public void setTruemaxObservedAsn(Double truemaxObservedAsn) {
		this.truemaxObservedAsn = truemaxObservedAsn;
	}
	//get方法
	public Double getTruemaxObservedPro() {
		return truemaxObservedPro;
	}

	//set方法
	public void setTruemaxObservedPro(Double truemaxObservedPro) {
		this.truemaxObservedPro = truemaxObservedPro;
	}
	//get方法
	public Double getTruemaxObservedGln() {
		return truemaxObservedGln;
	}

	//set方法
	public void setTruemaxObservedGln(Double truemaxObservedGln) {
		this.truemaxObservedGln = truemaxObservedGln;
	}
	//get方法
	public Double getTruemaxObservedArg() {
		return truemaxObservedArg;
	}

	//set方法
	public void setTruemaxObservedArg(Double truemaxObservedArg) {
		this.truemaxObservedArg = truemaxObservedArg;
	}
	//get方法
	public Double getTruemaxObservedSer() {
		return truemaxObservedSer;
	}

	//set方法
	public void setTruemaxObservedSer(Double truemaxObservedSer) {
		this.truemaxObservedSer = truemaxObservedSer;
	}
	//get方法
	public Double getTruemaxObservedThr() {
		return truemaxObservedThr;
	}

	//set方法
	public void setTruemaxObservedThr(Double truemaxObservedThr) {
		this.truemaxObservedThr = truemaxObservedThr;
	}
	//get方法
	public Double getTruemaxObservedVal() {
		return truemaxObservedVal;
	}

	//set方法
	public void setTruemaxObservedVal(Double truemaxObservedVal) {
		this.truemaxObservedVal = truemaxObservedVal;
	}
	//get方法
	public Double getTruemaxObservedTrp() {
		return truemaxObservedTrp;
	}

	//set方法
	public void setTruemaxObservedTrp(Double truemaxObservedTrp) {
		this.truemaxObservedTrp = truemaxObservedTrp;
	}
	//get方法
	public Double getTruemaxObservedTyr() {
		return truemaxObservedTyr;
	}

	//set方法
	public void setTruemaxObservedTyr(Double truemaxObservedTyr) {
		this.truemaxObservedTyr = truemaxObservedTyr;
	}
	//get方法
	public Double getMaxObservedAla() {
		return maxObservedAla;
	}

	//set方法
	public void setMaxObservedAla(Double maxObservedAla) {
		this.maxObservedAla = maxObservedAla;
	}
	//get方法
	public Double getMaxObservedCys() {
		return maxObservedCys;
	}

	//set方法
	public void setMaxObservedCys(Double maxObservedCys) {
		this.maxObservedCys = maxObservedCys;
	}
	//get方法
	public Double getMaxObservedAsp() {
		return maxObservedAsp;
	}

	//set方法
	public void setMaxObservedAsp(Double maxObservedAsp) {
		this.maxObservedAsp = maxObservedAsp;
	}
	//get方法
	public Double getMaxObservedGlu() {
		return maxObservedGlu;
	}

	//set方法
	public void setMaxObservedGlu(Double maxObservedGlu) {
		this.maxObservedGlu = maxObservedGlu;
	}
	//get方法
	public Double getMaxObservedPhe() {
		return maxObservedPhe;
	}

	//set方法
	public void setMaxObservedPhe(Double maxObservedPhe) {
		this.maxObservedPhe = maxObservedPhe;
	}
	//get方法
	public Double getMaxObservedGly() {
		return maxObservedGly;
	}

	//set方法
	public void setMaxObservedGly(Double maxObservedGly) {
		this.maxObservedGly = maxObservedGly;
	}
	//get方法
	public Double getMaxObservedHis() {
		return maxObservedHis;
	}

	//set方法
	public void setMaxObservedHis(Double maxObservedHis) {
		this.maxObservedHis = maxObservedHis;
	}
	//get方法
	public Double getMaxObservedIle() {
		return maxObservedIle;
	}

	//set方法
	public void setMaxObservedIle(Double maxObservedIle) {
		this.maxObservedIle = maxObservedIle;
	}
	//get方法
	public Double getMaxObservedLys() {
		return maxObservedLys;
	}

	//set方法
	public void setMaxObservedLys(Double maxObservedLys) {
		this.maxObservedLys = maxObservedLys;
	}
	//get方法
	public Double getMaxObservedLeu() {
		return maxObservedLeu;
	}

	//set方法
	public void setMaxObservedLeu(Double maxObservedLeu) {
		this.maxObservedLeu = maxObservedLeu;
	}
	//get方法
	public Double getMaxObservedMet() {
		return maxObservedMet;
	}

	//set方法
	public void setMaxObservedMet(Double maxObservedMet) {
		this.maxObservedMet = maxObservedMet;
	}
	//get方法
	public Double getMaxObservedAsn() {
		return maxObservedAsn;
	}

	//set方法
	public void setMaxObservedAsn(Double maxObservedAsn) {
		this.maxObservedAsn = maxObservedAsn;
	}
	//get方法
	public Double getMaxObservedPro() {
		return maxObservedPro;
	}

	//set方法
	public void setMaxObservedPro(Double maxObservedPro) {
		this.maxObservedPro = maxObservedPro;
	}
	//get方法
	public Double getMaxObservedGln() {
		return maxObservedGln;
	}

	//set方法
	public void setMaxObservedGln(Double maxObservedGln) {
		this.maxObservedGln = maxObservedGln;
	}
	//get方法
	public Double getMaxObservedArg() {
		return maxObservedArg;
	}

	//set方法
	public void setMaxObservedArg(Double maxObservedArg) {
		this.maxObservedArg = maxObservedArg;
	}
	//get方法
	public Double getMaxObservedSer() {
		return maxObservedSer;
	}

	//set方法
	public void setMaxObservedSer(Double maxObservedSer) {
		this.maxObservedSer = maxObservedSer;
	}
	//get方法
	public Double getMaxObservedThr() {
		return maxObservedThr;
	}

	//set方法
	public void setMaxObservedThr(Double maxObservedThr) {
		this.maxObservedThr = maxObservedThr;
	}
	//get方法
	public Double getMaxObservedVal() {
		return maxObservedVal;
	}

	//set方法
	public void setMaxObservedVal(Double maxObservedVal) {
		this.maxObservedVal = maxObservedVal;
	}
	//get方法
	public Double getMaxObservedTrp() {
		return maxObservedTrp;
	}

	//set方法
	public void setMaxObservedTrp(Double maxObservedTrp) {
		this.maxObservedTrp = maxObservedTrp;
	}
	//get方法
	public Double getMaxObservedTyr() {
		return maxObservedTyr;
	}

	//set方法
	public void setMaxObservedTyr(Double maxObservedTyr) {
		this.maxObservedTyr = maxObservedTyr;
	}
	//get方法
	public Double getMeanObservedAla() {
		return meanObservedAla;
	}

	//set方法
	public void setMeanObservedAla(Double meanObservedAla) {
		this.meanObservedAla = meanObservedAla;
	}
	//get方法
	public Double getMeanObservedCys() {
		return meanObservedCys;
	}

	//set方法
	public void setMeanObservedCys(Double meanObservedCys) {
		this.meanObservedCys = meanObservedCys;
	}
	//get方法
	public Double getMeanObservedAsp() {
		return meanObservedAsp;
	}

	//set方法
	public void setMeanObservedAsp(Double meanObservedAsp) {
		this.meanObservedAsp = meanObservedAsp;
	}
	//get方法
	public Double getMeanObservedGlu() {
		return meanObservedGlu;
	}

	//set方法
	public void setMeanObservedGlu(Double meanObservedGlu) {
		this.meanObservedGlu = meanObservedGlu;
	}
	//get方法
	public Double getMeanObservedPhe() {
		return meanObservedPhe;
	}

	//set方法
	public void setMeanObservedPhe(Double meanObservedPhe) {
		this.meanObservedPhe = meanObservedPhe;
	}
	//get方法
	public Double getMeanObservedGly() {
		return meanObservedGly;
	}

	//set方法
	public void setMeanObservedGly(Double meanObservedGly) {
		this.meanObservedGly = meanObservedGly;
	}
	//get方法
	public Double getMeanObservedHis() {
		return meanObservedHis;
	}

	//set方法
	public void setMeanObservedHis(Double meanObservedHis) {
		this.meanObservedHis = meanObservedHis;
	}
	//get方法
	public Double getMeanObservedIle() {
		return meanObservedIle;
	}

	//set方法
	public void setMeanObservedIle(Double meanObservedIle) {
		this.meanObservedIle = meanObservedIle;
	}
	//get方法
	public Double getMeanObservedLys() {
		return meanObservedLys;
	}

	//set方法
	public void setMeanObservedLys(Double meanObservedLys) {
		this.meanObservedLys = meanObservedLys;
	}
	//get方法
	public Double getMeanObservedLeu() {
		return meanObservedLeu;
	}

	//set方法
	public void setMeanObservedLeu(Double meanObservedLeu) {
		this.meanObservedLeu = meanObservedLeu;
	}
	//get方法
	public Double getMeanObservedMet() {
		return meanObservedMet;
	}

	//set方法
	public void setMeanObservedMet(Double meanObservedMet) {
		this.meanObservedMet = meanObservedMet;
	}
	//get方法
	public Double getMeanObservedAsn() {
		return meanObservedAsn;
	}

	//set方法
	public void setMeanObservedAsn(Double meanObservedAsn) {
		this.meanObservedAsn = meanObservedAsn;
	}
	//get方法
	public Double getMeanObservedPro() {
		return meanObservedPro;
	}

	//set方法
	public void setMeanObservedPro(Double meanObservedPro) {
		this.meanObservedPro = meanObservedPro;
	}
	//get方法
	public Double getMeanObservedGln() {
		return meanObservedGln;
	}

	//set方法
	public void setMeanObservedGln(Double meanObservedGln) {
		this.meanObservedGln = meanObservedGln;
	}
	//get方法
	public Double getMeanObservedArg() {
		return meanObservedArg;
	}

	//set方法
	public void setMeanObservedArg(Double meanObservedArg) {
		this.meanObservedArg = meanObservedArg;
	}
	//get方法
	public Double getMeanObservedSer() {
		return meanObservedSer;
	}

	//set方法
	public void setMeanObservedSer(Double meanObservedSer) {
		this.meanObservedSer = meanObservedSer;
	}
	//get方法
	public Double getMeanObservedThr() {
		return meanObservedThr;
	}

	//set方法
	public void setMeanObservedThr(Double meanObservedThr) {
		this.meanObservedThr = meanObservedThr;
	}
	//get方法
	public Double getMeanObservedVal() {
		return meanObservedVal;
	}

	//set方法
	public void setMeanObservedVal(Double meanObservedVal) {
		this.meanObservedVal = meanObservedVal;
	}
	//get方法
	public Double getMeanObservedTrp() {
		return meanObservedTrp;
	}

	//set方法
	public void setMeanObservedTrp(Double meanObservedTrp) {
		this.meanObservedTrp = meanObservedTrp;
	}
	//get方法
	public Double getMeanObservedTyr() {
		return meanObservedTyr;
	}

	//set方法
	public void setMeanObservedTyr(Double meanObservedTyr) {
		this.meanObservedTyr = meanObservedTyr;
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
