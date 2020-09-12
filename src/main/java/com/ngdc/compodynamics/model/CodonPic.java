package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodonPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="codon_pic")
public class CodonPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_observed_aaa")
	private Double minObservedAaa;//

    @Column(name = "min_observed_aag")
	private Double minObservedAag;//

    @Column(name = "min_observed_aat")
	private Double minObservedAat;//

    @Column(name = "min_observed_aac")
	private Double minObservedAac;//

    @Column(name = "min_observed_taa")
	private Double minObservedTaa;//

    @Column(name = "min_observed_tag")
	private Double minObservedTag;//

    @Column(name = "min_observed_tat")
	private Double minObservedTat;//

    @Column(name = "min_observed_tac")
	private Double minObservedTac;//

    @Column(name = "min_observed_ata")
	private Double minObservedAta;//

    @Column(name = "min_observed_atg")
	private Double minObservedAtg;//

    @Column(name = "min_observed_att")
	private Double minObservedAtt;//

    @Column(name = "min_observed_atc")
	private Double minObservedAtc;//

    @Column(name = "min_observed_tta")
	private Double minObservedTta;//

    @Column(name = "min_observed_ttg")
	private Double minObservedTtg;//

    @Column(name = "min_observed_ttt")
	private Double minObservedTtt;//

    @Column(name = "min_observed_ttc")
	private Double minObservedTtc;//

    @Column(name = "min_observed_gaa")
	private Double minObservedGaa;//

    @Column(name = "min_observed_gag")
	private Double minObservedGag;//

    @Column(name = "min_observed_gat")
	private Double minObservedGat;//

    @Column(name = "min_observed_gac")
	private Double minObservedGac;//

    @Column(name = "min_observed_caa")
	private Double minObservedCaa;//

    @Column(name = "min_observed_cag")
	private Double minObservedCag;//

    @Column(name = "min_observed_cat")
	private Double minObservedCat;//

    @Column(name = "min_observed_cac")
	private Double minObservedCac;//

    @Column(name = "min_observed_gta")
	private Double minObservedGta;//

    @Column(name = "min_observed_gtg")
	private Double minObservedGtg;//

    @Column(name = "min_observed_gtt")
	private Double minObservedGtt;//

    @Column(name = "min_observed_gtc")
	private Double minObservedGtc;//

    @Column(name = "min_observed_cta")
	private Double minObservedCta;//

    @Column(name = "min_observed_ctg")
	private Double minObservedCtg;//

    @Column(name = "min_observed_ctt")
	private Double minObservedCtt;//

    @Column(name = "min_observed_ctc")
	private Double minObservedCtc;//

    @Column(name = "min_observed_aga")
	private Double minObservedAga;//

    @Column(name = "min_observed_agg")
	private Double minObservedAgg;//

    @Column(name = "min_observed_agt")
	private Double minObservedAgt;//

    @Column(name = "min_observed_agc")
	private Double minObservedAgc;//

    @Column(name = "min_observed_tga")
	private Double minObservedTga;//

    @Column(name = "min_observed_tgg")
	private Double minObservedTgg;//

    @Column(name = "min_observed_tgt")
	private Double minObservedTgt;//

    @Column(name = "min_observed_tgc")
	private Double minObservedTgc;//

    @Column(name = "min_observed_aca")
	private Double minObservedAca;//

    @Column(name = "min_observed_acg")
	private Double minObservedAcg;//

    @Column(name = "min_observed_act")
	private Double minObservedAct;//

    @Column(name = "min_observed_acc")
	private Double minObservedAcc;//

    @Column(name = "min_observed_tca")
	private Double minObservedTca;//

    @Column(name = "min_observed_tcg")
	private Double minObservedTcg;//

    @Column(name = "min_observed_tct")
	private Double minObservedTct;//

    @Column(name = "min_observed_tcc")
	private Double minObservedTcc;//

    @Column(name = "min_observed_gga")
	private Double minObservedGga;//

    @Column(name = "min_observed_ggg")
	private Double minObservedGgg;//

    @Column(name = "min_observed_ggt")
	private Double minObservedGgt;//

    @Column(name = "min_observed_ggc")
	private Double minObservedGgc;//

    @Column(name = "min_observed_cga")
	private Double minObservedCga;//

    @Column(name = "min_observed_cgg")
	private Double minObservedCgg;//

    @Column(name = "min_observed_cgt")
	private Double minObservedCgt;//

    @Column(name = "min_observed_cgc")
	private Double minObservedCgc;//

    @Column(name = "min_observed_gca")
	private Double minObservedGca;//

    @Column(name = "min_observed_gcg")
	private Double minObservedGcg;//

    @Column(name = "min_observed_gct")
	private Double minObservedGct;//

    @Column(name = "min_observed_gcc")
	private Double minObservedGcc;//

    @Column(name = "min_observed_cca")
	private Double minObservedCca;//

    @Column(name = "min_observed_ccg")
	private Double minObservedCcg;//

    @Column(name = "min_observed_cct")
	private Double minObservedCct;//

    @Column(name = "min_observed_ccc")
	private Double minObservedCcc;//

    @Column(name = "truemin_observed_aaa")
	private Double trueminObservedAaa;//

    @Column(name = "truemin_observed_aag")
	private Double trueminObservedAag;//

    @Column(name = "truemin_observed_aat")
	private Double trueminObservedAat;//

    @Column(name = "truemin_observed_aac")
	private Double trueminObservedAac;//

    @Column(name = "truemin_observed_taa")
	private Double trueminObservedTaa;//

    @Column(name = "truemin_observed_tag")
	private Double trueminObservedTag;//

    @Column(name = "truemin_observed_tat")
	private Double trueminObservedTat;//

    @Column(name = "truemin_observed_tac")
	private Double trueminObservedTac;//

    @Column(name = "truemin_observed_ata")
	private Double trueminObservedAta;//

    @Column(name = "truemin_observed_atg")
	private Double trueminObservedAtg;//

    @Column(name = "truemin_observed_att")
	private Double trueminObservedAtt;//

    @Column(name = "truemin_observed_atc")
	private Double trueminObservedAtc;//

    @Column(name = "truemin_observed_tta")
	private Double trueminObservedTta;//

    @Column(name = "truemin_observed_ttg")
	private Double trueminObservedTtg;//

    @Column(name = "truemin_observed_ttt")
	private Double trueminObservedTtt;//

    @Column(name = "truemin_observed_ttc")
	private Double trueminObservedTtc;//

    @Column(name = "truemin_observed_gaa")
	private Double trueminObservedGaa;//

    @Column(name = "truemin_observed_gag")
	private Double trueminObservedGag;//

    @Column(name = "truemin_observed_gat")
	private Double trueminObservedGat;//

    @Column(name = "truemin_observed_gac")
	private Double trueminObservedGac;//

    @Column(name = "truemin_observed_caa")
	private Double trueminObservedCaa;//

    @Column(name = "truemin_observed_cag")
	private Double trueminObservedCag;//

    @Column(name = "truemin_observed_cat")
	private Double trueminObservedCat;//

    @Column(name = "truemin_observed_cac")
	private Double trueminObservedCac;//

    @Column(name = "truemin_observed_gta")
	private Double trueminObservedGta;//

    @Column(name = "truemin_observed_gtg")
	private Double trueminObservedGtg;//

    @Column(name = "truemin_observed_gtt")
	private Double trueminObservedGtt;//

    @Column(name = "truemin_observed_gtc")
	private Double trueminObservedGtc;//

    @Column(name = "truemin_observed_cta")
	private Double trueminObservedCta;//

    @Column(name = "truemin_observed_ctg")
	private Double trueminObservedCtg;//

    @Column(name = "truemin_observed_ctt")
	private Double trueminObservedCtt;//

    @Column(name = "truemin_observed_ctc")
	private Double trueminObservedCtc;//

    @Column(name = "truemin_observed_aga")
	private Double trueminObservedAga;//

    @Column(name = "truemin_observed_agg")
	private Double trueminObservedAgg;//

    @Column(name = "truemin_observed_agt")
	private Double trueminObservedAgt;//

    @Column(name = "truemin_observed_agc")
	private Double trueminObservedAgc;//

    @Column(name = "truemin_observed_tga")
	private Double trueminObservedTga;//

    @Column(name = "truemin_observed_tgg")
	private Double trueminObservedTgg;//

    @Column(name = "truemin_observed_tgt")
	private Double trueminObservedTgt;//

    @Column(name = "truemin_observed_tgc")
	private Double trueminObservedTgc;//

    @Column(name = "truemin_observed_aca")
	private Double trueminObservedAca;//

    @Column(name = "truemin_observed_acg")
	private Double trueminObservedAcg;//

    @Column(name = "truemin_observed_act")
	private Double trueminObservedAct;//

    @Column(name = "truemin_observed_acc")
	private Double trueminObservedAcc;//

    @Column(name = "truemin_observed_tca")
	private Double trueminObservedTca;//

    @Column(name = "truemin_observed_tcg")
	private Double trueminObservedTcg;//

    @Column(name = "truemin_observed_tct")
	private Double trueminObservedTct;//

    @Column(name = "truemin_observed_tcc")
	private Double trueminObservedTcc;//

    @Column(name = "truemin_observed_gga")
	private Double trueminObservedGga;//

    @Column(name = "truemin_observed_ggg")
	private Double trueminObservedGgg;//

    @Column(name = "truemin_observed_ggt")
	private Double trueminObservedGgt;//

    @Column(name = "truemin_observed_ggc")
	private Double trueminObservedGgc;//

    @Column(name = "truemin_observed_cga")
	private Double trueminObservedCga;//

    @Column(name = "truemin_observed_cgg")
	private Double trueminObservedCgg;//

    @Column(name = "truemin_observed_cgt")
	private Double trueminObservedCgt;//

    @Column(name = "truemin_observed_cgc")
	private Double trueminObservedCgc;//

    @Column(name = "truemin_observed_gca")
	private Double trueminObservedGca;//

    @Column(name = "truemin_observed_gcg")
	private Double trueminObservedGcg;//

    @Column(name = "truemin_observed_gct")
	private Double trueminObservedGct;//

    @Column(name = "truemin_observed_gcc")
	private Double trueminObservedGcc;//

    @Column(name = "truemin_observed_cca")
	private Double trueminObservedCca;//

    @Column(name = "truemin_observed_ccg")
	private Double trueminObservedCcg;//

    @Column(name = "truemin_observed_cct")
	private Double trueminObservedCct;//

    @Column(name = "truemin_observed_ccc")
	private Double trueminObservedCcc;//

    @Column(name = "q05_observed_aaa")
	private Double q05ObservedAaa;//

    @Column(name = "q05_observed_aag")
	private Double q05ObservedAag;//

    @Column(name = "q05_observed_aat")
	private Double q05ObservedAat;//

    @Column(name = "q05_observed_aac")
	private Double q05ObservedAac;//

    @Column(name = "q05_observed_taa")
	private Double q05ObservedTaa;//

    @Column(name = "q05_observed_tag")
	private Double q05ObservedTag;//

    @Column(name = "q05_observed_tat")
	private Double q05ObservedTat;//

    @Column(name = "q05_observed_tac")
	private Double q05ObservedTac;//

    @Column(name = "q05_observed_ata")
	private Double q05ObservedAta;//

    @Column(name = "q05_observed_atg")
	private Double q05ObservedAtg;//

    @Column(name = "q05_observed_att")
	private Double q05ObservedAtt;//

    @Column(name = "q05_observed_atc")
	private Double q05ObservedAtc;//

    @Column(name = "q05_observed_tta")
	private Double q05ObservedTta;//

    @Column(name = "q05_observed_ttg")
	private Double q05ObservedTtg;//

    @Column(name = "q05_observed_ttt")
	private Double q05ObservedTtt;//

    @Column(name = "q05_observed_ttc")
	private Double q05ObservedTtc;//

    @Column(name = "q05_observed_gaa")
	private Double q05ObservedGaa;//

    @Column(name = "q05_observed_gag")
	private Double q05ObservedGag;//

    @Column(name = "q05_observed_gat")
	private Double q05ObservedGat;//

    @Column(name = "q05_observed_gac")
	private Double q05ObservedGac;//

    @Column(name = "q05_observed_caa")
	private Double q05ObservedCaa;//

    @Column(name = "q05_observed_cag")
	private Double q05ObservedCag;//

    @Column(name = "q05_observed_cat")
	private Double q05ObservedCat;//

    @Column(name = "q05_observed_cac")
	private Double q05ObservedCac;//

    @Column(name = "q05_observed_gta")
	private Double q05ObservedGta;//

    @Column(name = "q05_observed_gtg")
	private Double q05ObservedGtg;//

    @Column(name = "q05_observed_gtt")
	private Double q05ObservedGtt;//

    @Column(name = "q05_observed_gtc")
	private Double q05ObservedGtc;//

    @Column(name = "q05_observed_cta")
	private Double q05ObservedCta;//

    @Column(name = "q05_observed_ctg")
	private Double q05ObservedCtg;//

    @Column(name = "q05_observed_ctt")
	private Double q05ObservedCtt;//

    @Column(name = "q05_observed_ctc")
	private Double q05ObservedCtc;//

    @Column(name = "q05_observed_aga")
	private Double q05ObservedAga;//

    @Column(name = "q05_observed_agg")
	private Double q05ObservedAgg;//

    @Column(name = "q05_observed_agt")
	private Double q05ObservedAgt;//

    @Column(name = "q05_observed_agc")
	private Double q05ObservedAgc;//

    @Column(name = "q05_observed_tga")
	private Double q05ObservedTga;//

    @Column(name = "q05_observed_tgg")
	private Double q05ObservedTgg;//

    @Column(name = "q05_observed_tgt")
	private Double q05ObservedTgt;//

    @Column(name = "q05_observed_tgc")
	private Double q05ObservedTgc;//

    @Column(name = "q05_observed_aca")
	private Double q05ObservedAca;//

    @Column(name = "q05_observed_acg")
	private Double q05ObservedAcg;//

    @Column(name = "q05_observed_act")
	private Double q05ObservedAct;//

    @Column(name = "q05_observed_acc")
	private Double q05ObservedAcc;//

    @Column(name = "q05_observed_tca")
	private Double q05ObservedTca;//

    @Column(name = "q05_observed_tcg")
	private Double q05ObservedTcg;//

    @Column(name = "q05_observed_tct")
	private Double q05ObservedTct;//

    @Column(name = "q05_observed_tcc")
	private Double q05ObservedTcc;//

    @Column(name = "q05_observed_gga")
	private Double q05ObservedGga;//

    @Column(name = "q05_observed_ggg")
	private Double q05ObservedGgg;//

    @Column(name = "q05_observed_ggt")
	private Double q05ObservedGgt;//

    @Column(name = "q05_observed_ggc")
	private Double q05ObservedGgc;//

    @Column(name = "q05_observed_cga")
	private Double q05ObservedCga;//

    @Column(name = "q05_observed_cgg")
	private Double q05ObservedCgg;//

    @Column(name = "q05_observed_cgt")
	private Double q05ObservedCgt;//

    @Column(name = "q05_observed_cgc")
	private Double q05ObservedCgc;//

    @Column(name = "q05_observed_gca")
	private Double q05ObservedGca;//

    @Column(name = "q05_observed_gcg")
	private Double q05ObservedGcg;//

    @Column(name = "q05_observed_gct")
	private Double q05ObservedGct;//

    @Column(name = "q05_observed_gcc")
	private Double q05ObservedGcc;//

    @Column(name = "q05_observed_cca")
	private Double q05ObservedCca;//

    @Column(name = "q05_observed_ccg")
	private Double q05ObservedCcg;//

    @Column(name = "q05_observed_cct")
	private Double q05ObservedCct;//

    @Column(name = "q05_observed_ccc")
	private Double q05ObservedCcc;//

    @Column(name = "q25_observed_aaa")
	private Double q25ObservedAaa;//

    @Column(name = "q25_observed_aag")
	private Double q25ObservedAag;//

    @Column(name = "q25_observed_aat")
	private Double q25ObservedAat;//

    @Column(name = "q25_observed_aac")
	private Double q25ObservedAac;//

    @Column(name = "q25_observed_taa")
	private Double q25ObservedTaa;//

    @Column(name = "q25_observed_tag")
	private Double q25ObservedTag;//

    @Column(name = "q25_observed_tat")
	private Double q25ObservedTat;//

    @Column(name = "q25_observed_tac")
	private Double q25ObservedTac;//

    @Column(name = "q25_observed_ata")
	private Double q25ObservedAta;//

    @Column(name = "q25_observed_atg")
	private Double q25ObservedAtg;//

    @Column(name = "q25_observed_att")
	private Double q25ObservedAtt;//

    @Column(name = "q25_observed_atc")
	private Double q25ObservedAtc;//

    @Column(name = "q25_observed_tta")
	private Double q25ObservedTta;//

    @Column(name = "q25_observed_ttg")
	private Double q25ObservedTtg;//

    @Column(name = "q25_observed_ttt")
	private Double q25ObservedTtt;//

    @Column(name = "q25_observed_ttc")
	private Double q25ObservedTtc;//

    @Column(name = "q25_observed_gaa")
	private Double q25ObservedGaa;//

    @Column(name = "q25_observed_gag")
	private Double q25ObservedGag;//

    @Column(name = "q25_observed_gat")
	private Double q25ObservedGat;//

    @Column(name = "q25_observed_gac")
	private Double q25ObservedGac;//

    @Column(name = "q25_observed_caa")
	private Double q25ObservedCaa;//

    @Column(name = "q25_observed_cag")
	private Double q25ObservedCag;//

    @Column(name = "q25_observed_cat")
	private Double q25ObservedCat;//

    @Column(name = "q25_observed_cac")
	private Double q25ObservedCac;//

    @Column(name = "q25_observed_gta")
	private Double q25ObservedGta;//

    @Column(name = "q25_observed_gtg")
	private Double q25ObservedGtg;//

    @Column(name = "q25_observed_gtt")
	private Double q25ObservedGtt;//

    @Column(name = "q25_observed_gtc")
	private Double q25ObservedGtc;//

    @Column(name = "q25_observed_cta")
	private Double q25ObservedCta;//

    @Column(name = "q25_observed_ctg")
	private Double q25ObservedCtg;//

    @Column(name = "q25_observed_ctt")
	private Double q25ObservedCtt;//

    @Column(name = "q25_observed_ctc")
	private Double q25ObservedCtc;//

    @Column(name = "q25_observed_aga")
	private Double q25ObservedAga;//

    @Column(name = "q25_observed_agg")
	private Double q25ObservedAgg;//

    @Column(name = "q25_observed_agt")
	private Double q25ObservedAgt;//

    @Column(name = "q25_observed_agc")
	private Double q25ObservedAgc;//

    @Column(name = "q25_observed_tga")
	private Double q25ObservedTga;//

    @Column(name = "q25_observed_tgg")
	private Double q25ObservedTgg;//

    @Column(name = "q25_observed_tgt")
	private Double q25ObservedTgt;//

    @Column(name = "q25_observed_tgc")
	private Double q25ObservedTgc;//

    @Column(name = "q25_observed_aca")
	private Double q25ObservedAca;//

    @Column(name = "q25_observed_acg")
	private Double q25ObservedAcg;//

    @Column(name = "q25_observed_act")
	private Double q25ObservedAct;//

    @Column(name = "q25_observed_acc")
	private Double q25ObservedAcc;//

    @Column(name = "q25_observed_tca")
	private Double q25ObservedTca;//

    @Column(name = "q25_observed_tcg")
	private Double q25ObservedTcg;//

    @Column(name = "q25_observed_tct")
	private Double q25ObservedTct;//

    @Column(name = "q25_observed_tcc")
	private Double q25ObservedTcc;//

    @Column(name = "q25_observed_gga")
	private Double q25ObservedGga;//

    @Column(name = "q25_observed_ggg")
	private Double q25ObservedGgg;//

    @Column(name = "q25_observed_ggt")
	private Double q25ObservedGgt;//

    @Column(name = "q25_observed_ggc")
	private Double q25ObservedGgc;//

    @Column(name = "q25_observed_cga")
	private Double q25ObservedCga;//

    @Column(name = "q25_observed_cgg")
	private Double q25ObservedCgg;//

    @Column(name = "q25_observed_cgt")
	private Double q25ObservedCgt;//

    @Column(name = "q25_observed_cgc")
	private Double q25ObservedCgc;//

    @Column(name = "q25_observed_gca")
	private Double q25ObservedGca;//

    @Column(name = "q25_observed_gcg")
	private Double q25ObservedGcg;//

    @Column(name = "q25_observed_gct")
	private Double q25ObservedGct;//

    @Column(name = "q25_observed_gcc")
	private Double q25ObservedGcc;//

    @Column(name = "q25_observed_cca")
	private Double q25ObservedCca;//

    @Column(name = "q25_observed_ccg")
	private Double q25ObservedCcg;//

    @Column(name = "q25_observed_cct")
	private Double q25ObservedCct;//

    @Column(name = "q25_observed_ccc")
	private Double q25ObservedCcc;//

    @Column(name = "q50_observed_aaa")
	private Double q50ObservedAaa;//

    @Column(name = "q50_observed_aag")
	private Double q50ObservedAag;//

    @Column(name = "q50_observed_aat")
	private Double q50ObservedAat;//

    @Column(name = "q50_observed_aac")
	private Double q50ObservedAac;//

    @Column(name = "q50_observed_taa")
	private Double q50ObservedTaa;//

    @Column(name = "q50_observed_tag")
	private Double q50ObservedTag;//

    @Column(name = "q50_observed_tat")
	private Double q50ObservedTat;//

    @Column(name = "q50_observed_tac")
	private Double q50ObservedTac;//

    @Column(name = "q50_observed_ata")
	private Double q50ObservedAta;//

    @Column(name = "q50_observed_atg")
	private Double q50ObservedAtg;//

    @Column(name = "q50_observed_att")
	private Double q50ObservedAtt;//

    @Column(name = "q50_observed_atc")
	private Double q50ObservedAtc;//

    @Column(name = "q50_observed_tta")
	private Double q50ObservedTta;//

    @Column(name = "q50_observed_ttg")
	private Double q50ObservedTtg;//

    @Column(name = "q50_observed_ttt")
	private Double q50ObservedTtt;//

    @Column(name = "q50_observed_ttc")
	private Double q50ObservedTtc;//

    @Column(name = "q50_observed_gaa")
	private Double q50ObservedGaa;//

    @Column(name = "q50_observed_gag")
	private Double q50ObservedGag;//

    @Column(name = "q50_observed_gat")
	private Double q50ObservedGat;//

    @Column(name = "q50_observed_gac")
	private Double q50ObservedGac;//

    @Column(name = "q50_observed_caa")
	private Double q50ObservedCaa;//

    @Column(name = "q50_observed_cag")
	private Double q50ObservedCag;//

    @Column(name = "q50_observed_cat")
	private Double q50ObservedCat;//

    @Column(name = "q50_observed_cac")
	private Double q50ObservedCac;//

    @Column(name = "q50_observed_gta")
	private Double q50ObservedGta;//

    @Column(name = "q50_observed_gtg")
	private Double q50ObservedGtg;//

    @Column(name = "q50_observed_gtt")
	private Double q50ObservedGtt;//

    @Column(name = "q50_observed_gtc")
	private Double q50ObservedGtc;//

    @Column(name = "q50_observed_cta")
	private Double q50ObservedCta;//

    @Column(name = "q50_observed_ctg")
	private Double q50ObservedCtg;//

    @Column(name = "q50_observed_ctt")
	private Double q50ObservedCtt;//

    @Column(name = "q50_observed_ctc")
	private Double q50ObservedCtc;//

    @Column(name = "q50_observed_aga")
	private Double q50ObservedAga;//

    @Column(name = "q50_observed_agg")
	private Double q50ObservedAgg;//

    @Column(name = "q50_observed_agt")
	private Double q50ObservedAgt;//

    @Column(name = "q50_observed_agc")
	private Double q50ObservedAgc;//

    @Column(name = "q50_observed_tga")
	private Double q50ObservedTga;//

    @Column(name = "q50_observed_tgg")
	private Double q50ObservedTgg;//

    @Column(name = "q50_observed_tgt")
	private Double q50ObservedTgt;//

    @Column(name = "q50_observed_tgc")
	private Double q50ObservedTgc;//

    @Column(name = "q50_observed_aca")
	private Double q50ObservedAca;//

    @Column(name = "q50_observed_acg")
	private Double q50ObservedAcg;//

    @Column(name = "q50_observed_act")
	private Double q50ObservedAct;//

    @Column(name = "q50_observed_acc")
	private Double q50ObservedAcc;//

    @Column(name = "q50_observed_tca")
	private Double q50ObservedTca;//

    @Column(name = "q50_observed_tcg")
	private Double q50ObservedTcg;//

    @Column(name = "q50_observed_tct")
	private Double q50ObservedTct;//

    @Column(name = "q50_observed_tcc")
	private Double q50ObservedTcc;//

    @Column(name = "q50_observed_gga")
	private Double q50ObservedGga;//

    @Column(name = "q50_observed_ggg")
	private Double q50ObservedGgg;//

    @Column(name = "q50_observed_ggt")
	private Double q50ObservedGgt;//

    @Column(name = "q50_observed_ggc")
	private Double q50ObservedGgc;//

    @Column(name = "q50_observed_cga")
	private Double q50ObservedCga;//

    @Column(name = "q50_observed_cgg")
	private Double q50ObservedCgg;//

    @Column(name = "q50_observed_cgt")
	private Double q50ObservedCgt;//

    @Column(name = "q50_observed_cgc")
	private Double q50ObservedCgc;//

    @Column(name = "q50_observed_gca")
	private Double q50ObservedGca;//

    @Column(name = "q50_observed_gcg")
	private Double q50ObservedGcg;//

    @Column(name = "q50_observed_gct")
	private Double q50ObservedGct;//

    @Column(name = "q50_observed_gcc")
	private Double q50ObservedGcc;//

    @Column(name = "q50_observed_cca")
	private Double q50ObservedCca;//

    @Column(name = "q50_observed_ccg")
	private Double q50ObservedCcg;//

    @Column(name = "q50_observed_cct")
	private Double q50ObservedCct;//

    @Column(name = "q50_observed_ccc")
	private Double q50ObservedCcc;//

    @Column(name = "q75_observed_aaa")
	private Double q75ObservedAaa;//

    @Column(name = "q75_observed_aag")
	private Double q75ObservedAag;//

    @Column(name = "q75_observed_aat")
	private Double q75ObservedAat;//

    @Column(name = "q75_observed_aac")
	private Double q75ObservedAac;//

    @Column(name = "q75_observed_taa")
	private Double q75ObservedTaa;//

    @Column(name = "q75_observed_tag")
	private Double q75ObservedTag;//

    @Column(name = "q75_observed_tat")
	private Double q75ObservedTat;//

    @Column(name = "q75_observed_tac")
	private Double q75ObservedTac;//

    @Column(name = "q75_observed_ata")
	private Double q75ObservedAta;//

    @Column(name = "q75_observed_atg")
	private Double q75ObservedAtg;//

    @Column(name = "q75_observed_att")
	private Double q75ObservedAtt;//

    @Column(name = "q75_observed_atc")
	private Double q75ObservedAtc;//

    @Column(name = "q75_observed_tta")
	private Double q75ObservedTta;//

    @Column(name = "q75_observed_ttg")
	private Double q75ObservedTtg;//

    @Column(name = "q75_observed_ttt")
	private Double q75ObservedTtt;//

    @Column(name = "q75_observed_ttc")
	private Double q75ObservedTtc;//

    @Column(name = "q75_observed_gaa")
	private Double q75ObservedGaa;//

    @Column(name = "q75_observed_gag")
	private Double q75ObservedGag;//

    @Column(name = "q75_observed_gat")
	private Double q75ObservedGat;//

    @Column(name = "q75_observed_gac")
	private Double q75ObservedGac;//

    @Column(name = "q75_observed_caa")
	private Double q75ObservedCaa;//

    @Column(name = "q75_observed_cag")
	private Double q75ObservedCag;//

    @Column(name = "q75_observed_cat")
	private Double q75ObservedCat;//

    @Column(name = "q75_observed_cac")
	private Double q75ObservedCac;//

    @Column(name = "q75_observed_gta")
	private Double q75ObservedGta;//

    @Column(name = "q75_observed_gtg")
	private Double q75ObservedGtg;//

    @Column(name = "q75_observed_gtt")
	private Double q75ObservedGtt;//

    @Column(name = "q75_observed_gtc")
	private Double q75ObservedGtc;//

    @Column(name = "q75_observed_cta")
	private Double q75ObservedCta;//

    @Column(name = "q75_observed_ctg")
	private Double q75ObservedCtg;//

    @Column(name = "q75_observed_ctt")
	private Double q75ObservedCtt;//

    @Column(name = "q75_observed_ctc")
	private Double q75ObservedCtc;//

    @Column(name = "q75_observed_aga")
	private Double q75ObservedAga;//

    @Column(name = "q75_observed_agg")
	private Double q75ObservedAgg;//

    @Column(name = "q75_observed_agt")
	private Double q75ObservedAgt;//

    @Column(name = "q75_observed_agc")
	private Double q75ObservedAgc;//

    @Column(name = "q75_observed_tga")
	private Double q75ObservedTga;//

    @Column(name = "q75_observed_tgg")
	private Double q75ObservedTgg;//

    @Column(name = "q75_observed_tgt")
	private Double q75ObservedTgt;//

    @Column(name = "q75_observed_tgc")
	private Double q75ObservedTgc;//

    @Column(name = "q75_observed_aca")
	private Double q75ObservedAca;//

    @Column(name = "q75_observed_acg")
	private Double q75ObservedAcg;//

    @Column(name = "q75_observed_act")
	private Double q75ObservedAct;//

    @Column(name = "q75_observed_acc")
	private Double q75ObservedAcc;//

    @Column(name = "q75_observed_tca")
	private Double q75ObservedTca;//

    @Column(name = "q75_observed_tcg")
	private Double q75ObservedTcg;//

    @Column(name = "q75_observed_tct")
	private Double q75ObservedTct;//

    @Column(name = "q75_observed_tcc")
	private Double q75ObservedTcc;//

    @Column(name = "q75_observed_gga")
	private Double q75ObservedGga;//

    @Column(name = "q75_observed_ggg")
	private Double q75ObservedGgg;//

    @Column(name = "q75_observed_ggt")
	private Double q75ObservedGgt;//

    @Column(name = "q75_observed_ggc")
	private Double q75ObservedGgc;//

    @Column(name = "q75_observed_cga")
	private Double q75ObservedCga;//

    @Column(name = "q75_observed_cgg")
	private Double q75ObservedCgg;//

    @Column(name = "q75_observed_cgt")
	private Double q75ObservedCgt;//

    @Column(name = "q75_observed_cgc")
	private Double q75ObservedCgc;//

    @Column(name = "q75_observed_gca")
	private Double q75ObservedGca;//

    @Column(name = "q75_observed_gcg")
	private Double q75ObservedGcg;//

    @Column(name = "q75_observed_gct")
	private Double q75ObservedGct;//

    @Column(name = "q75_observed_gcc")
	private Double q75ObservedGcc;//

    @Column(name = "q75_observed_cca")
	private Double q75ObservedCca;//

    @Column(name = "q75_observed_ccg")
	private Double q75ObservedCcg;//

    @Column(name = "q75_observed_cct")
	private Double q75ObservedCct;//

    @Column(name = "q75_observed_ccc")
	private Double q75ObservedCcc;//

    @Column(name = "q95_observed_aaa")
	private Double q95ObservedAaa;//

    @Column(name = "q95_observed_aag")
	private Double q95ObservedAag;//

    @Column(name = "q95_observed_aat")
	private Double q95ObservedAat;//

    @Column(name = "q95_observed_aac")
	private Double q95ObservedAac;//

    @Column(name = "q95_observed_taa")
	private Double q95ObservedTaa;//

    @Column(name = "q95_observed_tag")
	private Double q95ObservedTag;//

    @Column(name = "q95_observed_tat")
	private Double q95ObservedTat;//

    @Column(name = "q95_observed_tac")
	private Double q95ObservedTac;//

    @Column(name = "q95_observed_ata")
	private Double q95ObservedAta;//

    @Column(name = "q95_observed_atg")
	private Double q95ObservedAtg;//

    @Column(name = "q95_observed_att")
	private Double q95ObservedAtt;//

    @Column(name = "q95_observed_atc")
	private Double q95ObservedAtc;//

    @Column(name = "q95_observed_tta")
	private Double q95ObservedTta;//

    @Column(name = "q95_observed_ttg")
	private Double q95ObservedTtg;//

    @Column(name = "q95_observed_ttt")
	private Double q95ObservedTtt;//

    @Column(name = "q95_observed_ttc")
	private Double q95ObservedTtc;//

    @Column(name = "q95_observed_gaa")
	private Double q95ObservedGaa;//

    @Column(name = "q95_observed_gag")
	private Double q95ObservedGag;//

    @Column(name = "q95_observed_gat")
	private Double q95ObservedGat;//

    @Column(name = "q95_observed_gac")
	private Double q95ObservedGac;//

    @Column(name = "q95_observed_caa")
	private Double q95ObservedCaa;//

    @Column(name = "q95_observed_cag")
	private Double q95ObservedCag;//

    @Column(name = "q95_observed_cat")
	private Double q95ObservedCat;//

    @Column(name = "q95_observed_cac")
	private Double q95ObservedCac;//

    @Column(name = "q95_observed_gta")
	private Double q95ObservedGta;//

    @Column(name = "q95_observed_gtg")
	private Double q95ObservedGtg;//

    @Column(name = "q95_observed_gtt")
	private Double q95ObservedGtt;//

    @Column(name = "q95_observed_gtc")
	private Double q95ObservedGtc;//

    @Column(name = "q95_observed_cta")
	private Double q95ObservedCta;//

    @Column(name = "q95_observed_ctg")
	private Double q95ObservedCtg;//

    @Column(name = "q95_observed_ctt")
	private Double q95ObservedCtt;//

    @Column(name = "q95_observed_ctc")
	private Double q95ObservedCtc;//

    @Column(name = "q95_observed_aga")
	private Double q95ObservedAga;//

    @Column(name = "q95_observed_agg")
	private Double q95ObservedAgg;//

    @Column(name = "q95_observed_agt")
	private Double q95ObservedAgt;//

    @Column(name = "q95_observed_agc")
	private Double q95ObservedAgc;//

    @Column(name = "q95_observed_tga")
	private Double q95ObservedTga;//

    @Column(name = "q95_observed_tgg")
	private Double q95ObservedTgg;//

    @Column(name = "q95_observed_tgt")
	private Double q95ObservedTgt;//

    @Column(name = "q95_observed_tgc")
	private Double q95ObservedTgc;//

    @Column(name = "q95_observed_aca")
	private Double q95ObservedAca;//

    @Column(name = "q95_observed_acg")
	private Double q95ObservedAcg;//

    @Column(name = "q95_observed_act")
	private Double q95ObservedAct;//

    @Column(name = "q95_observed_acc")
	private Double q95ObservedAcc;//

    @Column(name = "q95_observed_tca")
	private Double q95ObservedTca;//

    @Column(name = "q95_observed_tcg")
	private Double q95ObservedTcg;//

    @Column(name = "q95_observed_tct")
	private Double q95ObservedTct;//

    @Column(name = "q95_observed_tcc")
	private Double q95ObservedTcc;//

    @Column(name = "q95_observed_gga")
	private Double q95ObservedGga;//

    @Column(name = "q95_observed_ggg")
	private Double q95ObservedGgg;//

    @Column(name = "q95_observed_ggt")
	private Double q95ObservedGgt;//

    @Column(name = "q95_observed_ggc")
	private Double q95ObservedGgc;//

    @Column(name = "q95_observed_cga")
	private Double q95ObservedCga;//

    @Column(name = "q95_observed_cgg")
	private Double q95ObservedCgg;//

    @Column(name = "q95_observed_cgt")
	private Double q95ObservedCgt;//

    @Column(name = "q95_observed_cgc")
	private Double q95ObservedCgc;//

    @Column(name = "q95_observed_gca")
	private Double q95ObservedGca;//

    @Column(name = "q95_observed_gcg")
	private Double q95ObservedGcg;//

    @Column(name = "q95_observed_gct")
	private Double q95ObservedGct;//

    @Column(name = "q95_observed_gcc")
	private Double q95ObservedGcc;//

    @Column(name = "q95_observed_cca")
	private Double q95ObservedCca;//

    @Column(name = "q95_observed_ccg")
	private Double q95ObservedCcg;//

    @Column(name = "q95_observed_cct")
	private Double q95ObservedCct;//

    @Column(name = "q95_observed_ccc")
	private Double q95ObservedCcc;//

    @Column(name = "truemax_observed_aaa")
	private Double truemaxObservedAaa;//

    @Column(name = "truemax_observed_aag")
	private Double truemaxObservedAag;//

    @Column(name = "truemax_observed_aat")
	private Double truemaxObservedAat;//

    @Column(name = "truemax_observed_aac")
	private Double truemaxObservedAac;//

    @Column(name = "truemax_observed_taa")
	private Double truemaxObservedTaa;//

    @Column(name = "truemax_observed_tag")
	private Double truemaxObservedTag;//

    @Column(name = "truemax_observed_tat")
	private Double truemaxObservedTat;//

    @Column(name = "truemax_observed_tac")
	private Double truemaxObservedTac;//

    @Column(name = "truemax_observed_ata")
	private Double truemaxObservedAta;//

    @Column(name = "truemax_observed_atg")
	private Double truemaxObservedAtg;//

    @Column(name = "truemax_observed_att")
	private Double truemaxObservedAtt;//

    @Column(name = "truemax_observed_atc")
	private Double truemaxObservedAtc;//

    @Column(name = "truemax_observed_tta")
	private Double truemaxObservedTta;//

    @Column(name = "truemax_observed_ttg")
	private Double truemaxObservedTtg;//

    @Column(name = "truemax_observed_ttt")
	private Double truemaxObservedTtt;//

    @Column(name = "truemax_observed_ttc")
	private Double truemaxObservedTtc;//

    @Column(name = "truemax_observed_gaa")
	private Double truemaxObservedGaa;//

    @Column(name = "truemax_observed_gag")
	private Double truemaxObservedGag;//

    @Column(name = "truemax_observed_gat")
	private Double truemaxObservedGat;//

    @Column(name = "truemax_observed_gac")
	private Double truemaxObservedGac;//

    @Column(name = "truemax_observed_caa")
	private Double truemaxObservedCaa;//

    @Column(name = "truemax_observed_cag")
	private Double truemaxObservedCag;//

    @Column(name = "truemax_observed_cat")
	private Double truemaxObservedCat;//

    @Column(name = "truemax_observed_cac")
	private Double truemaxObservedCac;//

    @Column(name = "truemax_observed_gta")
	private Double truemaxObservedGta;//

    @Column(name = "truemax_observed_gtg")
	private Double truemaxObservedGtg;//

    @Column(name = "truemax_observed_gtt")
	private Double truemaxObservedGtt;//

    @Column(name = "truemax_observed_gtc")
	private Double truemaxObservedGtc;//

    @Column(name = "truemax_observed_cta")
	private Double truemaxObservedCta;//

    @Column(name = "truemax_observed_ctg")
	private Double truemaxObservedCtg;//

    @Column(name = "truemax_observed_ctt")
	private Double truemaxObservedCtt;//

    @Column(name = "truemax_observed_ctc")
	private Double truemaxObservedCtc;//

    @Column(name = "truemax_observed_aga")
	private Double truemaxObservedAga;//

    @Column(name = "truemax_observed_agg")
	private Double truemaxObservedAgg;//

    @Column(name = "truemax_observed_agt")
	private Double truemaxObservedAgt;//

    @Column(name = "truemax_observed_agc")
	private Double truemaxObservedAgc;//

    @Column(name = "truemax_observed_tga")
	private Double truemaxObservedTga;//

    @Column(name = "truemax_observed_tgg")
	private Double truemaxObservedTgg;//

    @Column(name = "truemax_observed_tgt")
	private Double truemaxObservedTgt;//

    @Column(name = "truemax_observed_tgc")
	private Double truemaxObservedTgc;//

    @Column(name = "truemax_observed_aca")
	private Double truemaxObservedAca;//

    @Column(name = "truemax_observed_acg")
	private Double truemaxObservedAcg;//

    @Column(name = "truemax_observed_act")
	private Double truemaxObservedAct;//

    @Column(name = "truemax_observed_acc")
	private Double truemaxObservedAcc;//

    @Column(name = "truemax_observed_tca")
	private Double truemaxObservedTca;//

    @Column(name = "truemax_observed_tcg")
	private Double truemaxObservedTcg;//

    @Column(name = "truemax_observed_tct")
	private Double truemaxObservedTct;//

    @Column(name = "truemax_observed_tcc")
	private Double truemaxObservedTcc;//

    @Column(name = "truemax_observed_gga")
	private Double truemaxObservedGga;//

    @Column(name = "truemax_observed_ggg")
	private Double truemaxObservedGgg;//

    @Column(name = "truemax_observed_ggt")
	private Double truemaxObservedGgt;//

    @Column(name = "truemax_observed_ggc")
	private Double truemaxObservedGgc;//

    @Column(name = "truemax_observed_cga")
	private Double truemaxObservedCga;//

    @Column(name = "truemax_observed_cgg")
	private Double truemaxObservedCgg;//

    @Column(name = "truemax_observed_cgt")
	private Double truemaxObservedCgt;//

    @Column(name = "truemax_observed_cgc")
	private Double truemaxObservedCgc;//

    @Column(name = "truemax_observed_gca")
	private Double truemaxObservedGca;//

    @Column(name = "truemax_observed_gcg")
	private Double truemaxObservedGcg;//

    @Column(name = "truemax_observed_gct")
	private Double truemaxObservedGct;//

    @Column(name = "truemax_observed_gcc")
	private Double truemaxObservedGcc;//

    @Column(name = "truemax_observed_cca")
	private Double truemaxObservedCca;//

    @Column(name = "truemax_observed_ccg")
	private Double truemaxObservedCcg;//

    @Column(name = "truemax_observed_cct")
	private Double truemaxObservedCct;//

    @Column(name = "truemax_observed_ccc")
	private Double truemaxObservedCcc;//

    @Column(name = "max_observed_aaa")
	private Double maxObservedAaa;//

    @Column(name = "max_observed_aag")
	private Double maxObservedAag;//

    @Column(name = "max_observed_aat")
	private Double maxObservedAat;//

    @Column(name = "max_observed_aac")
	private Double maxObservedAac;//

    @Column(name = "max_observed_taa")
	private Double maxObservedTaa;//

    @Column(name = "max_observed_tag")
	private Double maxObservedTag;//

    @Column(name = "max_observed_tat")
	private Double maxObservedTat;//

    @Column(name = "max_observed_tac")
	private Double maxObservedTac;//

    @Column(name = "max_observed_ata")
	private Double maxObservedAta;//

    @Column(name = "max_observed_atg")
	private Double maxObservedAtg;//

    @Column(name = "max_observed_att")
	private Double maxObservedAtt;//

    @Column(name = "max_observed_atc")
	private Double maxObservedAtc;//

    @Column(name = "max_observed_tta")
	private Double maxObservedTta;//

    @Column(name = "max_observed_ttg")
	private Double maxObservedTtg;//

    @Column(name = "max_observed_ttt")
	private Double maxObservedTtt;//

    @Column(name = "max_observed_ttc")
	private Double maxObservedTtc;//

    @Column(name = "max_observed_gaa")
	private Double maxObservedGaa;//

    @Column(name = "max_observed_gag")
	private Double maxObservedGag;//

    @Column(name = "max_observed_gat")
	private Double maxObservedGat;//

    @Column(name = "max_observed_gac")
	private Double maxObservedGac;//

    @Column(name = "max_observed_caa")
	private Double maxObservedCaa;//

    @Column(name = "max_observed_cag")
	private Double maxObservedCag;//

    @Column(name = "max_observed_cat")
	private Double maxObservedCat;//

    @Column(name = "max_observed_cac")
	private Double maxObservedCac;//

    @Column(name = "max_observed_gta")
	private Double maxObservedGta;//

    @Column(name = "max_observed_gtg")
	private Double maxObservedGtg;//

    @Column(name = "max_observed_gtt")
	private Double maxObservedGtt;//

    @Column(name = "max_observed_gtc")
	private Double maxObservedGtc;//

    @Column(name = "max_observed_cta")
	private Double maxObservedCta;//

    @Column(name = "max_observed_ctg")
	private Double maxObservedCtg;//

    @Column(name = "max_observed_ctt")
	private Double maxObservedCtt;//

    @Column(name = "max_observed_ctc")
	private Double maxObservedCtc;//

    @Column(name = "max_observed_aga")
	private Double maxObservedAga;//

    @Column(name = "max_observed_agg")
	private Double maxObservedAgg;//

    @Column(name = "max_observed_agt")
	private Double maxObservedAgt;//

    @Column(name = "max_observed_agc")
	private Double maxObservedAgc;//

    @Column(name = "max_observed_tga")
	private Double maxObservedTga;//

    @Column(name = "max_observed_tgg")
	private Double maxObservedTgg;//

    @Column(name = "max_observed_tgt")
	private Double maxObservedTgt;//

    @Column(name = "max_observed_tgc")
	private Double maxObservedTgc;//

    @Column(name = "max_observed_aca")
	private Double maxObservedAca;//

    @Column(name = "max_observed_acg")
	private Double maxObservedAcg;//

    @Column(name = "max_observed_act")
	private Double maxObservedAct;//

    @Column(name = "max_observed_acc")
	private Double maxObservedAcc;//

    @Column(name = "max_observed_tca")
	private Double maxObservedTca;//

    @Column(name = "max_observed_tcg")
	private Double maxObservedTcg;//

    @Column(name = "max_observed_tct")
	private Double maxObservedTct;//

    @Column(name = "max_observed_tcc")
	private Double maxObservedTcc;//

    @Column(name = "max_observed_gga")
	private Double maxObservedGga;//

    @Column(name = "max_observed_ggg")
	private Double maxObservedGgg;//

    @Column(name = "max_observed_ggt")
	private Double maxObservedGgt;//

    @Column(name = "max_observed_ggc")
	private Double maxObservedGgc;//

    @Column(name = "max_observed_cga")
	private Double maxObservedCga;//

    @Column(name = "max_observed_cgg")
	private Double maxObservedCgg;//

    @Column(name = "max_observed_cgt")
	private Double maxObservedCgt;//

    @Column(name = "max_observed_cgc")
	private Double maxObservedCgc;//

    @Column(name = "max_observed_gca")
	private Double maxObservedGca;//

    @Column(name = "max_observed_gcg")
	private Double maxObservedGcg;//

    @Column(name = "max_observed_gct")
	private Double maxObservedGct;//

    @Column(name = "max_observed_gcc")
	private Double maxObservedGcc;//

    @Column(name = "max_observed_cca")
	private Double maxObservedCca;//

    @Column(name = "max_observed_ccg")
	private Double maxObservedCcg;//

    @Column(name = "max_observed_cct")
	private Double maxObservedCct;//

    @Column(name = "max_observed_ccc")
	private Double maxObservedCcc;//

    @Column(name = "mean_observed_aaa")
	private Double meanObservedAaa;//

    @Column(name = "mean_observed_aag")
	private Double meanObservedAag;//

    @Column(name = "mean_observed_aat")
	private Double meanObservedAat;//

    @Column(name = "mean_observed_aac")
	private Double meanObservedAac;//

    @Column(name = "mean_observed_taa")
	private Double meanObservedTaa;//

    @Column(name = "mean_observed_tag")
	private Double meanObservedTag;//

    @Column(name = "mean_observed_tat")
	private Double meanObservedTat;//

    @Column(name = "mean_observed_tac")
	private Double meanObservedTac;//

    @Column(name = "mean_observed_ata")
	private Double meanObservedAta;//

    @Column(name = "mean_observed_atg")
	private Double meanObservedAtg;//

    @Column(name = "mean_observed_att")
	private Double meanObservedAtt;//

    @Column(name = "mean_observed_atc")
	private Double meanObservedAtc;//

    @Column(name = "mean_observed_tta")
	private Double meanObservedTta;//

    @Column(name = "mean_observed_ttg")
	private Double meanObservedTtg;//

    @Column(name = "mean_observed_ttt")
	private Double meanObservedTtt;//

    @Column(name = "mean_observed_ttc")
	private Double meanObservedTtc;//

    @Column(name = "mean_observed_gaa")
	private Double meanObservedGaa;//

    @Column(name = "mean_observed_gag")
	private Double meanObservedGag;//

    @Column(name = "mean_observed_gat")
	private Double meanObservedGat;//

    @Column(name = "mean_observed_gac")
	private Double meanObservedGac;//

    @Column(name = "mean_observed_caa")
	private Double meanObservedCaa;//

    @Column(name = "mean_observed_cag")
	private Double meanObservedCag;//

    @Column(name = "mean_observed_cat")
	private Double meanObservedCat;//

    @Column(name = "mean_observed_cac")
	private Double meanObservedCac;//

    @Column(name = "mean_observed_gta")
	private Double meanObservedGta;//

    @Column(name = "mean_observed_gtg")
	private Double meanObservedGtg;//

    @Column(name = "mean_observed_gtt")
	private Double meanObservedGtt;//

    @Column(name = "mean_observed_gtc")
	private Double meanObservedGtc;//

    @Column(name = "mean_observed_cta")
	private Double meanObservedCta;//

    @Column(name = "mean_observed_ctg")
	private Double meanObservedCtg;//

    @Column(name = "mean_observed_ctt")
	private Double meanObservedCtt;//

    @Column(name = "mean_observed_ctc")
	private Double meanObservedCtc;//

    @Column(name = "mean_observed_aga")
	private Double meanObservedAga;//

    @Column(name = "mean_observed_agg")
	private Double meanObservedAgg;//

    @Column(name = "mean_observed_agt")
	private Double meanObservedAgt;//

    @Column(name = "mean_observed_agc")
	private Double meanObservedAgc;//

    @Column(name = "mean_observed_tga")
	private Double meanObservedTga;//

    @Column(name = "mean_observed_tgg")
	private Double meanObservedTgg;//

    @Column(name = "mean_observed_tgt")
	private Double meanObservedTgt;//

    @Column(name = "mean_observed_tgc")
	private Double meanObservedTgc;//

    @Column(name = "mean_observed_aca")
	private Double meanObservedAca;//

    @Column(name = "mean_observed_acg")
	private Double meanObservedAcg;//

    @Column(name = "mean_observed_act")
	private Double meanObservedAct;//

    @Column(name = "mean_observed_acc")
	private Double meanObservedAcc;//

    @Column(name = "mean_observed_tca")
	private Double meanObservedTca;//

    @Column(name = "mean_observed_tcg")
	private Double meanObservedTcg;//

    @Column(name = "mean_observed_tct")
	private Double meanObservedTct;//

    @Column(name = "mean_observed_tcc")
	private Double meanObservedTcc;//

    @Column(name = "mean_observed_gga")
	private Double meanObservedGga;//

    @Column(name = "mean_observed_ggg")
	private Double meanObservedGgg;//

    @Column(name = "mean_observed_ggt")
	private Double meanObservedGgt;//

    @Column(name = "mean_observed_ggc")
	private Double meanObservedGgc;//

    @Column(name = "mean_observed_cga")
	private Double meanObservedCga;//

    @Column(name = "mean_observed_cgg")
	private Double meanObservedCgg;//

    @Column(name = "mean_observed_cgt")
	private Double meanObservedCgt;//

    @Column(name = "mean_observed_cgc")
	private Double meanObservedCgc;//

    @Column(name = "mean_observed_gca")
	private Double meanObservedGca;//

    @Column(name = "mean_observed_gcg")
	private Double meanObservedGcg;//

    @Column(name = "mean_observed_gct")
	private Double meanObservedGct;//

    @Column(name = "mean_observed_gcc")
	private Double meanObservedGcc;//

    @Column(name = "mean_observed_cca")
	private Double meanObservedCca;//

    @Column(name = "mean_observed_ccg")
	private Double meanObservedCcg;//

    @Column(name = "mean_observed_cct")
	private Double meanObservedCct;//

    @Column(name = "mean_observed_ccc")
	private Double meanObservedCcc;//

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
	public Double getMinObservedAaa() {
		return minObservedAaa;
	}

	//set方法
	public void setMinObservedAaa(Double minObservedAaa) {
		this.minObservedAaa = minObservedAaa;
	}
	//get方法
	public Double getMinObservedAag() {
		return minObservedAag;
	}

	//set方法
	public void setMinObservedAag(Double minObservedAag) {
		this.minObservedAag = minObservedAag;
	}
	//get方法
	public Double getMinObservedAat() {
		return minObservedAat;
	}

	//set方法
	public void setMinObservedAat(Double minObservedAat) {
		this.minObservedAat = minObservedAat;
	}
	//get方法
	public Double getMinObservedAac() {
		return minObservedAac;
	}

	//set方法
	public void setMinObservedAac(Double minObservedAac) {
		this.minObservedAac = minObservedAac;
	}
	//get方法
	public Double getMinObservedTaa() {
		return minObservedTaa;
	}

	//set方法
	public void setMinObservedTaa(Double minObservedTaa) {
		this.minObservedTaa = minObservedTaa;
	}
	//get方法
	public Double getMinObservedTag() {
		return minObservedTag;
	}

	//set方法
	public void setMinObservedTag(Double minObservedTag) {
		this.minObservedTag = minObservedTag;
	}
	//get方法
	public Double getMinObservedTat() {
		return minObservedTat;
	}

	//set方法
	public void setMinObservedTat(Double minObservedTat) {
		this.minObservedTat = minObservedTat;
	}
	//get方法
	public Double getMinObservedTac() {
		return minObservedTac;
	}

	//set方法
	public void setMinObservedTac(Double minObservedTac) {
		this.minObservedTac = minObservedTac;
	}
	//get方法
	public Double getMinObservedAta() {
		return minObservedAta;
	}

	//set方法
	public void setMinObservedAta(Double minObservedAta) {
		this.minObservedAta = minObservedAta;
	}
	//get方法
	public Double getMinObservedAtg() {
		return minObservedAtg;
	}

	//set方法
	public void setMinObservedAtg(Double minObservedAtg) {
		this.minObservedAtg = minObservedAtg;
	}
	//get方法
	public Double getMinObservedAtt() {
		return minObservedAtt;
	}

	//set方法
	public void setMinObservedAtt(Double minObservedAtt) {
		this.minObservedAtt = minObservedAtt;
	}
	//get方法
	public Double getMinObservedAtc() {
		return minObservedAtc;
	}

	//set方法
	public void setMinObservedAtc(Double minObservedAtc) {
		this.minObservedAtc = minObservedAtc;
	}
	//get方法
	public Double getMinObservedTta() {
		return minObservedTta;
	}

	//set方法
	public void setMinObservedTta(Double minObservedTta) {
		this.minObservedTta = minObservedTta;
	}
	//get方法
	public Double getMinObservedTtg() {
		return minObservedTtg;
	}

	//set方法
	public void setMinObservedTtg(Double minObservedTtg) {
		this.minObservedTtg = minObservedTtg;
	}
	//get方法
	public Double getMinObservedTtt() {
		return minObservedTtt;
	}

	//set方法
	public void setMinObservedTtt(Double minObservedTtt) {
		this.minObservedTtt = minObservedTtt;
	}
	//get方法
	public Double getMinObservedTtc() {
		return minObservedTtc;
	}

	//set方法
	public void setMinObservedTtc(Double minObservedTtc) {
		this.minObservedTtc = minObservedTtc;
	}
	//get方法
	public Double getMinObservedGaa() {
		return minObservedGaa;
	}

	//set方法
	public void setMinObservedGaa(Double minObservedGaa) {
		this.minObservedGaa = minObservedGaa;
	}
	//get方法
	public Double getMinObservedGag() {
		return minObservedGag;
	}

	//set方法
	public void setMinObservedGag(Double minObservedGag) {
		this.minObservedGag = minObservedGag;
	}
	//get方法
	public Double getMinObservedGat() {
		return minObservedGat;
	}

	//set方法
	public void setMinObservedGat(Double minObservedGat) {
		this.minObservedGat = minObservedGat;
	}
	//get方法
	public Double getMinObservedGac() {
		return minObservedGac;
	}

	//set方法
	public void setMinObservedGac(Double minObservedGac) {
		this.minObservedGac = minObservedGac;
	}
	//get方法
	public Double getMinObservedCaa() {
		return minObservedCaa;
	}

	//set方法
	public void setMinObservedCaa(Double minObservedCaa) {
		this.minObservedCaa = minObservedCaa;
	}
	//get方法
	public Double getMinObservedCag() {
		return minObservedCag;
	}

	//set方法
	public void setMinObservedCag(Double minObservedCag) {
		this.minObservedCag = minObservedCag;
	}
	//get方法
	public Double getMinObservedCat() {
		return minObservedCat;
	}

	//set方法
	public void setMinObservedCat(Double minObservedCat) {
		this.minObservedCat = minObservedCat;
	}
	//get方法
	public Double getMinObservedCac() {
		return minObservedCac;
	}

	//set方法
	public void setMinObservedCac(Double minObservedCac) {
		this.minObservedCac = minObservedCac;
	}
	//get方法
	public Double getMinObservedGta() {
		return minObservedGta;
	}

	//set方法
	public void setMinObservedGta(Double minObservedGta) {
		this.minObservedGta = minObservedGta;
	}
	//get方法
	public Double getMinObservedGtg() {
		return minObservedGtg;
	}

	//set方法
	public void setMinObservedGtg(Double minObservedGtg) {
		this.minObservedGtg = minObservedGtg;
	}
	//get方法
	public Double getMinObservedGtt() {
		return minObservedGtt;
	}

	//set方法
	public void setMinObservedGtt(Double minObservedGtt) {
		this.minObservedGtt = minObservedGtt;
	}
	//get方法
	public Double getMinObservedGtc() {
		return minObservedGtc;
	}

	//set方法
	public void setMinObservedGtc(Double minObservedGtc) {
		this.minObservedGtc = minObservedGtc;
	}
	//get方法
	public Double getMinObservedCta() {
		return minObservedCta;
	}

	//set方法
	public void setMinObservedCta(Double minObservedCta) {
		this.minObservedCta = minObservedCta;
	}
	//get方法
	public Double getMinObservedCtg() {
		return minObservedCtg;
	}

	//set方法
	public void setMinObservedCtg(Double minObservedCtg) {
		this.minObservedCtg = minObservedCtg;
	}
	//get方法
	public Double getMinObservedCtt() {
		return minObservedCtt;
	}

	//set方法
	public void setMinObservedCtt(Double minObservedCtt) {
		this.minObservedCtt = minObservedCtt;
	}
	//get方法
	public Double getMinObservedCtc() {
		return minObservedCtc;
	}

	//set方法
	public void setMinObservedCtc(Double minObservedCtc) {
		this.minObservedCtc = minObservedCtc;
	}
	//get方法
	public Double getMinObservedAga() {
		return minObservedAga;
	}

	//set方法
	public void setMinObservedAga(Double minObservedAga) {
		this.minObservedAga = minObservedAga;
	}
	//get方法
	public Double getMinObservedAgg() {
		return minObservedAgg;
	}

	//set方法
	public void setMinObservedAgg(Double minObservedAgg) {
		this.minObservedAgg = minObservedAgg;
	}
	//get方法
	public Double getMinObservedAgt() {
		return minObservedAgt;
	}

	//set方法
	public void setMinObservedAgt(Double minObservedAgt) {
		this.minObservedAgt = minObservedAgt;
	}
	//get方法
	public Double getMinObservedAgc() {
		return minObservedAgc;
	}

	//set方法
	public void setMinObservedAgc(Double minObservedAgc) {
		this.minObservedAgc = minObservedAgc;
	}
	//get方法
	public Double getMinObservedTga() {
		return minObservedTga;
	}

	//set方法
	public void setMinObservedTga(Double minObservedTga) {
		this.minObservedTga = minObservedTga;
	}
	//get方法
	public Double getMinObservedTgg() {
		return minObservedTgg;
	}

	//set方法
	public void setMinObservedTgg(Double minObservedTgg) {
		this.minObservedTgg = minObservedTgg;
	}
	//get方法
	public Double getMinObservedTgt() {
		return minObservedTgt;
	}

	//set方法
	public void setMinObservedTgt(Double minObservedTgt) {
		this.minObservedTgt = minObservedTgt;
	}
	//get方法
	public Double getMinObservedTgc() {
		return minObservedTgc;
	}

	//set方法
	public void setMinObservedTgc(Double minObservedTgc) {
		this.minObservedTgc = minObservedTgc;
	}
	//get方法
	public Double getMinObservedAca() {
		return minObservedAca;
	}

	//set方法
	public void setMinObservedAca(Double minObservedAca) {
		this.minObservedAca = minObservedAca;
	}
	//get方法
	public Double getMinObservedAcg() {
		return minObservedAcg;
	}

	//set方法
	public void setMinObservedAcg(Double minObservedAcg) {
		this.minObservedAcg = minObservedAcg;
	}
	//get方法
	public Double getMinObservedAct() {
		return minObservedAct;
	}

	//set方法
	public void setMinObservedAct(Double minObservedAct) {
		this.minObservedAct = minObservedAct;
	}
	//get方法
	public Double getMinObservedAcc() {
		return minObservedAcc;
	}

	//set方法
	public void setMinObservedAcc(Double minObservedAcc) {
		this.minObservedAcc = minObservedAcc;
	}
	//get方法
	public Double getMinObservedTca() {
		return minObservedTca;
	}

	//set方法
	public void setMinObservedTca(Double minObservedTca) {
		this.minObservedTca = minObservedTca;
	}
	//get方法
	public Double getMinObservedTcg() {
		return minObservedTcg;
	}

	//set方法
	public void setMinObservedTcg(Double minObservedTcg) {
		this.minObservedTcg = minObservedTcg;
	}
	//get方法
	public Double getMinObservedTct() {
		return minObservedTct;
	}

	//set方法
	public void setMinObservedTct(Double minObservedTct) {
		this.minObservedTct = minObservedTct;
	}
	//get方法
	public Double getMinObservedTcc() {
		return minObservedTcc;
	}

	//set方法
	public void setMinObservedTcc(Double minObservedTcc) {
		this.minObservedTcc = minObservedTcc;
	}
	//get方法
	public Double getMinObservedGga() {
		return minObservedGga;
	}

	//set方法
	public void setMinObservedGga(Double minObservedGga) {
		this.minObservedGga = minObservedGga;
	}
	//get方法
	public Double getMinObservedGgg() {
		return minObservedGgg;
	}

	//set方法
	public void setMinObservedGgg(Double minObservedGgg) {
		this.minObservedGgg = minObservedGgg;
	}
	//get方法
	public Double getMinObservedGgt() {
		return minObservedGgt;
	}

	//set方法
	public void setMinObservedGgt(Double minObservedGgt) {
		this.minObservedGgt = minObservedGgt;
	}
	//get方法
	public Double getMinObservedGgc() {
		return minObservedGgc;
	}

	//set方法
	public void setMinObservedGgc(Double minObservedGgc) {
		this.minObservedGgc = minObservedGgc;
	}
	//get方法
	public Double getMinObservedCga() {
		return minObservedCga;
	}

	//set方法
	public void setMinObservedCga(Double minObservedCga) {
		this.minObservedCga = minObservedCga;
	}
	//get方法
	public Double getMinObservedCgg() {
		return minObservedCgg;
	}

	//set方法
	public void setMinObservedCgg(Double minObservedCgg) {
		this.minObservedCgg = minObservedCgg;
	}
	//get方法
	public Double getMinObservedCgt() {
		return minObservedCgt;
	}

	//set方法
	public void setMinObservedCgt(Double minObservedCgt) {
		this.minObservedCgt = minObservedCgt;
	}
	//get方法
	public Double getMinObservedCgc() {
		return minObservedCgc;
	}

	//set方法
	public void setMinObservedCgc(Double minObservedCgc) {
		this.minObservedCgc = minObservedCgc;
	}
	//get方法
	public Double getMinObservedGca() {
		return minObservedGca;
	}

	//set方法
	public void setMinObservedGca(Double minObservedGca) {
		this.minObservedGca = minObservedGca;
	}
	//get方法
	public Double getMinObservedGcg() {
		return minObservedGcg;
	}

	//set方法
	public void setMinObservedGcg(Double minObservedGcg) {
		this.minObservedGcg = minObservedGcg;
	}
	//get方法
	public Double getMinObservedGct() {
		return minObservedGct;
	}

	//set方法
	public void setMinObservedGct(Double minObservedGct) {
		this.minObservedGct = minObservedGct;
	}
	//get方法
	public Double getMinObservedGcc() {
		return minObservedGcc;
	}

	//set方法
	public void setMinObservedGcc(Double minObservedGcc) {
		this.minObservedGcc = minObservedGcc;
	}
	//get方法
	public Double getMinObservedCca() {
		return minObservedCca;
	}

	//set方法
	public void setMinObservedCca(Double minObservedCca) {
		this.minObservedCca = minObservedCca;
	}
	//get方法
	public Double getMinObservedCcg() {
		return minObservedCcg;
	}

	//set方法
	public void setMinObservedCcg(Double minObservedCcg) {
		this.minObservedCcg = minObservedCcg;
	}
	//get方法
	public Double getMinObservedCct() {
		return minObservedCct;
	}

	//set方法
	public void setMinObservedCct(Double minObservedCct) {
		this.minObservedCct = minObservedCct;
	}
	//get方法
	public Double getMinObservedCcc() {
		return minObservedCcc;
	}

	//set方法
	public void setMinObservedCcc(Double minObservedCcc) {
		this.minObservedCcc = minObservedCcc;
	}
	//get方法
	public Double getTrueminObservedAaa() {
		return trueminObservedAaa;
	}

	//set方法
	public void setTrueminObservedAaa(Double trueminObservedAaa) {
		this.trueminObservedAaa = trueminObservedAaa;
	}
	//get方法
	public Double getTrueminObservedAag() {
		return trueminObservedAag;
	}

	//set方法
	public void setTrueminObservedAag(Double trueminObservedAag) {
		this.trueminObservedAag = trueminObservedAag;
	}
	//get方法
	public Double getTrueminObservedAat() {
		return trueminObservedAat;
	}

	//set方法
	public void setTrueminObservedAat(Double trueminObservedAat) {
		this.trueminObservedAat = trueminObservedAat;
	}
	//get方法
	public Double getTrueminObservedAac() {
		return trueminObservedAac;
	}

	//set方法
	public void setTrueminObservedAac(Double trueminObservedAac) {
		this.trueminObservedAac = trueminObservedAac;
	}
	//get方法
	public Double getTrueminObservedTaa() {
		return trueminObservedTaa;
	}

	//set方法
	public void setTrueminObservedTaa(Double trueminObservedTaa) {
		this.trueminObservedTaa = trueminObservedTaa;
	}
	//get方法
	public Double getTrueminObservedTag() {
		return trueminObservedTag;
	}

	//set方法
	public void setTrueminObservedTag(Double trueminObservedTag) {
		this.trueminObservedTag = trueminObservedTag;
	}
	//get方法
	public Double getTrueminObservedTat() {
		return trueminObservedTat;
	}

	//set方法
	public void setTrueminObservedTat(Double trueminObservedTat) {
		this.trueminObservedTat = trueminObservedTat;
	}
	//get方法
	public Double getTrueminObservedTac() {
		return trueminObservedTac;
	}

	//set方法
	public void setTrueminObservedTac(Double trueminObservedTac) {
		this.trueminObservedTac = trueminObservedTac;
	}
	//get方法
	public Double getTrueminObservedAta() {
		return trueminObservedAta;
	}

	//set方法
	public void setTrueminObservedAta(Double trueminObservedAta) {
		this.trueminObservedAta = trueminObservedAta;
	}
	//get方法
	public Double getTrueminObservedAtg() {
		return trueminObservedAtg;
	}

	//set方法
	public void setTrueminObservedAtg(Double trueminObservedAtg) {
		this.trueminObservedAtg = trueminObservedAtg;
	}
	//get方法
	public Double getTrueminObservedAtt() {
		return trueminObservedAtt;
	}

	//set方法
	public void setTrueminObservedAtt(Double trueminObservedAtt) {
		this.trueminObservedAtt = trueminObservedAtt;
	}
	//get方法
	public Double getTrueminObservedAtc() {
		return trueminObservedAtc;
	}

	//set方法
	public void setTrueminObservedAtc(Double trueminObservedAtc) {
		this.trueminObservedAtc = trueminObservedAtc;
	}
	//get方法
	public Double getTrueminObservedTta() {
		return trueminObservedTta;
	}

	//set方法
	public void setTrueminObservedTta(Double trueminObservedTta) {
		this.trueminObservedTta = trueminObservedTta;
	}
	//get方法
	public Double getTrueminObservedTtg() {
		return trueminObservedTtg;
	}

	//set方法
	public void setTrueminObservedTtg(Double trueminObservedTtg) {
		this.trueminObservedTtg = trueminObservedTtg;
	}
	//get方法
	public Double getTrueminObservedTtt() {
		return trueminObservedTtt;
	}

	//set方法
	public void setTrueminObservedTtt(Double trueminObservedTtt) {
		this.trueminObservedTtt = trueminObservedTtt;
	}
	//get方法
	public Double getTrueminObservedTtc() {
		return trueminObservedTtc;
	}

	//set方法
	public void setTrueminObservedTtc(Double trueminObservedTtc) {
		this.trueminObservedTtc = trueminObservedTtc;
	}
	//get方法
	public Double getTrueminObservedGaa() {
		return trueminObservedGaa;
	}

	//set方法
	public void setTrueminObservedGaa(Double trueminObservedGaa) {
		this.trueminObservedGaa = trueminObservedGaa;
	}
	//get方法
	public Double getTrueminObservedGag() {
		return trueminObservedGag;
	}

	//set方法
	public void setTrueminObservedGag(Double trueminObservedGag) {
		this.trueminObservedGag = trueminObservedGag;
	}
	//get方法
	public Double getTrueminObservedGat() {
		return trueminObservedGat;
	}

	//set方法
	public void setTrueminObservedGat(Double trueminObservedGat) {
		this.trueminObservedGat = trueminObservedGat;
	}
	//get方法
	public Double getTrueminObservedGac() {
		return trueminObservedGac;
	}

	//set方法
	public void setTrueminObservedGac(Double trueminObservedGac) {
		this.trueminObservedGac = trueminObservedGac;
	}
	//get方法
	public Double getTrueminObservedCaa() {
		return trueminObservedCaa;
	}

	//set方法
	public void setTrueminObservedCaa(Double trueminObservedCaa) {
		this.trueminObservedCaa = trueminObservedCaa;
	}
	//get方法
	public Double getTrueminObservedCag() {
		return trueminObservedCag;
	}

	//set方法
	public void setTrueminObservedCag(Double trueminObservedCag) {
		this.trueminObservedCag = trueminObservedCag;
	}
	//get方法
	public Double getTrueminObservedCat() {
		return trueminObservedCat;
	}

	//set方法
	public void setTrueminObservedCat(Double trueminObservedCat) {
		this.trueminObservedCat = trueminObservedCat;
	}
	//get方法
	public Double getTrueminObservedCac() {
		return trueminObservedCac;
	}

	//set方法
	public void setTrueminObservedCac(Double trueminObservedCac) {
		this.trueminObservedCac = trueminObservedCac;
	}
	//get方法
	public Double getTrueminObservedGta() {
		return trueminObservedGta;
	}

	//set方法
	public void setTrueminObservedGta(Double trueminObservedGta) {
		this.trueminObservedGta = trueminObservedGta;
	}
	//get方法
	public Double getTrueminObservedGtg() {
		return trueminObservedGtg;
	}

	//set方法
	public void setTrueminObservedGtg(Double trueminObservedGtg) {
		this.trueminObservedGtg = trueminObservedGtg;
	}
	//get方法
	public Double getTrueminObservedGtt() {
		return trueminObservedGtt;
	}

	//set方法
	public void setTrueminObservedGtt(Double trueminObservedGtt) {
		this.trueminObservedGtt = trueminObservedGtt;
	}
	//get方法
	public Double getTrueminObservedGtc() {
		return trueminObservedGtc;
	}

	//set方法
	public void setTrueminObservedGtc(Double trueminObservedGtc) {
		this.trueminObservedGtc = trueminObservedGtc;
	}
	//get方法
	public Double getTrueminObservedCta() {
		return trueminObservedCta;
	}

	//set方法
	public void setTrueminObservedCta(Double trueminObservedCta) {
		this.trueminObservedCta = trueminObservedCta;
	}
	//get方法
	public Double getTrueminObservedCtg() {
		return trueminObservedCtg;
	}

	//set方法
	public void setTrueminObservedCtg(Double trueminObservedCtg) {
		this.trueminObservedCtg = trueminObservedCtg;
	}
	//get方法
	public Double getTrueminObservedCtt() {
		return trueminObservedCtt;
	}

	//set方法
	public void setTrueminObservedCtt(Double trueminObservedCtt) {
		this.trueminObservedCtt = trueminObservedCtt;
	}
	//get方法
	public Double getTrueminObservedCtc() {
		return trueminObservedCtc;
	}

	//set方法
	public void setTrueminObservedCtc(Double trueminObservedCtc) {
		this.trueminObservedCtc = trueminObservedCtc;
	}
	//get方法
	public Double getTrueminObservedAga() {
		return trueminObservedAga;
	}

	//set方法
	public void setTrueminObservedAga(Double trueminObservedAga) {
		this.trueminObservedAga = trueminObservedAga;
	}
	//get方法
	public Double getTrueminObservedAgg() {
		return trueminObservedAgg;
	}

	//set方法
	public void setTrueminObservedAgg(Double trueminObservedAgg) {
		this.trueminObservedAgg = trueminObservedAgg;
	}
	//get方法
	public Double getTrueminObservedAgt() {
		return trueminObservedAgt;
	}

	//set方法
	public void setTrueminObservedAgt(Double trueminObservedAgt) {
		this.trueminObservedAgt = trueminObservedAgt;
	}
	//get方法
	public Double getTrueminObservedAgc() {
		return trueminObservedAgc;
	}

	//set方法
	public void setTrueminObservedAgc(Double trueminObservedAgc) {
		this.trueminObservedAgc = trueminObservedAgc;
	}
	//get方法
	public Double getTrueminObservedTga() {
		return trueminObservedTga;
	}

	//set方法
	public void setTrueminObservedTga(Double trueminObservedTga) {
		this.trueminObservedTga = trueminObservedTga;
	}
	//get方法
	public Double getTrueminObservedTgg() {
		return trueminObservedTgg;
	}

	//set方法
	public void setTrueminObservedTgg(Double trueminObservedTgg) {
		this.trueminObservedTgg = trueminObservedTgg;
	}
	//get方法
	public Double getTrueminObservedTgt() {
		return trueminObservedTgt;
	}

	//set方法
	public void setTrueminObservedTgt(Double trueminObservedTgt) {
		this.trueminObservedTgt = trueminObservedTgt;
	}
	//get方法
	public Double getTrueminObservedTgc() {
		return trueminObservedTgc;
	}

	//set方法
	public void setTrueminObservedTgc(Double trueminObservedTgc) {
		this.trueminObservedTgc = trueminObservedTgc;
	}
	//get方法
	public Double getTrueminObservedAca() {
		return trueminObservedAca;
	}

	//set方法
	public void setTrueminObservedAca(Double trueminObservedAca) {
		this.trueminObservedAca = trueminObservedAca;
	}
	//get方法
	public Double getTrueminObservedAcg() {
		return trueminObservedAcg;
	}

	//set方法
	public void setTrueminObservedAcg(Double trueminObservedAcg) {
		this.trueminObservedAcg = trueminObservedAcg;
	}
	//get方法
	public Double getTrueminObservedAct() {
		return trueminObservedAct;
	}

	//set方法
	public void setTrueminObservedAct(Double trueminObservedAct) {
		this.trueminObservedAct = trueminObservedAct;
	}
	//get方法
	public Double getTrueminObservedAcc() {
		return trueminObservedAcc;
	}

	//set方法
	public void setTrueminObservedAcc(Double trueminObservedAcc) {
		this.trueminObservedAcc = trueminObservedAcc;
	}
	//get方法
	public Double getTrueminObservedTca() {
		return trueminObservedTca;
	}

	//set方法
	public void setTrueminObservedTca(Double trueminObservedTca) {
		this.trueminObservedTca = trueminObservedTca;
	}
	//get方法
	public Double getTrueminObservedTcg() {
		return trueminObservedTcg;
	}

	//set方法
	public void setTrueminObservedTcg(Double trueminObservedTcg) {
		this.trueminObservedTcg = trueminObservedTcg;
	}
	//get方法
	public Double getTrueminObservedTct() {
		return trueminObservedTct;
	}

	//set方法
	public void setTrueminObservedTct(Double trueminObservedTct) {
		this.trueminObservedTct = trueminObservedTct;
	}
	//get方法
	public Double getTrueminObservedTcc() {
		return trueminObservedTcc;
	}

	//set方法
	public void setTrueminObservedTcc(Double trueminObservedTcc) {
		this.trueminObservedTcc = trueminObservedTcc;
	}
	//get方法
	public Double getTrueminObservedGga() {
		return trueminObservedGga;
	}

	//set方法
	public void setTrueminObservedGga(Double trueminObservedGga) {
		this.trueminObservedGga = trueminObservedGga;
	}
	//get方法
	public Double getTrueminObservedGgg() {
		return trueminObservedGgg;
	}

	//set方法
	public void setTrueminObservedGgg(Double trueminObservedGgg) {
		this.trueminObservedGgg = trueminObservedGgg;
	}
	//get方法
	public Double getTrueminObservedGgt() {
		return trueminObservedGgt;
	}

	//set方法
	public void setTrueminObservedGgt(Double trueminObservedGgt) {
		this.trueminObservedGgt = trueminObservedGgt;
	}
	//get方法
	public Double getTrueminObservedGgc() {
		return trueminObservedGgc;
	}

	//set方法
	public void setTrueminObservedGgc(Double trueminObservedGgc) {
		this.trueminObservedGgc = trueminObservedGgc;
	}
	//get方法
	public Double getTrueminObservedCga() {
		return trueminObservedCga;
	}

	//set方法
	public void setTrueminObservedCga(Double trueminObservedCga) {
		this.trueminObservedCga = trueminObservedCga;
	}
	//get方法
	public Double getTrueminObservedCgg() {
		return trueminObservedCgg;
	}

	//set方法
	public void setTrueminObservedCgg(Double trueminObservedCgg) {
		this.trueminObservedCgg = trueminObservedCgg;
	}
	//get方法
	public Double getTrueminObservedCgt() {
		return trueminObservedCgt;
	}

	//set方法
	public void setTrueminObservedCgt(Double trueminObservedCgt) {
		this.trueminObservedCgt = trueminObservedCgt;
	}
	//get方法
	public Double getTrueminObservedCgc() {
		return trueminObservedCgc;
	}

	//set方法
	public void setTrueminObservedCgc(Double trueminObservedCgc) {
		this.trueminObservedCgc = trueminObservedCgc;
	}
	//get方法
	public Double getTrueminObservedGca() {
		return trueminObservedGca;
	}

	//set方法
	public void setTrueminObservedGca(Double trueminObservedGca) {
		this.trueminObservedGca = trueminObservedGca;
	}
	//get方法
	public Double getTrueminObservedGcg() {
		return trueminObservedGcg;
	}

	//set方法
	public void setTrueminObservedGcg(Double trueminObservedGcg) {
		this.trueminObservedGcg = trueminObservedGcg;
	}
	//get方法
	public Double getTrueminObservedGct() {
		return trueminObservedGct;
	}

	//set方法
	public void setTrueminObservedGct(Double trueminObservedGct) {
		this.trueminObservedGct = trueminObservedGct;
	}
	//get方法
	public Double getTrueminObservedGcc() {
		return trueminObservedGcc;
	}

	//set方法
	public void setTrueminObservedGcc(Double trueminObservedGcc) {
		this.trueminObservedGcc = trueminObservedGcc;
	}
	//get方法
	public Double getTrueminObservedCca() {
		return trueminObservedCca;
	}

	//set方法
	public void setTrueminObservedCca(Double trueminObservedCca) {
		this.trueminObservedCca = trueminObservedCca;
	}
	//get方法
	public Double getTrueminObservedCcg() {
		return trueminObservedCcg;
	}

	//set方法
	public void setTrueminObservedCcg(Double trueminObservedCcg) {
		this.trueminObservedCcg = trueminObservedCcg;
	}
	//get方法
	public Double getTrueminObservedCct() {
		return trueminObservedCct;
	}

	//set方法
	public void setTrueminObservedCct(Double trueminObservedCct) {
		this.trueminObservedCct = trueminObservedCct;
	}
	//get方法
	public Double getTrueminObservedCcc() {
		return trueminObservedCcc;
	}

	//set方法
	public void setTrueminObservedCcc(Double trueminObservedCcc) {
		this.trueminObservedCcc = trueminObservedCcc;
	}
	//get方法
	public Double getQ05ObservedAaa() {
		return q05ObservedAaa;
	}

	//set方法
	public void setQ05ObservedAaa(Double q05ObservedAaa) {
		this.q05ObservedAaa = q05ObservedAaa;
	}
	//get方法
	public Double getQ05ObservedAag() {
		return q05ObservedAag;
	}

	//set方法
	public void setQ05ObservedAag(Double q05ObservedAag) {
		this.q05ObservedAag = q05ObservedAag;
	}
	//get方法
	public Double getQ05ObservedAat() {
		return q05ObservedAat;
	}

	//set方法
	public void setQ05ObservedAat(Double q05ObservedAat) {
		this.q05ObservedAat = q05ObservedAat;
	}
	//get方法
	public Double getQ05ObservedAac() {
		return q05ObservedAac;
	}

	//set方法
	public void setQ05ObservedAac(Double q05ObservedAac) {
		this.q05ObservedAac = q05ObservedAac;
	}
	//get方法
	public Double getQ05ObservedTaa() {
		return q05ObservedTaa;
	}

	//set方法
	public void setQ05ObservedTaa(Double q05ObservedTaa) {
		this.q05ObservedTaa = q05ObservedTaa;
	}
	//get方法
	public Double getQ05ObservedTag() {
		return q05ObservedTag;
	}

	//set方法
	public void setQ05ObservedTag(Double q05ObservedTag) {
		this.q05ObservedTag = q05ObservedTag;
	}
	//get方法
	public Double getQ05ObservedTat() {
		return q05ObservedTat;
	}

	//set方法
	public void setQ05ObservedTat(Double q05ObservedTat) {
		this.q05ObservedTat = q05ObservedTat;
	}
	//get方法
	public Double getQ05ObservedTac() {
		return q05ObservedTac;
	}

	//set方法
	public void setQ05ObservedTac(Double q05ObservedTac) {
		this.q05ObservedTac = q05ObservedTac;
	}
	//get方法
	public Double getQ05ObservedAta() {
		return q05ObservedAta;
	}

	//set方法
	public void setQ05ObservedAta(Double q05ObservedAta) {
		this.q05ObservedAta = q05ObservedAta;
	}
	//get方法
	public Double getQ05ObservedAtg() {
		return q05ObservedAtg;
	}

	//set方法
	public void setQ05ObservedAtg(Double q05ObservedAtg) {
		this.q05ObservedAtg = q05ObservedAtg;
	}
	//get方法
	public Double getQ05ObservedAtt() {
		return q05ObservedAtt;
	}

	//set方法
	public void setQ05ObservedAtt(Double q05ObservedAtt) {
		this.q05ObservedAtt = q05ObservedAtt;
	}
	//get方法
	public Double getQ05ObservedAtc() {
		return q05ObservedAtc;
	}

	//set方法
	public void setQ05ObservedAtc(Double q05ObservedAtc) {
		this.q05ObservedAtc = q05ObservedAtc;
	}
	//get方法
	public Double getQ05ObservedTta() {
		return q05ObservedTta;
	}

	//set方法
	public void setQ05ObservedTta(Double q05ObservedTta) {
		this.q05ObservedTta = q05ObservedTta;
	}
	//get方法
	public Double getQ05ObservedTtg() {
		return q05ObservedTtg;
	}

	//set方法
	public void setQ05ObservedTtg(Double q05ObservedTtg) {
		this.q05ObservedTtg = q05ObservedTtg;
	}
	//get方法
	public Double getQ05ObservedTtt() {
		return q05ObservedTtt;
	}

	//set方法
	public void setQ05ObservedTtt(Double q05ObservedTtt) {
		this.q05ObservedTtt = q05ObservedTtt;
	}
	//get方法
	public Double getQ05ObservedTtc() {
		return q05ObservedTtc;
	}

	//set方法
	public void setQ05ObservedTtc(Double q05ObservedTtc) {
		this.q05ObservedTtc = q05ObservedTtc;
	}
	//get方法
	public Double getQ05ObservedGaa() {
		return q05ObservedGaa;
	}

	//set方法
	public void setQ05ObservedGaa(Double q05ObservedGaa) {
		this.q05ObservedGaa = q05ObservedGaa;
	}
	//get方法
	public Double getQ05ObservedGag() {
		return q05ObservedGag;
	}

	//set方法
	public void setQ05ObservedGag(Double q05ObservedGag) {
		this.q05ObservedGag = q05ObservedGag;
	}
	//get方法
	public Double getQ05ObservedGat() {
		return q05ObservedGat;
	}

	//set方法
	public void setQ05ObservedGat(Double q05ObservedGat) {
		this.q05ObservedGat = q05ObservedGat;
	}
	//get方法
	public Double getQ05ObservedGac() {
		return q05ObservedGac;
	}

	//set方法
	public void setQ05ObservedGac(Double q05ObservedGac) {
		this.q05ObservedGac = q05ObservedGac;
	}
	//get方法
	public Double getQ05ObservedCaa() {
		return q05ObservedCaa;
	}

	//set方法
	public void setQ05ObservedCaa(Double q05ObservedCaa) {
		this.q05ObservedCaa = q05ObservedCaa;
	}
	//get方法
	public Double getQ05ObservedCag() {
		return q05ObservedCag;
	}

	//set方法
	public void setQ05ObservedCag(Double q05ObservedCag) {
		this.q05ObservedCag = q05ObservedCag;
	}
	//get方法
	public Double getQ05ObservedCat() {
		return q05ObservedCat;
	}

	//set方法
	public void setQ05ObservedCat(Double q05ObservedCat) {
		this.q05ObservedCat = q05ObservedCat;
	}
	//get方法
	public Double getQ05ObservedCac() {
		return q05ObservedCac;
	}

	//set方法
	public void setQ05ObservedCac(Double q05ObservedCac) {
		this.q05ObservedCac = q05ObservedCac;
	}
	//get方法
	public Double getQ05ObservedGta() {
		return q05ObservedGta;
	}

	//set方法
	public void setQ05ObservedGta(Double q05ObservedGta) {
		this.q05ObservedGta = q05ObservedGta;
	}
	//get方法
	public Double getQ05ObservedGtg() {
		return q05ObservedGtg;
	}

	//set方法
	public void setQ05ObservedGtg(Double q05ObservedGtg) {
		this.q05ObservedGtg = q05ObservedGtg;
	}
	//get方法
	public Double getQ05ObservedGtt() {
		return q05ObservedGtt;
	}

	//set方法
	public void setQ05ObservedGtt(Double q05ObservedGtt) {
		this.q05ObservedGtt = q05ObservedGtt;
	}
	//get方法
	public Double getQ05ObservedGtc() {
		return q05ObservedGtc;
	}

	//set方法
	public void setQ05ObservedGtc(Double q05ObservedGtc) {
		this.q05ObservedGtc = q05ObservedGtc;
	}
	//get方法
	public Double getQ05ObservedCta() {
		return q05ObservedCta;
	}

	//set方法
	public void setQ05ObservedCta(Double q05ObservedCta) {
		this.q05ObservedCta = q05ObservedCta;
	}
	//get方法
	public Double getQ05ObservedCtg() {
		return q05ObservedCtg;
	}

	//set方法
	public void setQ05ObservedCtg(Double q05ObservedCtg) {
		this.q05ObservedCtg = q05ObservedCtg;
	}
	//get方法
	public Double getQ05ObservedCtt() {
		return q05ObservedCtt;
	}

	//set方法
	public void setQ05ObservedCtt(Double q05ObservedCtt) {
		this.q05ObservedCtt = q05ObservedCtt;
	}
	//get方法
	public Double getQ05ObservedCtc() {
		return q05ObservedCtc;
	}

	//set方法
	public void setQ05ObservedCtc(Double q05ObservedCtc) {
		this.q05ObservedCtc = q05ObservedCtc;
	}
	//get方法
	public Double getQ05ObservedAga() {
		return q05ObservedAga;
	}

	//set方法
	public void setQ05ObservedAga(Double q05ObservedAga) {
		this.q05ObservedAga = q05ObservedAga;
	}
	//get方法
	public Double getQ05ObservedAgg() {
		return q05ObservedAgg;
	}

	//set方法
	public void setQ05ObservedAgg(Double q05ObservedAgg) {
		this.q05ObservedAgg = q05ObservedAgg;
	}
	//get方法
	public Double getQ05ObservedAgt() {
		return q05ObservedAgt;
	}

	//set方法
	public void setQ05ObservedAgt(Double q05ObservedAgt) {
		this.q05ObservedAgt = q05ObservedAgt;
	}
	//get方法
	public Double getQ05ObservedAgc() {
		return q05ObservedAgc;
	}

	//set方法
	public void setQ05ObservedAgc(Double q05ObservedAgc) {
		this.q05ObservedAgc = q05ObservedAgc;
	}
	//get方法
	public Double getQ05ObservedTga() {
		return q05ObservedTga;
	}

	//set方法
	public void setQ05ObservedTga(Double q05ObservedTga) {
		this.q05ObservedTga = q05ObservedTga;
	}
	//get方法
	public Double getQ05ObservedTgg() {
		return q05ObservedTgg;
	}

	//set方法
	public void setQ05ObservedTgg(Double q05ObservedTgg) {
		this.q05ObservedTgg = q05ObservedTgg;
	}
	//get方法
	public Double getQ05ObservedTgt() {
		return q05ObservedTgt;
	}

	//set方法
	public void setQ05ObservedTgt(Double q05ObservedTgt) {
		this.q05ObservedTgt = q05ObservedTgt;
	}
	//get方法
	public Double getQ05ObservedTgc() {
		return q05ObservedTgc;
	}

	//set方法
	public void setQ05ObservedTgc(Double q05ObservedTgc) {
		this.q05ObservedTgc = q05ObservedTgc;
	}
	//get方法
	public Double getQ05ObservedAca() {
		return q05ObservedAca;
	}

	//set方法
	public void setQ05ObservedAca(Double q05ObservedAca) {
		this.q05ObservedAca = q05ObservedAca;
	}
	//get方法
	public Double getQ05ObservedAcg() {
		return q05ObservedAcg;
	}

	//set方法
	public void setQ05ObservedAcg(Double q05ObservedAcg) {
		this.q05ObservedAcg = q05ObservedAcg;
	}
	//get方法
	public Double getQ05ObservedAct() {
		return q05ObservedAct;
	}

	//set方法
	public void setQ05ObservedAct(Double q05ObservedAct) {
		this.q05ObservedAct = q05ObservedAct;
	}
	//get方法
	public Double getQ05ObservedAcc() {
		return q05ObservedAcc;
	}

	//set方法
	public void setQ05ObservedAcc(Double q05ObservedAcc) {
		this.q05ObservedAcc = q05ObservedAcc;
	}
	//get方法
	public Double getQ05ObservedTca() {
		return q05ObservedTca;
	}

	//set方法
	public void setQ05ObservedTca(Double q05ObservedTca) {
		this.q05ObservedTca = q05ObservedTca;
	}
	//get方法
	public Double getQ05ObservedTcg() {
		return q05ObservedTcg;
	}

	//set方法
	public void setQ05ObservedTcg(Double q05ObservedTcg) {
		this.q05ObservedTcg = q05ObservedTcg;
	}
	//get方法
	public Double getQ05ObservedTct() {
		return q05ObservedTct;
	}

	//set方法
	public void setQ05ObservedTct(Double q05ObservedTct) {
		this.q05ObservedTct = q05ObservedTct;
	}
	//get方法
	public Double getQ05ObservedTcc() {
		return q05ObservedTcc;
	}

	//set方法
	public void setQ05ObservedTcc(Double q05ObservedTcc) {
		this.q05ObservedTcc = q05ObservedTcc;
	}
	//get方法
	public Double getQ05ObservedGga() {
		return q05ObservedGga;
	}

	//set方法
	public void setQ05ObservedGga(Double q05ObservedGga) {
		this.q05ObservedGga = q05ObservedGga;
	}
	//get方法
	public Double getQ05ObservedGgg() {
		return q05ObservedGgg;
	}

	//set方法
	public void setQ05ObservedGgg(Double q05ObservedGgg) {
		this.q05ObservedGgg = q05ObservedGgg;
	}
	//get方法
	public Double getQ05ObservedGgt() {
		return q05ObservedGgt;
	}

	//set方法
	public void setQ05ObservedGgt(Double q05ObservedGgt) {
		this.q05ObservedGgt = q05ObservedGgt;
	}
	//get方法
	public Double getQ05ObservedGgc() {
		return q05ObservedGgc;
	}

	//set方法
	public void setQ05ObservedGgc(Double q05ObservedGgc) {
		this.q05ObservedGgc = q05ObservedGgc;
	}
	//get方法
	public Double getQ05ObservedCga() {
		return q05ObservedCga;
	}

	//set方法
	public void setQ05ObservedCga(Double q05ObservedCga) {
		this.q05ObservedCga = q05ObservedCga;
	}
	//get方法
	public Double getQ05ObservedCgg() {
		return q05ObservedCgg;
	}

	//set方法
	public void setQ05ObservedCgg(Double q05ObservedCgg) {
		this.q05ObservedCgg = q05ObservedCgg;
	}
	//get方法
	public Double getQ05ObservedCgt() {
		return q05ObservedCgt;
	}

	//set方法
	public void setQ05ObservedCgt(Double q05ObservedCgt) {
		this.q05ObservedCgt = q05ObservedCgt;
	}
	//get方法
	public Double getQ05ObservedCgc() {
		return q05ObservedCgc;
	}

	//set方法
	public void setQ05ObservedCgc(Double q05ObservedCgc) {
		this.q05ObservedCgc = q05ObservedCgc;
	}
	//get方法
	public Double getQ05ObservedGca() {
		return q05ObservedGca;
	}

	//set方法
	public void setQ05ObservedGca(Double q05ObservedGca) {
		this.q05ObservedGca = q05ObservedGca;
	}
	//get方法
	public Double getQ05ObservedGcg() {
		return q05ObservedGcg;
	}

	//set方法
	public void setQ05ObservedGcg(Double q05ObservedGcg) {
		this.q05ObservedGcg = q05ObservedGcg;
	}
	//get方法
	public Double getQ05ObservedGct() {
		return q05ObservedGct;
	}

	//set方法
	public void setQ05ObservedGct(Double q05ObservedGct) {
		this.q05ObservedGct = q05ObservedGct;
	}
	//get方法
	public Double getQ05ObservedGcc() {
		return q05ObservedGcc;
	}

	//set方法
	public void setQ05ObservedGcc(Double q05ObservedGcc) {
		this.q05ObservedGcc = q05ObservedGcc;
	}
	//get方法
	public Double getQ05ObservedCca() {
		return q05ObservedCca;
	}

	//set方法
	public void setQ05ObservedCca(Double q05ObservedCca) {
		this.q05ObservedCca = q05ObservedCca;
	}
	//get方法
	public Double getQ05ObservedCcg() {
		return q05ObservedCcg;
	}

	//set方法
	public void setQ05ObservedCcg(Double q05ObservedCcg) {
		this.q05ObservedCcg = q05ObservedCcg;
	}
	//get方法
	public Double getQ05ObservedCct() {
		return q05ObservedCct;
	}

	//set方法
	public void setQ05ObservedCct(Double q05ObservedCct) {
		this.q05ObservedCct = q05ObservedCct;
	}
	//get方法
	public Double getQ05ObservedCcc() {
		return q05ObservedCcc;
	}

	//set方法
	public void setQ05ObservedCcc(Double q05ObservedCcc) {
		this.q05ObservedCcc = q05ObservedCcc;
	}
	//get方法
	public Double getQ25ObservedAaa() {
		return q25ObservedAaa;
	}

	//set方法
	public void setQ25ObservedAaa(Double q25ObservedAaa) {
		this.q25ObservedAaa = q25ObservedAaa;
	}
	//get方法
	public Double getQ25ObservedAag() {
		return q25ObservedAag;
	}

	//set方法
	public void setQ25ObservedAag(Double q25ObservedAag) {
		this.q25ObservedAag = q25ObservedAag;
	}
	//get方法
	public Double getQ25ObservedAat() {
		return q25ObservedAat;
	}

	//set方法
	public void setQ25ObservedAat(Double q25ObservedAat) {
		this.q25ObservedAat = q25ObservedAat;
	}
	//get方法
	public Double getQ25ObservedAac() {
		return q25ObservedAac;
	}

	//set方法
	public void setQ25ObservedAac(Double q25ObservedAac) {
		this.q25ObservedAac = q25ObservedAac;
	}
	//get方法
	public Double getQ25ObservedTaa() {
		return q25ObservedTaa;
	}

	//set方法
	public void setQ25ObservedTaa(Double q25ObservedTaa) {
		this.q25ObservedTaa = q25ObservedTaa;
	}
	//get方法
	public Double getQ25ObservedTag() {
		return q25ObservedTag;
	}

	//set方法
	public void setQ25ObservedTag(Double q25ObservedTag) {
		this.q25ObservedTag = q25ObservedTag;
	}
	//get方法
	public Double getQ25ObservedTat() {
		return q25ObservedTat;
	}

	//set方法
	public void setQ25ObservedTat(Double q25ObservedTat) {
		this.q25ObservedTat = q25ObservedTat;
	}
	//get方法
	public Double getQ25ObservedTac() {
		return q25ObservedTac;
	}

	//set方法
	public void setQ25ObservedTac(Double q25ObservedTac) {
		this.q25ObservedTac = q25ObservedTac;
	}
	//get方法
	public Double getQ25ObservedAta() {
		return q25ObservedAta;
	}

	//set方法
	public void setQ25ObservedAta(Double q25ObservedAta) {
		this.q25ObservedAta = q25ObservedAta;
	}
	//get方法
	public Double getQ25ObservedAtg() {
		return q25ObservedAtg;
	}

	//set方法
	public void setQ25ObservedAtg(Double q25ObservedAtg) {
		this.q25ObservedAtg = q25ObservedAtg;
	}
	//get方法
	public Double getQ25ObservedAtt() {
		return q25ObservedAtt;
	}

	//set方法
	public void setQ25ObservedAtt(Double q25ObservedAtt) {
		this.q25ObservedAtt = q25ObservedAtt;
	}
	//get方法
	public Double getQ25ObservedAtc() {
		return q25ObservedAtc;
	}

	//set方法
	public void setQ25ObservedAtc(Double q25ObservedAtc) {
		this.q25ObservedAtc = q25ObservedAtc;
	}
	//get方法
	public Double getQ25ObservedTta() {
		return q25ObservedTta;
	}

	//set方法
	public void setQ25ObservedTta(Double q25ObservedTta) {
		this.q25ObservedTta = q25ObservedTta;
	}
	//get方法
	public Double getQ25ObservedTtg() {
		return q25ObservedTtg;
	}

	//set方法
	public void setQ25ObservedTtg(Double q25ObservedTtg) {
		this.q25ObservedTtg = q25ObservedTtg;
	}
	//get方法
	public Double getQ25ObservedTtt() {
		return q25ObservedTtt;
	}

	//set方法
	public void setQ25ObservedTtt(Double q25ObservedTtt) {
		this.q25ObservedTtt = q25ObservedTtt;
	}
	//get方法
	public Double getQ25ObservedTtc() {
		return q25ObservedTtc;
	}

	//set方法
	public void setQ25ObservedTtc(Double q25ObservedTtc) {
		this.q25ObservedTtc = q25ObservedTtc;
	}
	//get方法
	public Double getQ25ObservedGaa() {
		return q25ObservedGaa;
	}

	//set方法
	public void setQ25ObservedGaa(Double q25ObservedGaa) {
		this.q25ObservedGaa = q25ObservedGaa;
	}
	//get方法
	public Double getQ25ObservedGag() {
		return q25ObservedGag;
	}

	//set方法
	public void setQ25ObservedGag(Double q25ObservedGag) {
		this.q25ObservedGag = q25ObservedGag;
	}
	//get方法
	public Double getQ25ObservedGat() {
		return q25ObservedGat;
	}

	//set方法
	public void setQ25ObservedGat(Double q25ObservedGat) {
		this.q25ObservedGat = q25ObservedGat;
	}
	//get方法
	public Double getQ25ObservedGac() {
		return q25ObservedGac;
	}

	//set方法
	public void setQ25ObservedGac(Double q25ObservedGac) {
		this.q25ObservedGac = q25ObservedGac;
	}
	//get方法
	public Double getQ25ObservedCaa() {
		return q25ObservedCaa;
	}

	//set方法
	public void setQ25ObservedCaa(Double q25ObservedCaa) {
		this.q25ObservedCaa = q25ObservedCaa;
	}
	//get方法
	public Double getQ25ObservedCag() {
		return q25ObservedCag;
	}

	//set方法
	public void setQ25ObservedCag(Double q25ObservedCag) {
		this.q25ObservedCag = q25ObservedCag;
	}
	//get方法
	public Double getQ25ObservedCat() {
		return q25ObservedCat;
	}

	//set方法
	public void setQ25ObservedCat(Double q25ObservedCat) {
		this.q25ObservedCat = q25ObservedCat;
	}
	//get方法
	public Double getQ25ObservedCac() {
		return q25ObservedCac;
	}

	//set方法
	public void setQ25ObservedCac(Double q25ObservedCac) {
		this.q25ObservedCac = q25ObservedCac;
	}
	//get方法
	public Double getQ25ObservedGta() {
		return q25ObservedGta;
	}

	//set方法
	public void setQ25ObservedGta(Double q25ObservedGta) {
		this.q25ObservedGta = q25ObservedGta;
	}
	//get方法
	public Double getQ25ObservedGtg() {
		return q25ObservedGtg;
	}

	//set方法
	public void setQ25ObservedGtg(Double q25ObservedGtg) {
		this.q25ObservedGtg = q25ObservedGtg;
	}
	//get方法
	public Double getQ25ObservedGtt() {
		return q25ObservedGtt;
	}

	//set方法
	public void setQ25ObservedGtt(Double q25ObservedGtt) {
		this.q25ObservedGtt = q25ObservedGtt;
	}
	//get方法
	public Double getQ25ObservedGtc() {
		return q25ObservedGtc;
	}

	//set方法
	public void setQ25ObservedGtc(Double q25ObservedGtc) {
		this.q25ObservedGtc = q25ObservedGtc;
	}
	//get方法
	public Double getQ25ObservedCta() {
		return q25ObservedCta;
	}

	//set方法
	public void setQ25ObservedCta(Double q25ObservedCta) {
		this.q25ObservedCta = q25ObservedCta;
	}
	//get方法
	public Double getQ25ObservedCtg() {
		return q25ObservedCtg;
	}

	//set方法
	public void setQ25ObservedCtg(Double q25ObservedCtg) {
		this.q25ObservedCtg = q25ObservedCtg;
	}
	//get方法
	public Double getQ25ObservedCtt() {
		return q25ObservedCtt;
	}

	//set方法
	public void setQ25ObservedCtt(Double q25ObservedCtt) {
		this.q25ObservedCtt = q25ObservedCtt;
	}
	//get方法
	public Double getQ25ObservedCtc() {
		return q25ObservedCtc;
	}

	//set方法
	public void setQ25ObservedCtc(Double q25ObservedCtc) {
		this.q25ObservedCtc = q25ObservedCtc;
	}
	//get方法
	public Double getQ25ObservedAga() {
		return q25ObservedAga;
	}

	//set方法
	public void setQ25ObservedAga(Double q25ObservedAga) {
		this.q25ObservedAga = q25ObservedAga;
	}
	//get方法
	public Double getQ25ObservedAgg() {
		return q25ObservedAgg;
	}

	//set方法
	public void setQ25ObservedAgg(Double q25ObservedAgg) {
		this.q25ObservedAgg = q25ObservedAgg;
	}
	//get方法
	public Double getQ25ObservedAgt() {
		return q25ObservedAgt;
	}

	//set方法
	public void setQ25ObservedAgt(Double q25ObservedAgt) {
		this.q25ObservedAgt = q25ObservedAgt;
	}
	//get方法
	public Double getQ25ObservedAgc() {
		return q25ObservedAgc;
	}

	//set方法
	public void setQ25ObservedAgc(Double q25ObservedAgc) {
		this.q25ObservedAgc = q25ObservedAgc;
	}
	//get方法
	public Double getQ25ObservedTga() {
		return q25ObservedTga;
	}

	//set方法
	public void setQ25ObservedTga(Double q25ObservedTga) {
		this.q25ObservedTga = q25ObservedTga;
	}
	//get方法
	public Double getQ25ObservedTgg() {
		return q25ObservedTgg;
	}

	//set方法
	public void setQ25ObservedTgg(Double q25ObservedTgg) {
		this.q25ObservedTgg = q25ObservedTgg;
	}
	//get方法
	public Double getQ25ObservedTgt() {
		return q25ObservedTgt;
	}

	//set方法
	public void setQ25ObservedTgt(Double q25ObservedTgt) {
		this.q25ObservedTgt = q25ObservedTgt;
	}
	//get方法
	public Double getQ25ObservedTgc() {
		return q25ObservedTgc;
	}

	//set方法
	public void setQ25ObservedTgc(Double q25ObservedTgc) {
		this.q25ObservedTgc = q25ObservedTgc;
	}
	//get方法
	public Double getQ25ObservedAca() {
		return q25ObservedAca;
	}

	//set方法
	public void setQ25ObservedAca(Double q25ObservedAca) {
		this.q25ObservedAca = q25ObservedAca;
	}
	//get方法
	public Double getQ25ObservedAcg() {
		return q25ObservedAcg;
	}

	//set方法
	public void setQ25ObservedAcg(Double q25ObservedAcg) {
		this.q25ObservedAcg = q25ObservedAcg;
	}
	//get方法
	public Double getQ25ObservedAct() {
		return q25ObservedAct;
	}

	//set方法
	public void setQ25ObservedAct(Double q25ObservedAct) {
		this.q25ObservedAct = q25ObservedAct;
	}
	//get方法
	public Double getQ25ObservedAcc() {
		return q25ObservedAcc;
	}

	//set方法
	public void setQ25ObservedAcc(Double q25ObservedAcc) {
		this.q25ObservedAcc = q25ObservedAcc;
	}
	//get方法
	public Double getQ25ObservedTca() {
		return q25ObservedTca;
	}

	//set方法
	public void setQ25ObservedTca(Double q25ObservedTca) {
		this.q25ObservedTca = q25ObservedTca;
	}
	//get方法
	public Double getQ25ObservedTcg() {
		return q25ObservedTcg;
	}

	//set方法
	public void setQ25ObservedTcg(Double q25ObservedTcg) {
		this.q25ObservedTcg = q25ObservedTcg;
	}
	//get方法
	public Double getQ25ObservedTct() {
		return q25ObservedTct;
	}

	//set方法
	public void setQ25ObservedTct(Double q25ObservedTct) {
		this.q25ObservedTct = q25ObservedTct;
	}
	//get方法
	public Double getQ25ObservedTcc() {
		return q25ObservedTcc;
	}

	//set方法
	public void setQ25ObservedTcc(Double q25ObservedTcc) {
		this.q25ObservedTcc = q25ObservedTcc;
	}
	//get方法
	public Double getQ25ObservedGga() {
		return q25ObservedGga;
	}

	//set方法
	public void setQ25ObservedGga(Double q25ObservedGga) {
		this.q25ObservedGga = q25ObservedGga;
	}
	//get方法
	public Double getQ25ObservedGgg() {
		return q25ObservedGgg;
	}

	//set方法
	public void setQ25ObservedGgg(Double q25ObservedGgg) {
		this.q25ObservedGgg = q25ObservedGgg;
	}
	//get方法
	public Double getQ25ObservedGgt() {
		return q25ObservedGgt;
	}

	//set方法
	public void setQ25ObservedGgt(Double q25ObservedGgt) {
		this.q25ObservedGgt = q25ObservedGgt;
	}
	//get方法
	public Double getQ25ObservedGgc() {
		return q25ObservedGgc;
	}

	//set方法
	public void setQ25ObservedGgc(Double q25ObservedGgc) {
		this.q25ObservedGgc = q25ObservedGgc;
	}
	//get方法
	public Double getQ25ObservedCga() {
		return q25ObservedCga;
	}

	//set方法
	public void setQ25ObservedCga(Double q25ObservedCga) {
		this.q25ObservedCga = q25ObservedCga;
	}
	//get方法
	public Double getQ25ObservedCgg() {
		return q25ObservedCgg;
	}

	//set方法
	public void setQ25ObservedCgg(Double q25ObservedCgg) {
		this.q25ObservedCgg = q25ObservedCgg;
	}
	//get方法
	public Double getQ25ObservedCgt() {
		return q25ObservedCgt;
	}

	//set方法
	public void setQ25ObservedCgt(Double q25ObservedCgt) {
		this.q25ObservedCgt = q25ObservedCgt;
	}
	//get方法
	public Double getQ25ObservedCgc() {
		return q25ObservedCgc;
	}

	//set方法
	public void setQ25ObservedCgc(Double q25ObservedCgc) {
		this.q25ObservedCgc = q25ObservedCgc;
	}
	//get方法
	public Double getQ25ObservedGca() {
		return q25ObservedGca;
	}

	//set方法
	public void setQ25ObservedGca(Double q25ObservedGca) {
		this.q25ObservedGca = q25ObservedGca;
	}
	//get方法
	public Double getQ25ObservedGcg() {
		return q25ObservedGcg;
	}

	//set方法
	public void setQ25ObservedGcg(Double q25ObservedGcg) {
		this.q25ObservedGcg = q25ObservedGcg;
	}
	//get方法
	public Double getQ25ObservedGct() {
		return q25ObservedGct;
	}

	//set方法
	public void setQ25ObservedGct(Double q25ObservedGct) {
		this.q25ObservedGct = q25ObservedGct;
	}
	//get方法
	public Double getQ25ObservedGcc() {
		return q25ObservedGcc;
	}

	//set方法
	public void setQ25ObservedGcc(Double q25ObservedGcc) {
		this.q25ObservedGcc = q25ObservedGcc;
	}
	//get方法
	public Double getQ25ObservedCca() {
		return q25ObservedCca;
	}

	//set方法
	public void setQ25ObservedCca(Double q25ObservedCca) {
		this.q25ObservedCca = q25ObservedCca;
	}
	//get方法
	public Double getQ25ObservedCcg() {
		return q25ObservedCcg;
	}

	//set方法
	public void setQ25ObservedCcg(Double q25ObservedCcg) {
		this.q25ObservedCcg = q25ObservedCcg;
	}
	//get方法
	public Double getQ25ObservedCct() {
		return q25ObservedCct;
	}

	//set方法
	public void setQ25ObservedCct(Double q25ObservedCct) {
		this.q25ObservedCct = q25ObservedCct;
	}
	//get方法
	public Double getQ25ObservedCcc() {
		return q25ObservedCcc;
	}

	//set方法
	public void setQ25ObservedCcc(Double q25ObservedCcc) {
		this.q25ObservedCcc = q25ObservedCcc;
	}
	//get方法
	public Double getQ50ObservedAaa() {
		return q50ObservedAaa;
	}

	//set方法
	public void setQ50ObservedAaa(Double q50ObservedAaa) {
		this.q50ObservedAaa = q50ObservedAaa;
	}
	//get方法
	public Double getQ50ObservedAag() {
		return q50ObservedAag;
	}

	//set方法
	public void setQ50ObservedAag(Double q50ObservedAag) {
		this.q50ObservedAag = q50ObservedAag;
	}
	//get方法
	public Double getQ50ObservedAat() {
		return q50ObservedAat;
	}

	//set方法
	public void setQ50ObservedAat(Double q50ObservedAat) {
		this.q50ObservedAat = q50ObservedAat;
	}
	//get方法
	public Double getQ50ObservedAac() {
		return q50ObservedAac;
	}

	//set方法
	public void setQ50ObservedAac(Double q50ObservedAac) {
		this.q50ObservedAac = q50ObservedAac;
	}
	//get方法
	public Double getQ50ObservedTaa() {
		return q50ObservedTaa;
	}

	//set方法
	public void setQ50ObservedTaa(Double q50ObservedTaa) {
		this.q50ObservedTaa = q50ObservedTaa;
	}
	//get方法
	public Double getQ50ObservedTag() {
		return q50ObservedTag;
	}

	//set方法
	public void setQ50ObservedTag(Double q50ObservedTag) {
		this.q50ObservedTag = q50ObservedTag;
	}
	//get方法
	public Double getQ50ObservedTat() {
		return q50ObservedTat;
	}

	//set方法
	public void setQ50ObservedTat(Double q50ObservedTat) {
		this.q50ObservedTat = q50ObservedTat;
	}
	//get方法
	public Double getQ50ObservedTac() {
		return q50ObservedTac;
	}

	//set方法
	public void setQ50ObservedTac(Double q50ObservedTac) {
		this.q50ObservedTac = q50ObservedTac;
	}
	//get方法
	public Double getQ50ObservedAta() {
		return q50ObservedAta;
	}

	//set方法
	public void setQ50ObservedAta(Double q50ObservedAta) {
		this.q50ObservedAta = q50ObservedAta;
	}
	//get方法
	public Double getQ50ObservedAtg() {
		return q50ObservedAtg;
	}

	//set方法
	public void setQ50ObservedAtg(Double q50ObservedAtg) {
		this.q50ObservedAtg = q50ObservedAtg;
	}
	//get方法
	public Double getQ50ObservedAtt() {
		return q50ObservedAtt;
	}

	//set方法
	public void setQ50ObservedAtt(Double q50ObservedAtt) {
		this.q50ObservedAtt = q50ObservedAtt;
	}
	//get方法
	public Double getQ50ObservedAtc() {
		return q50ObservedAtc;
	}

	//set方法
	public void setQ50ObservedAtc(Double q50ObservedAtc) {
		this.q50ObservedAtc = q50ObservedAtc;
	}
	//get方法
	public Double getQ50ObservedTta() {
		return q50ObservedTta;
	}

	//set方法
	public void setQ50ObservedTta(Double q50ObservedTta) {
		this.q50ObservedTta = q50ObservedTta;
	}
	//get方法
	public Double getQ50ObservedTtg() {
		return q50ObservedTtg;
	}

	//set方法
	public void setQ50ObservedTtg(Double q50ObservedTtg) {
		this.q50ObservedTtg = q50ObservedTtg;
	}
	//get方法
	public Double getQ50ObservedTtt() {
		return q50ObservedTtt;
	}

	//set方法
	public void setQ50ObservedTtt(Double q50ObservedTtt) {
		this.q50ObservedTtt = q50ObservedTtt;
	}
	//get方法
	public Double getQ50ObservedTtc() {
		return q50ObservedTtc;
	}

	//set方法
	public void setQ50ObservedTtc(Double q50ObservedTtc) {
		this.q50ObservedTtc = q50ObservedTtc;
	}
	//get方法
	public Double getQ50ObservedGaa() {
		return q50ObservedGaa;
	}

	//set方法
	public void setQ50ObservedGaa(Double q50ObservedGaa) {
		this.q50ObservedGaa = q50ObservedGaa;
	}
	//get方法
	public Double getQ50ObservedGag() {
		return q50ObservedGag;
	}

	//set方法
	public void setQ50ObservedGag(Double q50ObservedGag) {
		this.q50ObservedGag = q50ObservedGag;
	}
	//get方法
	public Double getQ50ObservedGat() {
		return q50ObservedGat;
	}

	//set方法
	public void setQ50ObservedGat(Double q50ObservedGat) {
		this.q50ObservedGat = q50ObservedGat;
	}
	//get方法
	public Double getQ50ObservedGac() {
		return q50ObservedGac;
	}

	//set方法
	public void setQ50ObservedGac(Double q50ObservedGac) {
		this.q50ObservedGac = q50ObservedGac;
	}
	//get方法
	public Double getQ50ObservedCaa() {
		return q50ObservedCaa;
	}

	//set方法
	public void setQ50ObservedCaa(Double q50ObservedCaa) {
		this.q50ObservedCaa = q50ObservedCaa;
	}
	//get方法
	public Double getQ50ObservedCag() {
		return q50ObservedCag;
	}

	//set方法
	public void setQ50ObservedCag(Double q50ObservedCag) {
		this.q50ObservedCag = q50ObservedCag;
	}
	//get方法
	public Double getQ50ObservedCat() {
		return q50ObservedCat;
	}

	//set方法
	public void setQ50ObservedCat(Double q50ObservedCat) {
		this.q50ObservedCat = q50ObservedCat;
	}
	//get方法
	public Double getQ50ObservedCac() {
		return q50ObservedCac;
	}

	//set方法
	public void setQ50ObservedCac(Double q50ObservedCac) {
		this.q50ObservedCac = q50ObservedCac;
	}
	//get方法
	public Double getQ50ObservedGta() {
		return q50ObservedGta;
	}

	//set方法
	public void setQ50ObservedGta(Double q50ObservedGta) {
		this.q50ObservedGta = q50ObservedGta;
	}
	//get方法
	public Double getQ50ObservedGtg() {
		return q50ObservedGtg;
	}

	//set方法
	public void setQ50ObservedGtg(Double q50ObservedGtg) {
		this.q50ObservedGtg = q50ObservedGtg;
	}
	//get方法
	public Double getQ50ObservedGtt() {
		return q50ObservedGtt;
	}

	//set方法
	public void setQ50ObservedGtt(Double q50ObservedGtt) {
		this.q50ObservedGtt = q50ObservedGtt;
	}
	//get方法
	public Double getQ50ObservedGtc() {
		return q50ObservedGtc;
	}

	//set方法
	public void setQ50ObservedGtc(Double q50ObservedGtc) {
		this.q50ObservedGtc = q50ObservedGtc;
	}
	//get方法
	public Double getQ50ObservedCta() {
		return q50ObservedCta;
	}

	//set方法
	public void setQ50ObservedCta(Double q50ObservedCta) {
		this.q50ObservedCta = q50ObservedCta;
	}
	//get方法
	public Double getQ50ObservedCtg() {
		return q50ObservedCtg;
	}

	//set方法
	public void setQ50ObservedCtg(Double q50ObservedCtg) {
		this.q50ObservedCtg = q50ObservedCtg;
	}
	//get方法
	public Double getQ50ObservedCtt() {
		return q50ObservedCtt;
	}

	//set方法
	public void setQ50ObservedCtt(Double q50ObservedCtt) {
		this.q50ObservedCtt = q50ObservedCtt;
	}
	//get方法
	public Double getQ50ObservedCtc() {
		return q50ObservedCtc;
	}

	//set方法
	public void setQ50ObservedCtc(Double q50ObservedCtc) {
		this.q50ObservedCtc = q50ObservedCtc;
	}
	//get方法
	public Double getQ50ObservedAga() {
		return q50ObservedAga;
	}

	//set方法
	public void setQ50ObservedAga(Double q50ObservedAga) {
		this.q50ObservedAga = q50ObservedAga;
	}
	//get方法
	public Double getQ50ObservedAgg() {
		return q50ObservedAgg;
	}

	//set方法
	public void setQ50ObservedAgg(Double q50ObservedAgg) {
		this.q50ObservedAgg = q50ObservedAgg;
	}
	//get方法
	public Double getQ50ObservedAgt() {
		return q50ObservedAgt;
	}

	//set方法
	public void setQ50ObservedAgt(Double q50ObservedAgt) {
		this.q50ObservedAgt = q50ObservedAgt;
	}
	//get方法
	public Double getQ50ObservedAgc() {
		return q50ObservedAgc;
	}

	//set方法
	public void setQ50ObservedAgc(Double q50ObservedAgc) {
		this.q50ObservedAgc = q50ObservedAgc;
	}
	//get方法
	public Double getQ50ObservedTga() {
		return q50ObservedTga;
	}

	//set方法
	public void setQ50ObservedTga(Double q50ObservedTga) {
		this.q50ObservedTga = q50ObservedTga;
	}
	//get方法
	public Double getQ50ObservedTgg() {
		return q50ObservedTgg;
	}

	//set方法
	public void setQ50ObservedTgg(Double q50ObservedTgg) {
		this.q50ObservedTgg = q50ObservedTgg;
	}
	//get方法
	public Double getQ50ObservedTgt() {
		return q50ObservedTgt;
	}

	//set方法
	public void setQ50ObservedTgt(Double q50ObservedTgt) {
		this.q50ObservedTgt = q50ObservedTgt;
	}
	//get方法
	public Double getQ50ObservedTgc() {
		return q50ObservedTgc;
	}

	//set方法
	public void setQ50ObservedTgc(Double q50ObservedTgc) {
		this.q50ObservedTgc = q50ObservedTgc;
	}
	//get方法
	public Double getQ50ObservedAca() {
		return q50ObservedAca;
	}

	//set方法
	public void setQ50ObservedAca(Double q50ObservedAca) {
		this.q50ObservedAca = q50ObservedAca;
	}
	//get方法
	public Double getQ50ObservedAcg() {
		return q50ObservedAcg;
	}

	//set方法
	public void setQ50ObservedAcg(Double q50ObservedAcg) {
		this.q50ObservedAcg = q50ObservedAcg;
	}
	//get方法
	public Double getQ50ObservedAct() {
		return q50ObservedAct;
	}

	//set方法
	public void setQ50ObservedAct(Double q50ObservedAct) {
		this.q50ObservedAct = q50ObservedAct;
	}
	//get方法
	public Double getQ50ObservedAcc() {
		return q50ObservedAcc;
	}

	//set方法
	public void setQ50ObservedAcc(Double q50ObservedAcc) {
		this.q50ObservedAcc = q50ObservedAcc;
	}
	//get方法
	public Double getQ50ObservedTca() {
		return q50ObservedTca;
	}

	//set方法
	public void setQ50ObservedTca(Double q50ObservedTca) {
		this.q50ObservedTca = q50ObservedTca;
	}
	//get方法
	public Double getQ50ObservedTcg() {
		return q50ObservedTcg;
	}

	//set方法
	public void setQ50ObservedTcg(Double q50ObservedTcg) {
		this.q50ObservedTcg = q50ObservedTcg;
	}
	//get方法
	public Double getQ50ObservedTct() {
		return q50ObservedTct;
	}

	//set方法
	public void setQ50ObservedTct(Double q50ObservedTct) {
		this.q50ObservedTct = q50ObservedTct;
	}
	//get方法
	public Double getQ50ObservedTcc() {
		return q50ObservedTcc;
	}

	//set方法
	public void setQ50ObservedTcc(Double q50ObservedTcc) {
		this.q50ObservedTcc = q50ObservedTcc;
	}
	//get方法
	public Double getQ50ObservedGga() {
		return q50ObservedGga;
	}

	//set方法
	public void setQ50ObservedGga(Double q50ObservedGga) {
		this.q50ObservedGga = q50ObservedGga;
	}
	//get方法
	public Double getQ50ObservedGgg() {
		return q50ObservedGgg;
	}

	//set方法
	public void setQ50ObservedGgg(Double q50ObservedGgg) {
		this.q50ObservedGgg = q50ObservedGgg;
	}
	//get方法
	public Double getQ50ObservedGgt() {
		return q50ObservedGgt;
	}

	//set方法
	public void setQ50ObservedGgt(Double q50ObservedGgt) {
		this.q50ObservedGgt = q50ObservedGgt;
	}
	//get方法
	public Double getQ50ObservedGgc() {
		return q50ObservedGgc;
	}

	//set方法
	public void setQ50ObservedGgc(Double q50ObservedGgc) {
		this.q50ObservedGgc = q50ObservedGgc;
	}
	//get方法
	public Double getQ50ObservedCga() {
		return q50ObservedCga;
	}

	//set方法
	public void setQ50ObservedCga(Double q50ObservedCga) {
		this.q50ObservedCga = q50ObservedCga;
	}
	//get方法
	public Double getQ50ObservedCgg() {
		return q50ObservedCgg;
	}

	//set方法
	public void setQ50ObservedCgg(Double q50ObservedCgg) {
		this.q50ObservedCgg = q50ObservedCgg;
	}
	//get方法
	public Double getQ50ObservedCgt() {
		return q50ObservedCgt;
	}

	//set方法
	public void setQ50ObservedCgt(Double q50ObservedCgt) {
		this.q50ObservedCgt = q50ObservedCgt;
	}
	//get方法
	public Double getQ50ObservedCgc() {
		return q50ObservedCgc;
	}

	//set方法
	public void setQ50ObservedCgc(Double q50ObservedCgc) {
		this.q50ObservedCgc = q50ObservedCgc;
	}
	//get方法
	public Double getQ50ObservedGca() {
		return q50ObservedGca;
	}

	//set方法
	public void setQ50ObservedGca(Double q50ObservedGca) {
		this.q50ObservedGca = q50ObservedGca;
	}
	//get方法
	public Double getQ50ObservedGcg() {
		return q50ObservedGcg;
	}

	//set方法
	public void setQ50ObservedGcg(Double q50ObservedGcg) {
		this.q50ObservedGcg = q50ObservedGcg;
	}
	//get方法
	public Double getQ50ObservedGct() {
		return q50ObservedGct;
	}

	//set方法
	public void setQ50ObservedGct(Double q50ObservedGct) {
		this.q50ObservedGct = q50ObservedGct;
	}
	//get方法
	public Double getQ50ObservedGcc() {
		return q50ObservedGcc;
	}

	//set方法
	public void setQ50ObservedGcc(Double q50ObservedGcc) {
		this.q50ObservedGcc = q50ObservedGcc;
	}
	//get方法
	public Double getQ50ObservedCca() {
		return q50ObservedCca;
	}

	//set方法
	public void setQ50ObservedCca(Double q50ObservedCca) {
		this.q50ObservedCca = q50ObservedCca;
	}
	//get方法
	public Double getQ50ObservedCcg() {
		return q50ObservedCcg;
	}

	//set方法
	public void setQ50ObservedCcg(Double q50ObservedCcg) {
		this.q50ObservedCcg = q50ObservedCcg;
	}
	//get方法
	public Double getQ50ObservedCct() {
		return q50ObservedCct;
	}

	//set方法
	public void setQ50ObservedCct(Double q50ObservedCct) {
		this.q50ObservedCct = q50ObservedCct;
	}
	//get方法
	public Double getQ50ObservedCcc() {
		return q50ObservedCcc;
	}

	//set方法
	public void setQ50ObservedCcc(Double q50ObservedCcc) {
		this.q50ObservedCcc = q50ObservedCcc;
	}
	//get方法
	public Double getQ75ObservedAaa() {
		return q75ObservedAaa;
	}

	//set方法
	public void setQ75ObservedAaa(Double q75ObservedAaa) {
		this.q75ObservedAaa = q75ObservedAaa;
	}
	//get方法
	public Double getQ75ObservedAag() {
		return q75ObservedAag;
	}

	//set方法
	public void setQ75ObservedAag(Double q75ObservedAag) {
		this.q75ObservedAag = q75ObservedAag;
	}
	//get方法
	public Double getQ75ObservedAat() {
		return q75ObservedAat;
	}

	//set方法
	public void setQ75ObservedAat(Double q75ObservedAat) {
		this.q75ObservedAat = q75ObservedAat;
	}
	//get方法
	public Double getQ75ObservedAac() {
		return q75ObservedAac;
	}

	//set方法
	public void setQ75ObservedAac(Double q75ObservedAac) {
		this.q75ObservedAac = q75ObservedAac;
	}
	//get方法
	public Double getQ75ObservedTaa() {
		return q75ObservedTaa;
	}

	//set方法
	public void setQ75ObservedTaa(Double q75ObservedTaa) {
		this.q75ObservedTaa = q75ObservedTaa;
	}
	//get方法
	public Double getQ75ObservedTag() {
		return q75ObservedTag;
	}

	//set方法
	public void setQ75ObservedTag(Double q75ObservedTag) {
		this.q75ObservedTag = q75ObservedTag;
	}
	//get方法
	public Double getQ75ObservedTat() {
		return q75ObservedTat;
	}

	//set方法
	public void setQ75ObservedTat(Double q75ObservedTat) {
		this.q75ObservedTat = q75ObservedTat;
	}
	//get方法
	public Double getQ75ObservedTac() {
		return q75ObservedTac;
	}

	//set方法
	public void setQ75ObservedTac(Double q75ObservedTac) {
		this.q75ObservedTac = q75ObservedTac;
	}
	//get方法
	public Double getQ75ObservedAta() {
		return q75ObservedAta;
	}

	//set方法
	public void setQ75ObservedAta(Double q75ObservedAta) {
		this.q75ObservedAta = q75ObservedAta;
	}
	//get方法
	public Double getQ75ObservedAtg() {
		return q75ObservedAtg;
	}

	//set方法
	public void setQ75ObservedAtg(Double q75ObservedAtg) {
		this.q75ObservedAtg = q75ObservedAtg;
	}
	//get方法
	public Double getQ75ObservedAtt() {
		return q75ObservedAtt;
	}

	//set方法
	public void setQ75ObservedAtt(Double q75ObservedAtt) {
		this.q75ObservedAtt = q75ObservedAtt;
	}
	//get方法
	public Double getQ75ObservedAtc() {
		return q75ObservedAtc;
	}

	//set方法
	public void setQ75ObservedAtc(Double q75ObservedAtc) {
		this.q75ObservedAtc = q75ObservedAtc;
	}
	//get方法
	public Double getQ75ObservedTta() {
		return q75ObservedTta;
	}

	//set方法
	public void setQ75ObservedTta(Double q75ObservedTta) {
		this.q75ObservedTta = q75ObservedTta;
	}
	//get方法
	public Double getQ75ObservedTtg() {
		return q75ObservedTtg;
	}

	//set方法
	public void setQ75ObservedTtg(Double q75ObservedTtg) {
		this.q75ObservedTtg = q75ObservedTtg;
	}
	//get方法
	public Double getQ75ObservedTtt() {
		return q75ObservedTtt;
	}

	//set方法
	public void setQ75ObservedTtt(Double q75ObservedTtt) {
		this.q75ObservedTtt = q75ObservedTtt;
	}
	//get方法
	public Double getQ75ObservedTtc() {
		return q75ObservedTtc;
	}

	//set方法
	public void setQ75ObservedTtc(Double q75ObservedTtc) {
		this.q75ObservedTtc = q75ObservedTtc;
	}
	//get方法
	public Double getQ75ObservedGaa() {
		return q75ObservedGaa;
	}

	//set方法
	public void setQ75ObservedGaa(Double q75ObservedGaa) {
		this.q75ObservedGaa = q75ObservedGaa;
	}
	//get方法
	public Double getQ75ObservedGag() {
		return q75ObservedGag;
	}

	//set方法
	public void setQ75ObservedGag(Double q75ObservedGag) {
		this.q75ObservedGag = q75ObservedGag;
	}
	//get方法
	public Double getQ75ObservedGat() {
		return q75ObservedGat;
	}

	//set方法
	public void setQ75ObservedGat(Double q75ObservedGat) {
		this.q75ObservedGat = q75ObservedGat;
	}
	//get方法
	public Double getQ75ObservedGac() {
		return q75ObservedGac;
	}

	//set方法
	public void setQ75ObservedGac(Double q75ObservedGac) {
		this.q75ObservedGac = q75ObservedGac;
	}
	//get方法
	public Double getQ75ObservedCaa() {
		return q75ObservedCaa;
	}

	//set方法
	public void setQ75ObservedCaa(Double q75ObservedCaa) {
		this.q75ObservedCaa = q75ObservedCaa;
	}
	//get方法
	public Double getQ75ObservedCag() {
		return q75ObservedCag;
	}

	//set方法
	public void setQ75ObservedCag(Double q75ObservedCag) {
		this.q75ObservedCag = q75ObservedCag;
	}
	//get方法
	public Double getQ75ObservedCat() {
		return q75ObservedCat;
	}

	//set方法
	public void setQ75ObservedCat(Double q75ObservedCat) {
		this.q75ObservedCat = q75ObservedCat;
	}
	//get方法
	public Double getQ75ObservedCac() {
		return q75ObservedCac;
	}

	//set方法
	public void setQ75ObservedCac(Double q75ObservedCac) {
		this.q75ObservedCac = q75ObservedCac;
	}
	//get方法
	public Double getQ75ObservedGta() {
		return q75ObservedGta;
	}

	//set方法
	public void setQ75ObservedGta(Double q75ObservedGta) {
		this.q75ObservedGta = q75ObservedGta;
	}
	//get方法
	public Double getQ75ObservedGtg() {
		return q75ObservedGtg;
	}

	//set方法
	public void setQ75ObservedGtg(Double q75ObservedGtg) {
		this.q75ObservedGtg = q75ObservedGtg;
	}
	//get方法
	public Double getQ75ObservedGtt() {
		return q75ObservedGtt;
	}

	//set方法
	public void setQ75ObservedGtt(Double q75ObservedGtt) {
		this.q75ObservedGtt = q75ObservedGtt;
	}
	//get方法
	public Double getQ75ObservedGtc() {
		return q75ObservedGtc;
	}

	//set方法
	public void setQ75ObservedGtc(Double q75ObservedGtc) {
		this.q75ObservedGtc = q75ObservedGtc;
	}
	//get方法
	public Double getQ75ObservedCta() {
		return q75ObservedCta;
	}

	//set方法
	public void setQ75ObservedCta(Double q75ObservedCta) {
		this.q75ObservedCta = q75ObservedCta;
	}
	//get方法
	public Double getQ75ObservedCtg() {
		return q75ObservedCtg;
	}

	//set方法
	public void setQ75ObservedCtg(Double q75ObservedCtg) {
		this.q75ObservedCtg = q75ObservedCtg;
	}
	//get方法
	public Double getQ75ObservedCtt() {
		return q75ObservedCtt;
	}

	//set方法
	public void setQ75ObservedCtt(Double q75ObservedCtt) {
		this.q75ObservedCtt = q75ObservedCtt;
	}
	//get方法
	public Double getQ75ObservedCtc() {
		return q75ObservedCtc;
	}

	//set方法
	public void setQ75ObservedCtc(Double q75ObservedCtc) {
		this.q75ObservedCtc = q75ObservedCtc;
	}
	//get方法
	public Double getQ75ObservedAga() {
		return q75ObservedAga;
	}

	//set方法
	public void setQ75ObservedAga(Double q75ObservedAga) {
		this.q75ObservedAga = q75ObservedAga;
	}
	//get方法
	public Double getQ75ObservedAgg() {
		return q75ObservedAgg;
	}

	//set方法
	public void setQ75ObservedAgg(Double q75ObservedAgg) {
		this.q75ObservedAgg = q75ObservedAgg;
	}
	//get方法
	public Double getQ75ObservedAgt() {
		return q75ObservedAgt;
	}

	//set方法
	public void setQ75ObservedAgt(Double q75ObservedAgt) {
		this.q75ObservedAgt = q75ObservedAgt;
	}
	//get方法
	public Double getQ75ObservedAgc() {
		return q75ObservedAgc;
	}

	//set方法
	public void setQ75ObservedAgc(Double q75ObservedAgc) {
		this.q75ObservedAgc = q75ObservedAgc;
	}
	//get方法
	public Double getQ75ObservedTga() {
		return q75ObservedTga;
	}

	//set方法
	public void setQ75ObservedTga(Double q75ObservedTga) {
		this.q75ObservedTga = q75ObservedTga;
	}
	//get方法
	public Double getQ75ObservedTgg() {
		return q75ObservedTgg;
	}

	//set方法
	public void setQ75ObservedTgg(Double q75ObservedTgg) {
		this.q75ObservedTgg = q75ObservedTgg;
	}
	//get方法
	public Double getQ75ObservedTgt() {
		return q75ObservedTgt;
	}

	//set方法
	public void setQ75ObservedTgt(Double q75ObservedTgt) {
		this.q75ObservedTgt = q75ObservedTgt;
	}
	//get方法
	public Double getQ75ObservedTgc() {
		return q75ObservedTgc;
	}

	//set方法
	public void setQ75ObservedTgc(Double q75ObservedTgc) {
		this.q75ObservedTgc = q75ObservedTgc;
	}
	//get方法
	public Double getQ75ObservedAca() {
		return q75ObservedAca;
	}

	//set方法
	public void setQ75ObservedAca(Double q75ObservedAca) {
		this.q75ObservedAca = q75ObservedAca;
	}
	//get方法
	public Double getQ75ObservedAcg() {
		return q75ObservedAcg;
	}

	//set方法
	public void setQ75ObservedAcg(Double q75ObservedAcg) {
		this.q75ObservedAcg = q75ObservedAcg;
	}
	//get方法
	public Double getQ75ObservedAct() {
		return q75ObservedAct;
	}

	//set方法
	public void setQ75ObservedAct(Double q75ObservedAct) {
		this.q75ObservedAct = q75ObservedAct;
	}
	//get方法
	public Double getQ75ObservedAcc() {
		return q75ObservedAcc;
	}

	//set方法
	public void setQ75ObservedAcc(Double q75ObservedAcc) {
		this.q75ObservedAcc = q75ObservedAcc;
	}
	//get方法
	public Double getQ75ObservedTca() {
		return q75ObservedTca;
	}

	//set方法
	public void setQ75ObservedTca(Double q75ObservedTca) {
		this.q75ObservedTca = q75ObservedTca;
	}
	//get方法
	public Double getQ75ObservedTcg() {
		return q75ObservedTcg;
	}

	//set方法
	public void setQ75ObservedTcg(Double q75ObservedTcg) {
		this.q75ObservedTcg = q75ObservedTcg;
	}
	//get方法
	public Double getQ75ObservedTct() {
		return q75ObservedTct;
	}

	//set方法
	public void setQ75ObservedTct(Double q75ObservedTct) {
		this.q75ObservedTct = q75ObservedTct;
	}
	//get方法
	public Double getQ75ObservedTcc() {
		return q75ObservedTcc;
	}

	//set方法
	public void setQ75ObservedTcc(Double q75ObservedTcc) {
		this.q75ObservedTcc = q75ObservedTcc;
	}
	//get方法
	public Double getQ75ObservedGga() {
		return q75ObservedGga;
	}

	//set方法
	public void setQ75ObservedGga(Double q75ObservedGga) {
		this.q75ObservedGga = q75ObservedGga;
	}
	//get方法
	public Double getQ75ObservedGgg() {
		return q75ObservedGgg;
	}

	//set方法
	public void setQ75ObservedGgg(Double q75ObservedGgg) {
		this.q75ObservedGgg = q75ObservedGgg;
	}
	//get方法
	public Double getQ75ObservedGgt() {
		return q75ObservedGgt;
	}

	//set方法
	public void setQ75ObservedGgt(Double q75ObservedGgt) {
		this.q75ObservedGgt = q75ObservedGgt;
	}
	//get方法
	public Double getQ75ObservedGgc() {
		return q75ObservedGgc;
	}

	//set方法
	public void setQ75ObservedGgc(Double q75ObservedGgc) {
		this.q75ObservedGgc = q75ObservedGgc;
	}
	//get方法
	public Double getQ75ObservedCga() {
		return q75ObservedCga;
	}

	//set方法
	public void setQ75ObservedCga(Double q75ObservedCga) {
		this.q75ObservedCga = q75ObservedCga;
	}
	//get方法
	public Double getQ75ObservedCgg() {
		return q75ObservedCgg;
	}

	//set方法
	public void setQ75ObservedCgg(Double q75ObservedCgg) {
		this.q75ObservedCgg = q75ObservedCgg;
	}
	//get方法
	public Double getQ75ObservedCgt() {
		return q75ObservedCgt;
	}

	//set方法
	public void setQ75ObservedCgt(Double q75ObservedCgt) {
		this.q75ObservedCgt = q75ObservedCgt;
	}
	//get方法
	public Double getQ75ObservedCgc() {
		return q75ObservedCgc;
	}

	//set方法
	public void setQ75ObservedCgc(Double q75ObservedCgc) {
		this.q75ObservedCgc = q75ObservedCgc;
	}
	//get方法
	public Double getQ75ObservedGca() {
		return q75ObservedGca;
	}

	//set方法
	public void setQ75ObservedGca(Double q75ObservedGca) {
		this.q75ObservedGca = q75ObservedGca;
	}
	//get方法
	public Double getQ75ObservedGcg() {
		return q75ObservedGcg;
	}

	//set方法
	public void setQ75ObservedGcg(Double q75ObservedGcg) {
		this.q75ObservedGcg = q75ObservedGcg;
	}
	//get方法
	public Double getQ75ObservedGct() {
		return q75ObservedGct;
	}

	//set方法
	public void setQ75ObservedGct(Double q75ObservedGct) {
		this.q75ObservedGct = q75ObservedGct;
	}
	//get方法
	public Double getQ75ObservedGcc() {
		return q75ObservedGcc;
	}

	//set方法
	public void setQ75ObservedGcc(Double q75ObservedGcc) {
		this.q75ObservedGcc = q75ObservedGcc;
	}
	//get方法
	public Double getQ75ObservedCca() {
		return q75ObservedCca;
	}

	//set方法
	public void setQ75ObservedCca(Double q75ObservedCca) {
		this.q75ObservedCca = q75ObservedCca;
	}
	//get方法
	public Double getQ75ObservedCcg() {
		return q75ObservedCcg;
	}

	//set方法
	public void setQ75ObservedCcg(Double q75ObservedCcg) {
		this.q75ObservedCcg = q75ObservedCcg;
	}
	//get方法
	public Double getQ75ObservedCct() {
		return q75ObservedCct;
	}

	//set方法
	public void setQ75ObservedCct(Double q75ObservedCct) {
		this.q75ObservedCct = q75ObservedCct;
	}
	//get方法
	public Double getQ75ObservedCcc() {
		return q75ObservedCcc;
	}

	//set方法
	public void setQ75ObservedCcc(Double q75ObservedCcc) {
		this.q75ObservedCcc = q75ObservedCcc;
	}
	//get方法
	public Double getQ95ObservedAaa() {
		return q95ObservedAaa;
	}

	//set方法
	public void setQ95ObservedAaa(Double q95ObservedAaa) {
		this.q95ObservedAaa = q95ObservedAaa;
	}
	//get方法
	public Double getQ95ObservedAag() {
		return q95ObservedAag;
	}

	//set方法
	public void setQ95ObservedAag(Double q95ObservedAag) {
		this.q95ObservedAag = q95ObservedAag;
	}
	//get方法
	public Double getQ95ObservedAat() {
		return q95ObservedAat;
	}

	//set方法
	public void setQ95ObservedAat(Double q95ObservedAat) {
		this.q95ObservedAat = q95ObservedAat;
	}
	//get方法
	public Double getQ95ObservedAac() {
		return q95ObservedAac;
	}

	//set方法
	public void setQ95ObservedAac(Double q95ObservedAac) {
		this.q95ObservedAac = q95ObservedAac;
	}
	//get方法
	public Double getQ95ObservedTaa() {
		return q95ObservedTaa;
	}

	//set方法
	public void setQ95ObservedTaa(Double q95ObservedTaa) {
		this.q95ObservedTaa = q95ObservedTaa;
	}
	//get方法
	public Double getQ95ObservedTag() {
		return q95ObservedTag;
	}

	//set方法
	public void setQ95ObservedTag(Double q95ObservedTag) {
		this.q95ObservedTag = q95ObservedTag;
	}
	//get方法
	public Double getQ95ObservedTat() {
		return q95ObservedTat;
	}

	//set方法
	public void setQ95ObservedTat(Double q95ObservedTat) {
		this.q95ObservedTat = q95ObservedTat;
	}
	//get方法
	public Double getQ95ObservedTac() {
		return q95ObservedTac;
	}

	//set方法
	public void setQ95ObservedTac(Double q95ObservedTac) {
		this.q95ObservedTac = q95ObservedTac;
	}
	//get方法
	public Double getQ95ObservedAta() {
		return q95ObservedAta;
	}

	//set方法
	public void setQ95ObservedAta(Double q95ObservedAta) {
		this.q95ObservedAta = q95ObservedAta;
	}
	//get方法
	public Double getQ95ObservedAtg() {
		return q95ObservedAtg;
	}

	//set方法
	public void setQ95ObservedAtg(Double q95ObservedAtg) {
		this.q95ObservedAtg = q95ObservedAtg;
	}
	//get方法
	public Double getQ95ObservedAtt() {
		return q95ObservedAtt;
	}

	//set方法
	public void setQ95ObservedAtt(Double q95ObservedAtt) {
		this.q95ObservedAtt = q95ObservedAtt;
	}
	//get方法
	public Double getQ95ObservedAtc() {
		return q95ObservedAtc;
	}

	//set方法
	public void setQ95ObservedAtc(Double q95ObservedAtc) {
		this.q95ObservedAtc = q95ObservedAtc;
	}
	//get方法
	public Double getQ95ObservedTta() {
		return q95ObservedTta;
	}

	//set方法
	public void setQ95ObservedTta(Double q95ObservedTta) {
		this.q95ObservedTta = q95ObservedTta;
	}
	//get方法
	public Double getQ95ObservedTtg() {
		return q95ObservedTtg;
	}

	//set方法
	public void setQ95ObservedTtg(Double q95ObservedTtg) {
		this.q95ObservedTtg = q95ObservedTtg;
	}
	//get方法
	public Double getQ95ObservedTtt() {
		return q95ObservedTtt;
	}

	//set方法
	public void setQ95ObservedTtt(Double q95ObservedTtt) {
		this.q95ObservedTtt = q95ObservedTtt;
	}
	//get方法
	public Double getQ95ObservedTtc() {
		return q95ObservedTtc;
	}

	//set方法
	public void setQ95ObservedTtc(Double q95ObservedTtc) {
		this.q95ObservedTtc = q95ObservedTtc;
	}
	//get方法
	public Double getQ95ObservedGaa() {
		return q95ObservedGaa;
	}

	//set方法
	public void setQ95ObservedGaa(Double q95ObservedGaa) {
		this.q95ObservedGaa = q95ObservedGaa;
	}
	//get方法
	public Double getQ95ObservedGag() {
		return q95ObservedGag;
	}

	//set方法
	public void setQ95ObservedGag(Double q95ObservedGag) {
		this.q95ObservedGag = q95ObservedGag;
	}
	//get方法
	public Double getQ95ObservedGat() {
		return q95ObservedGat;
	}

	//set方法
	public void setQ95ObservedGat(Double q95ObservedGat) {
		this.q95ObservedGat = q95ObservedGat;
	}
	//get方法
	public Double getQ95ObservedGac() {
		return q95ObservedGac;
	}

	//set方法
	public void setQ95ObservedGac(Double q95ObservedGac) {
		this.q95ObservedGac = q95ObservedGac;
	}
	//get方法
	public Double getQ95ObservedCaa() {
		return q95ObservedCaa;
	}

	//set方法
	public void setQ95ObservedCaa(Double q95ObservedCaa) {
		this.q95ObservedCaa = q95ObservedCaa;
	}
	//get方法
	public Double getQ95ObservedCag() {
		return q95ObservedCag;
	}

	//set方法
	public void setQ95ObservedCag(Double q95ObservedCag) {
		this.q95ObservedCag = q95ObservedCag;
	}
	//get方法
	public Double getQ95ObservedCat() {
		return q95ObservedCat;
	}

	//set方法
	public void setQ95ObservedCat(Double q95ObservedCat) {
		this.q95ObservedCat = q95ObservedCat;
	}
	//get方法
	public Double getQ95ObservedCac() {
		return q95ObservedCac;
	}

	//set方法
	public void setQ95ObservedCac(Double q95ObservedCac) {
		this.q95ObservedCac = q95ObservedCac;
	}
	//get方法
	public Double getQ95ObservedGta() {
		return q95ObservedGta;
	}

	//set方法
	public void setQ95ObservedGta(Double q95ObservedGta) {
		this.q95ObservedGta = q95ObservedGta;
	}
	//get方法
	public Double getQ95ObservedGtg() {
		return q95ObservedGtg;
	}

	//set方法
	public void setQ95ObservedGtg(Double q95ObservedGtg) {
		this.q95ObservedGtg = q95ObservedGtg;
	}
	//get方法
	public Double getQ95ObservedGtt() {
		return q95ObservedGtt;
	}

	//set方法
	public void setQ95ObservedGtt(Double q95ObservedGtt) {
		this.q95ObservedGtt = q95ObservedGtt;
	}
	//get方法
	public Double getQ95ObservedGtc() {
		return q95ObservedGtc;
	}

	//set方法
	public void setQ95ObservedGtc(Double q95ObservedGtc) {
		this.q95ObservedGtc = q95ObservedGtc;
	}
	//get方法
	public Double getQ95ObservedCta() {
		return q95ObservedCta;
	}

	//set方法
	public void setQ95ObservedCta(Double q95ObservedCta) {
		this.q95ObservedCta = q95ObservedCta;
	}
	//get方法
	public Double getQ95ObservedCtg() {
		return q95ObservedCtg;
	}

	//set方法
	public void setQ95ObservedCtg(Double q95ObservedCtg) {
		this.q95ObservedCtg = q95ObservedCtg;
	}
	//get方法
	public Double getQ95ObservedCtt() {
		return q95ObservedCtt;
	}

	//set方法
	public void setQ95ObservedCtt(Double q95ObservedCtt) {
		this.q95ObservedCtt = q95ObservedCtt;
	}
	//get方法
	public Double getQ95ObservedCtc() {
		return q95ObservedCtc;
	}

	//set方法
	public void setQ95ObservedCtc(Double q95ObservedCtc) {
		this.q95ObservedCtc = q95ObservedCtc;
	}
	//get方法
	public Double getQ95ObservedAga() {
		return q95ObservedAga;
	}

	//set方法
	public void setQ95ObservedAga(Double q95ObservedAga) {
		this.q95ObservedAga = q95ObservedAga;
	}
	//get方法
	public Double getQ95ObservedAgg() {
		return q95ObservedAgg;
	}

	//set方法
	public void setQ95ObservedAgg(Double q95ObservedAgg) {
		this.q95ObservedAgg = q95ObservedAgg;
	}
	//get方法
	public Double getQ95ObservedAgt() {
		return q95ObservedAgt;
	}

	//set方法
	public void setQ95ObservedAgt(Double q95ObservedAgt) {
		this.q95ObservedAgt = q95ObservedAgt;
	}
	//get方法
	public Double getQ95ObservedAgc() {
		return q95ObservedAgc;
	}

	//set方法
	public void setQ95ObservedAgc(Double q95ObservedAgc) {
		this.q95ObservedAgc = q95ObservedAgc;
	}
	//get方法
	public Double getQ95ObservedTga() {
		return q95ObservedTga;
	}

	//set方法
	public void setQ95ObservedTga(Double q95ObservedTga) {
		this.q95ObservedTga = q95ObservedTga;
	}
	//get方法
	public Double getQ95ObservedTgg() {
		return q95ObservedTgg;
	}

	//set方法
	public void setQ95ObservedTgg(Double q95ObservedTgg) {
		this.q95ObservedTgg = q95ObservedTgg;
	}
	//get方法
	public Double getQ95ObservedTgt() {
		return q95ObservedTgt;
	}

	//set方法
	public void setQ95ObservedTgt(Double q95ObservedTgt) {
		this.q95ObservedTgt = q95ObservedTgt;
	}
	//get方法
	public Double getQ95ObservedTgc() {
		return q95ObservedTgc;
	}

	//set方法
	public void setQ95ObservedTgc(Double q95ObservedTgc) {
		this.q95ObservedTgc = q95ObservedTgc;
	}
	//get方法
	public Double getQ95ObservedAca() {
		return q95ObservedAca;
	}

	//set方法
	public void setQ95ObservedAca(Double q95ObservedAca) {
		this.q95ObservedAca = q95ObservedAca;
	}
	//get方法
	public Double getQ95ObservedAcg() {
		return q95ObservedAcg;
	}

	//set方法
	public void setQ95ObservedAcg(Double q95ObservedAcg) {
		this.q95ObservedAcg = q95ObservedAcg;
	}
	//get方法
	public Double getQ95ObservedAct() {
		return q95ObservedAct;
	}

	//set方法
	public void setQ95ObservedAct(Double q95ObservedAct) {
		this.q95ObservedAct = q95ObservedAct;
	}
	//get方法
	public Double getQ95ObservedAcc() {
		return q95ObservedAcc;
	}

	//set方法
	public void setQ95ObservedAcc(Double q95ObservedAcc) {
		this.q95ObservedAcc = q95ObservedAcc;
	}
	//get方法
	public Double getQ95ObservedTca() {
		return q95ObservedTca;
	}

	//set方法
	public void setQ95ObservedTca(Double q95ObservedTca) {
		this.q95ObservedTca = q95ObservedTca;
	}
	//get方法
	public Double getQ95ObservedTcg() {
		return q95ObservedTcg;
	}

	//set方法
	public void setQ95ObservedTcg(Double q95ObservedTcg) {
		this.q95ObservedTcg = q95ObservedTcg;
	}
	//get方法
	public Double getQ95ObservedTct() {
		return q95ObservedTct;
	}

	//set方法
	public void setQ95ObservedTct(Double q95ObservedTct) {
		this.q95ObservedTct = q95ObservedTct;
	}
	//get方法
	public Double getQ95ObservedTcc() {
		return q95ObservedTcc;
	}

	//set方法
	public void setQ95ObservedTcc(Double q95ObservedTcc) {
		this.q95ObservedTcc = q95ObservedTcc;
	}
	//get方法
	public Double getQ95ObservedGga() {
		return q95ObservedGga;
	}

	//set方法
	public void setQ95ObservedGga(Double q95ObservedGga) {
		this.q95ObservedGga = q95ObservedGga;
	}
	//get方法
	public Double getQ95ObservedGgg() {
		return q95ObservedGgg;
	}

	//set方法
	public void setQ95ObservedGgg(Double q95ObservedGgg) {
		this.q95ObservedGgg = q95ObservedGgg;
	}
	//get方法
	public Double getQ95ObservedGgt() {
		return q95ObservedGgt;
	}

	//set方法
	public void setQ95ObservedGgt(Double q95ObservedGgt) {
		this.q95ObservedGgt = q95ObservedGgt;
	}
	//get方法
	public Double getQ95ObservedGgc() {
		return q95ObservedGgc;
	}

	//set方法
	public void setQ95ObservedGgc(Double q95ObservedGgc) {
		this.q95ObservedGgc = q95ObservedGgc;
	}
	//get方法
	public Double getQ95ObservedCga() {
		return q95ObservedCga;
	}

	//set方法
	public void setQ95ObservedCga(Double q95ObservedCga) {
		this.q95ObservedCga = q95ObservedCga;
	}
	//get方法
	public Double getQ95ObservedCgg() {
		return q95ObservedCgg;
	}

	//set方法
	public void setQ95ObservedCgg(Double q95ObservedCgg) {
		this.q95ObservedCgg = q95ObservedCgg;
	}
	//get方法
	public Double getQ95ObservedCgt() {
		return q95ObservedCgt;
	}

	//set方法
	public void setQ95ObservedCgt(Double q95ObservedCgt) {
		this.q95ObservedCgt = q95ObservedCgt;
	}
	//get方法
	public Double getQ95ObservedCgc() {
		return q95ObservedCgc;
	}

	//set方法
	public void setQ95ObservedCgc(Double q95ObservedCgc) {
		this.q95ObservedCgc = q95ObservedCgc;
	}
	//get方法
	public Double getQ95ObservedGca() {
		return q95ObservedGca;
	}

	//set方法
	public void setQ95ObservedGca(Double q95ObservedGca) {
		this.q95ObservedGca = q95ObservedGca;
	}
	//get方法
	public Double getQ95ObservedGcg() {
		return q95ObservedGcg;
	}

	//set方法
	public void setQ95ObservedGcg(Double q95ObservedGcg) {
		this.q95ObservedGcg = q95ObservedGcg;
	}
	//get方法
	public Double getQ95ObservedGct() {
		return q95ObservedGct;
	}

	//set方法
	public void setQ95ObservedGct(Double q95ObservedGct) {
		this.q95ObservedGct = q95ObservedGct;
	}
	//get方法
	public Double getQ95ObservedGcc() {
		return q95ObservedGcc;
	}

	//set方法
	public void setQ95ObservedGcc(Double q95ObservedGcc) {
		this.q95ObservedGcc = q95ObservedGcc;
	}
	//get方法
	public Double getQ95ObservedCca() {
		return q95ObservedCca;
	}

	//set方法
	public void setQ95ObservedCca(Double q95ObservedCca) {
		this.q95ObservedCca = q95ObservedCca;
	}
	//get方法
	public Double getQ95ObservedCcg() {
		return q95ObservedCcg;
	}

	//set方法
	public void setQ95ObservedCcg(Double q95ObservedCcg) {
		this.q95ObservedCcg = q95ObservedCcg;
	}
	//get方法
	public Double getQ95ObservedCct() {
		return q95ObservedCct;
	}

	//set方法
	public void setQ95ObservedCct(Double q95ObservedCct) {
		this.q95ObservedCct = q95ObservedCct;
	}
	//get方法
	public Double getQ95ObservedCcc() {
		return q95ObservedCcc;
	}

	//set方法
	public void setQ95ObservedCcc(Double q95ObservedCcc) {
		this.q95ObservedCcc = q95ObservedCcc;
	}
	//get方法
	public Double getTruemaxObservedAaa() {
		return truemaxObservedAaa;
	}

	//set方法
	public void setTruemaxObservedAaa(Double truemaxObservedAaa) {
		this.truemaxObservedAaa = truemaxObservedAaa;
	}
	//get方法
	public Double getTruemaxObservedAag() {
		return truemaxObservedAag;
	}

	//set方法
	public void setTruemaxObservedAag(Double truemaxObservedAag) {
		this.truemaxObservedAag = truemaxObservedAag;
	}
	//get方法
	public Double getTruemaxObservedAat() {
		return truemaxObservedAat;
	}

	//set方法
	public void setTruemaxObservedAat(Double truemaxObservedAat) {
		this.truemaxObservedAat = truemaxObservedAat;
	}
	//get方法
	public Double getTruemaxObservedAac() {
		return truemaxObservedAac;
	}

	//set方法
	public void setTruemaxObservedAac(Double truemaxObservedAac) {
		this.truemaxObservedAac = truemaxObservedAac;
	}
	//get方法
	public Double getTruemaxObservedTaa() {
		return truemaxObservedTaa;
	}

	//set方法
	public void setTruemaxObservedTaa(Double truemaxObservedTaa) {
		this.truemaxObservedTaa = truemaxObservedTaa;
	}
	//get方法
	public Double getTruemaxObservedTag() {
		return truemaxObservedTag;
	}

	//set方法
	public void setTruemaxObservedTag(Double truemaxObservedTag) {
		this.truemaxObservedTag = truemaxObservedTag;
	}
	//get方法
	public Double getTruemaxObservedTat() {
		return truemaxObservedTat;
	}

	//set方法
	public void setTruemaxObservedTat(Double truemaxObservedTat) {
		this.truemaxObservedTat = truemaxObservedTat;
	}
	//get方法
	public Double getTruemaxObservedTac() {
		return truemaxObservedTac;
	}

	//set方法
	public void setTruemaxObservedTac(Double truemaxObservedTac) {
		this.truemaxObservedTac = truemaxObservedTac;
	}
	//get方法
	public Double getTruemaxObservedAta() {
		return truemaxObservedAta;
	}

	//set方法
	public void setTruemaxObservedAta(Double truemaxObservedAta) {
		this.truemaxObservedAta = truemaxObservedAta;
	}
	//get方法
	public Double getTruemaxObservedAtg() {
		return truemaxObservedAtg;
	}

	//set方法
	public void setTruemaxObservedAtg(Double truemaxObservedAtg) {
		this.truemaxObservedAtg = truemaxObservedAtg;
	}
	//get方法
	public Double getTruemaxObservedAtt() {
		return truemaxObservedAtt;
	}

	//set方法
	public void setTruemaxObservedAtt(Double truemaxObservedAtt) {
		this.truemaxObservedAtt = truemaxObservedAtt;
	}
	//get方法
	public Double getTruemaxObservedAtc() {
		return truemaxObservedAtc;
	}

	//set方法
	public void setTruemaxObservedAtc(Double truemaxObservedAtc) {
		this.truemaxObservedAtc = truemaxObservedAtc;
	}
	//get方法
	public Double getTruemaxObservedTta() {
		return truemaxObservedTta;
	}

	//set方法
	public void setTruemaxObservedTta(Double truemaxObservedTta) {
		this.truemaxObservedTta = truemaxObservedTta;
	}
	//get方法
	public Double getTruemaxObservedTtg() {
		return truemaxObservedTtg;
	}

	//set方法
	public void setTruemaxObservedTtg(Double truemaxObservedTtg) {
		this.truemaxObservedTtg = truemaxObservedTtg;
	}
	//get方法
	public Double getTruemaxObservedTtt() {
		return truemaxObservedTtt;
	}

	//set方法
	public void setTruemaxObservedTtt(Double truemaxObservedTtt) {
		this.truemaxObservedTtt = truemaxObservedTtt;
	}
	//get方法
	public Double getTruemaxObservedTtc() {
		return truemaxObservedTtc;
	}

	//set方法
	public void setTruemaxObservedTtc(Double truemaxObservedTtc) {
		this.truemaxObservedTtc = truemaxObservedTtc;
	}
	//get方法
	public Double getTruemaxObservedGaa() {
		return truemaxObservedGaa;
	}

	//set方法
	public void setTruemaxObservedGaa(Double truemaxObservedGaa) {
		this.truemaxObservedGaa = truemaxObservedGaa;
	}
	//get方法
	public Double getTruemaxObservedGag() {
		return truemaxObservedGag;
	}

	//set方法
	public void setTruemaxObservedGag(Double truemaxObservedGag) {
		this.truemaxObservedGag = truemaxObservedGag;
	}
	//get方法
	public Double getTruemaxObservedGat() {
		return truemaxObservedGat;
	}

	//set方法
	public void setTruemaxObservedGat(Double truemaxObservedGat) {
		this.truemaxObservedGat = truemaxObservedGat;
	}
	//get方法
	public Double getTruemaxObservedGac() {
		return truemaxObservedGac;
	}

	//set方法
	public void setTruemaxObservedGac(Double truemaxObservedGac) {
		this.truemaxObservedGac = truemaxObservedGac;
	}
	//get方法
	public Double getTruemaxObservedCaa() {
		return truemaxObservedCaa;
	}

	//set方法
	public void setTruemaxObservedCaa(Double truemaxObservedCaa) {
		this.truemaxObservedCaa = truemaxObservedCaa;
	}
	//get方法
	public Double getTruemaxObservedCag() {
		return truemaxObservedCag;
	}

	//set方法
	public void setTruemaxObservedCag(Double truemaxObservedCag) {
		this.truemaxObservedCag = truemaxObservedCag;
	}
	//get方法
	public Double getTruemaxObservedCat() {
		return truemaxObservedCat;
	}

	//set方法
	public void setTruemaxObservedCat(Double truemaxObservedCat) {
		this.truemaxObservedCat = truemaxObservedCat;
	}
	//get方法
	public Double getTruemaxObservedCac() {
		return truemaxObservedCac;
	}

	//set方法
	public void setTruemaxObservedCac(Double truemaxObservedCac) {
		this.truemaxObservedCac = truemaxObservedCac;
	}
	//get方法
	public Double getTruemaxObservedGta() {
		return truemaxObservedGta;
	}

	//set方法
	public void setTruemaxObservedGta(Double truemaxObservedGta) {
		this.truemaxObservedGta = truemaxObservedGta;
	}
	//get方法
	public Double getTruemaxObservedGtg() {
		return truemaxObservedGtg;
	}

	//set方法
	public void setTruemaxObservedGtg(Double truemaxObservedGtg) {
		this.truemaxObservedGtg = truemaxObservedGtg;
	}
	//get方法
	public Double getTruemaxObservedGtt() {
		return truemaxObservedGtt;
	}

	//set方法
	public void setTruemaxObservedGtt(Double truemaxObservedGtt) {
		this.truemaxObservedGtt = truemaxObservedGtt;
	}
	//get方法
	public Double getTruemaxObservedGtc() {
		return truemaxObservedGtc;
	}

	//set方法
	public void setTruemaxObservedGtc(Double truemaxObservedGtc) {
		this.truemaxObservedGtc = truemaxObservedGtc;
	}
	//get方法
	public Double getTruemaxObservedCta() {
		return truemaxObservedCta;
	}

	//set方法
	public void setTruemaxObservedCta(Double truemaxObservedCta) {
		this.truemaxObservedCta = truemaxObservedCta;
	}
	//get方法
	public Double getTruemaxObservedCtg() {
		return truemaxObservedCtg;
	}

	//set方法
	public void setTruemaxObservedCtg(Double truemaxObservedCtg) {
		this.truemaxObservedCtg = truemaxObservedCtg;
	}
	//get方法
	public Double getTruemaxObservedCtt() {
		return truemaxObservedCtt;
	}

	//set方法
	public void setTruemaxObservedCtt(Double truemaxObservedCtt) {
		this.truemaxObservedCtt = truemaxObservedCtt;
	}
	//get方法
	public Double getTruemaxObservedCtc() {
		return truemaxObservedCtc;
	}

	//set方法
	public void setTruemaxObservedCtc(Double truemaxObservedCtc) {
		this.truemaxObservedCtc = truemaxObservedCtc;
	}
	//get方法
	public Double getTruemaxObservedAga() {
		return truemaxObservedAga;
	}

	//set方法
	public void setTruemaxObservedAga(Double truemaxObservedAga) {
		this.truemaxObservedAga = truemaxObservedAga;
	}
	//get方法
	public Double getTruemaxObservedAgg() {
		return truemaxObservedAgg;
	}

	//set方法
	public void setTruemaxObservedAgg(Double truemaxObservedAgg) {
		this.truemaxObservedAgg = truemaxObservedAgg;
	}
	//get方法
	public Double getTruemaxObservedAgt() {
		return truemaxObservedAgt;
	}

	//set方法
	public void setTruemaxObservedAgt(Double truemaxObservedAgt) {
		this.truemaxObservedAgt = truemaxObservedAgt;
	}
	//get方法
	public Double getTruemaxObservedAgc() {
		return truemaxObservedAgc;
	}

	//set方法
	public void setTruemaxObservedAgc(Double truemaxObservedAgc) {
		this.truemaxObservedAgc = truemaxObservedAgc;
	}
	//get方法
	public Double getTruemaxObservedTga() {
		return truemaxObservedTga;
	}

	//set方法
	public void setTruemaxObservedTga(Double truemaxObservedTga) {
		this.truemaxObservedTga = truemaxObservedTga;
	}
	//get方法
	public Double getTruemaxObservedTgg() {
		return truemaxObservedTgg;
	}

	//set方法
	public void setTruemaxObservedTgg(Double truemaxObservedTgg) {
		this.truemaxObservedTgg = truemaxObservedTgg;
	}
	//get方法
	public Double getTruemaxObservedTgt() {
		return truemaxObservedTgt;
	}

	//set方法
	public void setTruemaxObservedTgt(Double truemaxObservedTgt) {
		this.truemaxObservedTgt = truemaxObservedTgt;
	}
	//get方法
	public Double getTruemaxObservedTgc() {
		return truemaxObservedTgc;
	}

	//set方法
	public void setTruemaxObservedTgc(Double truemaxObservedTgc) {
		this.truemaxObservedTgc = truemaxObservedTgc;
	}
	//get方法
	public Double getTruemaxObservedAca() {
		return truemaxObservedAca;
	}

	//set方法
	public void setTruemaxObservedAca(Double truemaxObservedAca) {
		this.truemaxObservedAca = truemaxObservedAca;
	}
	//get方法
	public Double getTruemaxObservedAcg() {
		return truemaxObservedAcg;
	}

	//set方法
	public void setTruemaxObservedAcg(Double truemaxObservedAcg) {
		this.truemaxObservedAcg = truemaxObservedAcg;
	}
	//get方法
	public Double getTruemaxObservedAct() {
		return truemaxObservedAct;
	}

	//set方法
	public void setTruemaxObservedAct(Double truemaxObservedAct) {
		this.truemaxObservedAct = truemaxObservedAct;
	}
	//get方法
	public Double getTruemaxObservedAcc() {
		return truemaxObservedAcc;
	}

	//set方法
	public void setTruemaxObservedAcc(Double truemaxObservedAcc) {
		this.truemaxObservedAcc = truemaxObservedAcc;
	}
	//get方法
	public Double getTruemaxObservedTca() {
		return truemaxObservedTca;
	}

	//set方法
	public void setTruemaxObservedTca(Double truemaxObservedTca) {
		this.truemaxObservedTca = truemaxObservedTca;
	}
	//get方法
	public Double getTruemaxObservedTcg() {
		return truemaxObservedTcg;
	}

	//set方法
	public void setTruemaxObservedTcg(Double truemaxObservedTcg) {
		this.truemaxObservedTcg = truemaxObservedTcg;
	}
	//get方法
	public Double getTruemaxObservedTct() {
		return truemaxObservedTct;
	}

	//set方法
	public void setTruemaxObservedTct(Double truemaxObservedTct) {
		this.truemaxObservedTct = truemaxObservedTct;
	}
	//get方法
	public Double getTruemaxObservedTcc() {
		return truemaxObservedTcc;
	}

	//set方法
	public void setTruemaxObservedTcc(Double truemaxObservedTcc) {
		this.truemaxObservedTcc = truemaxObservedTcc;
	}
	//get方法
	public Double getTruemaxObservedGga() {
		return truemaxObservedGga;
	}

	//set方法
	public void setTruemaxObservedGga(Double truemaxObservedGga) {
		this.truemaxObservedGga = truemaxObservedGga;
	}
	//get方法
	public Double getTruemaxObservedGgg() {
		return truemaxObservedGgg;
	}

	//set方法
	public void setTruemaxObservedGgg(Double truemaxObservedGgg) {
		this.truemaxObservedGgg = truemaxObservedGgg;
	}
	//get方法
	public Double getTruemaxObservedGgt() {
		return truemaxObservedGgt;
	}

	//set方法
	public void setTruemaxObservedGgt(Double truemaxObservedGgt) {
		this.truemaxObservedGgt = truemaxObservedGgt;
	}
	//get方法
	public Double getTruemaxObservedGgc() {
		return truemaxObservedGgc;
	}

	//set方法
	public void setTruemaxObservedGgc(Double truemaxObservedGgc) {
		this.truemaxObservedGgc = truemaxObservedGgc;
	}
	//get方法
	public Double getTruemaxObservedCga() {
		return truemaxObservedCga;
	}

	//set方法
	public void setTruemaxObservedCga(Double truemaxObservedCga) {
		this.truemaxObservedCga = truemaxObservedCga;
	}
	//get方法
	public Double getTruemaxObservedCgg() {
		return truemaxObservedCgg;
	}

	//set方法
	public void setTruemaxObservedCgg(Double truemaxObservedCgg) {
		this.truemaxObservedCgg = truemaxObservedCgg;
	}
	//get方法
	public Double getTruemaxObservedCgt() {
		return truemaxObservedCgt;
	}

	//set方法
	public void setTruemaxObservedCgt(Double truemaxObservedCgt) {
		this.truemaxObservedCgt = truemaxObservedCgt;
	}
	//get方法
	public Double getTruemaxObservedCgc() {
		return truemaxObservedCgc;
	}

	//set方法
	public void setTruemaxObservedCgc(Double truemaxObservedCgc) {
		this.truemaxObservedCgc = truemaxObservedCgc;
	}
	//get方法
	public Double getTruemaxObservedGca() {
		return truemaxObservedGca;
	}

	//set方法
	public void setTruemaxObservedGca(Double truemaxObservedGca) {
		this.truemaxObservedGca = truemaxObservedGca;
	}
	//get方法
	public Double getTruemaxObservedGcg() {
		return truemaxObservedGcg;
	}

	//set方法
	public void setTruemaxObservedGcg(Double truemaxObservedGcg) {
		this.truemaxObservedGcg = truemaxObservedGcg;
	}
	//get方法
	public Double getTruemaxObservedGct() {
		return truemaxObservedGct;
	}

	//set方法
	public void setTruemaxObservedGct(Double truemaxObservedGct) {
		this.truemaxObservedGct = truemaxObservedGct;
	}
	//get方法
	public Double getTruemaxObservedGcc() {
		return truemaxObservedGcc;
	}

	//set方法
	public void setTruemaxObservedGcc(Double truemaxObservedGcc) {
		this.truemaxObservedGcc = truemaxObservedGcc;
	}
	//get方法
	public Double getTruemaxObservedCca() {
		return truemaxObservedCca;
	}

	//set方法
	public void setTruemaxObservedCca(Double truemaxObservedCca) {
		this.truemaxObservedCca = truemaxObservedCca;
	}
	//get方法
	public Double getTruemaxObservedCcg() {
		return truemaxObservedCcg;
	}

	//set方法
	public void setTruemaxObservedCcg(Double truemaxObservedCcg) {
		this.truemaxObservedCcg = truemaxObservedCcg;
	}
	//get方法
	public Double getTruemaxObservedCct() {
		return truemaxObservedCct;
	}

	//set方法
	public void setTruemaxObservedCct(Double truemaxObservedCct) {
		this.truemaxObservedCct = truemaxObservedCct;
	}
	//get方法
	public Double getTruemaxObservedCcc() {
		return truemaxObservedCcc;
	}

	//set方法
	public void setTruemaxObservedCcc(Double truemaxObservedCcc) {
		this.truemaxObservedCcc = truemaxObservedCcc;
	}
	//get方法
	public Double getMaxObservedAaa() {
		return maxObservedAaa;
	}

	//set方法
	public void setMaxObservedAaa(Double maxObservedAaa) {
		this.maxObservedAaa = maxObservedAaa;
	}
	//get方法
	public Double getMaxObservedAag() {
		return maxObservedAag;
	}

	//set方法
	public void setMaxObservedAag(Double maxObservedAag) {
		this.maxObservedAag = maxObservedAag;
	}
	//get方法
	public Double getMaxObservedAat() {
		return maxObservedAat;
	}

	//set方法
	public void setMaxObservedAat(Double maxObservedAat) {
		this.maxObservedAat = maxObservedAat;
	}
	//get方法
	public Double getMaxObservedAac() {
		return maxObservedAac;
	}

	//set方法
	public void setMaxObservedAac(Double maxObservedAac) {
		this.maxObservedAac = maxObservedAac;
	}
	//get方法
	public Double getMaxObservedTaa() {
		return maxObservedTaa;
	}

	//set方法
	public void setMaxObservedTaa(Double maxObservedTaa) {
		this.maxObservedTaa = maxObservedTaa;
	}
	//get方法
	public Double getMaxObservedTag() {
		return maxObservedTag;
	}

	//set方法
	public void setMaxObservedTag(Double maxObservedTag) {
		this.maxObservedTag = maxObservedTag;
	}
	//get方法
	public Double getMaxObservedTat() {
		return maxObservedTat;
	}

	//set方法
	public void setMaxObservedTat(Double maxObservedTat) {
		this.maxObservedTat = maxObservedTat;
	}
	//get方法
	public Double getMaxObservedTac() {
		return maxObservedTac;
	}

	//set方法
	public void setMaxObservedTac(Double maxObservedTac) {
		this.maxObservedTac = maxObservedTac;
	}
	//get方法
	public Double getMaxObservedAta() {
		return maxObservedAta;
	}

	//set方法
	public void setMaxObservedAta(Double maxObservedAta) {
		this.maxObservedAta = maxObservedAta;
	}
	//get方法
	public Double getMaxObservedAtg() {
		return maxObservedAtg;
	}

	//set方法
	public void setMaxObservedAtg(Double maxObservedAtg) {
		this.maxObservedAtg = maxObservedAtg;
	}
	//get方法
	public Double getMaxObservedAtt() {
		return maxObservedAtt;
	}

	//set方法
	public void setMaxObservedAtt(Double maxObservedAtt) {
		this.maxObservedAtt = maxObservedAtt;
	}
	//get方法
	public Double getMaxObservedAtc() {
		return maxObservedAtc;
	}

	//set方法
	public void setMaxObservedAtc(Double maxObservedAtc) {
		this.maxObservedAtc = maxObservedAtc;
	}
	//get方法
	public Double getMaxObservedTta() {
		return maxObservedTta;
	}

	//set方法
	public void setMaxObservedTta(Double maxObservedTta) {
		this.maxObservedTta = maxObservedTta;
	}
	//get方法
	public Double getMaxObservedTtg() {
		return maxObservedTtg;
	}

	//set方法
	public void setMaxObservedTtg(Double maxObservedTtg) {
		this.maxObservedTtg = maxObservedTtg;
	}
	//get方法
	public Double getMaxObservedTtt() {
		return maxObservedTtt;
	}

	//set方法
	public void setMaxObservedTtt(Double maxObservedTtt) {
		this.maxObservedTtt = maxObservedTtt;
	}
	//get方法
	public Double getMaxObservedTtc() {
		return maxObservedTtc;
	}

	//set方法
	public void setMaxObservedTtc(Double maxObservedTtc) {
		this.maxObservedTtc = maxObservedTtc;
	}
	//get方法
	public Double getMaxObservedGaa() {
		return maxObservedGaa;
	}

	//set方法
	public void setMaxObservedGaa(Double maxObservedGaa) {
		this.maxObservedGaa = maxObservedGaa;
	}
	//get方法
	public Double getMaxObservedGag() {
		return maxObservedGag;
	}

	//set方法
	public void setMaxObservedGag(Double maxObservedGag) {
		this.maxObservedGag = maxObservedGag;
	}
	//get方法
	public Double getMaxObservedGat() {
		return maxObservedGat;
	}

	//set方法
	public void setMaxObservedGat(Double maxObservedGat) {
		this.maxObservedGat = maxObservedGat;
	}
	//get方法
	public Double getMaxObservedGac() {
		return maxObservedGac;
	}

	//set方法
	public void setMaxObservedGac(Double maxObservedGac) {
		this.maxObservedGac = maxObservedGac;
	}
	//get方法
	public Double getMaxObservedCaa() {
		return maxObservedCaa;
	}

	//set方法
	public void setMaxObservedCaa(Double maxObservedCaa) {
		this.maxObservedCaa = maxObservedCaa;
	}
	//get方法
	public Double getMaxObservedCag() {
		return maxObservedCag;
	}

	//set方法
	public void setMaxObservedCag(Double maxObservedCag) {
		this.maxObservedCag = maxObservedCag;
	}
	//get方法
	public Double getMaxObservedCat() {
		return maxObservedCat;
	}

	//set方法
	public void setMaxObservedCat(Double maxObservedCat) {
		this.maxObservedCat = maxObservedCat;
	}
	//get方法
	public Double getMaxObservedCac() {
		return maxObservedCac;
	}

	//set方法
	public void setMaxObservedCac(Double maxObservedCac) {
		this.maxObservedCac = maxObservedCac;
	}
	//get方法
	public Double getMaxObservedGta() {
		return maxObservedGta;
	}

	//set方法
	public void setMaxObservedGta(Double maxObservedGta) {
		this.maxObservedGta = maxObservedGta;
	}
	//get方法
	public Double getMaxObservedGtg() {
		return maxObservedGtg;
	}

	//set方法
	public void setMaxObservedGtg(Double maxObservedGtg) {
		this.maxObservedGtg = maxObservedGtg;
	}
	//get方法
	public Double getMaxObservedGtt() {
		return maxObservedGtt;
	}

	//set方法
	public void setMaxObservedGtt(Double maxObservedGtt) {
		this.maxObservedGtt = maxObservedGtt;
	}
	//get方法
	public Double getMaxObservedGtc() {
		return maxObservedGtc;
	}

	//set方法
	public void setMaxObservedGtc(Double maxObservedGtc) {
		this.maxObservedGtc = maxObservedGtc;
	}
	//get方法
	public Double getMaxObservedCta() {
		return maxObservedCta;
	}

	//set方法
	public void setMaxObservedCta(Double maxObservedCta) {
		this.maxObservedCta = maxObservedCta;
	}
	//get方法
	public Double getMaxObservedCtg() {
		return maxObservedCtg;
	}

	//set方法
	public void setMaxObservedCtg(Double maxObservedCtg) {
		this.maxObservedCtg = maxObservedCtg;
	}
	//get方法
	public Double getMaxObservedCtt() {
		return maxObservedCtt;
	}

	//set方法
	public void setMaxObservedCtt(Double maxObservedCtt) {
		this.maxObservedCtt = maxObservedCtt;
	}
	//get方法
	public Double getMaxObservedCtc() {
		return maxObservedCtc;
	}

	//set方法
	public void setMaxObservedCtc(Double maxObservedCtc) {
		this.maxObservedCtc = maxObservedCtc;
	}
	//get方法
	public Double getMaxObservedAga() {
		return maxObservedAga;
	}

	//set方法
	public void setMaxObservedAga(Double maxObservedAga) {
		this.maxObservedAga = maxObservedAga;
	}
	//get方法
	public Double getMaxObservedAgg() {
		return maxObservedAgg;
	}

	//set方法
	public void setMaxObservedAgg(Double maxObservedAgg) {
		this.maxObservedAgg = maxObservedAgg;
	}
	//get方法
	public Double getMaxObservedAgt() {
		return maxObservedAgt;
	}

	//set方法
	public void setMaxObservedAgt(Double maxObservedAgt) {
		this.maxObservedAgt = maxObservedAgt;
	}
	//get方法
	public Double getMaxObservedAgc() {
		return maxObservedAgc;
	}

	//set方法
	public void setMaxObservedAgc(Double maxObservedAgc) {
		this.maxObservedAgc = maxObservedAgc;
	}
	//get方法
	public Double getMaxObservedTga() {
		return maxObservedTga;
	}

	//set方法
	public void setMaxObservedTga(Double maxObservedTga) {
		this.maxObservedTga = maxObservedTga;
	}
	//get方法
	public Double getMaxObservedTgg() {
		return maxObservedTgg;
	}

	//set方法
	public void setMaxObservedTgg(Double maxObservedTgg) {
		this.maxObservedTgg = maxObservedTgg;
	}
	//get方法
	public Double getMaxObservedTgt() {
		return maxObservedTgt;
	}

	//set方法
	public void setMaxObservedTgt(Double maxObservedTgt) {
		this.maxObservedTgt = maxObservedTgt;
	}
	//get方法
	public Double getMaxObservedTgc() {
		return maxObservedTgc;
	}

	//set方法
	public void setMaxObservedTgc(Double maxObservedTgc) {
		this.maxObservedTgc = maxObservedTgc;
	}
	//get方法
	public Double getMaxObservedAca() {
		return maxObservedAca;
	}

	//set方法
	public void setMaxObservedAca(Double maxObservedAca) {
		this.maxObservedAca = maxObservedAca;
	}
	//get方法
	public Double getMaxObservedAcg() {
		return maxObservedAcg;
	}

	//set方法
	public void setMaxObservedAcg(Double maxObservedAcg) {
		this.maxObservedAcg = maxObservedAcg;
	}
	//get方法
	public Double getMaxObservedAct() {
		return maxObservedAct;
	}

	//set方法
	public void setMaxObservedAct(Double maxObservedAct) {
		this.maxObservedAct = maxObservedAct;
	}
	//get方法
	public Double getMaxObservedAcc() {
		return maxObservedAcc;
	}

	//set方法
	public void setMaxObservedAcc(Double maxObservedAcc) {
		this.maxObservedAcc = maxObservedAcc;
	}
	//get方法
	public Double getMaxObservedTca() {
		return maxObservedTca;
	}

	//set方法
	public void setMaxObservedTca(Double maxObservedTca) {
		this.maxObservedTca = maxObservedTca;
	}
	//get方法
	public Double getMaxObservedTcg() {
		return maxObservedTcg;
	}

	//set方法
	public void setMaxObservedTcg(Double maxObservedTcg) {
		this.maxObservedTcg = maxObservedTcg;
	}
	//get方法
	public Double getMaxObservedTct() {
		return maxObservedTct;
	}

	//set方法
	public void setMaxObservedTct(Double maxObservedTct) {
		this.maxObservedTct = maxObservedTct;
	}
	//get方法
	public Double getMaxObservedTcc() {
		return maxObservedTcc;
	}

	//set方法
	public void setMaxObservedTcc(Double maxObservedTcc) {
		this.maxObservedTcc = maxObservedTcc;
	}
	//get方法
	public Double getMaxObservedGga() {
		return maxObservedGga;
	}

	//set方法
	public void setMaxObservedGga(Double maxObservedGga) {
		this.maxObservedGga = maxObservedGga;
	}
	//get方法
	public Double getMaxObservedGgg() {
		return maxObservedGgg;
	}

	//set方法
	public void setMaxObservedGgg(Double maxObservedGgg) {
		this.maxObservedGgg = maxObservedGgg;
	}
	//get方法
	public Double getMaxObservedGgt() {
		return maxObservedGgt;
	}

	//set方法
	public void setMaxObservedGgt(Double maxObservedGgt) {
		this.maxObservedGgt = maxObservedGgt;
	}
	//get方法
	public Double getMaxObservedGgc() {
		return maxObservedGgc;
	}

	//set方法
	public void setMaxObservedGgc(Double maxObservedGgc) {
		this.maxObservedGgc = maxObservedGgc;
	}
	//get方法
	public Double getMaxObservedCga() {
		return maxObservedCga;
	}

	//set方法
	public void setMaxObservedCga(Double maxObservedCga) {
		this.maxObservedCga = maxObservedCga;
	}
	//get方法
	public Double getMaxObservedCgg() {
		return maxObservedCgg;
	}

	//set方法
	public void setMaxObservedCgg(Double maxObservedCgg) {
		this.maxObservedCgg = maxObservedCgg;
	}
	//get方法
	public Double getMaxObservedCgt() {
		return maxObservedCgt;
	}

	//set方法
	public void setMaxObservedCgt(Double maxObservedCgt) {
		this.maxObservedCgt = maxObservedCgt;
	}
	//get方法
	public Double getMaxObservedCgc() {
		return maxObservedCgc;
	}

	//set方法
	public void setMaxObservedCgc(Double maxObservedCgc) {
		this.maxObservedCgc = maxObservedCgc;
	}
	//get方法
	public Double getMaxObservedGca() {
		return maxObservedGca;
	}

	//set方法
	public void setMaxObservedGca(Double maxObservedGca) {
		this.maxObservedGca = maxObservedGca;
	}
	//get方法
	public Double getMaxObservedGcg() {
		return maxObservedGcg;
	}

	//set方法
	public void setMaxObservedGcg(Double maxObservedGcg) {
		this.maxObservedGcg = maxObservedGcg;
	}
	//get方法
	public Double getMaxObservedGct() {
		return maxObservedGct;
	}

	//set方法
	public void setMaxObservedGct(Double maxObservedGct) {
		this.maxObservedGct = maxObservedGct;
	}
	//get方法
	public Double getMaxObservedGcc() {
		return maxObservedGcc;
	}

	//set方法
	public void setMaxObservedGcc(Double maxObservedGcc) {
		this.maxObservedGcc = maxObservedGcc;
	}
	//get方法
	public Double getMaxObservedCca() {
		return maxObservedCca;
	}

	//set方法
	public void setMaxObservedCca(Double maxObservedCca) {
		this.maxObservedCca = maxObservedCca;
	}
	//get方法
	public Double getMaxObservedCcg() {
		return maxObservedCcg;
	}

	//set方法
	public void setMaxObservedCcg(Double maxObservedCcg) {
		this.maxObservedCcg = maxObservedCcg;
	}
	//get方法
	public Double getMaxObservedCct() {
		return maxObservedCct;
	}

	//set方法
	public void setMaxObservedCct(Double maxObservedCct) {
		this.maxObservedCct = maxObservedCct;
	}
	//get方法
	public Double getMaxObservedCcc() {
		return maxObservedCcc;
	}

	//set方法
	public void setMaxObservedCcc(Double maxObservedCcc) {
		this.maxObservedCcc = maxObservedCcc;
	}
	//get方法
	public Double getMeanObservedAaa() {
		return meanObservedAaa;
	}

	//set方法
	public void setMeanObservedAaa(Double meanObservedAaa) {
		this.meanObservedAaa = meanObservedAaa;
	}
	//get方法
	public Double getMeanObservedAag() {
		return meanObservedAag;
	}

	//set方法
	public void setMeanObservedAag(Double meanObservedAag) {
		this.meanObservedAag = meanObservedAag;
	}
	//get方法
	public Double getMeanObservedAat() {
		return meanObservedAat;
	}

	//set方法
	public void setMeanObservedAat(Double meanObservedAat) {
		this.meanObservedAat = meanObservedAat;
	}
	//get方法
	public Double getMeanObservedAac() {
		return meanObservedAac;
	}

	//set方法
	public void setMeanObservedAac(Double meanObservedAac) {
		this.meanObservedAac = meanObservedAac;
	}
	//get方法
	public Double getMeanObservedTaa() {
		return meanObservedTaa;
	}

	//set方法
	public void setMeanObservedTaa(Double meanObservedTaa) {
		this.meanObservedTaa = meanObservedTaa;
	}
	//get方法
	public Double getMeanObservedTag() {
		return meanObservedTag;
	}

	//set方法
	public void setMeanObservedTag(Double meanObservedTag) {
		this.meanObservedTag = meanObservedTag;
	}
	//get方法
	public Double getMeanObservedTat() {
		return meanObservedTat;
	}

	//set方法
	public void setMeanObservedTat(Double meanObservedTat) {
		this.meanObservedTat = meanObservedTat;
	}
	//get方法
	public Double getMeanObservedTac() {
		return meanObservedTac;
	}

	//set方法
	public void setMeanObservedTac(Double meanObservedTac) {
		this.meanObservedTac = meanObservedTac;
	}
	//get方法
	public Double getMeanObservedAta() {
		return meanObservedAta;
	}

	//set方法
	public void setMeanObservedAta(Double meanObservedAta) {
		this.meanObservedAta = meanObservedAta;
	}
	//get方法
	public Double getMeanObservedAtg() {
		return meanObservedAtg;
	}

	//set方法
	public void setMeanObservedAtg(Double meanObservedAtg) {
		this.meanObservedAtg = meanObservedAtg;
	}
	//get方法
	public Double getMeanObservedAtt() {
		return meanObservedAtt;
	}

	//set方法
	public void setMeanObservedAtt(Double meanObservedAtt) {
		this.meanObservedAtt = meanObservedAtt;
	}
	//get方法
	public Double getMeanObservedAtc() {
		return meanObservedAtc;
	}

	//set方法
	public void setMeanObservedAtc(Double meanObservedAtc) {
		this.meanObservedAtc = meanObservedAtc;
	}
	//get方法
	public Double getMeanObservedTta() {
		return meanObservedTta;
	}

	//set方法
	public void setMeanObservedTta(Double meanObservedTta) {
		this.meanObservedTta = meanObservedTta;
	}
	//get方法
	public Double getMeanObservedTtg() {
		return meanObservedTtg;
	}

	//set方法
	public void setMeanObservedTtg(Double meanObservedTtg) {
		this.meanObservedTtg = meanObservedTtg;
	}
	//get方法
	public Double getMeanObservedTtt() {
		return meanObservedTtt;
	}

	//set方法
	public void setMeanObservedTtt(Double meanObservedTtt) {
		this.meanObservedTtt = meanObservedTtt;
	}
	//get方法
	public Double getMeanObservedTtc() {
		return meanObservedTtc;
	}

	//set方法
	public void setMeanObservedTtc(Double meanObservedTtc) {
		this.meanObservedTtc = meanObservedTtc;
	}
	//get方法
	public Double getMeanObservedGaa() {
		return meanObservedGaa;
	}

	//set方法
	public void setMeanObservedGaa(Double meanObservedGaa) {
		this.meanObservedGaa = meanObservedGaa;
	}
	//get方法
	public Double getMeanObservedGag() {
		return meanObservedGag;
	}

	//set方法
	public void setMeanObservedGag(Double meanObservedGag) {
		this.meanObservedGag = meanObservedGag;
	}
	//get方法
	public Double getMeanObservedGat() {
		return meanObservedGat;
	}

	//set方法
	public void setMeanObservedGat(Double meanObservedGat) {
		this.meanObservedGat = meanObservedGat;
	}
	//get方法
	public Double getMeanObservedGac() {
		return meanObservedGac;
	}

	//set方法
	public void setMeanObservedGac(Double meanObservedGac) {
		this.meanObservedGac = meanObservedGac;
	}
	//get方法
	public Double getMeanObservedCaa() {
		return meanObservedCaa;
	}

	//set方法
	public void setMeanObservedCaa(Double meanObservedCaa) {
		this.meanObservedCaa = meanObservedCaa;
	}
	//get方法
	public Double getMeanObservedCag() {
		return meanObservedCag;
	}

	//set方法
	public void setMeanObservedCag(Double meanObservedCag) {
		this.meanObservedCag = meanObservedCag;
	}
	//get方法
	public Double getMeanObservedCat() {
		return meanObservedCat;
	}

	//set方法
	public void setMeanObservedCat(Double meanObservedCat) {
		this.meanObservedCat = meanObservedCat;
	}
	//get方法
	public Double getMeanObservedCac() {
		return meanObservedCac;
	}

	//set方法
	public void setMeanObservedCac(Double meanObservedCac) {
		this.meanObservedCac = meanObservedCac;
	}
	//get方法
	public Double getMeanObservedGta() {
		return meanObservedGta;
	}

	//set方法
	public void setMeanObservedGta(Double meanObservedGta) {
		this.meanObservedGta = meanObservedGta;
	}
	//get方法
	public Double getMeanObservedGtg() {
		return meanObservedGtg;
	}

	//set方法
	public void setMeanObservedGtg(Double meanObservedGtg) {
		this.meanObservedGtg = meanObservedGtg;
	}
	//get方法
	public Double getMeanObservedGtt() {
		return meanObservedGtt;
	}

	//set方法
	public void setMeanObservedGtt(Double meanObservedGtt) {
		this.meanObservedGtt = meanObservedGtt;
	}
	//get方法
	public Double getMeanObservedGtc() {
		return meanObservedGtc;
	}

	//set方法
	public void setMeanObservedGtc(Double meanObservedGtc) {
		this.meanObservedGtc = meanObservedGtc;
	}
	//get方法
	public Double getMeanObservedCta() {
		return meanObservedCta;
	}

	//set方法
	public void setMeanObservedCta(Double meanObservedCta) {
		this.meanObservedCta = meanObservedCta;
	}
	//get方法
	public Double getMeanObservedCtg() {
		return meanObservedCtg;
	}

	//set方法
	public void setMeanObservedCtg(Double meanObservedCtg) {
		this.meanObservedCtg = meanObservedCtg;
	}
	//get方法
	public Double getMeanObservedCtt() {
		return meanObservedCtt;
	}

	//set方法
	public void setMeanObservedCtt(Double meanObservedCtt) {
		this.meanObservedCtt = meanObservedCtt;
	}
	//get方法
	public Double getMeanObservedCtc() {
		return meanObservedCtc;
	}

	//set方法
	public void setMeanObservedCtc(Double meanObservedCtc) {
		this.meanObservedCtc = meanObservedCtc;
	}
	//get方法
	public Double getMeanObservedAga() {
		return meanObservedAga;
	}

	//set方法
	public void setMeanObservedAga(Double meanObservedAga) {
		this.meanObservedAga = meanObservedAga;
	}
	//get方法
	public Double getMeanObservedAgg() {
		return meanObservedAgg;
	}

	//set方法
	public void setMeanObservedAgg(Double meanObservedAgg) {
		this.meanObservedAgg = meanObservedAgg;
	}
	//get方法
	public Double getMeanObservedAgt() {
		return meanObservedAgt;
	}

	//set方法
	public void setMeanObservedAgt(Double meanObservedAgt) {
		this.meanObservedAgt = meanObservedAgt;
	}
	//get方法
	public Double getMeanObservedAgc() {
		return meanObservedAgc;
	}

	//set方法
	public void setMeanObservedAgc(Double meanObservedAgc) {
		this.meanObservedAgc = meanObservedAgc;
	}
	//get方法
	public Double getMeanObservedTga() {
		return meanObservedTga;
	}

	//set方法
	public void setMeanObservedTga(Double meanObservedTga) {
		this.meanObservedTga = meanObservedTga;
	}
	//get方法
	public Double getMeanObservedTgg() {
		return meanObservedTgg;
	}

	//set方法
	public void setMeanObservedTgg(Double meanObservedTgg) {
		this.meanObservedTgg = meanObservedTgg;
	}
	//get方法
	public Double getMeanObservedTgt() {
		return meanObservedTgt;
	}

	//set方法
	public void setMeanObservedTgt(Double meanObservedTgt) {
		this.meanObservedTgt = meanObservedTgt;
	}
	//get方法
	public Double getMeanObservedTgc() {
		return meanObservedTgc;
	}

	//set方法
	public void setMeanObservedTgc(Double meanObservedTgc) {
		this.meanObservedTgc = meanObservedTgc;
	}
	//get方法
	public Double getMeanObservedAca() {
		return meanObservedAca;
	}

	//set方法
	public void setMeanObservedAca(Double meanObservedAca) {
		this.meanObservedAca = meanObservedAca;
	}
	//get方法
	public Double getMeanObservedAcg() {
		return meanObservedAcg;
	}

	//set方法
	public void setMeanObservedAcg(Double meanObservedAcg) {
		this.meanObservedAcg = meanObservedAcg;
	}
	//get方法
	public Double getMeanObservedAct() {
		return meanObservedAct;
	}

	//set方法
	public void setMeanObservedAct(Double meanObservedAct) {
		this.meanObservedAct = meanObservedAct;
	}
	//get方法
	public Double getMeanObservedAcc() {
		return meanObservedAcc;
	}

	//set方法
	public void setMeanObservedAcc(Double meanObservedAcc) {
		this.meanObservedAcc = meanObservedAcc;
	}
	//get方法
	public Double getMeanObservedTca() {
		return meanObservedTca;
	}

	//set方法
	public void setMeanObservedTca(Double meanObservedTca) {
		this.meanObservedTca = meanObservedTca;
	}
	//get方法
	public Double getMeanObservedTcg() {
		return meanObservedTcg;
	}

	//set方法
	public void setMeanObservedTcg(Double meanObservedTcg) {
		this.meanObservedTcg = meanObservedTcg;
	}
	//get方法
	public Double getMeanObservedTct() {
		return meanObservedTct;
	}

	//set方法
	public void setMeanObservedTct(Double meanObservedTct) {
		this.meanObservedTct = meanObservedTct;
	}
	//get方法
	public Double getMeanObservedTcc() {
		return meanObservedTcc;
	}

	//set方法
	public void setMeanObservedTcc(Double meanObservedTcc) {
		this.meanObservedTcc = meanObservedTcc;
	}
	//get方法
	public Double getMeanObservedGga() {
		return meanObservedGga;
	}

	//set方法
	public void setMeanObservedGga(Double meanObservedGga) {
		this.meanObservedGga = meanObservedGga;
	}
	//get方法
	public Double getMeanObservedGgg() {
		return meanObservedGgg;
	}

	//set方法
	public void setMeanObservedGgg(Double meanObservedGgg) {
		this.meanObservedGgg = meanObservedGgg;
	}
	//get方法
	public Double getMeanObservedGgt() {
		return meanObservedGgt;
	}

	//set方法
	public void setMeanObservedGgt(Double meanObservedGgt) {
		this.meanObservedGgt = meanObservedGgt;
	}
	//get方法
	public Double getMeanObservedGgc() {
		return meanObservedGgc;
	}

	//set方法
	public void setMeanObservedGgc(Double meanObservedGgc) {
		this.meanObservedGgc = meanObservedGgc;
	}
	//get方法
	public Double getMeanObservedCga() {
		return meanObservedCga;
	}

	//set方法
	public void setMeanObservedCga(Double meanObservedCga) {
		this.meanObservedCga = meanObservedCga;
	}
	//get方法
	public Double getMeanObservedCgg() {
		return meanObservedCgg;
	}

	//set方法
	public void setMeanObservedCgg(Double meanObservedCgg) {
		this.meanObservedCgg = meanObservedCgg;
	}
	//get方法
	public Double getMeanObservedCgt() {
		return meanObservedCgt;
	}

	//set方法
	public void setMeanObservedCgt(Double meanObservedCgt) {
		this.meanObservedCgt = meanObservedCgt;
	}
	//get方法
	public Double getMeanObservedCgc() {
		return meanObservedCgc;
	}

	//set方法
	public void setMeanObservedCgc(Double meanObservedCgc) {
		this.meanObservedCgc = meanObservedCgc;
	}
	//get方法
	public Double getMeanObservedGca() {
		return meanObservedGca;
	}

	//set方法
	public void setMeanObservedGca(Double meanObservedGca) {
		this.meanObservedGca = meanObservedGca;
	}
	//get方法
	public Double getMeanObservedGcg() {
		return meanObservedGcg;
	}

	//set方法
	public void setMeanObservedGcg(Double meanObservedGcg) {
		this.meanObservedGcg = meanObservedGcg;
	}
	//get方法
	public Double getMeanObservedGct() {
		return meanObservedGct;
	}

	//set方法
	public void setMeanObservedGct(Double meanObservedGct) {
		this.meanObservedGct = meanObservedGct;
	}
	//get方法
	public Double getMeanObservedGcc() {
		return meanObservedGcc;
	}

	//set方法
	public void setMeanObservedGcc(Double meanObservedGcc) {
		this.meanObservedGcc = meanObservedGcc;
	}
	//get方法
	public Double getMeanObservedCca() {
		return meanObservedCca;
	}

	//set方法
	public void setMeanObservedCca(Double meanObservedCca) {
		this.meanObservedCca = meanObservedCca;
	}
	//get方法
	public Double getMeanObservedCcg() {
		return meanObservedCcg;
	}

	//set方法
	public void setMeanObservedCcg(Double meanObservedCcg) {
		this.meanObservedCcg = meanObservedCcg;
	}
	//get方法
	public Double getMeanObservedCct() {
		return meanObservedCct;
	}

	//set方法
	public void setMeanObservedCct(Double meanObservedCct) {
		this.meanObservedCct = meanObservedCct;
	}
	//get方法
	public Double getMeanObservedCcc() {
		return meanObservedCcc;
	}

	//set方法
	public void setMeanObservedCcc(Double meanObservedCcc) {
		this.meanObservedCcc = meanObservedCcc;
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
