package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodonBiasPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="codon_bias_pic")
public class CodonBiasPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_cdc")
	private Double minCdc;//

    @Column(name = "min_enc")
	private Double minEnc;//

    @Column(name = "truemin_cdc")
	private Double trueminCdc;//

    @Column(name = "truemin_enc")
	private Double trueminEnc;//

    @Column(name = "X05q_cdc")
	private Double X05qCdc;//

    @Column(name = "X05q_enc")
	private Double X05qEnc;//

    @Column(name = "X25q_cdc")
	private Double X25qCdc;//

    @Column(name = "X25q_enc")
	private Double X25qEnc;//

    @Column(name = "X50q_cdc")
	private Double X50qCdc;//

    @Column(name = "X50q_enc")
	private Double X50qEnc;//

    @Column(name = "X75q_cdc")
	private Double X75qCdc;//

    @Column(name = "X75q_enc")
	private Double X75qEnc;//

    @Column(name = "X95q_cdc")
	private Double X95qCdc;//

    @Column(name = "X95q_enc")
	private Double X95qEnc;//

    @Column(name = "truemax_cdc")
	private Double truemaxCdc;//

    @Column(name = "truemax_enc")
	private Double truemaxEnc;//

    @Column(name = "max_cdc")
	private Double maxCdc;//

    @Column(name = "max_enc")
	private Double maxEnc;//

    @Column(name = "mean_cdc")
	private Double meanCdc;//

    @Column(name = "mean_enc")
	private Double meanEnc;//

    @Column(name = "min_rscu_aaa")
	private Double minRscuAaa;//

    @Column(name = "min_rscu_aag")
	private Double minRscuAag;//

    @Column(name = "min_rscu_aat")
	private Double minRscuAat;//

    @Column(name = "min_rscu_aac")
	private Double minRscuAac;//

    @Column(name = "min_rscu_taa")
	private Double minRscuTaa;//

    @Column(name = "min_rscu_tag")
	private Double minRscuTag;//

    @Column(name = "min_rscu_tat")
	private Double minRscuTat;//

    @Column(name = "min_rscu_tac")
	private Double minRscuTac;//

    @Column(name = "min_rscu_ata")
	private Double minRscuAta;//

    @Column(name = "min_rscu_atg")
	private Double minRscuAtg;//

    @Column(name = "min_rscu_att")
	private Double minRscuAtt;//

    @Column(name = "min_rscu_atc")
	private Double minRscuAtc;//

    @Column(name = "min_rscu_tta")
	private Double minRscuTta;//

    @Column(name = "min_rscu_ttg")
	private Double minRscuTtg;//

    @Column(name = "min_rscu_ttt")
	private Double minRscuTtt;//

    @Column(name = "min_rscu_ttc")
	private Double minRscuTtc;//

    @Column(name = "min_rscu_gaa")
	private Double minRscuGaa;//

    @Column(name = "min_rscu_gag")
	private Double minRscuGag;//

    @Column(name = "min_rscu_gat")
	private Double minRscuGat;//

    @Column(name = "min_rscu_gac")
	private Double minRscuGac;//

    @Column(name = "min_rscu_caa")
	private Double minRscuCaa;//

    @Column(name = "min_rscu_cag")
	private Double minRscuCag;//

    @Column(name = "min_rscu_cat")
	private Double minRscuCat;//

    @Column(name = "min_rscu_cac")
	private Double minRscuCac;//

    @Column(name = "min_rscu_gta")
	private Double minRscuGta;//

    @Column(name = "min_rscu_gtg")
	private Double minRscuGtg;//

    @Column(name = "min_rscu_gtt")
	private Double minRscuGtt;//

    @Column(name = "min_rscu_gtc")
	private Double minRscuGtc;//

    @Column(name = "min_rscu_cta")
	private Double minRscuCta;//

    @Column(name = "min_rscu_ctg")
	private Double minRscuCtg;//

    @Column(name = "min_rscu_ctt")
	private Double minRscuCtt;//

    @Column(name = "min_rscu_ctc")
	private Double minRscuCtc;//

    @Column(name = "min_rscu_aga")
	private Double minRscuAga;//

    @Column(name = "min_rscu_agg")
	private Double minRscuAgg;//

    @Column(name = "min_rscu_agt")
	private Double minRscuAgt;//

    @Column(name = "min_rscu_agc")
	private Double minRscuAgc;//

    @Column(name = "min_rscu_tga")
	private Double minRscuTga;//

    @Column(name = "min_rscu_tgg")
	private Double minRscuTgg;//

    @Column(name = "min_rscu_tgt")
	private Double minRscuTgt;//

    @Column(name = "min_rscu_tgc")
	private Double minRscuTgc;//

    @Column(name = "min_rscu_aca")
	private Double minRscuAca;//

    @Column(name = "min_rscu_acg")
	private Double minRscuAcg;//

    @Column(name = "min_rscu_act")
	private Double minRscuAct;//

    @Column(name = "min_rscu_acc")
	private Double minRscuAcc;//

    @Column(name = "min_rscu_tca")
	private Double minRscuTca;//

    @Column(name = "min_rscu_tcg")
	private Double minRscuTcg;//

    @Column(name = "min_rscu_tct")
	private Double minRscuTct;//

    @Column(name = "min_rscu_tcc")
	private Double minRscuTcc;//

    @Column(name = "min_rscu_gga")
	private Double minRscuGga;//

    @Column(name = "min_rscu_ggg")
	private Double minRscuGgg;//

    @Column(name = "min_rscu_ggt")
	private Double minRscuGgt;//

    @Column(name = "min_rscu_ggc")
	private Double minRscuGgc;//

    @Column(name = "min_rscu_cga")
	private Double minRscuCga;//

    @Column(name = "min_rscu_cgg")
	private Double minRscuCgg;//

    @Column(name = "min_rscu_cgt")
	private Double minRscuCgt;//

    @Column(name = "min_rscu_cgc")
	private Double minRscuCgc;//

    @Column(name = "min_rscu_gca")
	private Double minRscuGca;//

    @Column(name = "min_rscu_gcg")
	private Double minRscuGcg;//

    @Column(name = "min_rscu_gct")
	private Double minRscuGct;//

    @Column(name = "min_rscu_gcc")
	private Double minRscuGcc;//

    @Column(name = "min_rscu_cca")
	private Double minRscuCca;//

    @Column(name = "min_rscu_ccg")
	private Double minRscuCcg;//

    @Column(name = "min_rscu_cct")
	private Double minRscuCct;//

    @Column(name = "min_rscu_ccc")
	private Double minRscuCcc;//

    @Column(name = "truemin_rscu_aaa")
	private Double trueminRscuAaa;//

    @Column(name = "truemin_rscu_aag")
	private Double trueminRscuAag;//

    @Column(name = "truemin_rscu_aat")
	private Double trueminRscuAat;//

    @Column(name = "truemin_rscu_aac")
	private Double trueminRscuAac;//

    @Column(name = "truemin_rscu_taa")
	private Double trueminRscuTaa;//

    @Column(name = "truemin_rscu_tag")
	private Double trueminRscuTag;//

    @Column(name = "truemin_rscu_tat")
	private Double trueminRscuTat;//

    @Column(name = "truemin_rscu_tac")
	private Double trueminRscuTac;//

    @Column(name = "truemin_rscu_ata")
	private Double trueminRscuAta;//

    @Column(name = "truemin_rscu_atg")
	private Double trueminRscuAtg;//

    @Column(name = "truemin_rscu_att")
	private Double trueminRscuAtt;//

    @Column(name = "truemin_rscu_atc")
	private Double trueminRscuAtc;//

    @Column(name = "truemin_rscu_tta")
	private Double trueminRscuTta;//

    @Column(name = "truemin_rscu_ttg")
	private Double trueminRscuTtg;//

    @Column(name = "truemin_rscu_ttt")
	private Double trueminRscuTtt;//

    @Column(name = "truemin_rscu_ttc")
	private Double trueminRscuTtc;//

    @Column(name = "truemin_rscu_gaa")
	private Double trueminRscuGaa;//

    @Column(name = "truemin_rscu_gag")
	private Double trueminRscuGag;//

    @Column(name = "truemin_rscu_gat")
	private Double trueminRscuGat;//

    @Column(name = "truemin_rscu_gac")
	private Double trueminRscuGac;//

    @Column(name = "truemin_rscu_caa")
	private Double trueminRscuCaa;//

    @Column(name = "truemin_rscu_cag")
	private Double trueminRscuCag;//

    @Column(name = "truemin_rscu_cat")
	private Double trueminRscuCat;//

    @Column(name = "truemin_rscu_cac")
	private Double trueminRscuCac;//

    @Column(name = "truemin_rscu_gta")
	private Double trueminRscuGta;//

    @Column(name = "truemin_rscu_gtg")
	private Double trueminRscuGtg;//

    @Column(name = "truemin_rscu_gtt")
	private Double trueminRscuGtt;//

    @Column(name = "truemin_rscu_gtc")
	private Double trueminRscuGtc;//

    @Column(name = "truemin_rscu_cta")
	private Double trueminRscuCta;//

    @Column(name = "truemin_rscu_ctg")
	private Double trueminRscuCtg;//

    @Column(name = "truemin_rscu_ctt")
	private Double trueminRscuCtt;//

    @Column(name = "truemin_rscu_ctc")
	private Double trueminRscuCtc;//

    @Column(name = "truemin_rscu_aga")
	private Double trueminRscuAga;//

    @Column(name = "truemin_rscu_agg")
	private Double trueminRscuAgg;//

    @Column(name = "truemin_rscu_agt")
	private Double trueminRscuAgt;//

    @Column(name = "truemin_rscu_agc")
	private Double trueminRscuAgc;//

    @Column(name = "truemin_rscu_tga")
	private Double trueminRscuTga;//

    @Column(name = "truemin_rscu_tgg")
	private Double trueminRscuTgg;//

    @Column(name = "truemin_rscu_tgt")
	private Double trueminRscuTgt;//

    @Column(name = "truemin_rscu_tgc")
	private Double trueminRscuTgc;//

    @Column(name = "truemin_rscu_aca")
	private Double trueminRscuAca;//

    @Column(name = "truemin_rscu_acg")
	private Double trueminRscuAcg;//

    @Column(name = "truemin_rscu_act")
	private Double trueminRscuAct;//

    @Column(name = "truemin_rscu_acc")
	private Double trueminRscuAcc;//

    @Column(name = "truemin_rscu_tca")
	private Double trueminRscuTca;//

    @Column(name = "truemin_rscu_tcg")
	private Double trueminRscuTcg;//

    @Column(name = "truemin_rscu_tct")
	private Double trueminRscuTct;//

    @Column(name = "truemin_rscu_tcc")
	private Double trueminRscuTcc;//

    @Column(name = "truemin_rscu_gga")
	private Double trueminRscuGga;//

    @Column(name = "truemin_rscu_ggg")
	private Double trueminRscuGgg;//

    @Column(name = "truemin_rscu_ggt")
	private Double trueminRscuGgt;//

    @Column(name = "truemin_rscu_ggc")
	private Double trueminRscuGgc;//

    @Column(name = "truemin_rscu_cga")
	private Double trueminRscuCga;//

    @Column(name = "truemin_rscu_cgg")
	private Double trueminRscuCgg;//

    @Column(name = "truemin_rscu_cgt")
	private Double trueminRscuCgt;//

    @Column(name = "truemin_rscu_cgc")
	private Double trueminRscuCgc;//

    @Column(name = "truemin_rscu_gca")
	private Double trueminRscuGca;//

    @Column(name = "truemin_rscu_gcg")
	private Double trueminRscuGcg;//

    @Column(name = "truemin_rscu_gct")
	private Double trueminRscuGct;//

    @Column(name = "truemin_rscu_gcc")
	private Double trueminRscuGcc;//

    @Column(name = "truemin_rscu_cca")
	private Double trueminRscuCca;//

    @Column(name = "truemin_rscu_ccg")
	private Double trueminRscuCcg;//

    @Column(name = "truemin_rscu_cct")
	private Double trueminRscuCct;//

    @Column(name = "truemin_rscu_ccc")
	private Double trueminRscuCcc;//

    @Column(name = "X05q_rscu_aaa")
	private Double X05qRscuAaa;//

    @Column(name = "X05q_rscu_aag")
	private Double X05qRscuAag;//

    @Column(name = "X05q_rscu_aat")
	private Double X05qRscuAat;//

    @Column(name = "X05q_rscu_aac")
	private Double X05qRscuAac;//

    @Column(name = "X05q_rscu_taa")
	private Double X05qRscuTaa;//

    @Column(name = "X05q_rscu_tag")
	private Double X05qRscuTag;//

    @Column(name = "X05q_rscu_tat")
	private Double X05qRscuTat;//

    @Column(name = "X05q_rscu_tac")
	private Double X05qRscuTac;//

    @Column(name = "X05q_rscu_ata")
	private Double X05qRscuAta;//

    @Column(name = "X05q_rscu_atg")
	private Double X05qRscuAtg;//

    @Column(name = "X05q_rscu_att")
	private Double X05qRscuAtt;//

    @Column(name = "X05q_rscu_atc")
	private Double X05qRscuAtc;//

    @Column(name = "X05q_rscu_tta")
	private Double X05qRscuTta;//

    @Column(name = "X05q_rscu_ttg")
	private Double X05qRscuTtg;//

    @Column(name = "X05q_rscu_ttt")
	private Double X05qRscuTtt;//

    @Column(name = "X05q_rscu_ttc")
	private Double X05qRscuTtc;//

    @Column(name = "X05q_rscu_gaa")
	private Double X05qRscuGaa;//

    @Column(name = "X05q_rscu_gag")
	private Double X05qRscuGag;//

    @Column(name = "X05q_rscu_gat")
	private Double X05qRscuGat;//

    @Column(name = "X05q_rscu_gac")
	private Double X05qRscuGac;//

    @Column(name = "X05q_rscu_caa")
	private Double X05qRscuCaa;//

    @Column(name = "X05q_rscu_cag")
	private Double X05qRscuCag;//

    @Column(name = "X05q_rscu_cat")
	private Double X05qRscuCat;//

    @Column(name = "X05q_rscu_cac")
	private Double X05qRscuCac;//

    @Column(name = "X05q_rscu_gta")
	private Double X05qRscuGta;//

    @Column(name = "X05q_rscu_gtg")
	private Double X05qRscuGtg;//

    @Column(name = "X05q_rscu_gtt")
	private Double X05qRscuGtt;//

    @Column(name = "X05q_rscu_gtc")
	private Double X05qRscuGtc;//

    @Column(name = "X05q_rscu_cta")
	private Double X05qRscuCta;//

    @Column(name = "X05q_rscu_ctg")
	private Double X05qRscuCtg;//

    @Column(name = "X05q_rscu_ctt")
	private Double X05qRscuCtt;//

    @Column(name = "X05q_rscu_ctc")
	private Double X05qRscuCtc;//

    @Column(name = "X05q_rscu_aga")
	private Double X05qRscuAga;//

    @Column(name = "X05q_rscu_agg")
	private Double X05qRscuAgg;//

    @Column(name = "X05q_rscu_agt")
	private Double X05qRscuAgt;//

    @Column(name = "X05q_rscu_agc")
	private Double X05qRscuAgc;//

    @Column(name = "X05q_rscu_tga")
	private Double X05qRscuTga;//

    @Column(name = "X05q_rscu_tgg")
	private Double X05qRscuTgg;//

    @Column(name = "X05q_rscu_tgt")
	private Double X05qRscuTgt;//

    @Column(name = "X05q_rscu_tgc")
	private Double X05qRscuTgc;//

    @Column(name = "X05q_rscu_aca")
	private Double X05qRscuAca;//

    @Column(name = "X05q_rscu_acg")
	private Double X05qRscuAcg;//

    @Column(name = "X05q_rscu_act")
	private Double X05qRscuAct;//

    @Column(name = "X05q_rscu_acc")
	private Double X05qRscuAcc;//

    @Column(name = "X05q_rscu_tca")
	private Double X05qRscuTca;//

    @Column(name = "X05q_rscu_tcg")
	private Double X05qRscuTcg;//

    @Column(name = "X05q_rscu_tct")
	private Double X05qRscuTct;//

    @Column(name = "X05q_rscu_tcc")
	private Double X05qRscuTcc;//

    @Column(name = "X05q_rscu_gga")
	private Double X05qRscuGga;//

    @Column(name = "X05q_rscu_ggg")
	private Double X05qRscuGgg;//

    @Column(name = "X05q_rscu_ggt")
	private Double X05qRscuGgt;//

    @Column(name = "X05q_rscu_ggc")
	private Double X05qRscuGgc;//

    @Column(name = "X05q_rscu_cga")
	private Double X05qRscuCga;//

    @Column(name = "X05q_rscu_cgg")
	private Double X05qRscuCgg;//

    @Column(name = "X05q_rscu_cgt")
	private Double X05qRscuCgt;//

    @Column(name = "X05q_rscu_cgc")
	private Double X05qRscuCgc;//

    @Column(name = "X05q_rscu_gca")
	private Double X05qRscuGca;//

    @Column(name = "X05q_rscu_gcg")
	private Double X05qRscuGcg;//

    @Column(name = "X05q_rscu_gct")
	private Double X05qRscuGct;//

    @Column(name = "X05q_rscu_gcc")
	private Double X05qRscuGcc;//

    @Column(name = "X05q_rscu_cca")
	private Double X05qRscuCca;//

    @Column(name = "X05q_rscu_ccg")
	private Double X05qRscuCcg;//

    @Column(name = "X05q_rscu_cct")
	private Double X05qRscuCct;//

    @Column(name = "X05q_rscu_ccc")
	private Double X05qRscuCcc;//

    @Column(name = "X25q_rscu_aaa")
	private Double X25qRscuAaa;//

    @Column(name = "X25q_rscu_aag")
	private Double X25qRscuAag;//

    @Column(name = "X25q_rscu_aat")
	private Double X25qRscuAat;//

    @Column(name = "X25q_rscu_aac")
	private Double X25qRscuAac;//

    @Column(name = "X25q_rscu_taa")
	private Double X25qRscuTaa;//

    @Column(name = "X25q_rscu_tag")
	private Double X25qRscuTag;//

    @Column(name = "X25q_rscu_tat")
	private Double X25qRscuTat;//

    @Column(name = "X25q_rscu_tac")
	private Double X25qRscuTac;//

    @Column(name = "X25q_rscu_ata")
	private Double X25qRscuAta;//

    @Column(name = "X25q_rscu_atg")
	private Double X25qRscuAtg;//

    @Column(name = "X25q_rscu_att")
	private Double X25qRscuAtt;//

    @Column(name = "X25q_rscu_atc")
	private Double X25qRscuAtc;//

    @Column(name = "X25q_rscu_tta")
	private Double X25qRscuTta;//

    @Column(name = "X25q_rscu_ttg")
	private Double X25qRscuTtg;//

    @Column(name = "X25q_rscu_ttt")
	private Double X25qRscuTtt;//

    @Column(name = "X25q_rscu_ttc")
	private Double X25qRscuTtc;//

    @Column(name = "X25q_rscu_gaa")
	private Double X25qRscuGaa;//

    @Column(name = "X25q_rscu_gag")
	private Double X25qRscuGag;//

    @Column(name = "X25q_rscu_gat")
	private Double X25qRscuGat;//

    @Column(name = "X25q_rscu_gac")
	private Double X25qRscuGac;//

    @Column(name = "X25q_rscu_caa")
	private Double X25qRscuCaa;//

    @Column(name = "X25q_rscu_cag")
	private Double X25qRscuCag;//

    @Column(name = "X25q_rscu_cat")
	private Double X25qRscuCat;//

    @Column(name = "X25q_rscu_cac")
	private Double X25qRscuCac;//

    @Column(name = "X25q_rscu_gta")
	private Double X25qRscuGta;//

    @Column(name = "X25q_rscu_gtg")
	private Double X25qRscuGtg;//

    @Column(name = "X25q_rscu_gtt")
	private Double X25qRscuGtt;//

    @Column(name = "X25q_rscu_gtc")
	private Double X25qRscuGtc;//

    @Column(name = "X25q_rscu_cta")
	private Double X25qRscuCta;//

    @Column(name = "X25q_rscu_ctg")
	private Double X25qRscuCtg;//

    @Column(name = "X25q_rscu_ctt")
	private Double X25qRscuCtt;//

    @Column(name = "X25q_rscu_ctc")
	private Double X25qRscuCtc;//

    @Column(name = "X25q_rscu_aga")
	private Double X25qRscuAga;//

    @Column(name = "X25q_rscu_agg")
	private Double X25qRscuAgg;//

    @Column(name = "X25q_rscu_agt")
	private Double X25qRscuAgt;//

    @Column(name = "X25q_rscu_agc")
	private Double X25qRscuAgc;//

    @Column(name = "X25q_rscu_tga")
	private Double X25qRscuTga;//

    @Column(name = "X25q_rscu_tgg")
	private Double X25qRscuTgg;//

    @Column(name = "X25q_rscu_tgt")
	private Double X25qRscuTgt;//

    @Column(name = "X25q_rscu_tgc")
	private Double X25qRscuTgc;//

    @Column(name = "X25q_rscu_aca")
	private Double X25qRscuAca;//

    @Column(name = "X25q_rscu_acg")
	private Double X25qRscuAcg;//

    @Column(name = "X25q_rscu_act")
	private Double X25qRscuAct;//

    @Column(name = "X25q_rscu_acc")
	private Double X25qRscuAcc;//

    @Column(name = "X25q_rscu_tca")
	private Double X25qRscuTca;//

    @Column(name = "X25q_rscu_tcg")
	private Double X25qRscuTcg;//

    @Column(name = "X25q_rscu_tct")
	private Double X25qRscuTct;//

    @Column(name = "X25q_rscu_tcc")
	private Double X25qRscuTcc;//

    @Column(name = "X25q_rscu_gga")
	private Double X25qRscuGga;//

    @Column(name = "X25q_rscu_ggg")
	private Double X25qRscuGgg;//

    @Column(name = "X25q_rscu_ggt")
	private Double X25qRscuGgt;//

    @Column(name = "X25q_rscu_ggc")
	private Double X25qRscuGgc;//

    @Column(name = "X25q_rscu_cga")
	private Double X25qRscuCga;//

    @Column(name = "X25q_rscu_cgg")
	private Double X25qRscuCgg;//

    @Column(name = "X25q_rscu_cgt")
	private Double X25qRscuCgt;//

    @Column(name = "X25q_rscu_cgc")
	private Double X25qRscuCgc;//

    @Column(name = "X25q_rscu_gca")
	private Double X25qRscuGca;//

    @Column(name = "X25q_rscu_gcg")
	private Double X25qRscuGcg;//

    @Column(name = "X25q_rscu_gct")
	private Double X25qRscuGct;//

    @Column(name = "X25q_rscu_gcc")
	private Double X25qRscuGcc;//

    @Column(name = "X25q_rscu_cca")
	private Double X25qRscuCca;//

    @Column(name = "X25q_rscu_ccg")
	private Double X25qRscuCcg;//

    @Column(name = "X25q_rscu_cct")
	private Double X25qRscuCct;//

    @Column(name = "X25q_rscu_ccc")
	private Double X25qRscuCcc;//

    @Column(name = "X50q_rscu_aaa")
	private Double X50qRscuAaa;//

    @Column(name = "X50q_rscu_aag")
	private Double X50qRscuAag;//

    @Column(name = "X50q_rscu_aat")
	private Double X50qRscuAat;//

    @Column(name = "X50q_rscu_aac")
	private Double X50qRscuAac;//

    @Column(name = "X50q_rscu_taa")
	private Double X50qRscuTaa;//

    @Column(name = "X50q_rscu_tag")
	private Double X50qRscuTag;//

    @Column(name = "X50q_rscu_tat")
	private Double X50qRscuTat;//

    @Column(name = "X50q_rscu_tac")
	private Double X50qRscuTac;//

    @Column(name = "X50q_rscu_ata")
	private Double X50qRscuAta;//

    @Column(name = "X50q_rscu_atg")
	private Double X50qRscuAtg;//

    @Column(name = "X50q_rscu_att")
	private Double X50qRscuAtt;//

    @Column(name = "X50q_rscu_atc")
	private Double X50qRscuAtc;//

    @Column(name = "X50q_rscu_tta")
	private Double X50qRscuTta;//

    @Column(name = "X50q_rscu_ttg")
	private Double X50qRscuTtg;//

    @Column(name = "X50q_rscu_ttt")
	private Double X50qRscuTtt;//

    @Column(name = "X50q_rscu_ttc")
	private Double X50qRscuTtc;//

    @Column(name = "X50q_rscu_gaa")
	private Double X50qRscuGaa;//

    @Column(name = "X50q_rscu_gag")
	private Double X50qRscuGag;//

    @Column(name = "X50q_rscu_gat")
	private Double X50qRscuGat;//

    @Column(name = "X50q_rscu_gac")
	private Double X50qRscuGac;//

    @Column(name = "X50q_rscu_caa")
	private Double X50qRscuCaa;//

    @Column(name = "X50q_rscu_cag")
	private Double X50qRscuCag;//

    @Column(name = "X50q_rscu_cat")
	private Double X50qRscuCat;//

    @Column(name = "X50q_rscu_cac")
	private Double X50qRscuCac;//

    @Column(name = "X50q_rscu_gta")
	private Double X50qRscuGta;//

    @Column(name = "X50q_rscu_gtg")
	private Double X50qRscuGtg;//

    @Column(name = "X50q_rscu_gtt")
	private Double X50qRscuGtt;//

    @Column(name = "X50q_rscu_gtc")
	private Double X50qRscuGtc;//

    @Column(name = "X50q_rscu_cta")
	private Double X50qRscuCta;//

    @Column(name = "X50q_rscu_ctg")
	private Double X50qRscuCtg;//

    @Column(name = "X50q_rscu_ctt")
	private Double X50qRscuCtt;//

    @Column(name = "X50q_rscu_ctc")
	private Double X50qRscuCtc;//

    @Column(name = "X50q_rscu_aga")
	private Double X50qRscuAga;//

    @Column(name = "X50q_rscu_agg")
	private Double X50qRscuAgg;//

    @Column(name = "X50q_rscu_agt")
	private Double X50qRscuAgt;//

    @Column(name = "X50q_rscu_agc")
	private Double X50qRscuAgc;//

    @Column(name = "X50q_rscu_tga")
	private Double X50qRscuTga;//

    @Column(name = "X50q_rscu_tgg")
	private Double X50qRscuTgg;//

    @Column(name = "X50q_rscu_tgt")
	private Double X50qRscuTgt;//

    @Column(name = "X50q_rscu_tgc")
	private Double X50qRscuTgc;//

    @Column(name = "X50q_rscu_aca")
	private Double X50qRscuAca;//

    @Column(name = "X50q_rscu_acg")
	private Double X50qRscuAcg;//

    @Column(name = "X50q_rscu_act")
	private Double X50qRscuAct;//

    @Column(name = "X50q_rscu_acc")
	private Double X50qRscuAcc;//

    @Column(name = "X50q_rscu_tca")
	private Double X50qRscuTca;//

    @Column(name = "X50q_rscu_tcg")
	private Double X50qRscuTcg;//

    @Column(name = "X50q_rscu_tct")
	private Double X50qRscuTct;//

    @Column(name = "X50q_rscu_tcc")
	private Double X50qRscuTcc;//

    @Column(name = "X50q_rscu_gga")
	private Double X50qRscuGga;//

    @Column(name = "X50q_rscu_ggg")
	private Double X50qRscuGgg;//

    @Column(name = "X50q_rscu_ggt")
	private Double X50qRscuGgt;//

    @Column(name = "X50q_rscu_ggc")
	private Double X50qRscuGgc;//

    @Column(name = "X50q_rscu_cga")
	private Double X50qRscuCga;//

    @Column(name = "X50q_rscu_cgg")
	private Double X50qRscuCgg;//

    @Column(name = "X50q_rscu_cgt")
	private Double X50qRscuCgt;//

    @Column(name = "X50q_rscu_cgc")
	private Double X50qRscuCgc;//

    @Column(name = "X50q_rscu_gca")
	private Double X50qRscuGca;//

    @Column(name = "X50q_rscu_gcg")
	private Double X50qRscuGcg;//

    @Column(name = "X50q_rscu_gct")
	private Double X50qRscuGct;//

    @Column(name = "X50q_rscu_gcc")
	private Double X50qRscuGcc;//

    @Column(name = "X50q_rscu_cca")
	private Double X50qRscuCca;//

    @Column(name = "X50q_rscu_ccg")
	private Double X50qRscuCcg;//

    @Column(name = "X50q_rscu_cct")
	private Double X50qRscuCct;//

    @Column(name = "X50q_rscu_ccc")
	private Double X50qRscuCcc;//

    @Column(name = "X75q_rscu_aaa")
	private Double X75qRscuAaa;//

    @Column(name = "X75q_rscu_aag")
	private Double X75qRscuAag;//

    @Column(name = "X75q_rscu_aat")
	private Double X75qRscuAat;//

    @Column(name = "X75q_rscu_aac")
	private Double X75qRscuAac;//

    @Column(name = "X75q_rscu_taa")
	private Double X75qRscuTaa;//

    @Column(name = "X75q_rscu_tag")
	private Double X75qRscuTag;//

    @Column(name = "X75q_rscu_tat")
	private Double X75qRscuTat;//

    @Column(name = "X75q_rscu_tac")
	private Double X75qRscuTac;//

    @Column(name = "X75q_rscu_ata")
	private Double X75qRscuAta;//

    @Column(name = "X75q_rscu_atg")
	private Double X75qRscuAtg;//

    @Column(name = "X75q_rscu_att")
	private Double X75qRscuAtt;//

    @Column(name = "X75q_rscu_atc")
	private Double X75qRscuAtc;//

    @Column(name = "X75q_rscu_tta")
	private Double X75qRscuTta;//

    @Column(name = "X75q_rscu_ttg")
	private Double X75qRscuTtg;//

    @Column(name = "X75q_rscu_ttt")
	private Double X75qRscuTtt;//

    @Column(name = "X75q_rscu_ttc")
	private Double X75qRscuTtc;//

    @Column(name = "X75q_rscu_gaa")
	private Double X75qRscuGaa;//

    @Column(name = "X75q_rscu_gag")
	private Double X75qRscuGag;//

    @Column(name = "X75q_rscu_gat")
	private Double X75qRscuGat;//

    @Column(name = "X75q_rscu_gac")
	private Double X75qRscuGac;//

    @Column(name = "X75q_rscu_caa")
	private Double X75qRscuCaa;//

    @Column(name = "X75q_rscu_cag")
	private Double X75qRscuCag;//

    @Column(name = "X75q_rscu_cat")
	private Double X75qRscuCat;//

    @Column(name = "X75q_rscu_cac")
	private Double X75qRscuCac;//

    @Column(name = "X75q_rscu_gta")
	private Double X75qRscuGta;//

    @Column(name = "X75q_rscu_gtg")
	private Double X75qRscuGtg;//

    @Column(name = "X75q_rscu_gtt")
	private Double X75qRscuGtt;//

    @Column(name = "X75q_rscu_gtc")
	private Double X75qRscuGtc;//

    @Column(name = "X75q_rscu_cta")
	private Double X75qRscuCta;//

    @Column(name = "X75q_rscu_ctg")
	private Double X75qRscuCtg;//

    @Column(name = "X75q_rscu_ctt")
	private Double X75qRscuCtt;//

    @Column(name = "X75q_rscu_ctc")
	private Double X75qRscuCtc;//

    @Column(name = "X75q_rscu_aga")
	private Double X75qRscuAga;//

    @Column(name = "X75q_rscu_agg")
	private Double X75qRscuAgg;//

    @Column(name = "X75q_rscu_agt")
	private Double X75qRscuAgt;//

    @Column(name = "X75q_rscu_agc")
	private Double X75qRscuAgc;//

    @Column(name = "X75q_rscu_tga")
	private Double X75qRscuTga;//

    @Column(name = "X75q_rscu_tgg")
	private Double X75qRscuTgg;//

    @Column(name = "X75q_rscu_tgt")
	private Double X75qRscuTgt;//

    @Column(name = "X75q_rscu_tgc")
	private Double X75qRscuTgc;//

    @Column(name = "X75q_rscu_aca")
	private Double X75qRscuAca;//

    @Column(name = "X75q_rscu_acg")
	private Double X75qRscuAcg;//

    @Column(name = "X75q_rscu_act")
	private Double X75qRscuAct;//

    @Column(name = "X75q_rscu_acc")
	private Double X75qRscuAcc;//

    @Column(name = "X75q_rscu_tca")
	private Double X75qRscuTca;//

    @Column(name = "X75q_rscu_tcg")
	private Double X75qRscuTcg;//

    @Column(name = "X75q_rscu_tct")
	private Double X75qRscuTct;//

    @Column(name = "X75q_rscu_tcc")
	private Double X75qRscuTcc;//

    @Column(name = "X75q_rscu_gga")
	private Double X75qRscuGga;//

    @Column(name = "X75q_rscu_ggg")
	private Double X75qRscuGgg;//

    @Column(name = "X75q_rscu_ggt")
	private Double X75qRscuGgt;//

    @Column(name = "X75q_rscu_ggc")
	private Double X75qRscuGgc;//

    @Column(name = "X75q_rscu_cga")
	private Double X75qRscuCga;//

    @Column(name = "X75q_rscu_cgg")
	private Double X75qRscuCgg;//

    @Column(name = "X75q_rscu_cgt")
	private Double X75qRscuCgt;//

    @Column(name = "X75q_rscu_cgc")
	private Double X75qRscuCgc;//

    @Column(name = "X75q_rscu_gca")
	private Double X75qRscuGca;//

    @Column(name = "X75q_rscu_gcg")
	private Double X75qRscuGcg;//

    @Column(name = "X75q_rscu_gct")
	private Double X75qRscuGct;//

    @Column(name = "X75q_rscu_gcc")
	private Double X75qRscuGcc;//

    @Column(name = "X75q_rscu_cca")
	private Double X75qRscuCca;//

    @Column(name = "X75q_rscu_ccg")
	private Double X75qRscuCcg;//

    @Column(name = "X75q_rscu_cct")
	private Double X75qRscuCct;//

    @Column(name = "X75q_rscu_ccc")
	private Double X75qRscuCcc;//

    @Column(name = "X95q_rscu_aaa")
	private Double X95qRscuAaa;//

    @Column(name = "X95q_rscu_aag")
	private Double X95qRscuAag;//

    @Column(name = "X95q_rscu_aat")
	private Double X95qRscuAat;//

    @Column(name = "X95q_rscu_aac")
	private Double X95qRscuAac;//

    @Column(name = "X95q_rscu_taa")
	private Double X95qRscuTaa;//

    @Column(name = "X95q_rscu_tag")
	private Double X95qRscuTag;//

    @Column(name = "X95q_rscu_tat")
	private Double X95qRscuTat;//

    @Column(name = "X95q_rscu_tac")
	private Double X95qRscuTac;//

    @Column(name = "X95q_rscu_ata")
	private Double X95qRscuAta;//

    @Column(name = "X95q_rscu_atg")
	private Double X95qRscuAtg;//

    @Column(name = "X95q_rscu_att")
	private Double X95qRscuAtt;//

    @Column(name = "X95q_rscu_atc")
	private Double X95qRscuAtc;//

    @Column(name = "X95q_rscu_tta")
	private Double X95qRscuTta;//

    @Column(name = "X95q_rscu_ttg")
	private Double X95qRscuTtg;//

    @Column(name = "X95q_rscu_ttt")
	private Double X95qRscuTtt;//

    @Column(name = "X95q_rscu_ttc")
	private Double X95qRscuTtc;//

    @Column(name = "X95q_rscu_gaa")
	private Double X95qRscuGaa;//

    @Column(name = "X95q_rscu_gag")
	private Double X95qRscuGag;//

    @Column(name = "X95q_rscu_gat")
	private Double X95qRscuGat;//

    @Column(name = "X95q_rscu_gac")
	private Double X95qRscuGac;//

    @Column(name = "X95q_rscu_caa")
	private Double X95qRscuCaa;//

    @Column(name = "X95q_rscu_cag")
	private Double X95qRscuCag;//

    @Column(name = "X95q_rscu_cat")
	private Double X95qRscuCat;//

    @Column(name = "X95q_rscu_cac")
	private Double X95qRscuCac;//

    @Column(name = "X95q_rscu_gta")
	private Double X95qRscuGta;//

    @Column(name = "X95q_rscu_gtg")
	private Double X95qRscuGtg;//

    @Column(name = "X95q_rscu_gtt")
	private Double X95qRscuGtt;//

    @Column(name = "X95q_rscu_gtc")
	private Double X95qRscuGtc;//

    @Column(name = "X95q_rscu_cta")
	private Double X95qRscuCta;//

    @Column(name = "X95q_rscu_ctg")
	private Double X95qRscuCtg;//

    @Column(name = "X95q_rscu_ctt")
	private Double X95qRscuCtt;//

    @Column(name = "X95q_rscu_ctc")
	private Double X95qRscuCtc;//

    @Column(name = "X95q_rscu_aga")
	private Double X95qRscuAga;//

    @Column(name = "X95q_rscu_agg")
	private Double X95qRscuAgg;//

    @Column(name = "X95q_rscu_agt")
	private Double X95qRscuAgt;//

    @Column(name = "X95q_rscu_agc")
	private Double X95qRscuAgc;//

    @Column(name = "X95q_rscu_tga")
	private Double X95qRscuTga;//

    @Column(name = "X95q_rscu_tgg")
	private Double X95qRscuTgg;//

    @Column(name = "X95q_rscu_tgt")
	private Double X95qRscuTgt;//

    @Column(name = "X95q_rscu_tgc")
	private Double X95qRscuTgc;//

    @Column(name = "X95q_rscu_aca")
	private Double X95qRscuAca;//

    @Column(name = "X95q_rscu_acg")
	private Double X95qRscuAcg;//

    @Column(name = "X95q_rscu_act")
	private Double X95qRscuAct;//

    @Column(name = "X95q_rscu_acc")
	private Double X95qRscuAcc;//

    @Column(name = "X95q_rscu_tca")
	private Double X95qRscuTca;//

    @Column(name = "X95q_rscu_tcg")
	private Double X95qRscuTcg;//

    @Column(name = "X95q_rscu_tct")
	private Double X95qRscuTct;//

    @Column(name = "X95q_rscu_tcc")
	private Double X95qRscuTcc;//

    @Column(name = "X95q_rscu_gga")
	private Double X95qRscuGga;//

    @Column(name = "X95q_rscu_ggg")
	private Double X95qRscuGgg;//

    @Column(name = "X95q_rscu_ggt")
	private Double X95qRscuGgt;//

    @Column(name = "X95q_rscu_ggc")
	private Double X95qRscuGgc;//

    @Column(name = "X95q_rscu_cga")
	private Double X95qRscuCga;//

    @Column(name = "X95q_rscu_cgg")
	private Double X95qRscuCgg;//

    @Column(name = "X95q_rscu_cgt")
	private Double X95qRscuCgt;//

    @Column(name = "X95q_rscu_cgc")
	private Double X95qRscuCgc;//

    @Column(name = "X95q_rscu_gca")
	private Double X95qRscuGca;//

    @Column(name = "X95q_rscu_gcg")
	private Double X95qRscuGcg;//

    @Column(name = "X95q_rscu_gct")
	private Double X95qRscuGct;//

    @Column(name = "X95q_rscu_gcc")
	private Double X95qRscuGcc;//

    @Column(name = "X95q_rscu_cca")
	private Double X95qRscuCca;//

    @Column(name = "X95q_rscu_ccg")
	private Double X95qRscuCcg;//

    @Column(name = "X95q_rscu_cct")
	private Double X95qRscuCct;//

    @Column(name = "X95q_rscu_ccc")
	private Double X95qRscuCcc;//

    @Column(name = "truemax_rscu_aaa")
	private Double truemaxRscuAaa;//

    @Column(name = "truemax_rscu_aag")
	private Double truemaxRscuAag;//

    @Column(name = "truemax_rscu_aat")
	private Double truemaxRscuAat;//

    @Column(name = "truemax_rscu_aac")
	private Double truemaxRscuAac;//

    @Column(name = "truemax_rscu_taa")
	private Double truemaxRscuTaa;//

    @Column(name = "truemax_rscu_tag")
	private Double truemaxRscuTag;//

    @Column(name = "truemax_rscu_tat")
	private Double truemaxRscuTat;//

    @Column(name = "truemax_rscu_tac")
	private Double truemaxRscuTac;//

    @Column(name = "truemax_rscu_ata")
	private Double truemaxRscuAta;//

    @Column(name = "truemax_rscu_atg")
	private Double truemaxRscuAtg;//

    @Column(name = "truemax_rscu_att")
	private Double truemaxRscuAtt;//

    @Column(name = "truemax_rscu_atc")
	private Double truemaxRscuAtc;//

    @Column(name = "truemax_rscu_tta")
	private Double truemaxRscuTta;//

    @Column(name = "truemax_rscu_ttg")
	private Double truemaxRscuTtg;//

    @Column(name = "truemax_rscu_ttt")
	private Double truemaxRscuTtt;//

    @Column(name = "truemax_rscu_ttc")
	private Double truemaxRscuTtc;//

    @Column(name = "truemax_rscu_gaa")
	private Double truemaxRscuGaa;//

    @Column(name = "truemax_rscu_gag")
	private Double truemaxRscuGag;//

    @Column(name = "truemax_rscu_gat")
	private Double truemaxRscuGat;//

    @Column(name = "truemax_rscu_gac")
	private Double truemaxRscuGac;//

    @Column(name = "truemax_rscu_caa")
	private Double truemaxRscuCaa;//

    @Column(name = "truemax_rscu_cag")
	private Double truemaxRscuCag;//

    @Column(name = "truemax_rscu_cat")
	private Double truemaxRscuCat;//

    @Column(name = "truemax_rscu_cac")
	private Double truemaxRscuCac;//

    @Column(name = "truemax_rscu_gta")
	private Double truemaxRscuGta;//

    @Column(name = "truemax_rscu_gtg")
	private Double truemaxRscuGtg;//

    @Column(name = "truemax_rscu_gtt")
	private Double truemaxRscuGtt;//

    @Column(name = "truemax_rscu_gtc")
	private Double truemaxRscuGtc;//

    @Column(name = "truemax_rscu_cta")
	private Double truemaxRscuCta;//

    @Column(name = "truemax_rscu_ctg")
	private Double truemaxRscuCtg;//

    @Column(name = "truemax_rscu_ctt")
	private Double truemaxRscuCtt;//

    @Column(name = "truemax_rscu_ctc")
	private Double truemaxRscuCtc;//

    @Column(name = "truemax_rscu_aga")
	private Double truemaxRscuAga;//

    @Column(name = "truemax_rscu_agg")
	private Double truemaxRscuAgg;//

    @Column(name = "truemax_rscu_agt")
	private Double truemaxRscuAgt;//

    @Column(name = "truemax_rscu_agc")
	private Double truemaxRscuAgc;//

    @Column(name = "truemax_rscu_tga")
	private Double truemaxRscuTga;//

    @Column(name = "truemax_rscu_tgg")
	private Double truemaxRscuTgg;//

    @Column(name = "truemax_rscu_tgt")
	private Double truemaxRscuTgt;//

    @Column(name = "truemax_rscu_tgc")
	private Double truemaxRscuTgc;//

    @Column(name = "truemax_rscu_aca")
	private Double truemaxRscuAca;//

    @Column(name = "truemax_rscu_acg")
	private Double truemaxRscuAcg;//

    @Column(name = "truemax_rscu_act")
	private Double truemaxRscuAct;//

    @Column(name = "truemax_rscu_acc")
	private Double truemaxRscuAcc;//

    @Column(name = "truemax_rscu_tca")
	private Double truemaxRscuTca;//

    @Column(name = "truemax_rscu_tcg")
	private Double truemaxRscuTcg;//

    @Column(name = "truemax_rscu_tct")
	private Double truemaxRscuTct;//

    @Column(name = "truemax_rscu_tcc")
	private Double truemaxRscuTcc;//

    @Column(name = "truemax_rscu_gga")
	private Double truemaxRscuGga;//

    @Column(name = "truemax_rscu_ggg")
	private Double truemaxRscuGgg;//

    @Column(name = "truemax_rscu_ggt")
	private Double truemaxRscuGgt;//

    @Column(name = "truemax_rscu_ggc")
	private Double truemaxRscuGgc;//

    @Column(name = "truemax_rscu_cga")
	private Double truemaxRscuCga;//

    @Column(name = "truemax_rscu_cgg")
	private Double truemaxRscuCgg;//

    @Column(name = "truemax_rscu_cgt")
	private Double truemaxRscuCgt;//

    @Column(name = "truemax_rscu_cgc")
	private Double truemaxRscuCgc;//

    @Column(name = "truemax_rscu_gca")
	private Double truemaxRscuGca;//

    @Column(name = "truemax_rscu_gcg")
	private Double truemaxRscuGcg;//

    @Column(name = "truemax_rscu_gct")
	private Double truemaxRscuGct;//

    @Column(name = "truemax_rscu_gcc")
	private Double truemaxRscuGcc;//

    @Column(name = "truemax_rscu_cca")
	private Double truemaxRscuCca;//

    @Column(name = "truemax_rscu_ccg")
	private Double truemaxRscuCcg;//

    @Column(name = "truemax_rscu_cct")
	private Double truemaxRscuCct;//

    @Column(name = "truemax_rscu_ccc")
	private Double truemaxRscuCcc;//

    @Column(name = "max_rscu_aaa")
	private Double maxRscuAaa;//

    @Column(name = "max_rscu_aag")
	private Double maxRscuAag;//

    @Column(name = "max_rscu_aat")
	private Double maxRscuAat;//

    @Column(name = "max_rscu_aac")
	private Double maxRscuAac;//

    @Column(name = "max_rscu_taa")
	private Double maxRscuTaa;//

    @Column(name = "max_rscu_tag")
	private Double maxRscuTag;//

    @Column(name = "max_rscu_tat")
	private Double maxRscuTat;//

    @Column(name = "max_rscu_tac")
	private Double maxRscuTac;//

    @Column(name = "max_rscu_ata")
	private Double maxRscuAta;//

    @Column(name = "max_rscu_atg")
	private Double maxRscuAtg;//

    @Column(name = "max_rscu_att")
	private Double maxRscuAtt;//

    @Column(name = "max_rscu_atc")
	private Double maxRscuAtc;//

    @Column(name = "max_rscu_tta")
	private Double maxRscuTta;//

    @Column(name = "max_rscu_ttg")
	private Double maxRscuTtg;//

    @Column(name = "max_rscu_ttt")
	private Double maxRscuTtt;//

    @Column(name = "max_rscu_ttc")
	private Double maxRscuTtc;//

    @Column(name = "max_rscu_gaa")
	private Double maxRscuGaa;//

    @Column(name = "max_rscu_gag")
	private Double maxRscuGag;//

    @Column(name = "max_rscu_gat")
	private Double maxRscuGat;//

    @Column(name = "max_rscu_gac")
	private Double maxRscuGac;//

    @Column(name = "max_rscu_caa")
	private Double maxRscuCaa;//

    @Column(name = "max_rscu_cag")
	private Double maxRscuCag;//

    @Column(name = "max_rscu_cat")
	private Double maxRscuCat;//

    @Column(name = "max_rscu_cac")
	private Double maxRscuCac;//

    @Column(name = "max_rscu_gta")
	private Double maxRscuGta;//

    @Column(name = "max_rscu_gtg")
	private Double maxRscuGtg;//

    @Column(name = "max_rscu_gtt")
	private Double maxRscuGtt;//

    @Column(name = "max_rscu_gtc")
	private Double maxRscuGtc;//

    @Column(name = "max_rscu_cta")
	private Double maxRscuCta;//

    @Column(name = "max_rscu_ctg")
	private Double maxRscuCtg;//

    @Column(name = "max_rscu_ctt")
	private Double maxRscuCtt;//

    @Column(name = "max_rscu_ctc")
	private Double maxRscuCtc;//

    @Column(name = "max_rscu_aga")
	private Double maxRscuAga;//

    @Column(name = "max_rscu_agg")
	private Double maxRscuAgg;//

    @Column(name = "max_rscu_agt")
	private Double maxRscuAgt;//

    @Column(name = "max_rscu_agc")
	private Double maxRscuAgc;//

    @Column(name = "max_rscu_tga")
	private Double maxRscuTga;//

    @Column(name = "max_rscu_tgg")
	private Double maxRscuTgg;//

    @Column(name = "max_rscu_tgt")
	private Double maxRscuTgt;//

    @Column(name = "max_rscu_tgc")
	private Double maxRscuTgc;//

    @Column(name = "max_rscu_aca")
	private Double maxRscuAca;//

    @Column(name = "max_rscu_acg")
	private Double maxRscuAcg;//

    @Column(name = "max_rscu_act")
	private Double maxRscuAct;//

    @Column(name = "max_rscu_acc")
	private Double maxRscuAcc;//

    @Column(name = "max_rscu_tca")
	private Double maxRscuTca;//

    @Column(name = "max_rscu_tcg")
	private Double maxRscuTcg;//

    @Column(name = "max_rscu_tct")
	private Double maxRscuTct;//

    @Column(name = "max_rscu_tcc")
	private Double maxRscuTcc;//

    @Column(name = "max_rscu_gga")
	private Double maxRscuGga;//

    @Column(name = "max_rscu_ggg")
	private Double maxRscuGgg;//

    @Column(name = "max_rscu_ggt")
	private Double maxRscuGgt;//

    @Column(name = "max_rscu_ggc")
	private Double maxRscuGgc;//

    @Column(name = "max_rscu_cga")
	private Double maxRscuCga;//

    @Column(name = "max_rscu_cgg")
	private Double maxRscuCgg;//

    @Column(name = "max_rscu_cgt")
	private Double maxRscuCgt;//

    @Column(name = "max_rscu_cgc")
	private Double maxRscuCgc;//

    @Column(name = "max_rscu_gca")
	private Double maxRscuGca;//

    @Column(name = "max_rscu_gcg")
	private Double maxRscuGcg;//

    @Column(name = "max_rscu_gct")
	private Double maxRscuGct;//

    @Column(name = "max_rscu_gcc")
	private Double maxRscuGcc;//

    @Column(name = "max_rscu_cca")
	private Double maxRscuCca;//

    @Column(name = "max_rscu_ccg")
	private Double maxRscuCcg;//

    @Column(name = "max_rscu_cct")
	private Double maxRscuCct;//

    @Column(name = "max_rscu_ccc")
	private Double maxRscuCcc;//

    @Column(name = "mean_rscu_aaa")
	private Double meanRscuAaa;//

    @Column(name = "mean_rscu_aag")
	private Double meanRscuAag;//

    @Column(name = "mean_rscu_aat")
	private Double meanRscuAat;//

    @Column(name = "mean_rscu_aac")
	private Double meanRscuAac;//

    @Column(name = "mean_rscu_taa")
	private Double meanRscuTaa;//

    @Column(name = "mean_rscu_tag")
	private Double meanRscuTag;//

    @Column(name = "mean_rscu_tat")
	private Double meanRscuTat;//

    @Column(name = "mean_rscu_tac")
	private Double meanRscuTac;//

    @Column(name = "mean_rscu_ata")
	private Double meanRscuAta;//

    @Column(name = "mean_rscu_atg")
	private Double meanRscuAtg;//

    @Column(name = "mean_rscu_att")
	private Double meanRscuAtt;//

    @Column(name = "mean_rscu_atc")
	private Double meanRscuAtc;//

    @Column(name = "mean_rscu_tta")
	private Double meanRscuTta;//

    @Column(name = "mean_rscu_ttg")
	private Double meanRscuTtg;//

    @Column(name = "mean_rscu_ttt")
	private Double meanRscuTtt;//

    @Column(name = "mean_rscu_ttc")
	private Double meanRscuTtc;//

    @Column(name = "mean_rscu_gaa")
	private Double meanRscuGaa;//

    @Column(name = "mean_rscu_gag")
	private Double meanRscuGag;//

    @Column(name = "mean_rscu_gat")
	private Double meanRscuGat;//

    @Column(name = "mean_rscu_gac")
	private Double meanRscuGac;//

    @Column(name = "mean_rscu_caa")
	private Double meanRscuCaa;//

    @Column(name = "mean_rscu_cag")
	private Double meanRscuCag;//

    @Column(name = "mean_rscu_cat")
	private Double meanRscuCat;//

    @Column(name = "mean_rscu_cac")
	private Double meanRscuCac;//

    @Column(name = "mean_rscu_gta")
	private Double meanRscuGta;//

    @Column(name = "mean_rscu_gtg")
	private Double meanRscuGtg;//

    @Column(name = "mean_rscu_gtt")
	private Double meanRscuGtt;//

    @Column(name = "mean_rscu_gtc")
	private Double meanRscuGtc;//

    @Column(name = "mean_rscu_cta")
	private Double meanRscuCta;//

    @Column(name = "mean_rscu_ctg")
	private Double meanRscuCtg;//

    @Column(name = "mean_rscu_ctt")
	private Double meanRscuCtt;//

    @Column(name = "mean_rscu_ctc")
	private Double meanRscuCtc;//

    @Column(name = "mean_rscu_aga")
	private Double meanRscuAga;//

    @Column(name = "mean_rscu_agg")
	private Double meanRscuAgg;//

    @Column(name = "mean_rscu_agt")
	private Double meanRscuAgt;//

    @Column(name = "mean_rscu_agc")
	private Double meanRscuAgc;//

    @Column(name = "mean_rscu_tga")
	private Double meanRscuTga;//

    @Column(name = "mean_rscu_tgg")
	private Double meanRscuTgg;//

    @Column(name = "mean_rscu_tgt")
	private Double meanRscuTgt;//

    @Column(name = "mean_rscu_tgc")
	private Double meanRscuTgc;//

    @Column(name = "mean_rscu_aca")
	private Double meanRscuAca;//

    @Column(name = "mean_rscu_acg")
	private Double meanRscuAcg;//

    @Column(name = "mean_rscu_act")
	private Double meanRscuAct;//

    @Column(name = "mean_rscu_acc")
	private Double meanRscuAcc;//

    @Column(name = "mean_rscu_tca")
	private Double meanRscuTca;//

    @Column(name = "mean_rscu_tcg")
	private Double meanRscuTcg;//

    @Column(name = "mean_rscu_tct")
	private Double meanRscuTct;//

    @Column(name = "mean_rscu_tcc")
	private Double meanRscuTcc;//

    @Column(name = "mean_rscu_gga")
	private Double meanRscuGga;//

    @Column(name = "mean_rscu_ggg")
	private Double meanRscuGgg;//

    @Column(name = "mean_rscu_ggt")
	private Double meanRscuGgt;//

    @Column(name = "mean_rscu_ggc")
	private Double meanRscuGgc;//

    @Column(name = "mean_rscu_cga")
	private Double meanRscuCga;//

    @Column(name = "mean_rscu_cgg")
	private Double meanRscuCgg;//

    @Column(name = "mean_rscu_cgt")
	private Double meanRscuCgt;//

    @Column(name = "mean_rscu_cgc")
	private Double meanRscuCgc;//

    @Column(name = "mean_rscu_gca")
	private Double meanRscuGca;//

    @Column(name = "mean_rscu_gcg")
	private Double meanRscuGcg;//

    @Column(name = "mean_rscu_gct")
	private Double meanRscuGct;//

    @Column(name = "mean_rscu_gcc")
	private Double meanRscuGcc;//

    @Column(name = "mean_rscu_cca")
	private Double meanRscuCca;//

    @Column(name = "mean_rscu_ccg")
	private Double meanRscuCcg;//

    @Column(name = "mean_rscu_cct")
	private Double meanRscuCct;//

    @Column(name = "mean_rscu_ccc")
	private Double meanRscuCcc;//

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
	public Double getMinCdc() {
		return minCdc;
	}

	//set方法
	public void setMinCdc(Double minCdc) {
		this.minCdc = minCdc;
	}
	//get方法
	public Double getMinEnc() {
		return minEnc;
	}

	//set方法
	public void setMinEnc(Double minEnc) {
		this.minEnc = minEnc;
	}
	//get方法
	public Double getTrueminCdc() {
		return trueminCdc;
	}

	//set方法
	public void setTrueminCdc(Double trueminCdc) {
		this.trueminCdc = trueminCdc;
	}
	//get方法
	public Double getTrueminEnc() {
		return trueminEnc;
	}

	//set方法
	public void setTrueminEnc(Double trueminEnc) {
		this.trueminEnc = trueminEnc;
	}
	//get方法
	public Double getX05qCdc() {
		return X05qCdc;
	}

	//set方法
	public void setX05qCdc(Double X05qCdc) {
		this.X05qCdc = X05qCdc;
	}
	//get方法
	public Double getX05qEnc() {
		return X05qEnc;
	}

	//set方法
	public void setX05qEnc(Double X05qEnc) {
		this.X05qEnc = X05qEnc;
	}
	//get方法
	public Double getX25qCdc() {
		return X25qCdc;
	}

	//set方法
	public void setX25qCdc(Double X25qCdc) {
		this.X25qCdc = X25qCdc;
	}
	//get方法
	public Double getX25qEnc() {
		return X25qEnc;
	}

	//set方法
	public void setX25qEnc(Double X25qEnc) {
		this.X25qEnc = X25qEnc;
	}
	//get方法
	public Double getX50qCdc() {
		return X50qCdc;
	}

	//set方法
	public void setX50qCdc(Double X50qCdc) {
		this.X50qCdc = X50qCdc;
	}
	//get方法
	public Double getX50qEnc() {
		return X50qEnc;
	}

	//set方法
	public void setX50qEnc(Double X50qEnc) {
		this.X50qEnc = X50qEnc;
	}
	//get方法
	public Double getX75qCdc() {
		return X75qCdc;
	}

	//set方法
	public void setX75qCdc(Double X75qCdc) {
		this.X75qCdc = X75qCdc;
	}
	//get方法
	public Double getX75qEnc() {
		return X75qEnc;
	}

	//set方法
	public void setX75qEnc(Double X75qEnc) {
		this.X75qEnc = X75qEnc;
	}
	//get方法
	public Double getX95qCdc() {
		return X95qCdc;
	}

	//set方法
	public void setX95qCdc(Double X95qCdc) {
		this.X95qCdc = X95qCdc;
	}
	//get方法
	public Double getX95qEnc() {
		return X95qEnc;
	}

	//set方法
	public void setX95qEnc(Double X95qEnc) {
		this.X95qEnc = X95qEnc;
	}
	//get方法
	public Double getTruemaxCdc() {
		return truemaxCdc;
	}

	//set方法
	public void setTruemaxCdc(Double truemaxCdc) {
		this.truemaxCdc = truemaxCdc;
	}
	//get方法
	public Double getTruemaxEnc() {
		return truemaxEnc;
	}

	//set方法
	public void setTruemaxEnc(Double truemaxEnc) {
		this.truemaxEnc = truemaxEnc;
	}
	//get方法
	public Double getMaxCdc() {
		return maxCdc;
	}

	//set方法
	public void setMaxCdc(Double maxCdc) {
		this.maxCdc = maxCdc;
	}
	//get方法
	public Double getMaxEnc() {
		return maxEnc;
	}

	//set方法
	public void setMaxEnc(Double maxEnc) {
		this.maxEnc = maxEnc;
	}
	//get方法
	public Double getMeanCdc() {
		return meanCdc;
	}

	//set方法
	public void setMeanCdc(Double meanCdc) {
		this.meanCdc = meanCdc;
	}
	//get方法
	public Double getMeanEnc() {
		return meanEnc;
	}

	//set方法
	public void setMeanEnc(Double meanEnc) {
		this.meanEnc = meanEnc;
	}
	//get方法
	public Double getMinRscuAaa() {
		return minRscuAaa;
	}

	//set方法
	public void setMinRscuAaa(Double minRscuAaa) {
		this.minRscuAaa = minRscuAaa;
	}
	//get方法
	public Double getMinRscuAag() {
		return minRscuAag;
	}

	//set方法
	public void setMinRscuAag(Double minRscuAag) {
		this.minRscuAag = minRscuAag;
	}
	//get方法
	public Double getMinRscuAat() {
		return minRscuAat;
	}

	//set方法
	public void setMinRscuAat(Double minRscuAat) {
		this.minRscuAat = minRscuAat;
	}
	//get方法
	public Double getMinRscuAac() {
		return minRscuAac;
	}

	//set方法
	public void setMinRscuAac(Double minRscuAac) {
		this.minRscuAac = minRscuAac;
	}
	//get方法
	public Double getMinRscuTaa() {
		return minRscuTaa;
	}

	//set方法
	public void setMinRscuTaa(Double minRscuTaa) {
		this.minRscuTaa = minRscuTaa;
	}
	//get方法
	public Double getMinRscuTag() {
		return minRscuTag;
	}

	//set方法
	public void setMinRscuTag(Double minRscuTag) {
		this.minRscuTag = minRscuTag;
	}
	//get方法
	public Double getMinRscuTat() {
		return minRscuTat;
	}

	//set方法
	public void setMinRscuTat(Double minRscuTat) {
		this.minRscuTat = minRscuTat;
	}
	//get方法
	public Double getMinRscuTac() {
		return minRscuTac;
	}

	//set方法
	public void setMinRscuTac(Double minRscuTac) {
		this.minRscuTac = minRscuTac;
	}
	//get方法
	public Double getMinRscuAta() {
		return minRscuAta;
	}

	//set方法
	public void setMinRscuAta(Double minRscuAta) {
		this.minRscuAta = minRscuAta;
	}
	//get方法
	public Double getMinRscuAtg() {
		return minRscuAtg;
	}

	//set方法
	public void setMinRscuAtg(Double minRscuAtg) {
		this.minRscuAtg = minRscuAtg;
	}
	//get方法
	public Double getMinRscuAtt() {
		return minRscuAtt;
	}

	//set方法
	public void setMinRscuAtt(Double minRscuAtt) {
		this.minRscuAtt = minRscuAtt;
	}
	//get方法
	public Double getMinRscuAtc() {
		return minRscuAtc;
	}

	//set方法
	public void setMinRscuAtc(Double minRscuAtc) {
		this.minRscuAtc = minRscuAtc;
	}
	//get方法
	public Double getMinRscuTta() {
		return minRscuTta;
	}

	//set方法
	public void setMinRscuTta(Double minRscuTta) {
		this.minRscuTta = minRscuTta;
	}
	//get方法
	public Double getMinRscuTtg() {
		return minRscuTtg;
	}

	//set方法
	public void setMinRscuTtg(Double minRscuTtg) {
		this.minRscuTtg = minRscuTtg;
	}
	//get方法
	public Double getMinRscuTtt() {
		return minRscuTtt;
	}

	//set方法
	public void setMinRscuTtt(Double minRscuTtt) {
		this.minRscuTtt = minRscuTtt;
	}
	//get方法
	public Double getMinRscuTtc() {
		return minRscuTtc;
	}

	//set方法
	public void setMinRscuTtc(Double minRscuTtc) {
		this.minRscuTtc = minRscuTtc;
	}
	//get方法
	public Double getMinRscuGaa() {
		return minRscuGaa;
	}

	//set方法
	public void setMinRscuGaa(Double minRscuGaa) {
		this.minRscuGaa = minRscuGaa;
	}
	//get方法
	public Double getMinRscuGag() {
		return minRscuGag;
	}

	//set方法
	public void setMinRscuGag(Double minRscuGag) {
		this.minRscuGag = minRscuGag;
	}
	//get方法
	public Double getMinRscuGat() {
		return minRscuGat;
	}

	//set方法
	public void setMinRscuGat(Double minRscuGat) {
		this.minRscuGat = minRscuGat;
	}
	//get方法
	public Double getMinRscuGac() {
		return minRscuGac;
	}

	//set方法
	public void setMinRscuGac(Double minRscuGac) {
		this.minRscuGac = minRscuGac;
	}
	//get方法
	public Double getMinRscuCaa() {
		return minRscuCaa;
	}

	//set方法
	public void setMinRscuCaa(Double minRscuCaa) {
		this.minRscuCaa = minRscuCaa;
	}
	//get方法
	public Double getMinRscuCag() {
		return minRscuCag;
	}

	//set方法
	public void setMinRscuCag(Double minRscuCag) {
		this.minRscuCag = minRscuCag;
	}
	//get方法
	public Double getMinRscuCat() {
		return minRscuCat;
	}

	//set方法
	public void setMinRscuCat(Double minRscuCat) {
		this.minRscuCat = minRscuCat;
	}
	//get方法
	public Double getMinRscuCac() {
		return minRscuCac;
	}

	//set方法
	public void setMinRscuCac(Double minRscuCac) {
		this.minRscuCac = minRscuCac;
	}
	//get方法
	public Double getMinRscuGta() {
		return minRscuGta;
	}

	//set方法
	public void setMinRscuGta(Double minRscuGta) {
		this.minRscuGta = minRscuGta;
	}
	//get方法
	public Double getMinRscuGtg() {
		return minRscuGtg;
	}

	//set方法
	public void setMinRscuGtg(Double minRscuGtg) {
		this.minRscuGtg = minRscuGtg;
	}
	//get方法
	public Double getMinRscuGtt() {
		return minRscuGtt;
	}

	//set方法
	public void setMinRscuGtt(Double minRscuGtt) {
		this.minRscuGtt = minRscuGtt;
	}
	//get方法
	public Double getMinRscuGtc() {
		return minRscuGtc;
	}

	//set方法
	public void setMinRscuGtc(Double minRscuGtc) {
		this.minRscuGtc = minRscuGtc;
	}
	//get方法
	public Double getMinRscuCta() {
		return minRscuCta;
	}

	//set方法
	public void setMinRscuCta(Double minRscuCta) {
		this.minRscuCta = minRscuCta;
	}
	//get方法
	public Double getMinRscuCtg() {
		return minRscuCtg;
	}

	//set方法
	public void setMinRscuCtg(Double minRscuCtg) {
		this.minRscuCtg = minRscuCtg;
	}
	//get方法
	public Double getMinRscuCtt() {
		return minRscuCtt;
	}

	//set方法
	public void setMinRscuCtt(Double minRscuCtt) {
		this.minRscuCtt = minRscuCtt;
	}
	//get方法
	public Double getMinRscuCtc() {
		return minRscuCtc;
	}

	//set方法
	public void setMinRscuCtc(Double minRscuCtc) {
		this.minRscuCtc = minRscuCtc;
	}
	//get方法
	public Double getMinRscuAga() {
		return minRscuAga;
	}

	//set方法
	public void setMinRscuAga(Double minRscuAga) {
		this.minRscuAga = minRscuAga;
	}
	//get方法
	public Double getMinRscuAgg() {
		return minRscuAgg;
	}

	//set方法
	public void setMinRscuAgg(Double minRscuAgg) {
		this.minRscuAgg = minRscuAgg;
	}
	//get方法
	public Double getMinRscuAgt() {
		return minRscuAgt;
	}

	//set方法
	public void setMinRscuAgt(Double minRscuAgt) {
		this.minRscuAgt = minRscuAgt;
	}
	//get方法
	public Double getMinRscuAgc() {
		return minRscuAgc;
	}

	//set方法
	public void setMinRscuAgc(Double minRscuAgc) {
		this.minRscuAgc = minRscuAgc;
	}
	//get方法
	public Double getMinRscuTga() {
		return minRscuTga;
	}

	//set方法
	public void setMinRscuTga(Double minRscuTga) {
		this.minRscuTga = minRscuTga;
	}
	//get方法
	public Double getMinRscuTgg() {
		return minRscuTgg;
	}

	//set方法
	public void setMinRscuTgg(Double minRscuTgg) {
		this.minRscuTgg = minRscuTgg;
	}
	//get方法
	public Double getMinRscuTgt() {
		return minRscuTgt;
	}

	//set方法
	public void setMinRscuTgt(Double minRscuTgt) {
		this.minRscuTgt = minRscuTgt;
	}
	//get方法
	public Double getMinRscuTgc() {
		return minRscuTgc;
	}

	//set方法
	public void setMinRscuTgc(Double minRscuTgc) {
		this.minRscuTgc = minRscuTgc;
	}
	//get方法
	public Double getMinRscuAca() {
		return minRscuAca;
	}

	//set方法
	public void setMinRscuAca(Double minRscuAca) {
		this.minRscuAca = minRscuAca;
	}
	//get方法
	public Double getMinRscuAcg() {
		return minRscuAcg;
	}

	//set方法
	public void setMinRscuAcg(Double minRscuAcg) {
		this.minRscuAcg = minRscuAcg;
	}
	//get方法
	public Double getMinRscuAct() {
		return minRscuAct;
	}

	//set方法
	public void setMinRscuAct(Double minRscuAct) {
		this.minRscuAct = minRscuAct;
	}
	//get方法
	public Double getMinRscuAcc() {
		return minRscuAcc;
	}

	//set方法
	public void setMinRscuAcc(Double minRscuAcc) {
		this.minRscuAcc = minRscuAcc;
	}
	//get方法
	public Double getMinRscuTca() {
		return minRscuTca;
	}

	//set方法
	public void setMinRscuTca(Double minRscuTca) {
		this.minRscuTca = minRscuTca;
	}
	//get方法
	public Double getMinRscuTcg() {
		return minRscuTcg;
	}

	//set方法
	public void setMinRscuTcg(Double minRscuTcg) {
		this.minRscuTcg = minRscuTcg;
	}
	//get方法
	public Double getMinRscuTct() {
		return minRscuTct;
	}

	//set方法
	public void setMinRscuTct(Double minRscuTct) {
		this.minRscuTct = minRscuTct;
	}
	//get方法
	public Double getMinRscuTcc() {
		return minRscuTcc;
	}

	//set方法
	public void setMinRscuTcc(Double minRscuTcc) {
		this.minRscuTcc = minRscuTcc;
	}
	//get方法
	public Double getMinRscuGga() {
		return minRscuGga;
	}

	//set方法
	public void setMinRscuGga(Double minRscuGga) {
		this.minRscuGga = minRscuGga;
	}
	//get方法
	public Double getMinRscuGgg() {
		return minRscuGgg;
	}

	//set方法
	public void setMinRscuGgg(Double minRscuGgg) {
		this.minRscuGgg = minRscuGgg;
	}
	//get方法
	public Double getMinRscuGgt() {
		return minRscuGgt;
	}

	//set方法
	public void setMinRscuGgt(Double minRscuGgt) {
		this.minRscuGgt = minRscuGgt;
	}
	//get方法
	public Double getMinRscuGgc() {
		return minRscuGgc;
	}

	//set方法
	public void setMinRscuGgc(Double minRscuGgc) {
		this.minRscuGgc = minRscuGgc;
	}
	//get方法
	public Double getMinRscuCga() {
		return minRscuCga;
	}

	//set方法
	public void setMinRscuCga(Double minRscuCga) {
		this.minRscuCga = minRscuCga;
	}
	//get方法
	public Double getMinRscuCgg() {
		return minRscuCgg;
	}

	//set方法
	public void setMinRscuCgg(Double minRscuCgg) {
		this.minRscuCgg = minRscuCgg;
	}
	//get方法
	public Double getMinRscuCgt() {
		return minRscuCgt;
	}

	//set方法
	public void setMinRscuCgt(Double minRscuCgt) {
		this.minRscuCgt = minRscuCgt;
	}
	//get方法
	public Double getMinRscuCgc() {
		return minRscuCgc;
	}

	//set方法
	public void setMinRscuCgc(Double minRscuCgc) {
		this.minRscuCgc = minRscuCgc;
	}
	//get方法
	public Double getMinRscuGca() {
		return minRscuGca;
	}

	//set方法
	public void setMinRscuGca(Double minRscuGca) {
		this.minRscuGca = minRscuGca;
	}
	//get方法
	public Double getMinRscuGcg() {
		return minRscuGcg;
	}

	//set方法
	public void setMinRscuGcg(Double minRscuGcg) {
		this.minRscuGcg = minRscuGcg;
	}
	//get方法
	public Double getMinRscuGct() {
		return minRscuGct;
	}

	//set方法
	public void setMinRscuGct(Double minRscuGct) {
		this.minRscuGct = minRscuGct;
	}
	//get方法
	public Double getMinRscuGcc() {
		return minRscuGcc;
	}

	//set方法
	public void setMinRscuGcc(Double minRscuGcc) {
		this.minRscuGcc = minRscuGcc;
	}
	//get方法
	public Double getMinRscuCca() {
		return minRscuCca;
	}

	//set方法
	public void setMinRscuCca(Double minRscuCca) {
		this.minRscuCca = minRscuCca;
	}
	//get方法
	public Double getMinRscuCcg() {
		return minRscuCcg;
	}

	//set方法
	public void setMinRscuCcg(Double minRscuCcg) {
		this.minRscuCcg = minRscuCcg;
	}
	//get方法
	public Double getMinRscuCct() {
		return minRscuCct;
	}

	//set方法
	public void setMinRscuCct(Double minRscuCct) {
		this.minRscuCct = minRscuCct;
	}
	//get方法
	public Double getMinRscuCcc() {
		return minRscuCcc;
	}

	//set方法
	public void setMinRscuCcc(Double minRscuCcc) {
		this.minRscuCcc = minRscuCcc;
	}
	//get方法
	public Double getTrueminRscuAaa() {
		return trueminRscuAaa;
	}

	//set方法
	public void setTrueminRscuAaa(Double trueminRscuAaa) {
		this.trueminRscuAaa = trueminRscuAaa;
	}
	//get方法
	public Double getTrueminRscuAag() {
		return trueminRscuAag;
	}

	//set方法
	public void setTrueminRscuAag(Double trueminRscuAag) {
		this.trueminRscuAag = trueminRscuAag;
	}
	//get方法
	public Double getTrueminRscuAat() {
		return trueminRscuAat;
	}

	//set方法
	public void setTrueminRscuAat(Double trueminRscuAat) {
		this.trueminRscuAat = trueminRscuAat;
	}
	//get方法
	public Double getTrueminRscuAac() {
		return trueminRscuAac;
	}

	//set方法
	public void setTrueminRscuAac(Double trueminRscuAac) {
		this.trueminRscuAac = trueminRscuAac;
	}
	//get方法
	public Double getTrueminRscuTaa() {
		return trueminRscuTaa;
	}

	//set方法
	public void setTrueminRscuTaa(Double trueminRscuTaa) {
		this.trueminRscuTaa = trueminRscuTaa;
	}
	//get方法
	public Double getTrueminRscuTag() {
		return trueminRscuTag;
	}

	//set方法
	public void setTrueminRscuTag(Double trueminRscuTag) {
		this.trueminRscuTag = trueminRscuTag;
	}
	//get方法
	public Double getTrueminRscuTat() {
		return trueminRscuTat;
	}

	//set方法
	public void setTrueminRscuTat(Double trueminRscuTat) {
		this.trueminRscuTat = trueminRscuTat;
	}
	//get方法
	public Double getTrueminRscuTac() {
		return trueminRscuTac;
	}

	//set方法
	public void setTrueminRscuTac(Double trueminRscuTac) {
		this.trueminRscuTac = trueminRscuTac;
	}
	//get方法
	public Double getTrueminRscuAta() {
		return trueminRscuAta;
	}

	//set方法
	public void setTrueminRscuAta(Double trueminRscuAta) {
		this.trueminRscuAta = trueminRscuAta;
	}
	//get方法
	public Double getTrueminRscuAtg() {
		return trueminRscuAtg;
	}

	//set方法
	public void setTrueminRscuAtg(Double trueminRscuAtg) {
		this.trueminRscuAtg = trueminRscuAtg;
	}
	//get方法
	public Double getTrueminRscuAtt() {
		return trueminRscuAtt;
	}

	//set方法
	public void setTrueminRscuAtt(Double trueminRscuAtt) {
		this.trueminRscuAtt = trueminRscuAtt;
	}
	//get方法
	public Double getTrueminRscuAtc() {
		return trueminRscuAtc;
	}

	//set方法
	public void setTrueminRscuAtc(Double trueminRscuAtc) {
		this.trueminRscuAtc = trueminRscuAtc;
	}
	//get方法
	public Double getTrueminRscuTta() {
		return trueminRscuTta;
	}

	//set方法
	public void setTrueminRscuTta(Double trueminRscuTta) {
		this.trueminRscuTta = trueminRscuTta;
	}
	//get方法
	public Double getTrueminRscuTtg() {
		return trueminRscuTtg;
	}

	//set方法
	public void setTrueminRscuTtg(Double trueminRscuTtg) {
		this.trueminRscuTtg = trueminRscuTtg;
	}
	//get方法
	public Double getTrueminRscuTtt() {
		return trueminRscuTtt;
	}

	//set方法
	public void setTrueminRscuTtt(Double trueminRscuTtt) {
		this.trueminRscuTtt = trueminRscuTtt;
	}
	//get方法
	public Double getTrueminRscuTtc() {
		return trueminRscuTtc;
	}

	//set方法
	public void setTrueminRscuTtc(Double trueminRscuTtc) {
		this.trueminRscuTtc = trueminRscuTtc;
	}
	//get方法
	public Double getTrueminRscuGaa() {
		return trueminRscuGaa;
	}

	//set方法
	public void setTrueminRscuGaa(Double trueminRscuGaa) {
		this.trueminRscuGaa = trueminRscuGaa;
	}
	//get方法
	public Double getTrueminRscuGag() {
		return trueminRscuGag;
	}

	//set方法
	public void setTrueminRscuGag(Double trueminRscuGag) {
		this.trueminRscuGag = trueminRscuGag;
	}
	//get方法
	public Double getTrueminRscuGat() {
		return trueminRscuGat;
	}

	//set方法
	public void setTrueminRscuGat(Double trueminRscuGat) {
		this.trueminRscuGat = trueminRscuGat;
	}
	//get方法
	public Double getTrueminRscuGac() {
		return trueminRscuGac;
	}

	//set方法
	public void setTrueminRscuGac(Double trueminRscuGac) {
		this.trueminRscuGac = trueminRscuGac;
	}
	//get方法
	public Double getTrueminRscuCaa() {
		return trueminRscuCaa;
	}

	//set方法
	public void setTrueminRscuCaa(Double trueminRscuCaa) {
		this.trueminRscuCaa = trueminRscuCaa;
	}
	//get方法
	public Double getTrueminRscuCag() {
		return trueminRscuCag;
	}

	//set方法
	public void setTrueminRscuCag(Double trueminRscuCag) {
		this.trueminRscuCag = trueminRscuCag;
	}
	//get方法
	public Double getTrueminRscuCat() {
		return trueminRscuCat;
	}

	//set方法
	public void setTrueminRscuCat(Double trueminRscuCat) {
		this.trueminRscuCat = trueminRscuCat;
	}
	//get方法
	public Double getTrueminRscuCac() {
		return trueminRscuCac;
	}

	//set方法
	public void setTrueminRscuCac(Double trueminRscuCac) {
		this.trueminRscuCac = trueminRscuCac;
	}
	//get方法
	public Double getTrueminRscuGta() {
		return trueminRscuGta;
	}

	//set方法
	public void setTrueminRscuGta(Double trueminRscuGta) {
		this.trueminRscuGta = trueminRscuGta;
	}
	//get方法
	public Double getTrueminRscuGtg() {
		return trueminRscuGtg;
	}

	//set方法
	public void setTrueminRscuGtg(Double trueminRscuGtg) {
		this.trueminRscuGtg = trueminRscuGtg;
	}
	//get方法
	public Double getTrueminRscuGtt() {
		return trueminRscuGtt;
	}

	//set方法
	public void setTrueminRscuGtt(Double trueminRscuGtt) {
		this.trueminRscuGtt = trueminRscuGtt;
	}
	//get方法
	public Double getTrueminRscuGtc() {
		return trueminRscuGtc;
	}

	//set方法
	public void setTrueminRscuGtc(Double trueminRscuGtc) {
		this.trueminRscuGtc = trueminRscuGtc;
	}
	//get方法
	public Double getTrueminRscuCta() {
		return trueminRscuCta;
	}

	//set方法
	public void setTrueminRscuCta(Double trueminRscuCta) {
		this.trueminRscuCta = trueminRscuCta;
	}
	//get方法
	public Double getTrueminRscuCtg() {
		return trueminRscuCtg;
	}

	//set方法
	public void setTrueminRscuCtg(Double trueminRscuCtg) {
		this.trueminRscuCtg = trueminRscuCtg;
	}
	//get方法
	public Double getTrueminRscuCtt() {
		return trueminRscuCtt;
	}

	//set方法
	public void setTrueminRscuCtt(Double trueminRscuCtt) {
		this.trueminRscuCtt = trueminRscuCtt;
	}
	//get方法
	public Double getTrueminRscuCtc() {
		return trueminRscuCtc;
	}

	//set方法
	public void setTrueminRscuCtc(Double trueminRscuCtc) {
		this.trueminRscuCtc = trueminRscuCtc;
	}
	//get方法
	public Double getTrueminRscuAga() {
		return trueminRscuAga;
	}

	//set方法
	public void setTrueminRscuAga(Double trueminRscuAga) {
		this.trueminRscuAga = trueminRscuAga;
	}
	//get方法
	public Double getTrueminRscuAgg() {
		return trueminRscuAgg;
	}

	//set方法
	public void setTrueminRscuAgg(Double trueminRscuAgg) {
		this.trueminRscuAgg = trueminRscuAgg;
	}
	//get方法
	public Double getTrueminRscuAgt() {
		return trueminRscuAgt;
	}

	//set方法
	public void setTrueminRscuAgt(Double trueminRscuAgt) {
		this.trueminRscuAgt = trueminRscuAgt;
	}
	//get方法
	public Double getTrueminRscuAgc() {
		return trueminRscuAgc;
	}

	//set方法
	public void setTrueminRscuAgc(Double trueminRscuAgc) {
		this.trueminRscuAgc = trueminRscuAgc;
	}
	//get方法
	public Double getTrueminRscuTga() {
		return trueminRscuTga;
	}

	//set方法
	public void setTrueminRscuTga(Double trueminRscuTga) {
		this.trueminRscuTga = trueminRscuTga;
	}
	//get方法
	public Double getTrueminRscuTgg() {
		return trueminRscuTgg;
	}

	//set方法
	public void setTrueminRscuTgg(Double trueminRscuTgg) {
		this.trueminRscuTgg = trueminRscuTgg;
	}
	//get方法
	public Double getTrueminRscuTgt() {
		return trueminRscuTgt;
	}

	//set方法
	public void setTrueminRscuTgt(Double trueminRscuTgt) {
		this.trueminRscuTgt = trueminRscuTgt;
	}
	//get方法
	public Double getTrueminRscuTgc() {
		return trueminRscuTgc;
	}

	//set方法
	public void setTrueminRscuTgc(Double trueminRscuTgc) {
		this.trueminRscuTgc = trueminRscuTgc;
	}
	//get方法
	public Double getTrueminRscuAca() {
		return trueminRscuAca;
	}

	//set方法
	public void setTrueminRscuAca(Double trueminRscuAca) {
		this.trueminRscuAca = trueminRscuAca;
	}
	//get方法
	public Double getTrueminRscuAcg() {
		return trueminRscuAcg;
	}

	//set方法
	public void setTrueminRscuAcg(Double trueminRscuAcg) {
		this.trueminRscuAcg = trueminRscuAcg;
	}
	//get方法
	public Double getTrueminRscuAct() {
		return trueminRscuAct;
	}

	//set方法
	public void setTrueminRscuAct(Double trueminRscuAct) {
		this.trueminRscuAct = trueminRscuAct;
	}
	//get方法
	public Double getTrueminRscuAcc() {
		return trueminRscuAcc;
	}

	//set方法
	public void setTrueminRscuAcc(Double trueminRscuAcc) {
		this.trueminRscuAcc = trueminRscuAcc;
	}
	//get方法
	public Double getTrueminRscuTca() {
		return trueminRscuTca;
	}

	//set方法
	public void setTrueminRscuTca(Double trueminRscuTca) {
		this.trueminRscuTca = trueminRscuTca;
	}
	//get方法
	public Double getTrueminRscuTcg() {
		return trueminRscuTcg;
	}

	//set方法
	public void setTrueminRscuTcg(Double trueminRscuTcg) {
		this.trueminRscuTcg = trueminRscuTcg;
	}
	//get方法
	public Double getTrueminRscuTct() {
		return trueminRscuTct;
	}

	//set方法
	public void setTrueminRscuTct(Double trueminRscuTct) {
		this.trueminRscuTct = trueminRscuTct;
	}
	//get方法
	public Double getTrueminRscuTcc() {
		return trueminRscuTcc;
	}

	//set方法
	public void setTrueminRscuTcc(Double trueminRscuTcc) {
		this.trueminRscuTcc = trueminRscuTcc;
	}
	//get方法
	public Double getTrueminRscuGga() {
		return trueminRscuGga;
	}

	//set方法
	public void setTrueminRscuGga(Double trueminRscuGga) {
		this.trueminRscuGga = trueminRscuGga;
	}
	//get方法
	public Double getTrueminRscuGgg() {
		return trueminRscuGgg;
	}

	//set方法
	public void setTrueminRscuGgg(Double trueminRscuGgg) {
		this.trueminRscuGgg = trueminRscuGgg;
	}
	//get方法
	public Double getTrueminRscuGgt() {
		return trueminRscuGgt;
	}

	//set方法
	public void setTrueminRscuGgt(Double trueminRscuGgt) {
		this.trueminRscuGgt = trueminRscuGgt;
	}
	//get方法
	public Double getTrueminRscuGgc() {
		return trueminRscuGgc;
	}

	//set方法
	public void setTrueminRscuGgc(Double trueminRscuGgc) {
		this.trueminRscuGgc = trueminRscuGgc;
	}
	//get方法
	public Double getTrueminRscuCga() {
		return trueminRscuCga;
	}

	//set方法
	public void setTrueminRscuCga(Double trueminRscuCga) {
		this.trueminRscuCga = trueminRscuCga;
	}
	//get方法
	public Double getTrueminRscuCgg() {
		return trueminRscuCgg;
	}

	//set方法
	public void setTrueminRscuCgg(Double trueminRscuCgg) {
		this.trueminRscuCgg = trueminRscuCgg;
	}
	//get方法
	public Double getTrueminRscuCgt() {
		return trueminRscuCgt;
	}

	//set方法
	public void setTrueminRscuCgt(Double trueminRscuCgt) {
		this.trueminRscuCgt = trueminRscuCgt;
	}
	//get方法
	public Double getTrueminRscuCgc() {
		return trueminRscuCgc;
	}

	//set方法
	public void setTrueminRscuCgc(Double trueminRscuCgc) {
		this.trueminRscuCgc = trueminRscuCgc;
	}
	//get方法
	public Double getTrueminRscuGca() {
		return trueminRscuGca;
	}

	//set方法
	public void setTrueminRscuGca(Double trueminRscuGca) {
		this.trueminRscuGca = trueminRscuGca;
	}
	//get方法
	public Double getTrueminRscuGcg() {
		return trueminRscuGcg;
	}

	//set方法
	public void setTrueminRscuGcg(Double trueminRscuGcg) {
		this.trueminRscuGcg = trueminRscuGcg;
	}
	//get方法
	public Double getTrueminRscuGct() {
		return trueminRscuGct;
	}

	//set方法
	public void setTrueminRscuGct(Double trueminRscuGct) {
		this.trueminRscuGct = trueminRscuGct;
	}
	//get方法
	public Double getTrueminRscuGcc() {
		return trueminRscuGcc;
	}

	//set方法
	public void setTrueminRscuGcc(Double trueminRscuGcc) {
		this.trueminRscuGcc = trueminRscuGcc;
	}
	//get方法
	public Double getTrueminRscuCca() {
		return trueminRscuCca;
	}

	//set方法
	public void setTrueminRscuCca(Double trueminRscuCca) {
		this.trueminRscuCca = trueminRscuCca;
	}
	//get方法
	public Double getTrueminRscuCcg() {
		return trueminRscuCcg;
	}

	//set方法
	public void setTrueminRscuCcg(Double trueminRscuCcg) {
		this.trueminRscuCcg = trueminRscuCcg;
	}
	//get方法
	public Double getTrueminRscuCct() {
		return trueminRscuCct;
	}

	//set方法
	public void setTrueminRscuCct(Double trueminRscuCct) {
		this.trueminRscuCct = trueminRscuCct;
	}
	//get方法
	public Double getTrueminRscuCcc() {
		return trueminRscuCcc;
	}

	//set方法
	public void setTrueminRscuCcc(Double trueminRscuCcc) {
		this.trueminRscuCcc = trueminRscuCcc;
	}
	//get方法
	public Double getX05qRscuAaa() {
		return X05qRscuAaa;
	}

	//set方法
	public void setX05qRscuAaa(Double X05qRscuAaa) {
		this.X05qRscuAaa = X05qRscuAaa;
	}
	//get方法
	public Double getX05qRscuAag() {
		return X05qRscuAag;
	}

	//set方法
	public void setX05qRscuAag(Double X05qRscuAag) {
		this.X05qRscuAag = X05qRscuAag;
	}
	//get方法
	public Double getX05qRscuAat() {
		return X05qRscuAat;
	}

	//set方法
	public void setX05qRscuAat(Double X05qRscuAat) {
		this.X05qRscuAat = X05qRscuAat;
	}
	//get方法
	public Double getX05qRscuAac() {
		return X05qRscuAac;
	}

	//set方法
	public void setX05qRscuAac(Double X05qRscuAac) {
		this.X05qRscuAac = X05qRscuAac;
	}
	//get方法
	public Double getX05qRscuTaa() {
		return X05qRscuTaa;
	}

	//set方法
	public void setX05qRscuTaa(Double X05qRscuTaa) {
		this.X05qRscuTaa = X05qRscuTaa;
	}
	//get方法
	public Double getX05qRscuTag() {
		return X05qRscuTag;
	}

	//set方法
	public void setX05qRscuTag(Double X05qRscuTag) {
		this.X05qRscuTag = X05qRscuTag;
	}
	//get方法
	public Double getX05qRscuTat() {
		return X05qRscuTat;
	}

	//set方法
	public void setX05qRscuTat(Double X05qRscuTat) {
		this.X05qRscuTat = X05qRscuTat;
	}
	//get方法
	public Double getX05qRscuTac() {
		return X05qRscuTac;
	}

	//set方法
	public void setX05qRscuTac(Double X05qRscuTac) {
		this.X05qRscuTac = X05qRscuTac;
	}
	//get方法
	public Double getX05qRscuAta() {
		return X05qRscuAta;
	}

	//set方法
	public void setX05qRscuAta(Double X05qRscuAta) {
		this.X05qRscuAta = X05qRscuAta;
	}
	//get方法
	public Double getX05qRscuAtg() {
		return X05qRscuAtg;
	}

	//set方法
	public void setX05qRscuAtg(Double X05qRscuAtg) {
		this.X05qRscuAtg = X05qRscuAtg;
	}
	//get方法
	public Double getX05qRscuAtt() {
		return X05qRscuAtt;
	}

	//set方法
	public void setX05qRscuAtt(Double X05qRscuAtt) {
		this.X05qRscuAtt = X05qRscuAtt;
	}
	//get方法
	public Double getX05qRscuAtc() {
		return X05qRscuAtc;
	}

	//set方法
	public void setX05qRscuAtc(Double X05qRscuAtc) {
		this.X05qRscuAtc = X05qRscuAtc;
	}
	//get方法
	public Double getX05qRscuTta() {
		return X05qRscuTta;
	}

	//set方法
	public void setX05qRscuTta(Double X05qRscuTta) {
		this.X05qRscuTta = X05qRscuTta;
	}
	//get方法
	public Double getX05qRscuTtg() {
		return X05qRscuTtg;
	}

	//set方法
	public void setX05qRscuTtg(Double X05qRscuTtg) {
		this.X05qRscuTtg = X05qRscuTtg;
	}
	//get方法
	public Double getX05qRscuTtt() {
		return X05qRscuTtt;
	}

	//set方法
	public void setX05qRscuTtt(Double X05qRscuTtt) {
		this.X05qRscuTtt = X05qRscuTtt;
	}
	//get方法
	public Double getX05qRscuTtc() {
		return X05qRscuTtc;
	}

	//set方法
	public void setX05qRscuTtc(Double X05qRscuTtc) {
		this.X05qRscuTtc = X05qRscuTtc;
	}
	//get方法
	public Double getX05qRscuGaa() {
		return X05qRscuGaa;
	}

	//set方法
	public void setX05qRscuGaa(Double X05qRscuGaa) {
		this.X05qRscuGaa = X05qRscuGaa;
	}
	//get方法
	public Double getX05qRscuGag() {
		return X05qRscuGag;
	}

	//set方法
	public void setX05qRscuGag(Double X05qRscuGag) {
		this.X05qRscuGag = X05qRscuGag;
	}
	//get方法
	public Double getX05qRscuGat() {
		return X05qRscuGat;
	}

	//set方法
	public void setX05qRscuGat(Double X05qRscuGat) {
		this.X05qRscuGat = X05qRscuGat;
	}
	//get方法
	public Double getX05qRscuGac() {
		return X05qRscuGac;
	}

	//set方法
	public void setX05qRscuGac(Double X05qRscuGac) {
		this.X05qRscuGac = X05qRscuGac;
	}
	//get方法
	public Double getX05qRscuCaa() {
		return X05qRscuCaa;
	}

	//set方法
	public void setX05qRscuCaa(Double X05qRscuCaa) {
		this.X05qRscuCaa = X05qRscuCaa;
	}
	//get方法
	public Double getX05qRscuCag() {
		return X05qRscuCag;
	}

	//set方法
	public void setX05qRscuCag(Double X05qRscuCag) {
		this.X05qRscuCag = X05qRscuCag;
	}
	//get方法
	public Double getX05qRscuCat() {
		return X05qRscuCat;
	}

	//set方法
	public void setX05qRscuCat(Double X05qRscuCat) {
		this.X05qRscuCat = X05qRscuCat;
	}
	//get方法
	public Double getX05qRscuCac() {
		return X05qRscuCac;
	}

	//set方法
	public void setX05qRscuCac(Double X05qRscuCac) {
		this.X05qRscuCac = X05qRscuCac;
	}
	//get方法
	public Double getX05qRscuGta() {
		return X05qRscuGta;
	}

	//set方法
	public void setX05qRscuGta(Double X05qRscuGta) {
		this.X05qRscuGta = X05qRscuGta;
	}
	//get方法
	public Double getX05qRscuGtg() {
		return X05qRscuGtg;
	}

	//set方法
	public void setX05qRscuGtg(Double X05qRscuGtg) {
		this.X05qRscuGtg = X05qRscuGtg;
	}
	//get方法
	public Double getX05qRscuGtt() {
		return X05qRscuGtt;
	}

	//set方法
	public void setX05qRscuGtt(Double X05qRscuGtt) {
		this.X05qRscuGtt = X05qRscuGtt;
	}
	//get方法
	public Double getX05qRscuGtc() {
		return X05qRscuGtc;
	}

	//set方法
	public void setX05qRscuGtc(Double X05qRscuGtc) {
		this.X05qRscuGtc = X05qRscuGtc;
	}
	//get方法
	public Double getX05qRscuCta() {
		return X05qRscuCta;
	}

	//set方法
	public void setX05qRscuCta(Double X05qRscuCta) {
		this.X05qRscuCta = X05qRscuCta;
	}
	//get方法
	public Double getX05qRscuCtg() {
		return X05qRscuCtg;
	}

	//set方法
	public void setX05qRscuCtg(Double X05qRscuCtg) {
		this.X05qRscuCtg = X05qRscuCtg;
	}
	//get方法
	public Double getX05qRscuCtt() {
		return X05qRscuCtt;
	}

	//set方法
	public void setX05qRscuCtt(Double X05qRscuCtt) {
		this.X05qRscuCtt = X05qRscuCtt;
	}
	//get方法
	public Double getX05qRscuCtc() {
		return X05qRscuCtc;
	}

	//set方法
	public void setX05qRscuCtc(Double X05qRscuCtc) {
		this.X05qRscuCtc = X05qRscuCtc;
	}
	//get方法
	public Double getX05qRscuAga() {
		return X05qRscuAga;
	}

	//set方法
	public void setX05qRscuAga(Double X05qRscuAga) {
		this.X05qRscuAga = X05qRscuAga;
	}
	//get方法
	public Double getX05qRscuAgg() {
		return X05qRscuAgg;
	}

	//set方法
	public void setX05qRscuAgg(Double X05qRscuAgg) {
		this.X05qRscuAgg = X05qRscuAgg;
	}
	//get方法
	public Double getX05qRscuAgt() {
		return X05qRscuAgt;
	}

	//set方法
	public void setX05qRscuAgt(Double X05qRscuAgt) {
		this.X05qRscuAgt = X05qRscuAgt;
	}
	//get方法
	public Double getX05qRscuAgc() {
		return X05qRscuAgc;
	}

	//set方法
	public void setX05qRscuAgc(Double X05qRscuAgc) {
		this.X05qRscuAgc = X05qRscuAgc;
	}
	//get方法
	public Double getX05qRscuTga() {
		return X05qRscuTga;
	}

	//set方法
	public void setX05qRscuTga(Double X05qRscuTga) {
		this.X05qRscuTga = X05qRscuTga;
	}
	//get方法
	public Double getX05qRscuTgg() {
		return X05qRscuTgg;
	}

	//set方法
	public void setX05qRscuTgg(Double X05qRscuTgg) {
		this.X05qRscuTgg = X05qRscuTgg;
	}
	//get方法
	public Double getX05qRscuTgt() {
		return X05qRscuTgt;
	}

	//set方法
	public void setX05qRscuTgt(Double X05qRscuTgt) {
		this.X05qRscuTgt = X05qRscuTgt;
	}
	//get方法
	public Double getX05qRscuTgc() {
		return X05qRscuTgc;
	}

	//set方法
	public void setX05qRscuTgc(Double X05qRscuTgc) {
		this.X05qRscuTgc = X05qRscuTgc;
	}
	//get方法
	public Double getX05qRscuAca() {
		return X05qRscuAca;
	}

	//set方法
	public void setX05qRscuAca(Double X05qRscuAca) {
		this.X05qRscuAca = X05qRscuAca;
	}
	//get方法
	public Double getX05qRscuAcg() {
		return X05qRscuAcg;
	}

	//set方法
	public void setX05qRscuAcg(Double X05qRscuAcg) {
		this.X05qRscuAcg = X05qRscuAcg;
	}
	//get方法
	public Double getX05qRscuAct() {
		return X05qRscuAct;
	}

	//set方法
	public void setX05qRscuAct(Double X05qRscuAct) {
		this.X05qRscuAct = X05qRscuAct;
	}
	//get方法
	public Double getX05qRscuAcc() {
		return X05qRscuAcc;
	}

	//set方法
	public void setX05qRscuAcc(Double X05qRscuAcc) {
		this.X05qRscuAcc = X05qRscuAcc;
	}
	//get方法
	public Double getX05qRscuTca() {
		return X05qRscuTca;
	}

	//set方法
	public void setX05qRscuTca(Double X05qRscuTca) {
		this.X05qRscuTca = X05qRscuTca;
	}
	//get方法
	public Double getX05qRscuTcg() {
		return X05qRscuTcg;
	}

	//set方法
	public void setX05qRscuTcg(Double X05qRscuTcg) {
		this.X05qRscuTcg = X05qRscuTcg;
	}
	//get方法
	public Double getX05qRscuTct() {
		return X05qRscuTct;
	}

	//set方法
	public void setX05qRscuTct(Double X05qRscuTct) {
		this.X05qRscuTct = X05qRscuTct;
	}
	//get方法
	public Double getX05qRscuTcc() {
		return X05qRscuTcc;
	}

	//set方法
	public void setX05qRscuTcc(Double X05qRscuTcc) {
		this.X05qRscuTcc = X05qRscuTcc;
	}
	//get方法
	public Double getX05qRscuGga() {
		return X05qRscuGga;
	}

	//set方法
	public void setX05qRscuGga(Double X05qRscuGga) {
		this.X05qRscuGga = X05qRscuGga;
	}
	//get方法
	public Double getX05qRscuGgg() {
		return X05qRscuGgg;
	}

	//set方法
	public void setX05qRscuGgg(Double X05qRscuGgg) {
		this.X05qRscuGgg = X05qRscuGgg;
	}
	//get方法
	public Double getX05qRscuGgt() {
		return X05qRscuGgt;
	}

	//set方法
	public void setX05qRscuGgt(Double X05qRscuGgt) {
		this.X05qRscuGgt = X05qRscuGgt;
	}
	//get方法
	public Double getX05qRscuGgc() {
		return X05qRscuGgc;
	}

	//set方法
	public void setX05qRscuGgc(Double X05qRscuGgc) {
		this.X05qRscuGgc = X05qRscuGgc;
	}
	//get方法
	public Double getX05qRscuCga() {
		return X05qRscuCga;
	}

	//set方法
	public void setX05qRscuCga(Double X05qRscuCga) {
		this.X05qRscuCga = X05qRscuCga;
	}
	//get方法
	public Double getX05qRscuCgg() {
		return X05qRscuCgg;
	}

	//set方法
	public void setX05qRscuCgg(Double X05qRscuCgg) {
		this.X05qRscuCgg = X05qRscuCgg;
	}
	//get方法
	public Double getX05qRscuCgt() {
		return X05qRscuCgt;
	}

	//set方法
	public void setX05qRscuCgt(Double X05qRscuCgt) {
		this.X05qRscuCgt = X05qRscuCgt;
	}
	//get方法
	public Double getX05qRscuCgc() {
		return X05qRscuCgc;
	}

	//set方法
	public void setX05qRscuCgc(Double X05qRscuCgc) {
		this.X05qRscuCgc = X05qRscuCgc;
	}
	//get方法
	public Double getX05qRscuGca() {
		return X05qRscuGca;
	}

	//set方法
	public void setX05qRscuGca(Double X05qRscuGca) {
		this.X05qRscuGca = X05qRscuGca;
	}
	//get方法
	public Double getX05qRscuGcg() {
		return X05qRscuGcg;
	}

	//set方法
	public void setX05qRscuGcg(Double X05qRscuGcg) {
		this.X05qRscuGcg = X05qRscuGcg;
	}
	//get方法
	public Double getX05qRscuGct() {
		return X05qRscuGct;
	}

	//set方法
	public void setX05qRscuGct(Double X05qRscuGct) {
		this.X05qRscuGct = X05qRscuGct;
	}
	//get方法
	public Double getX05qRscuGcc() {
		return X05qRscuGcc;
	}

	//set方法
	public void setX05qRscuGcc(Double X05qRscuGcc) {
		this.X05qRscuGcc = X05qRscuGcc;
	}
	//get方法
	public Double getX05qRscuCca() {
		return X05qRscuCca;
	}

	//set方法
	public void setX05qRscuCca(Double X05qRscuCca) {
		this.X05qRscuCca = X05qRscuCca;
	}
	//get方法
	public Double getX05qRscuCcg() {
		return X05qRscuCcg;
	}

	//set方法
	public void setX05qRscuCcg(Double X05qRscuCcg) {
		this.X05qRscuCcg = X05qRscuCcg;
	}
	//get方法
	public Double getX05qRscuCct() {
		return X05qRscuCct;
	}

	//set方法
	public void setX05qRscuCct(Double X05qRscuCct) {
		this.X05qRscuCct = X05qRscuCct;
	}
	//get方法
	public Double getX05qRscuCcc() {
		return X05qRscuCcc;
	}

	//set方法
	public void setX05qRscuCcc(Double X05qRscuCcc) {
		this.X05qRscuCcc = X05qRscuCcc;
	}
	//get方法
	public Double getX25qRscuAaa() {
		return X25qRscuAaa;
	}

	//set方法
	public void setX25qRscuAaa(Double X25qRscuAaa) {
		this.X25qRscuAaa = X25qRscuAaa;
	}
	//get方法
	public Double getX25qRscuAag() {
		return X25qRscuAag;
	}

	//set方法
	public void setX25qRscuAag(Double X25qRscuAag) {
		this.X25qRscuAag = X25qRscuAag;
	}
	//get方法
	public Double getX25qRscuAat() {
		return X25qRscuAat;
	}

	//set方法
	public void setX25qRscuAat(Double X25qRscuAat) {
		this.X25qRscuAat = X25qRscuAat;
	}
	//get方法
	public Double getX25qRscuAac() {
		return X25qRscuAac;
	}

	//set方法
	public void setX25qRscuAac(Double X25qRscuAac) {
		this.X25qRscuAac = X25qRscuAac;
	}
	//get方法
	public Double getX25qRscuTaa() {
		return X25qRscuTaa;
	}

	//set方法
	public void setX25qRscuTaa(Double X25qRscuTaa) {
		this.X25qRscuTaa = X25qRscuTaa;
	}
	//get方法
	public Double getX25qRscuTag() {
		return X25qRscuTag;
	}

	//set方法
	public void setX25qRscuTag(Double X25qRscuTag) {
		this.X25qRscuTag = X25qRscuTag;
	}
	//get方法
	public Double getX25qRscuTat() {
		return X25qRscuTat;
	}

	//set方法
	public void setX25qRscuTat(Double X25qRscuTat) {
		this.X25qRscuTat = X25qRscuTat;
	}
	//get方法
	public Double getX25qRscuTac() {
		return X25qRscuTac;
	}

	//set方法
	public void setX25qRscuTac(Double X25qRscuTac) {
		this.X25qRscuTac = X25qRscuTac;
	}
	//get方法
	public Double getX25qRscuAta() {
		return X25qRscuAta;
	}

	//set方法
	public void setX25qRscuAta(Double X25qRscuAta) {
		this.X25qRscuAta = X25qRscuAta;
	}
	//get方法
	public Double getX25qRscuAtg() {
		return X25qRscuAtg;
	}

	//set方法
	public void setX25qRscuAtg(Double X25qRscuAtg) {
		this.X25qRscuAtg = X25qRscuAtg;
	}
	//get方法
	public Double getX25qRscuAtt() {
		return X25qRscuAtt;
	}

	//set方法
	public void setX25qRscuAtt(Double X25qRscuAtt) {
		this.X25qRscuAtt = X25qRscuAtt;
	}
	//get方法
	public Double getX25qRscuAtc() {
		return X25qRscuAtc;
	}

	//set方法
	public void setX25qRscuAtc(Double X25qRscuAtc) {
		this.X25qRscuAtc = X25qRscuAtc;
	}
	//get方法
	public Double getX25qRscuTta() {
		return X25qRscuTta;
	}

	//set方法
	public void setX25qRscuTta(Double X25qRscuTta) {
		this.X25qRscuTta = X25qRscuTta;
	}
	//get方法
	public Double getX25qRscuTtg() {
		return X25qRscuTtg;
	}

	//set方法
	public void setX25qRscuTtg(Double X25qRscuTtg) {
		this.X25qRscuTtg = X25qRscuTtg;
	}
	//get方法
	public Double getX25qRscuTtt() {
		return X25qRscuTtt;
	}

	//set方法
	public void setX25qRscuTtt(Double X25qRscuTtt) {
		this.X25qRscuTtt = X25qRscuTtt;
	}
	//get方法
	public Double getX25qRscuTtc() {
		return X25qRscuTtc;
	}

	//set方法
	public void setX25qRscuTtc(Double X25qRscuTtc) {
		this.X25qRscuTtc = X25qRscuTtc;
	}
	//get方法
	public Double getX25qRscuGaa() {
		return X25qRscuGaa;
	}

	//set方法
	public void setX25qRscuGaa(Double X25qRscuGaa) {
		this.X25qRscuGaa = X25qRscuGaa;
	}
	//get方法
	public Double getX25qRscuGag() {
		return X25qRscuGag;
	}

	//set方法
	public void setX25qRscuGag(Double X25qRscuGag) {
		this.X25qRscuGag = X25qRscuGag;
	}
	//get方法
	public Double getX25qRscuGat() {
		return X25qRscuGat;
	}

	//set方法
	public void setX25qRscuGat(Double X25qRscuGat) {
		this.X25qRscuGat = X25qRscuGat;
	}
	//get方法
	public Double getX25qRscuGac() {
		return X25qRscuGac;
	}

	//set方法
	public void setX25qRscuGac(Double X25qRscuGac) {
		this.X25qRscuGac = X25qRscuGac;
	}
	//get方法
	public Double getX25qRscuCaa() {
		return X25qRscuCaa;
	}

	//set方法
	public void setX25qRscuCaa(Double X25qRscuCaa) {
		this.X25qRscuCaa = X25qRscuCaa;
	}
	//get方法
	public Double getX25qRscuCag() {
		return X25qRscuCag;
	}

	//set方法
	public void setX25qRscuCag(Double X25qRscuCag) {
		this.X25qRscuCag = X25qRscuCag;
	}
	//get方法
	public Double getX25qRscuCat() {
		return X25qRscuCat;
	}

	//set方法
	public void setX25qRscuCat(Double X25qRscuCat) {
		this.X25qRscuCat = X25qRscuCat;
	}
	//get方法
	public Double getX25qRscuCac() {
		return X25qRscuCac;
	}

	//set方法
	public void setX25qRscuCac(Double X25qRscuCac) {
		this.X25qRscuCac = X25qRscuCac;
	}
	//get方法
	public Double getX25qRscuGta() {
		return X25qRscuGta;
	}

	//set方法
	public void setX25qRscuGta(Double X25qRscuGta) {
		this.X25qRscuGta = X25qRscuGta;
	}
	//get方法
	public Double getX25qRscuGtg() {
		return X25qRscuGtg;
	}

	//set方法
	public void setX25qRscuGtg(Double X25qRscuGtg) {
		this.X25qRscuGtg = X25qRscuGtg;
	}
	//get方法
	public Double getX25qRscuGtt() {
		return X25qRscuGtt;
	}

	//set方法
	public void setX25qRscuGtt(Double X25qRscuGtt) {
		this.X25qRscuGtt = X25qRscuGtt;
	}
	//get方法
	public Double getX25qRscuGtc() {
		return X25qRscuGtc;
	}

	//set方法
	public void setX25qRscuGtc(Double X25qRscuGtc) {
		this.X25qRscuGtc = X25qRscuGtc;
	}
	//get方法
	public Double getX25qRscuCta() {
		return X25qRscuCta;
	}

	//set方法
	public void setX25qRscuCta(Double X25qRscuCta) {
		this.X25qRscuCta = X25qRscuCta;
	}
	//get方法
	public Double getX25qRscuCtg() {
		return X25qRscuCtg;
	}

	//set方法
	public void setX25qRscuCtg(Double X25qRscuCtg) {
		this.X25qRscuCtg = X25qRscuCtg;
	}
	//get方法
	public Double getX25qRscuCtt() {
		return X25qRscuCtt;
	}

	//set方法
	public void setX25qRscuCtt(Double X25qRscuCtt) {
		this.X25qRscuCtt = X25qRscuCtt;
	}
	//get方法
	public Double getX25qRscuCtc() {
		return X25qRscuCtc;
	}

	//set方法
	public void setX25qRscuCtc(Double X25qRscuCtc) {
		this.X25qRscuCtc = X25qRscuCtc;
	}
	//get方法
	public Double getX25qRscuAga() {
		return X25qRscuAga;
	}

	//set方法
	public void setX25qRscuAga(Double X25qRscuAga) {
		this.X25qRscuAga = X25qRscuAga;
	}
	//get方法
	public Double getX25qRscuAgg() {
		return X25qRscuAgg;
	}

	//set方法
	public void setX25qRscuAgg(Double X25qRscuAgg) {
		this.X25qRscuAgg = X25qRscuAgg;
	}
	//get方法
	public Double getX25qRscuAgt() {
		return X25qRscuAgt;
	}

	//set方法
	public void setX25qRscuAgt(Double X25qRscuAgt) {
		this.X25qRscuAgt = X25qRscuAgt;
	}
	//get方法
	public Double getX25qRscuAgc() {
		return X25qRscuAgc;
	}

	//set方法
	public void setX25qRscuAgc(Double X25qRscuAgc) {
		this.X25qRscuAgc = X25qRscuAgc;
	}
	//get方法
	public Double getX25qRscuTga() {
		return X25qRscuTga;
	}

	//set方法
	public void setX25qRscuTga(Double X25qRscuTga) {
		this.X25qRscuTga = X25qRscuTga;
	}
	//get方法
	public Double getX25qRscuTgg() {
		return X25qRscuTgg;
	}

	//set方法
	public void setX25qRscuTgg(Double X25qRscuTgg) {
		this.X25qRscuTgg = X25qRscuTgg;
	}
	//get方法
	public Double getX25qRscuTgt() {
		return X25qRscuTgt;
	}

	//set方法
	public void setX25qRscuTgt(Double X25qRscuTgt) {
		this.X25qRscuTgt = X25qRscuTgt;
	}
	//get方法
	public Double getX25qRscuTgc() {
		return X25qRscuTgc;
	}

	//set方法
	public void setX25qRscuTgc(Double X25qRscuTgc) {
		this.X25qRscuTgc = X25qRscuTgc;
	}
	//get方法
	public Double getX25qRscuAca() {
		return X25qRscuAca;
	}

	//set方法
	public void setX25qRscuAca(Double X25qRscuAca) {
		this.X25qRscuAca = X25qRscuAca;
	}
	//get方法
	public Double getX25qRscuAcg() {
		return X25qRscuAcg;
	}

	//set方法
	public void setX25qRscuAcg(Double X25qRscuAcg) {
		this.X25qRscuAcg = X25qRscuAcg;
	}
	//get方法
	public Double getX25qRscuAct() {
		return X25qRscuAct;
	}

	//set方法
	public void setX25qRscuAct(Double X25qRscuAct) {
		this.X25qRscuAct = X25qRscuAct;
	}
	//get方法
	public Double getX25qRscuAcc() {
		return X25qRscuAcc;
	}

	//set方法
	public void setX25qRscuAcc(Double X25qRscuAcc) {
		this.X25qRscuAcc = X25qRscuAcc;
	}
	//get方法
	public Double getX25qRscuTca() {
		return X25qRscuTca;
	}

	//set方法
	public void setX25qRscuTca(Double X25qRscuTca) {
		this.X25qRscuTca = X25qRscuTca;
	}
	//get方法
	public Double getX25qRscuTcg() {
		return X25qRscuTcg;
	}

	//set方法
	public void setX25qRscuTcg(Double X25qRscuTcg) {
		this.X25qRscuTcg = X25qRscuTcg;
	}
	//get方法
	public Double getX25qRscuTct() {
		return X25qRscuTct;
	}

	//set方法
	public void setX25qRscuTct(Double X25qRscuTct) {
		this.X25qRscuTct = X25qRscuTct;
	}
	//get方法
	public Double getX25qRscuTcc() {
		return X25qRscuTcc;
	}

	//set方法
	public void setX25qRscuTcc(Double X25qRscuTcc) {
		this.X25qRscuTcc = X25qRscuTcc;
	}
	//get方法
	public Double getX25qRscuGga() {
		return X25qRscuGga;
	}

	//set方法
	public void setX25qRscuGga(Double X25qRscuGga) {
		this.X25qRscuGga = X25qRscuGga;
	}
	//get方法
	public Double getX25qRscuGgg() {
		return X25qRscuGgg;
	}

	//set方法
	public void setX25qRscuGgg(Double X25qRscuGgg) {
		this.X25qRscuGgg = X25qRscuGgg;
	}
	//get方法
	public Double getX25qRscuGgt() {
		return X25qRscuGgt;
	}

	//set方法
	public void setX25qRscuGgt(Double X25qRscuGgt) {
		this.X25qRscuGgt = X25qRscuGgt;
	}
	//get方法
	public Double getX25qRscuGgc() {
		return X25qRscuGgc;
	}

	//set方法
	public void setX25qRscuGgc(Double X25qRscuGgc) {
		this.X25qRscuGgc = X25qRscuGgc;
	}
	//get方法
	public Double getX25qRscuCga() {
		return X25qRscuCga;
	}

	//set方法
	public void setX25qRscuCga(Double X25qRscuCga) {
		this.X25qRscuCga = X25qRscuCga;
	}
	//get方法
	public Double getX25qRscuCgg() {
		return X25qRscuCgg;
	}

	//set方法
	public void setX25qRscuCgg(Double X25qRscuCgg) {
		this.X25qRscuCgg = X25qRscuCgg;
	}
	//get方法
	public Double getX25qRscuCgt() {
		return X25qRscuCgt;
	}

	//set方法
	public void setX25qRscuCgt(Double X25qRscuCgt) {
		this.X25qRscuCgt = X25qRscuCgt;
	}
	//get方法
	public Double getX25qRscuCgc() {
		return X25qRscuCgc;
	}

	//set方法
	public void setX25qRscuCgc(Double X25qRscuCgc) {
		this.X25qRscuCgc = X25qRscuCgc;
	}
	//get方法
	public Double getX25qRscuGca() {
		return X25qRscuGca;
	}

	//set方法
	public void setX25qRscuGca(Double X25qRscuGca) {
		this.X25qRscuGca = X25qRscuGca;
	}
	//get方法
	public Double getX25qRscuGcg() {
		return X25qRscuGcg;
	}

	//set方法
	public void setX25qRscuGcg(Double X25qRscuGcg) {
		this.X25qRscuGcg = X25qRscuGcg;
	}
	//get方法
	public Double getX25qRscuGct() {
		return X25qRscuGct;
	}

	//set方法
	public void setX25qRscuGct(Double X25qRscuGct) {
		this.X25qRscuGct = X25qRscuGct;
	}
	//get方法
	public Double getX25qRscuGcc() {
		return X25qRscuGcc;
	}

	//set方法
	public void setX25qRscuGcc(Double X25qRscuGcc) {
		this.X25qRscuGcc = X25qRscuGcc;
	}
	//get方法
	public Double getX25qRscuCca() {
		return X25qRscuCca;
	}

	//set方法
	public void setX25qRscuCca(Double X25qRscuCca) {
		this.X25qRscuCca = X25qRscuCca;
	}
	//get方法
	public Double getX25qRscuCcg() {
		return X25qRscuCcg;
	}

	//set方法
	public void setX25qRscuCcg(Double X25qRscuCcg) {
		this.X25qRscuCcg = X25qRscuCcg;
	}
	//get方法
	public Double getX25qRscuCct() {
		return X25qRscuCct;
	}

	//set方法
	public void setX25qRscuCct(Double X25qRscuCct) {
		this.X25qRscuCct = X25qRscuCct;
	}
	//get方法
	public Double getX25qRscuCcc() {
		return X25qRscuCcc;
	}

	//set方法
	public void setX25qRscuCcc(Double X25qRscuCcc) {
		this.X25qRscuCcc = X25qRscuCcc;
	}
	//get方法
	public Double getX50qRscuAaa() {
		return X50qRscuAaa;
	}

	//set方法
	public void setX50qRscuAaa(Double X50qRscuAaa) {
		this.X50qRscuAaa = X50qRscuAaa;
	}
	//get方法
	public Double getX50qRscuAag() {
		return X50qRscuAag;
	}

	//set方法
	public void setX50qRscuAag(Double X50qRscuAag) {
		this.X50qRscuAag = X50qRscuAag;
	}
	//get方法
	public Double getX50qRscuAat() {
		return X50qRscuAat;
	}

	//set方法
	public void setX50qRscuAat(Double X50qRscuAat) {
		this.X50qRscuAat = X50qRscuAat;
	}
	//get方法
	public Double getX50qRscuAac() {
		return X50qRscuAac;
	}

	//set方法
	public void setX50qRscuAac(Double X50qRscuAac) {
		this.X50qRscuAac = X50qRscuAac;
	}
	//get方法
	public Double getX50qRscuTaa() {
		return X50qRscuTaa;
	}

	//set方法
	public void setX50qRscuTaa(Double X50qRscuTaa) {
		this.X50qRscuTaa = X50qRscuTaa;
	}
	//get方法
	public Double getX50qRscuTag() {
		return X50qRscuTag;
	}

	//set方法
	public void setX50qRscuTag(Double X50qRscuTag) {
		this.X50qRscuTag = X50qRscuTag;
	}
	//get方法
	public Double getX50qRscuTat() {
		return X50qRscuTat;
	}

	//set方法
	public void setX50qRscuTat(Double X50qRscuTat) {
		this.X50qRscuTat = X50qRscuTat;
	}
	//get方法
	public Double getX50qRscuTac() {
		return X50qRscuTac;
	}

	//set方法
	public void setX50qRscuTac(Double X50qRscuTac) {
		this.X50qRscuTac = X50qRscuTac;
	}
	//get方法
	public Double getX50qRscuAta() {
		return X50qRscuAta;
	}

	//set方法
	public void setX50qRscuAta(Double X50qRscuAta) {
		this.X50qRscuAta = X50qRscuAta;
	}
	//get方法
	public Double getX50qRscuAtg() {
		return X50qRscuAtg;
	}

	//set方法
	public void setX50qRscuAtg(Double X50qRscuAtg) {
		this.X50qRscuAtg = X50qRscuAtg;
	}
	//get方法
	public Double getX50qRscuAtt() {
		return X50qRscuAtt;
	}

	//set方法
	public void setX50qRscuAtt(Double X50qRscuAtt) {
		this.X50qRscuAtt = X50qRscuAtt;
	}
	//get方法
	public Double getX50qRscuAtc() {
		return X50qRscuAtc;
	}

	//set方法
	public void setX50qRscuAtc(Double X50qRscuAtc) {
		this.X50qRscuAtc = X50qRscuAtc;
	}
	//get方法
	public Double getX50qRscuTta() {
		return X50qRscuTta;
	}

	//set方法
	public void setX50qRscuTta(Double X50qRscuTta) {
		this.X50qRscuTta = X50qRscuTta;
	}
	//get方法
	public Double getX50qRscuTtg() {
		return X50qRscuTtg;
	}

	//set方法
	public void setX50qRscuTtg(Double X50qRscuTtg) {
		this.X50qRscuTtg = X50qRscuTtg;
	}
	//get方法
	public Double getX50qRscuTtt() {
		return X50qRscuTtt;
	}

	//set方法
	public void setX50qRscuTtt(Double X50qRscuTtt) {
		this.X50qRscuTtt = X50qRscuTtt;
	}
	//get方法
	public Double getX50qRscuTtc() {
		return X50qRscuTtc;
	}

	//set方法
	public void setX50qRscuTtc(Double X50qRscuTtc) {
		this.X50qRscuTtc = X50qRscuTtc;
	}
	//get方法
	public Double getX50qRscuGaa() {
		return X50qRscuGaa;
	}

	//set方法
	public void setX50qRscuGaa(Double X50qRscuGaa) {
		this.X50qRscuGaa = X50qRscuGaa;
	}
	//get方法
	public Double getX50qRscuGag() {
		return X50qRscuGag;
	}

	//set方法
	public void setX50qRscuGag(Double X50qRscuGag) {
		this.X50qRscuGag = X50qRscuGag;
	}
	//get方法
	public Double getX50qRscuGat() {
		return X50qRscuGat;
	}

	//set方法
	public void setX50qRscuGat(Double X50qRscuGat) {
		this.X50qRscuGat = X50qRscuGat;
	}
	//get方法
	public Double getX50qRscuGac() {
		return X50qRscuGac;
	}

	//set方法
	public void setX50qRscuGac(Double X50qRscuGac) {
		this.X50qRscuGac = X50qRscuGac;
	}
	//get方法
	public Double getX50qRscuCaa() {
		return X50qRscuCaa;
	}

	//set方法
	public void setX50qRscuCaa(Double X50qRscuCaa) {
		this.X50qRscuCaa = X50qRscuCaa;
	}
	//get方法
	public Double getX50qRscuCag() {
		return X50qRscuCag;
	}

	//set方法
	public void setX50qRscuCag(Double X50qRscuCag) {
		this.X50qRscuCag = X50qRscuCag;
	}
	//get方法
	public Double getX50qRscuCat() {
		return X50qRscuCat;
	}

	//set方法
	public void setX50qRscuCat(Double X50qRscuCat) {
		this.X50qRscuCat = X50qRscuCat;
	}
	//get方法
	public Double getX50qRscuCac() {
		return X50qRscuCac;
	}

	//set方法
	public void setX50qRscuCac(Double X50qRscuCac) {
		this.X50qRscuCac = X50qRscuCac;
	}
	//get方法
	public Double getX50qRscuGta() {
		return X50qRscuGta;
	}

	//set方法
	public void setX50qRscuGta(Double X50qRscuGta) {
		this.X50qRscuGta = X50qRscuGta;
	}
	//get方法
	public Double getX50qRscuGtg() {
		return X50qRscuGtg;
	}

	//set方法
	public void setX50qRscuGtg(Double X50qRscuGtg) {
		this.X50qRscuGtg = X50qRscuGtg;
	}
	//get方法
	public Double getX50qRscuGtt() {
		return X50qRscuGtt;
	}

	//set方法
	public void setX50qRscuGtt(Double X50qRscuGtt) {
		this.X50qRscuGtt = X50qRscuGtt;
	}
	//get方法
	public Double getX50qRscuGtc() {
		return X50qRscuGtc;
	}

	//set方法
	public void setX50qRscuGtc(Double X50qRscuGtc) {
		this.X50qRscuGtc = X50qRscuGtc;
	}
	//get方法
	public Double getX50qRscuCta() {
		return X50qRscuCta;
	}

	//set方法
	public void setX50qRscuCta(Double X50qRscuCta) {
		this.X50qRscuCta = X50qRscuCta;
	}
	//get方法
	public Double getX50qRscuCtg() {
		return X50qRscuCtg;
	}

	//set方法
	public void setX50qRscuCtg(Double X50qRscuCtg) {
		this.X50qRscuCtg = X50qRscuCtg;
	}
	//get方法
	public Double getX50qRscuCtt() {
		return X50qRscuCtt;
	}

	//set方法
	public void setX50qRscuCtt(Double X50qRscuCtt) {
		this.X50qRscuCtt = X50qRscuCtt;
	}
	//get方法
	public Double getX50qRscuCtc() {
		return X50qRscuCtc;
	}

	//set方法
	public void setX50qRscuCtc(Double X50qRscuCtc) {
		this.X50qRscuCtc = X50qRscuCtc;
	}
	//get方法
	public Double getX50qRscuAga() {
		return X50qRscuAga;
	}

	//set方法
	public void setX50qRscuAga(Double X50qRscuAga) {
		this.X50qRscuAga = X50qRscuAga;
	}
	//get方法
	public Double getX50qRscuAgg() {
		return X50qRscuAgg;
	}

	//set方法
	public void setX50qRscuAgg(Double X50qRscuAgg) {
		this.X50qRscuAgg = X50qRscuAgg;
	}
	//get方法
	public Double getX50qRscuAgt() {
		return X50qRscuAgt;
	}

	//set方法
	public void setX50qRscuAgt(Double X50qRscuAgt) {
		this.X50qRscuAgt = X50qRscuAgt;
	}
	//get方法
	public Double getX50qRscuAgc() {
		return X50qRscuAgc;
	}

	//set方法
	public void setX50qRscuAgc(Double X50qRscuAgc) {
		this.X50qRscuAgc = X50qRscuAgc;
	}
	//get方法
	public Double getX50qRscuTga() {
		return X50qRscuTga;
	}

	//set方法
	public void setX50qRscuTga(Double X50qRscuTga) {
		this.X50qRscuTga = X50qRscuTga;
	}
	//get方法
	public Double getX50qRscuTgg() {
		return X50qRscuTgg;
	}

	//set方法
	public void setX50qRscuTgg(Double X50qRscuTgg) {
		this.X50qRscuTgg = X50qRscuTgg;
	}
	//get方法
	public Double getX50qRscuTgt() {
		return X50qRscuTgt;
	}

	//set方法
	public void setX50qRscuTgt(Double X50qRscuTgt) {
		this.X50qRscuTgt = X50qRscuTgt;
	}
	//get方法
	public Double getX50qRscuTgc() {
		return X50qRscuTgc;
	}

	//set方法
	public void setX50qRscuTgc(Double X50qRscuTgc) {
		this.X50qRscuTgc = X50qRscuTgc;
	}
	//get方法
	public Double getX50qRscuAca() {
		return X50qRscuAca;
	}

	//set方法
	public void setX50qRscuAca(Double X50qRscuAca) {
		this.X50qRscuAca = X50qRscuAca;
	}
	//get方法
	public Double getX50qRscuAcg() {
		return X50qRscuAcg;
	}

	//set方法
	public void setX50qRscuAcg(Double X50qRscuAcg) {
		this.X50qRscuAcg = X50qRscuAcg;
	}
	//get方法
	public Double getX50qRscuAct() {
		return X50qRscuAct;
	}

	//set方法
	public void setX50qRscuAct(Double X50qRscuAct) {
		this.X50qRscuAct = X50qRscuAct;
	}
	//get方法
	public Double getX50qRscuAcc() {
		return X50qRscuAcc;
	}

	//set方法
	public void setX50qRscuAcc(Double X50qRscuAcc) {
		this.X50qRscuAcc = X50qRscuAcc;
	}
	//get方法
	public Double getX50qRscuTca() {
		return X50qRscuTca;
	}

	//set方法
	public void setX50qRscuTca(Double X50qRscuTca) {
		this.X50qRscuTca = X50qRscuTca;
	}
	//get方法
	public Double getX50qRscuTcg() {
		return X50qRscuTcg;
	}

	//set方法
	public void setX50qRscuTcg(Double X50qRscuTcg) {
		this.X50qRscuTcg = X50qRscuTcg;
	}
	//get方法
	public Double getX50qRscuTct() {
		return X50qRscuTct;
	}

	//set方法
	public void setX50qRscuTct(Double X50qRscuTct) {
		this.X50qRscuTct = X50qRscuTct;
	}
	//get方法
	public Double getX50qRscuTcc() {
		return X50qRscuTcc;
	}

	//set方法
	public void setX50qRscuTcc(Double X50qRscuTcc) {
		this.X50qRscuTcc = X50qRscuTcc;
	}
	//get方法
	public Double getX50qRscuGga() {
		return X50qRscuGga;
	}

	//set方法
	public void setX50qRscuGga(Double X50qRscuGga) {
		this.X50qRscuGga = X50qRscuGga;
	}
	//get方法
	public Double getX50qRscuGgg() {
		return X50qRscuGgg;
	}

	//set方法
	public void setX50qRscuGgg(Double X50qRscuGgg) {
		this.X50qRscuGgg = X50qRscuGgg;
	}
	//get方法
	public Double getX50qRscuGgt() {
		return X50qRscuGgt;
	}

	//set方法
	public void setX50qRscuGgt(Double X50qRscuGgt) {
		this.X50qRscuGgt = X50qRscuGgt;
	}
	//get方法
	public Double getX50qRscuGgc() {
		return X50qRscuGgc;
	}

	//set方法
	public void setX50qRscuGgc(Double X50qRscuGgc) {
		this.X50qRscuGgc = X50qRscuGgc;
	}
	//get方法
	public Double getX50qRscuCga() {
		return X50qRscuCga;
	}

	//set方法
	public void setX50qRscuCga(Double X50qRscuCga) {
		this.X50qRscuCga = X50qRscuCga;
	}
	//get方法
	public Double getX50qRscuCgg() {
		return X50qRscuCgg;
	}

	//set方法
	public void setX50qRscuCgg(Double X50qRscuCgg) {
		this.X50qRscuCgg = X50qRscuCgg;
	}
	//get方法
	public Double getX50qRscuCgt() {
		return X50qRscuCgt;
	}

	//set方法
	public void setX50qRscuCgt(Double X50qRscuCgt) {
		this.X50qRscuCgt = X50qRscuCgt;
	}
	//get方法
	public Double getX50qRscuCgc() {
		return X50qRscuCgc;
	}

	//set方法
	public void setX50qRscuCgc(Double X50qRscuCgc) {
		this.X50qRscuCgc = X50qRscuCgc;
	}
	//get方法
	public Double getX50qRscuGca() {
		return X50qRscuGca;
	}

	//set方法
	public void setX50qRscuGca(Double X50qRscuGca) {
		this.X50qRscuGca = X50qRscuGca;
	}
	//get方法
	public Double getX50qRscuGcg() {
		return X50qRscuGcg;
	}

	//set方法
	public void setX50qRscuGcg(Double X50qRscuGcg) {
		this.X50qRscuGcg = X50qRscuGcg;
	}
	//get方法
	public Double getX50qRscuGct() {
		return X50qRscuGct;
	}

	//set方法
	public void setX50qRscuGct(Double X50qRscuGct) {
		this.X50qRscuGct = X50qRscuGct;
	}
	//get方法
	public Double getX50qRscuGcc() {
		return X50qRscuGcc;
	}

	//set方法
	public void setX50qRscuGcc(Double X50qRscuGcc) {
		this.X50qRscuGcc = X50qRscuGcc;
	}
	//get方法
	public Double getX50qRscuCca() {
		return X50qRscuCca;
	}

	//set方法
	public void setX50qRscuCca(Double X50qRscuCca) {
		this.X50qRscuCca = X50qRscuCca;
	}
	//get方法
	public Double getX50qRscuCcg() {
		return X50qRscuCcg;
	}

	//set方法
	public void setX50qRscuCcg(Double X50qRscuCcg) {
		this.X50qRscuCcg = X50qRscuCcg;
	}
	//get方法
	public Double getX50qRscuCct() {
		return X50qRscuCct;
	}

	//set方法
	public void setX50qRscuCct(Double X50qRscuCct) {
		this.X50qRscuCct = X50qRscuCct;
	}
	//get方法
	public Double getX50qRscuCcc() {
		return X50qRscuCcc;
	}

	//set方法
	public void setX50qRscuCcc(Double X50qRscuCcc) {
		this.X50qRscuCcc = X50qRscuCcc;
	}
	//get方法
	public Double getX75qRscuAaa() {
		return X75qRscuAaa;
	}

	//set方法
	public void setX75qRscuAaa(Double X75qRscuAaa) {
		this.X75qRscuAaa = X75qRscuAaa;
	}
	//get方法
	public Double getX75qRscuAag() {
		return X75qRscuAag;
	}

	//set方法
	public void setX75qRscuAag(Double X75qRscuAag) {
		this.X75qRscuAag = X75qRscuAag;
	}
	//get方法
	public Double getX75qRscuAat() {
		return X75qRscuAat;
	}

	//set方法
	public void setX75qRscuAat(Double X75qRscuAat) {
		this.X75qRscuAat = X75qRscuAat;
	}
	//get方法
	public Double getX75qRscuAac() {
		return X75qRscuAac;
	}

	//set方法
	public void setX75qRscuAac(Double X75qRscuAac) {
		this.X75qRscuAac = X75qRscuAac;
	}
	//get方法
	public Double getX75qRscuTaa() {
		return X75qRscuTaa;
	}

	//set方法
	public void setX75qRscuTaa(Double X75qRscuTaa) {
		this.X75qRscuTaa = X75qRscuTaa;
	}
	//get方法
	public Double getX75qRscuTag() {
		return X75qRscuTag;
	}

	//set方法
	public void setX75qRscuTag(Double X75qRscuTag) {
		this.X75qRscuTag = X75qRscuTag;
	}
	//get方法
	public Double getX75qRscuTat() {
		return X75qRscuTat;
	}

	//set方法
	public void setX75qRscuTat(Double X75qRscuTat) {
		this.X75qRscuTat = X75qRscuTat;
	}
	//get方法
	public Double getX75qRscuTac() {
		return X75qRscuTac;
	}

	//set方法
	public void setX75qRscuTac(Double X75qRscuTac) {
		this.X75qRscuTac = X75qRscuTac;
	}
	//get方法
	public Double getX75qRscuAta() {
		return X75qRscuAta;
	}

	//set方法
	public void setX75qRscuAta(Double X75qRscuAta) {
		this.X75qRscuAta = X75qRscuAta;
	}
	//get方法
	public Double getX75qRscuAtg() {
		return X75qRscuAtg;
	}

	//set方法
	public void setX75qRscuAtg(Double X75qRscuAtg) {
		this.X75qRscuAtg = X75qRscuAtg;
	}
	//get方法
	public Double getX75qRscuAtt() {
		return X75qRscuAtt;
	}

	//set方法
	public void setX75qRscuAtt(Double X75qRscuAtt) {
		this.X75qRscuAtt = X75qRscuAtt;
	}
	//get方法
	public Double getX75qRscuAtc() {
		return X75qRscuAtc;
	}

	//set方法
	public void setX75qRscuAtc(Double X75qRscuAtc) {
		this.X75qRscuAtc = X75qRscuAtc;
	}
	//get方法
	public Double getX75qRscuTta() {
		return X75qRscuTta;
	}

	//set方法
	public void setX75qRscuTta(Double X75qRscuTta) {
		this.X75qRscuTta = X75qRscuTta;
	}
	//get方法
	public Double getX75qRscuTtg() {
		return X75qRscuTtg;
	}

	//set方法
	public void setX75qRscuTtg(Double X75qRscuTtg) {
		this.X75qRscuTtg = X75qRscuTtg;
	}
	//get方法
	public Double getX75qRscuTtt() {
		return X75qRscuTtt;
	}

	//set方法
	public void setX75qRscuTtt(Double X75qRscuTtt) {
		this.X75qRscuTtt = X75qRscuTtt;
	}
	//get方法
	public Double getX75qRscuTtc() {
		return X75qRscuTtc;
	}

	//set方法
	public void setX75qRscuTtc(Double X75qRscuTtc) {
		this.X75qRscuTtc = X75qRscuTtc;
	}
	//get方法
	public Double getX75qRscuGaa() {
		return X75qRscuGaa;
	}

	//set方法
	public void setX75qRscuGaa(Double X75qRscuGaa) {
		this.X75qRscuGaa = X75qRscuGaa;
	}
	//get方法
	public Double getX75qRscuGag() {
		return X75qRscuGag;
	}

	//set方法
	public void setX75qRscuGag(Double X75qRscuGag) {
		this.X75qRscuGag = X75qRscuGag;
	}
	//get方法
	public Double getX75qRscuGat() {
		return X75qRscuGat;
	}

	//set方法
	public void setX75qRscuGat(Double X75qRscuGat) {
		this.X75qRscuGat = X75qRscuGat;
	}
	//get方法
	public Double getX75qRscuGac() {
		return X75qRscuGac;
	}

	//set方法
	public void setX75qRscuGac(Double X75qRscuGac) {
		this.X75qRscuGac = X75qRscuGac;
	}
	//get方法
	public Double getX75qRscuCaa() {
		return X75qRscuCaa;
	}

	//set方法
	public void setX75qRscuCaa(Double X75qRscuCaa) {
		this.X75qRscuCaa = X75qRscuCaa;
	}
	//get方法
	public Double getX75qRscuCag() {
		return X75qRscuCag;
	}

	//set方法
	public void setX75qRscuCag(Double X75qRscuCag) {
		this.X75qRscuCag = X75qRscuCag;
	}
	//get方法
	public Double getX75qRscuCat() {
		return X75qRscuCat;
	}

	//set方法
	public void setX75qRscuCat(Double X75qRscuCat) {
		this.X75qRscuCat = X75qRscuCat;
	}
	//get方法
	public Double getX75qRscuCac() {
		return X75qRscuCac;
	}

	//set方法
	public void setX75qRscuCac(Double X75qRscuCac) {
		this.X75qRscuCac = X75qRscuCac;
	}
	//get方法
	public Double getX75qRscuGta() {
		return X75qRscuGta;
	}

	//set方法
	public void setX75qRscuGta(Double X75qRscuGta) {
		this.X75qRscuGta = X75qRscuGta;
	}
	//get方法
	public Double getX75qRscuGtg() {
		return X75qRscuGtg;
	}

	//set方法
	public void setX75qRscuGtg(Double X75qRscuGtg) {
		this.X75qRscuGtg = X75qRscuGtg;
	}
	//get方法
	public Double getX75qRscuGtt() {
		return X75qRscuGtt;
	}

	//set方法
	public void setX75qRscuGtt(Double X75qRscuGtt) {
		this.X75qRscuGtt = X75qRscuGtt;
	}
	//get方法
	public Double getX75qRscuGtc() {
		return X75qRscuGtc;
	}

	//set方法
	public void setX75qRscuGtc(Double X75qRscuGtc) {
		this.X75qRscuGtc = X75qRscuGtc;
	}
	//get方法
	public Double getX75qRscuCta() {
		return X75qRscuCta;
	}

	//set方法
	public void setX75qRscuCta(Double X75qRscuCta) {
		this.X75qRscuCta = X75qRscuCta;
	}
	//get方法
	public Double getX75qRscuCtg() {
		return X75qRscuCtg;
	}

	//set方法
	public void setX75qRscuCtg(Double X75qRscuCtg) {
		this.X75qRscuCtg = X75qRscuCtg;
	}
	//get方法
	public Double getX75qRscuCtt() {
		return X75qRscuCtt;
	}

	//set方法
	public void setX75qRscuCtt(Double X75qRscuCtt) {
		this.X75qRscuCtt = X75qRscuCtt;
	}
	//get方法
	public Double getX75qRscuCtc() {
		return X75qRscuCtc;
	}

	//set方法
	public void setX75qRscuCtc(Double X75qRscuCtc) {
		this.X75qRscuCtc = X75qRscuCtc;
	}
	//get方法
	public Double getX75qRscuAga() {
		return X75qRscuAga;
	}

	//set方法
	public void setX75qRscuAga(Double X75qRscuAga) {
		this.X75qRscuAga = X75qRscuAga;
	}
	//get方法
	public Double getX75qRscuAgg() {
		return X75qRscuAgg;
	}

	//set方法
	public void setX75qRscuAgg(Double X75qRscuAgg) {
		this.X75qRscuAgg = X75qRscuAgg;
	}
	//get方法
	public Double getX75qRscuAgt() {
		return X75qRscuAgt;
	}

	//set方法
	public void setX75qRscuAgt(Double X75qRscuAgt) {
		this.X75qRscuAgt = X75qRscuAgt;
	}
	//get方法
	public Double getX75qRscuAgc() {
		return X75qRscuAgc;
	}

	//set方法
	public void setX75qRscuAgc(Double X75qRscuAgc) {
		this.X75qRscuAgc = X75qRscuAgc;
	}
	//get方法
	public Double getX75qRscuTga() {
		return X75qRscuTga;
	}

	//set方法
	public void setX75qRscuTga(Double X75qRscuTga) {
		this.X75qRscuTga = X75qRscuTga;
	}
	//get方法
	public Double getX75qRscuTgg() {
		return X75qRscuTgg;
	}

	//set方法
	public void setX75qRscuTgg(Double X75qRscuTgg) {
		this.X75qRscuTgg = X75qRscuTgg;
	}
	//get方法
	public Double getX75qRscuTgt() {
		return X75qRscuTgt;
	}

	//set方法
	public void setX75qRscuTgt(Double X75qRscuTgt) {
		this.X75qRscuTgt = X75qRscuTgt;
	}
	//get方法
	public Double getX75qRscuTgc() {
		return X75qRscuTgc;
	}

	//set方法
	public void setX75qRscuTgc(Double X75qRscuTgc) {
		this.X75qRscuTgc = X75qRscuTgc;
	}
	//get方法
	public Double getX75qRscuAca() {
		return X75qRscuAca;
	}

	//set方法
	public void setX75qRscuAca(Double X75qRscuAca) {
		this.X75qRscuAca = X75qRscuAca;
	}
	//get方法
	public Double getX75qRscuAcg() {
		return X75qRscuAcg;
	}

	//set方法
	public void setX75qRscuAcg(Double X75qRscuAcg) {
		this.X75qRscuAcg = X75qRscuAcg;
	}
	//get方法
	public Double getX75qRscuAct() {
		return X75qRscuAct;
	}

	//set方法
	public void setX75qRscuAct(Double X75qRscuAct) {
		this.X75qRscuAct = X75qRscuAct;
	}
	//get方法
	public Double getX75qRscuAcc() {
		return X75qRscuAcc;
	}

	//set方法
	public void setX75qRscuAcc(Double X75qRscuAcc) {
		this.X75qRscuAcc = X75qRscuAcc;
	}
	//get方法
	public Double getX75qRscuTca() {
		return X75qRscuTca;
	}

	//set方法
	public void setX75qRscuTca(Double X75qRscuTca) {
		this.X75qRscuTca = X75qRscuTca;
	}
	//get方法
	public Double getX75qRscuTcg() {
		return X75qRscuTcg;
	}

	//set方法
	public void setX75qRscuTcg(Double X75qRscuTcg) {
		this.X75qRscuTcg = X75qRscuTcg;
	}
	//get方法
	public Double getX75qRscuTct() {
		return X75qRscuTct;
	}

	//set方法
	public void setX75qRscuTct(Double X75qRscuTct) {
		this.X75qRscuTct = X75qRscuTct;
	}
	//get方法
	public Double getX75qRscuTcc() {
		return X75qRscuTcc;
	}

	//set方法
	public void setX75qRscuTcc(Double X75qRscuTcc) {
		this.X75qRscuTcc = X75qRscuTcc;
	}
	//get方法
	public Double getX75qRscuGga() {
		return X75qRscuGga;
	}

	//set方法
	public void setX75qRscuGga(Double X75qRscuGga) {
		this.X75qRscuGga = X75qRscuGga;
	}
	//get方法
	public Double getX75qRscuGgg() {
		return X75qRscuGgg;
	}

	//set方法
	public void setX75qRscuGgg(Double X75qRscuGgg) {
		this.X75qRscuGgg = X75qRscuGgg;
	}
	//get方法
	public Double getX75qRscuGgt() {
		return X75qRscuGgt;
	}

	//set方法
	public void setX75qRscuGgt(Double X75qRscuGgt) {
		this.X75qRscuGgt = X75qRscuGgt;
	}
	//get方法
	public Double getX75qRscuGgc() {
		return X75qRscuGgc;
	}

	//set方法
	public void setX75qRscuGgc(Double X75qRscuGgc) {
		this.X75qRscuGgc = X75qRscuGgc;
	}
	//get方法
	public Double getX75qRscuCga() {
		return X75qRscuCga;
	}

	//set方法
	public void setX75qRscuCga(Double X75qRscuCga) {
		this.X75qRscuCga = X75qRscuCga;
	}
	//get方法
	public Double getX75qRscuCgg() {
		return X75qRscuCgg;
	}

	//set方法
	public void setX75qRscuCgg(Double X75qRscuCgg) {
		this.X75qRscuCgg = X75qRscuCgg;
	}
	//get方法
	public Double getX75qRscuCgt() {
		return X75qRscuCgt;
	}

	//set方法
	public void setX75qRscuCgt(Double X75qRscuCgt) {
		this.X75qRscuCgt = X75qRscuCgt;
	}
	//get方法
	public Double getX75qRscuCgc() {
		return X75qRscuCgc;
	}

	//set方法
	public void setX75qRscuCgc(Double X75qRscuCgc) {
		this.X75qRscuCgc = X75qRscuCgc;
	}
	//get方法
	public Double getX75qRscuGca() {
		return X75qRscuGca;
	}

	//set方法
	public void setX75qRscuGca(Double X75qRscuGca) {
		this.X75qRscuGca = X75qRscuGca;
	}
	//get方法
	public Double getX75qRscuGcg() {
		return X75qRscuGcg;
	}

	//set方法
	public void setX75qRscuGcg(Double X75qRscuGcg) {
		this.X75qRscuGcg = X75qRscuGcg;
	}
	//get方法
	public Double getX75qRscuGct() {
		return X75qRscuGct;
	}

	//set方法
	public void setX75qRscuGct(Double X75qRscuGct) {
		this.X75qRscuGct = X75qRscuGct;
	}
	//get方法
	public Double getX75qRscuGcc() {
		return X75qRscuGcc;
	}

	//set方法
	public void setX75qRscuGcc(Double X75qRscuGcc) {
		this.X75qRscuGcc = X75qRscuGcc;
	}
	//get方法
	public Double getX75qRscuCca() {
		return X75qRscuCca;
	}

	//set方法
	public void setX75qRscuCca(Double X75qRscuCca) {
		this.X75qRscuCca = X75qRscuCca;
	}
	//get方法
	public Double getX75qRscuCcg() {
		return X75qRscuCcg;
	}

	//set方法
	public void setX75qRscuCcg(Double X75qRscuCcg) {
		this.X75qRscuCcg = X75qRscuCcg;
	}
	//get方法
	public Double getX75qRscuCct() {
		return X75qRscuCct;
	}

	//set方法
	public void setX75qRscuCct(Double X75qRscuCct) {
		this.X75qRscuCct = X75qRscuCct;
	}
	//get方法
	public Double getX75qRscuCcc() {
		return X75qRscuCcc;
	}

	//set方法
	public void setX75qRscuCcc(Double X75qRscuCcc) {
		this.X75qRscuCcc = X75qRscuCcc;
	}
	//get方法
	public Double getX95qRscuAaa() {
		return X95qRscuAaa;
	}

	//set方法
	public void setX95qRscuAaa(Double X95qRscuAaa) {
		this.X95qRscuAaa = X95qRscuAaa;
	}
	//get方法
	public Double getX95qRscuAag() {
		return X95qRscuAag;
	}

	//set方法
	public void setX95qRscuAag(Double X95qRscuAag) {
		this.X95qRscuAag = X95qRscuAag;
	}
	//get方法
	public Double getX95qRscuAat() {
		return X95qRscuAat;
	}

	//set方法
	public void setX95qRscuAat(Double X95qRscuAat) {
		this.X95qRscuAat = X95qRscuAat;
	}
	//get方法
	public Double getX95qRscuAac() {
		return X95qRscuAac;
	}

	//set方法
	public void setX95qRscuAac(Double X95qRscuAac) {
		this.X95qRscuAac = X95qRscuAac;
	}
	//get方法
	public Double getX95qRscuTaa() {
		return X95qRscuTaa;
	}

	//set方法
	public void setX95qRscuTaa(Double X95qRscuTaa) {
		this.X95qRscuTaa = X95qRscuTaa;
	}
	//get方法
	public Double getX95qRscuTag() {
		return X95qRscuTag;
	}

	//set方法
	public void setX95qRscuTag(Double X95qRscuTag) {
		this.X95qRscuTag = X95qRscuTag;
	}
	//get方法
	public Double getX95qRscuTat() {
		return X95qRscuTat;
	}

	//set方法
	public void setX95qRscuTat(Double X95qRscuTat) {
		this.X95qRscuTat = X95qRscuTat;
	}
	//get方法
	public Double getX95qRscuTac() {
		return X95qRscuTac;
	}

	//set方法
	public void setX95qRscuTac(Double X95qRscuTac) {
		this.X95qRscuTac = X95qRscuTac;
	}
	//get方法
	public Double getX95qRscuAta() {
		return X95qRscuAta;
	}

	//set方法
	public void setX95qRscuAta(Double X95qRscuAta) {
		this.X95qRscuAta = X95qRscuAta;
	}
	//get方法
	public Double getX95qRscuAtg() {
		return X95qRscuAtg;
	}

	//set方法
	public void setX95qRscuAtg(Double X95qRscuAtg) {
		this.X95qRscuAtg = X95qRscuAtg;
	}
	//get方法
	public Double getX95qRscuAtt() {
		return X95qRscuAtt;
	}

	//set方法
	public void setX95qRscuAtt(Double X95qRscuAtt) {
		this.X95qRscuAtt = X95qRscuAtt;
	}
	//get方法
	public Double getX95qRscuAtc() {
		return X95qRscuAtc;
	}

	//set方法
	public void setX95qRscuAtc(Double X95qRscuAtc) {
		this.X95qRscuAtc = X95qRscuAtc;
	}
	//get方法
	public Double getX95qRscuTta() {
		return X95qRscuTta;
	}

	//set方法
	public void setX95qRscuTta(Double X95qRscuTta) {
		this.X95qRscuTta = X95qRscuTta;
	}
	//get方法
	public Double getX95qRscuTtg() {
		return X95qRscuTtg;
	}

	//set方法
	public void setX95qRscuTtg(Double X95qRscuTtg) {
		this.X95qRscuTtg = X95qRscuTtg;
	}
	//get方法
	public Double getX95qRscuTtt() {
		return X95qRscuTtt;
	}

	//set方法
	public void setX95qRscuTtt(Double X95qRscuTtt) {
		this.X95qRscuTtt = X95qRscuTtt;
	}
	//get方法
	public Double getX95qRscuTtc() {
		return X95qRscuTtc;
	}

	//set方法
	public void setX95qRscuTtc(Double X95qRscuTtc) {
		this.X95qRscuTtc = X95qRscuTtc;
	}
	//get方法
	public Double getX95qRscuGaa() {
		return X95qRscuGaa;
	}

	//set方法
	public void setX95qRscuGaa(Double X95qRscuGaa) {
		this.X95qRscuGaa = X95qRscuGaa;
	}
	//get方法
	public Double getX95qRscuGag() {
		return X95qRscuGag;
	}

	//set方法
	public void setX95qRscuGag(Double X95qRscuGag) {
		this.X95qRscuGag = X95qRscuGag;
	}
	//get方法
	public Double getX95qRscuGat() {
		return X95qRscuGat;
	}

	//set方法
	public void setX95qRscuGat(Double X95qRscuGat) {
		this.X95qRscuGat = X95qRscuGat;
	}
	//get方法
	public Double getX95qRscuGac() {
		return X95qRscuGac;
	}

	//set方法
	public void setX95qRscuGac(Double X95qRscuGac) {
		this.X95qRscuGac = X95qRscuGac;
	}
	//get方法
	public Double getX95qRscuCaa() {
		return X95qRscuCaa;
	}

	//set方法
	public void setX95qRscuCaa(Double X95qRscuCaa) {
		this.X95qRscuCaa = X95qRscuCaa;
	}
	//get方法
	public Double getX95qRscuCag() {
		return X95qRscuCag;
	}

	//set方法
	public void setX95qRscuCag(Double X95qRscuCag) {
		this.X95qRscuCag = X95qRscuCag;
	}
	//get方法
	public Double getX95qRscuCat() {
		return X95qRscuCat;
	}

	//set方法
	public void setX95qRscuCat(Double X95qRscuCat) {
		this.X95qRscuCat = X95qRscuCat;
	}
	//get方法
	public Double getX95qRscuCac() {
		return X95qRscuCac;
	}

	//set方法
	public void setX95qRscuCac(Double X95qRscuCac) {
		this.X95qRscuCac = X95qRscuCac;
	}
	//get方法
	public Double getX95qRscuGta() {
		return X95qRscuGta;
	}

	//set方法
	public void setX95qRscuGta(Double X95qRscuGta) {
		this.X95qRscuGta = X95qRscuGta;
	}
	//get方法
	public Double getX95qRscuGtg() {
		return X95qRscuGtg;
	}

	//set方法
	public void setX95qRscuGtg(Double X95qRscuGtg) {
		this.X95qRscuGtg = X95qRscuGtg;
	}
	//get方法
	public Double getX95qRscuGtt() {
		return X95qRscuGtt;
	}

	//set方法
	public void setX95qRscuGtt(Double X95qRscuGtt) {
		this.X95qRscuGtt = X95qRscuGtt;
	}
	//get方法
	public Double getX95qRscuGtc() {
		return X95qRscuGtc;
	}

	//set方法
	public void setX95qRscuGtc(Double X95qRscuGtc) {
		this.X95qRscuGtc = X95qRscuGtc;
	}
	//get方法
	public Double getX95qRscuCta() {
		return X95qRscuCta;
	}

	//set方法
	public void setX95qRscuCta(Double X95qRscuCta) {
		this.X95qRscuCta = X95qRscuCta;
	}
	//get方法
	public Double getX95qRscuCtg() {
		return X95qRscuCtg;
	}

	//set方法
	public void setX95qRscuCtg(Double X95qRscuCtg) {
		this.X95qRscuCtg = X95qRscuCtg;
	}
	//get方法
	public Double getX95qRscuCtt() {
		return X95qRscuCtt;
	}

	//set方法
	public void setX95qRscuCtt(Double X95qRscuCtt) {
		this.X95qRscuCtt = X95qRscuCtt;
	}
	//get方法
	public Double getX95qRscuCtc() {
		return X95qRscuCtc;
	}

	//set方法
	public void setX95qRscuCtc(Double X95qRscuCtc) {
		this.X95qRscuCtc = X95qRscuCtc;
	}
	//get方法
	public Double getX95qRscuAga() {
		return X95qRscuAga;
	}

	//set方法
	public void setX95qRscuAga(Double X95qRscuAga) {
		this.X95qRscuAga = X95qRscuAga;
	}
	//get方法
	public Double getX95qRscuAgg() {
		return X95qRscuAgg;
	}

	//set方法
	public void setX95qRscuAgg(Double X95qRscuAgg) {
		this.X95qRscuAgg = X95qRscuAgg;
	}
	//get方法
	public Double getX95qRscuAgt() {
		return X95qRscuAgt;
	}

	//set方法
	public void setX95qRscuAgt(Double X95qRscuAgt) {
		this.X95qRscuAgt = X95qRscuAgt;
	}
	//get方法
	public Double getX95qRscuAgc() {
		return X95qRscuAgc;
	}

	//set方法
	public void setX95qRscuAgc(Double X95qRscuAgc) {
		this.X95qRscuAgc = X95qRscuAgc;
	}
	//get方法
	public Double getX95qRscuTga() {
		return X95qRscuTga;
	}

	//set方法
	public void setX95qRscuTga(Double X95qRscuTga) {
		this.X95qRscuTga = X95qRscuTga;
	}
	//get方法
	public Double getX95qRscuTgg() {
		return X95qRscuTgg;
	}

	//set方法
	public void setX95qRscuTgg(Double X95qRscuTgg) {
		this.X95qRscuTgg = X95qRscuTgg;
	}
	//get方法
	public Double getX95qRscuTgt() {
		return X95qRscuTgt;
	}

	//set方法
	public void setX95qRscuTgt(Double X95qRscuTgt) {
		this.X95qRscuTgt = X95qRscuTgt;
	}
	//get方法
	public Double getX95qRscuTgc() {
		return X95qRscuTgc;
	}

	//set方法
	public void setX95qRscuTgc(Double X95qRscuTgc) {
		this.X95qRscuTgc = X95qRscuTgc;
	}
	//get方法
	public Double getX95qRscuAca() {
		return X95qRscuAca;
	}

	//set方法
	public void setX95qRscuAca(Double X95qRscuAca) {
		this.X95qRscuAca = X95qRscuAca;
	}
	//get方法
	public Double getX95qRscuAcg() {
		return X95qRscuAcg;
	}

	//set方法
	public void setX95qRscuAcg(Double X95qRscuAcg) {
		this.X95qRscuAcg = X95qRscuAcg;
	}
	//get方法
	public Double getX95qRscuAct() {
		return X95qRscuAct;
	}

	//set方法
	public void setX95qRscuAct(Double X95qRscuAct) {
		this.X95qRscuAct = X95qRscuAct;
	}
	//get方法
	public Double getX95qRscuAcc() {
		return X95qRscuAcc;
	}

	//set方法
	public void setX95qRscuAcc(Double X95qRscuAcc) {
		this.X95qRscuAcc = X95qRscuAcc;
	}
	//get方法
	public Double getX95qRscuTca() {
		return X95qRscuTca;
	}

	//set方法
	public void setX95qRscuTca(Double X95qRscuTca) {
		this.X95qRscuTca = X95qRscuTca;
	}
	//get方法
	public Double getX95qRscuTcg() {
		return X95qRscuTcg;
	}

	//set方法
	public void setX95qRscuTcg(Double X95qRscuTcg) {
		this.X95qRscuTcg = X95qRscuTcg;
	}
	//get方法
	public Double getX95qRscuTct() {
		return X95qRscuTct;
	}

	//set方法
	public void setX95qRscuTct(Double X95qRscuTct) {
		this.X95qRscuTct = X95qRscuTct;
	}
	//get方法
	public Double getX95qRscuTcc() {
		return X95qRscuTcc;
	}

	//set方法
	public void setX95qRscuTcc(Double X95qRscuTcc) {
		this.X95qRscuTcc = X95qRscuTcc;
	}
	//get方法
	public Double getX95qRscuGga() {
		return X95qRscuGga;
	}

	//set方法
	public void setX95qRscuGga(Double X95qRscuGga) {
		this.X95qRscuGga = X95qRscuGga;
	}
	//get方法
	public Double getX95qRscuGgg() {
		return X95qRscuGgg;
	}

	//set方法
	public void setX95qRscuGgg(Double X95qRscuGgg) {
		this.X95qRscuGgg = X95qRscuGgg;
	}
	//get方法
	public Double getX95qRscuGgt() {
		return X95qRscuGgt;
	}

	//set方法
	public void setX95qRscuGgt(Double X95qRscuGgt) {
		this.X95qRscuGgt = X95qRscuGgt;
	}
	//get方法
	public Double getX95qRscuGgc() {
		return X95qRscuGgc;
	}

	//set方法
	public void setX95qRscuGgc(Double X95qRscuGgc) {
		this.X95qRscuGgc = X95qRscuGgc;
	}
	//get方法
	public Double getX95qRscuCga() {
		return X95qRscuCga;
	}

	//set方法
	public void setX95qRscuCga(Double X95qRscuCga) {
		this.X95qRscuCga = X95qRscuCga;
	}
	//get方法
	public Double getX95qRscuCgg() {
		return X95qRscuCgg;
	}

	//set方法
	public void setX95qRscuCgg(Double X95qRscuCgg) {
		this.X95qRscuCgg = X95qRscuCgg;
	}
	//get方法
	public Double getX95qRscuCgt() {
		return X95qRscuCgt;
	}

	//set方法
	public void setX95qRscuCgt(Double X95qRscuCgt) {
		this.X95qRscuCgt = X95qRscuCgt;
	}
	//get方法
	public Double getX95qRscuCgc() {
		return X95qRscuCgc;
	}

	//set方法
	public void setX95qRscuCgc(Double X95qRscuCgc) {
		this.X95qRscuCgc = X95qRscuCgc;
	}
	//get方法
	public Double getX95qRscuGca() {
		return X95qRscuGca;
	}

	//set方法
	public void setX95qRscuGca(Double X95qRscuGca) {
		this.X95qRscuGca = X95qRscuGca;
	}
	//get方法
	public Double getX95qRscuGcg() {
		return X95qRscuGcg;
	}

	//set方法
	public void setX95qRscuGcg(Double X95qRscuGcg) {
		this.X95qRscuGcg = X95qRscuGcg;
	}
	//get方法
	public Double getX95qRscuGct() {
		return X95qRscuGct;
	}

	//set方法
	public void setX95qRscuGct(Double X95qRscuGct) {
		this.X95qRscuGct = X95qRscuGct;
	}
	//get方法
	public Double getX95qRscuGcc() {
		return X95qRscuGcc;
	}

	//set方法
	public void setX95qRscuGcc(Double X95qRscuGcc) {
		this.X95qRscuGcc = X95qRscuGcc;
	}
	//get方法
	public Double getX95qRscuCca() {
		return X95qRscuCca;
	}

	//set方法
	public void setX95qRscuCca(Double X95qRscuCca) {
		this.X95qRscuCca = X95qRscuCca;
	}
	//get方法
	public Double getX95qRscuCcg() {
		return X95qRscuCcg;
	}

	//set方法
	public void setX95qRscuCcg(Double X95qRscuCcg) {
		this.X95qRscuCcg = X95qRscuCcg;
	}
	//get方法
	public Double getX95qRscuCct() {
		return X95qRscuCct;
	}

	//set方法
	public void setX95qRscuCct(Double X95qRscuCct) {
		this.X95qRscuCct = X95qRscuCct;
	}
	//get方法
	public Double getX95qRscuCcc() {
		return X95qRscuCcc;
	}

	//set方法
	public void setX95qRscuCcc(Double X95qRscuCcc) {
		this.X95qRscuCcc = X95qRscuCcc;
	}
	//get方法
	public Double getTruemaxRscuAaa() {
		return truemaxRscuAaa;
	}

	//set方法
	public void setTruemaxRscuAaa(Double truemaxRscuAaa) {
		this.truemaxRscuAaa = truemaxRscuAaa;
	}
	//get方法
	public Double getTruemaxRscuAag() {
		return truemaxRscuAag;
	}

	//set方法
	public void setTruemaxRscuAag(Double truemaxRscuAag) {
		this.truemaxRscuAag = truemaxRscuAag;
	}
	//get方法
	public Double getTruemaxRscuAat() {
		return truemaxRscuAat;
	}

	//set方法
	public void setTruemaxRscuAat(Double truemaxRscuAat) {
		this.truemaxRscuAat = truemaxRscuAat;
	}
	//get方法
	public Double getTruemaxRscuAac() {
		return truemaxRscuAac;
	}

	//set方法
	public void setTruemaxRscuAac(Double truemaxRscuAac) {
		this.truemaxRscuAac = truemaxRscuAac;
	}
	//get方法
	public Double getTruemaxRscuTaa() {
		return truemaxRscuTaa;
	}

	//set方法
	public void setTruemaxRscuTaa(Double truemaxRscuTaa) {
		this.truemaxRscuTaa = truemaxRscuTaa;
	}
	//get方法
	public Double getTruemaxRscuTag() {
		return truemaxRscuTag;
	}

	//set方法
	public void setTruemaxRscuTag(Double truemaxRscuTag) {
		this.truemaxRscuTag = truemaxRscuTag;
	}
	//get方法
	public Double getTruemaxRscuTat() {
		return truemaxRscuTat;
	}

	//set方法
	public void setTruemaxRscuTat(Double truemaxRscuTat) {
		this.truemaxRscuTat = truemaxRscuTat;
	}
	//get方法
	public Double getTruemaxRscuTac() {
		return truemaxRscuTac;
	}

	//set方法
	public void setTruemaxRscuTac(Double truemaxRscuTac) {
		this.truemaxRscuTac = truemaxRscuTac;
	}
	//get方法
	public Double getTruemaxRscuAta() {
		return truemaxRscuAta;
	}

	//set方法
	public void setTruemaxRscuAta(Double truemaxRscuAta) {
		this.truemaxRscuAta = truemaxRscuAta;
	}
	//get方法
	public Double getTruemaxRscuAtg() {
		return truemaxRscuAtg;
	}

	//set方法
	public void setTruemaxRscuAtg(Double truemaxRscuAtg) {
		this.truemaxRscuAtg = truemaxRscuAtg;
	}
	//get方法
	public Double getTruemaxRscuAtt() {
		return truemaxRscuAtt;
	}

	//set方法
	public void setTruemaxRscuAtt(Double truemaxRscuAtt) {
		this.truemaxRscuAtt = truemaxRscuAtt;
	}
	//get方法
	public Double getTruemaxRscuAtc() {
		return truemaxRscuAtc;
	}

	//set方法
	public void setTruemaxRscuAtc(Double truemaxRscuAtc) {
		this.truemaxRscuAtc = truemaxRscuAtc;
	}
	//get方法
	public Double getTruemaxRscuTta() {
		return truemaxRscuTta;
	}

	//set方法
	public void setTruemaxRscuTta(Double truemaxRscuTta) {
		this.truemaxRscuTta = truemaxRscuTta;
	}
	//get方法
	public Double getTruemaxRscuTtg() {
		return truemaxRscuTtg;
	}

	//set方法
	public void setTruemaxRscuTtg(Double truemaxRscuTtg) {
		this.truemaxRscuTtg = truemaxRscuTtg;
	}
	//get方法
	public Double getTruemaxRscuTtt() {
		return truemaxRscuTtt;
	}

	//set方法
	public void setTruemaxRscuTtt(Double truemaxRscuTtt) {
		this.truemaxRscuTtt = truemaxRscuTtt;
	}
	//get方法
	public Double getTruemaxRscuTtc() {
		return truemaxRscuTtc;
	}

	//set方法
	public void setTruemaxRscuTtc(Double truemaxRscuTtc) {
		this.truemaxRscuTtc = truemaxRscuTtc;
	}
	//get方法
	public Double getTruemaxRscuGaa() {
		return truemaxRscuGaa;
	}

	//set方法
	public void setTruemaxRscuGaa(Double truemaxRscuGaa) {
		this.truemaxRscuGaa = truemaxRscuGaa;
	}
	//get方法
	public Double getTruemaxRscuGag() {
		return truemaxRscuGag;
	}

	//set方法
	public void setTruemaxRscuGag(Double truemaxRscuGag) {
		this.truemaxRscuGag = truemaxRscuGag;
	}
	//get方法
	public Double getTruemaxRscuGat() {
		return truemaxRscuGat;
	}

	//set方法
	public void setTruemaxRscuGat(Double truemaxRscuGat) {
		this.truemaxRscuGat = truemaxRscuGat;
	}
	//get方法
	public Double getTruemaxRscuGac() {
		return truemaxRscuGac;
	}

	//set方法
	public void setTruemaxRscuGac(Double truemaxRscuGac) {
		this.truemaxRscuGac = truemaxRscuGac;
	}
	//get方法
	public Double getTruemaxRscuCaa() {
		return truemaxRscuCaa;
	}

	//set方法
	public void setTruemaxRscuCaa(Double truemaxRscuCaa) {
		this.truemaxRscuCaa = truemaxRscuCaa;
	}
	//get方法
	public Double getTruemaxRscuCag() {
		return truemaxRscuCag;
	}

	//set方法
	public void setTruemaxRscuCag(Double truemaxRscuCag) {
		this.truemaxRscuCag = truemaxRscuCag;
	}
	//get方法
	public Double getTruemaxRscuCat() {
		return truemaxRscuCat;
	}

	//set方法
	public void setTruemaxRscuCat(Double truemaxRscuCat) {
		this.truemaxRscuCat = truemaxRscuCat;
	}
	//get方法
	public Double getTruemaxRscuCac() {
		return truemaxRscuCac;
	}

	//set方法
	public void setTruemaxRscuCac(Double truemaxRscuCac) {
		this.truemaxRscuCac = truemaxRscuCac;
	}
	//get方法
	public Double getTruemaxRscuGta() {
		return truemaxRscuGta;
	}

	//set方法
	public void setTruemaxRscuGta(Double truemaxRscuGta) {
		this.truemaxRscuGta = truemaxRscuGta;
	}
	//get方法
	public Double getTruemaxRscuGtg() {
		return truemaxRscuGtg;
	}

	//set方法
	public void setTruemaxRscuGtg(Double truemaxRscuGtg) {
		this.truemaxRscuGtg = truemaxRscuGtg;
	}
	//get方法
	public Double getTruemaxRscuGtt() {
		return truemaxRscuGtt;
	}

	//set方法
	public void setTruemaxRscuGtt(Double truemaxRscuGtt) {
		this.truemaxRscuGtt = truemaxRscuGtt;
	}
	//get方法
	public Double getTruemaxRscuGtc() {
		return truemaxRscuGtc;
	}

	//set方法
	public void setTruemaxRscuGtc(Double truemaxRscuGtc) {
		this.truemaxRscuGtc = truemaxRscuGtc;
	}
	//get方法
	public Double getTruemaxRscuCta() {
		return truemaxRscuCta;
	}

	//set方法
	public void setTruemaxRscuCta(Double truemaxRscuCta) {
		this.truemaxRscuCta = truemaxRscuCta;
	}
	//get方法
	public Double getTruemaxRscuCtg() {
		return truemaxRscuCtg;
	}

	//set方法
	public void setTruemaxRscuCtg(Double truemaxRscuCtg) {
		this.truemaxRscuCtg = truemaxRscuCtg;
	}
	//get方法
	public Double getTruemaxRscuCtt() {
		return truemaxRscuCtt;
	}

	//set方法
	public void setTruemaxRscuCtt(Double truemaxRscuCtt) {
		this.truemaxRscuCtt = truemaxRscuCtt;
	}
	//get方法
	public Double getTruemaxRscuCtc() {
		return truemaxRscuCtc;
	}

	//set方法
	public void setTruemaxRscuCtc(Double truemaxRscuCtc) {
		this.truemaxRscuCtc = truemaxRscuCtc;
	}
	//get方法
	public Double getTruemaxRscuAga() {
		return truemaxRscuAga;
	}

	//set方法
	public void setTruemaxRscuAga(Double truemaxRscuAga) {
		this.truemaxRscuAga = truemaxRscuAga;
	}
	//get方法
	public Double getTruemaxRscuAgg() {
		return truemaxRscuAgg;
	}

	//set方法
	public void setTruemaxRscuAgg(Double truemaxRscuAgg) {
		this.truemaxRscuAgg = truemaxRscuAgg;
	}
	//get方法
	public Double getTruemaxRscuAgt() {
		return truemaxRscuAgt;
	}

	//set方法
	public void setTruemaxRscuAgt(Double truemaxRscuAgt) {
		this.truemaxRscuAgt = truemaxRscuAgt;
	}
	//get方法
	public Double getTruemaxRscuAgc() {
		return truemaxRscuAgc;
	}

	//set方法
	public void setTruemaxRscuAgc(Double truemaxRscuAgc) {
		this.truemaxRscuAgc = truemaxRscuAgc;
	}
	//get方法
	public Double getTruemaxRscuTga() {
		return truemaxRscuTga;
	}

	//set方法
	public void setTruemaxRscuTga(Double truemaxRscuTga) {
		this.truemaxRscuTga = truemaxRscuTga;
	}
	//get方法
	public Double getTruemaxRscuTgg() {
		return truemaxRscuTgg;
	}

	//set方法
	public void setTruemaxRscuTgg(Double truemaxRscuTgg) {
		this.truemaxRscuTgg = truemaxRscuTgg;
	}
	//get方法
	public Double getTruemaxRscuTgt() {
		return truemaxRscuTgt;
	}

	//set方法
	public void setTruemaxRscuTgt(Double truemaxRscuTgt) {
		this.truemaxRscuTgt = truemaxRscuTgt;
	}
	//get方法
	public Double getTruemaxRscuTgc() {
		return truemaxRscuTgc;
	}

	//set方法
	public void setTruemaxRscuTgc(Double truemaxRscuTgc) {
		this.truemaxRscuTgc = truemaxRscuTgc;
	}
	//get方法
	public Double getTruemaxRscuAca() {
		return truemaxRscuAca;
	}

	//set方法
	public void setTruemaxRscuAca(Double truemaxRscuAca) {
		this.truemaxRscuAca = truemaxRscuAca;
	}
	//get方法
	public Double getTruemaxRscuAcg() {
		return truemaxRscuAcg;
	}

	//set方法
	public void setTruemaxRscuAcg(Double truemaxRscuAcg) {
		this.truemaxRscuAcg = truemaxRscuAcg;
	}
	//get方法
	public Double getTruemaxRscuAct() {
		return truemaxRscuAct;
	}

	//set方法
	public void setTruemaxRscuAct(Double truemaxRscuAct) {
		this.truemaxRscuAct = truemaxRscuAct;
	}
	//get方法
	public Double getTruemaxRscuAcc() {
		return truemaxRscuAcc;
	}

	//set方法
	public void setTruemaxRscuAcc(Double truemaxRscuAcc) {
		this.truemaxRscuAcc = truemaxRscuAcc;
	}
	//get方法
	public Double getTruemaxRscuTca() {
		return truemaxRscuTca;
	}

	//set方法
	public void setTruemaxRscuTca(Double truemaxRscuTca) {
		this.truemaxRscuTca = truemaxRscuTca;
	}
	//get方法
	public Double getTruemaxRscuTcg() {
		return truemaxRscuTcg;
	}

	//set方法
	public void setTruemaxRscuTcg(Double truemaxRscuTcg) {
		this.truemaxRscuTcg = truemaxRscuTcg;
	}
	//get方法
	public Double getTruemaxRscuTct() {
		return truemaxRscuTct;
	}

	//set方法
	public void setTruemaxRscuTct(Double truemaxRscuTct) {
		this.truemaxRscuTct = truemaxRscuTct;
	}
	//get方法
	public Double getTruemaxRscuTcc() {
		return truemaxRscuTcc;
	}

	//set方法
	public void setTruemaxRscuTcc(Double truemaxRscuTcc) {
		this.truemaxRscuTcc = truemaxRscuTcc;
	}
	//get方法
	public Double getTruemaxRscuGga() {
		return truemaxRscuGga;
	}

	//set方法
	public void setTruemaxRscuGga(Double truemaxRscuGga) {
		this.truemaxRscuGga = truemaxRscuGga;
	}
	//get方法
	public Double getTruemaxRscuGgg() {
		return truemaxRscuGgg;
	}

	//set方法
	public void setTruemaxRscuGgg(Double truemaxRscuGgg) {
		this.truemaxRscuGgg = truemaxRscuGgg;
	}
	//get方法
	public Double getTruemaxRscuGgt() {
		return truemaxRscuGgt;
	}

	//set方法
	public void setTruemaxRscuGgt(Double truemaxRscuGgt) {
		this.truemaxRscuGgt = truemaxRscuGgt;
	}
	//get方法
	public Double getTruemaxRscuGgc() {
		return truemaxRscuGgc;
	}

	//set方法
	public void setTruemaxRscuGgc(Double truemaxRscuGgc) {
		this.truemaxRscuGgc = truemaxRscuGgc;
	}
	//get方法
	public Double getTruemaxRscuCga() {
		return truemaxRscuCga;
	}

	//set方法
	public void setTruemaxRscuCga(Double truemaxRscuCga) {
		this.truemaxRscuCga = truemaxRscuCga;
	}
	//get方法
	public Double getTruemaxRscuCgg() {
		return truemaxRscuCgg;
	}

	//set方法
	public void setTruemaxRscuCgg(Double truemaxRscuCgg) {
		this.truemaxRscuCgg = truemaxRscuCgg;
	}
	//get方法
	public Double getTruemaxRscuCgt() {
		return truemaxRscuCgt;
	}

	//set方法
	public void setTruemaxRscuCgt(Double truemaxRscuCgt) {
		this.truemaxRscuCgt = truemaxRscuCgt;
	}
	//get方法
	public Double getTruemaxRscuCgc() {
		return truemaxRscuCgc;
	}

	//set方法
	public void setTruemaxRscuCgc(Double truemaxRscuCgc) {
		this.truemaxRscuCgc = truemaxRscuCgc;
	}
	//get方法
	public Double getTruemaxRscuGca() {
		return truemaxRscuGca;
	}

	//set方法
	public void setTruemaxRscuGca(Double truemaxRscuGca) {
		this.truemaxRscuGca = truemaxRscuGca;
	}
	//get方法
	public Double getTruemaxRscuGcg() {
		return truemaxRscuGcg;
	}

	//set方法
	public void setTruemaxRscuGcg(Double truemaxRscuGcg) {
		this.truemaxRscuGcg = truemaxRscuGcg;
	}
	//get方法
	public Double getTruemaxRscuGct() {
		return truemaxRscuGct;
	}

	//set方法
	public void setTruemaxRscuGct(Double truemaxRscuGct) {
		this.truemaxRscuGct = truemaxRscuGct;
	}
	//get方法
	public Double getTruemaxRscuGcc() {
		return truemaxRscuGcc;
	}

	//set方法
	public void setTruemaxRscuGcc(Double truemaxRscuGcc) {
		this.truemaxRscuGcc = truemaxRscuGcc;
	}
	//get方法
	public Double getTruemaxRscuCca() {
		return truemaxRscuCca;
	}

	//set方法
	public void setTruemaxRscuCca(Double truemaxRscuCca) {
		this.truemaxRscuCca = truemaxRscuCca;
	}
	//get方法
	public Double getTruemaxRscuCcg() {
		return truemaxRscuCcg;
	}

	//set方法
	public void setTruemaxRscuCcg(Double truemaxRscuCcg) {
		this.truemaxRscuCcg = truemaxRscuCcg;
	}
	//get方法
	public Double getTruemaxRscuCct() {
		return truemaxRscuCct;
	}

	//set方法
	public void setTruemaxRscuCct(Double truemaxRscuCct) {
		this.truemaxRscuCct = truemaxRscuCct;
	}
	//get方法
	public Double getTruemaxRscuCcc() {
		return truemaxRscuCcc;
	}

	//set方法
	public void setTruemaxRscuCcc(Double truemaxRscuCcc) {
		this.truemaxRscuCcc = truemaxRscuCcc;
	}
	//get方法
	public Double getMaxRscuAaa() {
		return maxRscuAaa;
	}

	//set方法
	public void setMaxRscuAaa(Double maxRscuAaa) {
		this.maxRscuAaa = maxRscuAaa;
	}
	//get方法
	public Double getMaxRscuAag() {
		return maxRscuAag;
	}

	//set方法
	public void setMaxRscuAag(Double maxRscuAag) {
		this.maxRscuAag = maxRscuAag;
	}
	//get方法
	public Double getMaxRscuAat() {
		return maxRscuAat;
	}

	//set方法
	public void setMaxRscuAat(Double maxRscuAat) {
		this.maxRscuAat = maxRscuAat;
	}
	//get方法
	public Double getMaxRscuAac() {
		return maxRscuAac;
	}

	//set方法
	public void setMaxRscuAac(Double maxRscuAac) {
		this.maxRscuAac = maxRscuAac;
	}
	//get方法
	public Double getMaxRscuTaa() {
		return maxRscuTaa;
	}

	//set方法
	public void setMaxRscuTaa(Double maxRscuTaa) {
		this.maxRscuTaa = maxRscuTaa;
	}
	//get方法
	public Double getMaxRscuTag() {
		return maxRscuTag;
	}

	//set方法
	public void setMaxRscuTag(Double maxRscuTag) {
		this.maxRscuTag = maxRscuTag;
	}
	//get方法
	public Double getMaxRscuTat() {
		return maxRscuTat;
	}

	//set方法
	public void setMaxRscuTat(Double maxRscuTat) {
		this.maxRscuTat = maxRscuTat;
	}
	//get方法
	public Double getMaxRscuTac() {
		return maxRscuTac;
	}

	//set方法
	public void setMaxRscuTac(Double maxRscuTac) {
		this.maxRscuTac = maxRscuTac;
	}
	//get方法
	public Double getMaxRscuAta() {
		return maxRscuAta;
	}

	//set方法
	public void setMaxRscuAta(Double maxRscuAta) {
		this.maxRscuAta = maxRscuAta;
	}
	//get方法
	public Double getMaxRscuAtg() {
		return maxRscuAtg;
	}

	//set方法
	public void setMaxRscuAtg(Double maxRscuAtg) {
		this.maxRscuAtg = maxRscuAtg;
	}
	//get方法
	public Double getMaxRscuAtt() {
		return maxRscuAtt;
	}

	//set方法
	public void setMaxRscuAtt(Double maxRscuAtt) {
		this.maxRscuAtt = maxRscuAtt;
	}
	//get方法
	public Double getMaxRscuAtc() {
		return maxRscuAtc;
	}

	//set方法
	public void setMaxRscuAtc(Double maxRscuAtc) {
		this.maxRscuAtc = maxRscuAtc;
	}
	//get方法
	public Double getMaxRscuTta() {
		return maxRscuTta;
	}

	//set方法
	public void setMaxRscuTta(Double maxRscuTta) {
		this.maxRscuTta = maxRscuTta;
	}
	//get方法
	public Double getMaxRscuTtg() {
		return maxRscuTtg;
	}

	//set方法
	public void setMaxRscuTtg(Double maxRscuTtg) {
		this.maxRscuTtg = maxRscuTtg;
	}
	//get方法
	public Double getMaxRscuTtt() {
		return maxRscuTtt;
	}

	//set方法
	public void setMaxRscuTtt(Double maxRscuTtt) {
		this.maxRscuTtt = maxRscuTtt;
	}
	//get方法
	public Double getMaxRscuTtc() {
		return maxRscuTtc;
	}

	//set方法
	public void setMaxRscuTtc(Double maxRscuTtc) {
		this.maxRscuTtc = maxRscuTtc;
	}
	//get方法
	public Double getMaxRscuGaa() {
		return maxRscuGaa;
	}

	//set方法
	public void setMaxRscuGaa(Double maxRscuGaa) {
		this.maxRscuGaa = maxRscuGaa;
	}
	//get方法
	public Double getMaxRscuGag() {
		return maxRscuGag;
	}

	//set方法
	public void setMaxRscuGag(Double maxRscuGag) {
		this.maxRscuGag = maxRscuGag;
	}
	//get方法
	public Double getMaxRscuGat() {
		return maxRscuGat;
	}

	//set方法
	public void setMaxRscuGat(Double maxRscuGat) {
		this.maxRscuGat = maxRscuGat;
	}
	//get方法
	public Double getMaxRscuGac() {
		return maxRscuGac;
	}

	//set方法
	public void setMaxRscuGac(Double maxRscuGac) {
		this.maxRscuGac = maxRscuGac;
	}
	//get方法
	public Double getMaxRscuCaa() {
		return maxRscuCaa;
	}

	//set方法
	public void setMaxRscuCaa(Double maxRscuCaa) {
		this.maxRscuCaa = maxRscuCaa;
	}
	//get方法
	public Double getMaxRscuCag() {
		return maxRscuCag;
	}

	//set方法
	public void setMaxRscuCag(Double maxRscuCag) {
		this.maxRscuCag = maxRscuCag;
	}
	//get方法
	public Double getMaxRscuCat() {
		return maxRscuCat;
	}

	//set方法
	public void setMaxRscuCat(Double maxRscuCat) {
		this.maxRscuCat = maxRscuCat;
	}
	//get方法
	public Double getMaxRscuCac() {
		return maxRscuCac;
	}

	//set方法
	public void setMaxRscuCac(Double maxRscuCac) {
		this.maxRscuCac = maxRscuCac;
	}
	//get方法
	public Double getMaxRscuGta() {
		return maxRscuGta;
	}

	//set方法
	public void setMaxRscuGta(Double maxRscuGta) {
		this.maxRscuGta = maxRscuGta;
	}
	//get方法
	public Double getMaxRscuGtg() {
		return maxRscuGtg;
	}

	//set方法
	public void setMaxRscuGtg(Double maxRscuGtg) {
		this.maxRscuGtg = maxRscuGtg;
	}
	//get方法
	public Double getMaxRscuGtt() {
		return maxRscuGtt;
	}

	//set方法
	public void setMaxRscuGtt(Double maxRscuGtt) {
		this.maxRscuGtt = maxRscuGtt;
	}
	//get方法
	public Double getMaxRscuGtc() {
		return maxRscuGtc;
	}

	//set方法
	public void setMaxRscuGtc(Double maxRscuGtc) {
		this.maxRscuGtc = maxRscuGtc;
	}
	//get方法
	public Double getMaxRscuCta() {
		return maxRscuCta;
	}

	//set方法
	public void setMaxRscuCta(Double maxRscuCta) {
		this.maxRscuCta = maxRscuCta;
	}
	//get方法
	public Double getMaxRscuCtg() {
		return maxRscuCtg;
	}

	//set方法
	public void setMaxRscuCtg(Double maxRscuCtg) {
		this.maxRscuCtg = maxRscuCtg;
	}
	//get方法
	public Double getMaxRscuCtt() {
		return maxRscuCtt;
	}

	//set方法
	public void setMaxRscuCtt(Double maxRscuCtt) {
		this.maxRscuCtt = maxRscuCtt;
	}
	//get方法
	public Double getMaxRscuCtc() {
		return maxRscuCtc;
	}

	//set方法
	public void setMaxRscuCtc(Double maxRscuCtc) {
		this.maxRscuCtc = maxRscuCtc;
	}
	//get方法
	public Double getMaxRscuAga() {
		return maxRscuAga;
	}

	//set方法
	public void setMaxRscuAga(Double maxRscuAga) {
		this.maxRscuAga = maxRscuAga;
	}
	//get方法
	public Double getMaxRscuAgg() {
		return maxRscuAgg;
	}

	//set方法
	public void setMaxRscuAgg(Double maxRscuAgg) {
		this.maxRscuAgg = maxRscuAgg;
	}
	//get方法
	public Double getMaxRscuAgt() {
		return maxRscuAgt;
	}

	//set方法
	public void setMaxRscuAgt(Double maxRscuAgt) {
		this.maxRscuAgt = maxRscuAgt;
	}
	//get方法
	public Double getMaxRscuAgc() {
		return maxRscuAgc;
	}

	//set方法
	public void setMaxRscuAgc(Double maxRscuAgc) {
		this.maxRscuAgc = maxRscuAgc;
	}
	//get方法
	public Double getMaxRscuTga() {
		return maxRscuTga;
	}

	//set方法
	public void setMaxRscuTga(Double maxRscuTga) {
		this.maxRscuTga = maxRscuTga;
	}
	//get方法
	public Double getMaxRscuTgg() {
		return maxRscuTgg;
	}

	//set方法
	public void setMaxRscuTgg(Double maxRscuTgg) {
		this.maxRscuTgg = maxRscuTgg;
	}
	//get方法
	public Double getMaxRscuTgt() {
		return maxRscuTgt;
	}

	//set方法
	public void setMaxRscuTgt(Double maxRscuTgt) {
		this.maxRscuTgt = maxRscuTgt;
	}
	//get方法
	public Double getMaxRscuTgc() {
		return maxRscuTgc;
	}

	//set方法
	public void setMaxRscuTgc(Double maxRscuTgc) {
		this.maxRscuTgc = maxRscuTgc;
	}
	//get方法
	public Double getMaxRscuAca() {
		return maxRscuAca;
	}

	//set方法
	public void setMaxRscuAca(Double maxRscuAca) {
		this.maxRscuAca = maxRscuAca;
	}
	//get方法
	public Double getMaxRscuAcg() {
		return maxRscuAcg;
	}

	//set方法
	public void setMaxRscuAcg(Double maxRscuAcg) {
		this.maxRscuAcg = maxRscuAcg;
	}
	//get方法
	public Double getMaxRscuAct() {
		return maxRscuAct;
	}

	//set方法
	public void setMaxRscuAct(Double maxRscuAct) {
		this.maxRscuAct = maxRscuAct;
	}
	//get方法
	public Double getMaxRscuAcc() {
		return maxRscuAcc;
	}

	//set方法
	public void setMaxRscuAcc(Double maxRscuAcc) {
		this.maxRscuAcc = maxRscuAcc;
	}
	//get方法
	public Double getMaxRscuTca() {
		return maxRscuTca;
	}

	//set方法
	public void setMaxRscuTca(Double maxRscuTca) {
		this.maxRscuTca = maxRscuTca;
	}
	//get方法
	public Double getMaxRscuTcg() {
		return maxRscuTcg;
	}

	//set方法
	public void setMaxRscuTcg(Double maxRscuTcg) {
		this.maxRscuTcg = maxRscuTcg;
	}
	//get方法
	public Double getMaxRscuTct() {
		return maxRscuTct;
	}

	//set方法
	public void setMaxRscuTct(Double maxRscuTct) {
		this.maxRscuTct = maxRscuTct;
	}
	//get方法
	public Double getMaxRscuTcc() {
		return maxRscuTcc;
	}

	//set方法
	public void setMaxRscuTcc(Double maxRscuTcc) {
		this.maxRscuTcc = maxRscuTcc;
	}
	//get方法
	public Double getMaxRscuGga() {
		return maxRscuGga;
	}

	//set方法
	public void setMaxRscuGga(Double maxRscuGga) {
		this.maxRscuGga = maxRscuGga;
	}
	//get方法
	public Double getMaxRscuGgg() {
		return maxRscuGgg;
	}

	//set方法
	public void setMaxRscuGgg(Double maxRscuGgg) {
		this.maxRscuGgg = maxRscuGgg;
	}
	//get方法
	public Double getMaxRscuGgt() {
		return maxRscuGgt;
	}

	//set方法
	public void setMaxRscuGgt(Double maxRscuGgt) {
		this.maxRscuGgt = maxRscuGgt;
	}
	//get方法
	public Double getMaxRscuGgc() {
		return maxRscuGgc;
	}

	//set方法
	public void setMaxRscuGgc(Double maxRscuGgc) {
		this.maxRscuGgc = maxRscuGgc;
	}
	//get方法
	public Double getMaxRscuCga() {
		return maxRscuCga;
	}

	//set方法
	public void setMaxRscuCga(Double maxRscuCga) {
		this.maxRscuCga = maxRscuCga;
	}
	//get方法
	public Double getMaxRscuCgg() {
		return maxRscuCgg;
	}

	//set方法
	public void setMaxRscuCgg(Double maxRscuCgg) {
		this.maxRscuCgg = maxRscuCgg;
	}
	//get方法
	public Double getMaxRscuCgt() {
		return maxRscuCgt;
	}

	//set方法
	public void setMaxRscuCgt(Double maxRscuCgt) {
		this.maxRscuCgt = maxRscuCgt;
	}
	//get方法
	public Double getMaxRscuCgc() {
		return maxRscuCgc;
	}

	//set方法
	public void setMaxRscuCgc(Double maxRscuCgc) {
		this.maxRscuCgc = maxRscuCgc;
	}
	//get方法
	public Double getMaxRscuGca() {
		return maxRscuGca;
	}

	//set方法
	public void setMaxRscuGca(Double maxRscuGca) {
		this.maxRscuGca = maxRscuGca;
	}
	//get方法
	public Double getMaxRscuGcg() {
		return maxRscuGcg;
	}

	//set方法
	public void setMaxRscuGcg(Double maxRscuGcg) {
		this.maxRscuGcg = maxRscuGcg;
	}
	//get方法
	public Double getMaxRscuGct() {
		return maxRscuGct;
	}

	//set方法
	public void setMaxRscuGct(Double maxRscuGct) {
		this.maxRscuGct = maxRscuGct;
	}
	//get方法
	public Double getMaxRscuGcc() {
		return maxRscuGcc;
	}

	//set方法
	public void setMaxRscuGcc(Double maxRscuGcc) {
		this.maxRscuGcc = maxRscuGcc;
	}
	//get方法
	public Double getMaxRscuCca() {
		return maxRscuCca;
	}

	//set方法
	public void setMaxRscuCca(Double maxRscuCca) {
		this.maxRscuCca = maxRscuCca;
	}
	//get方法
	public Double getMaxRscuCcg() {
		return maxRscuCcg;
	}

	//set方法
	public void setMaxRscuCcg(Double maxRscuCcg) {
		this.maxRscuCcg = maxRscuCcg;
	}
	//get方法
	public Double getMaxRscuCct() {
		return maxRscuCct;
	}

	//set方法
	public void setMaxRscuCct(Double maxRscuCct) {
		this.maxRscuCct = maxRscuCct;
	}
	//get方法
	public Double getMaxRscuCcc() {
		return maxRscuCcc;
	}

	//set方法
	public void setMaxRscuCcc(Double maxRscuCcc) {
		this.maxRscuCcc = maxRscuCcc;
	}
	//get方法
	public Double getMeanRscuAaa() {
		return meanRscuAaa;
	}

	//set方法
	public void setMeanRscuAaa(Double meanRscuAaa) {
		this.meanRscuAaa = meanRscuAaa;
	}
	//get方法
	public Double getMeanRscuAag() {
		return meanRscuAag;
	}

	//set方法
	public void setMeanRscuAag(Double meanRscuAag) {
		this.meanRscuAag = meanRscuAag;
	}
	//get方法
	public Double getMeanRscuAat() {
		return meanRscuAat;
	}

	//set方法
	public void setMeanRscuAat(Double meanRscuAat) {
		this.meanRscuAat = meanRscuAat;
	}
	//get方法
	public Double getMeanRscuAac() {
		return meanRscuAac;
	}

	//set方法
	public void setMeanRscuAac(Double meanRscuAac) {
		this.meanRscuAac = meanRscuAac;
	}
	//get方法
	public Double getMeanRscuTaa() {
		return meanRscuTaa;
	}

	//set方法
	public void setMeanRscuTaa(Double meanRscuTaa) {
		this.meanRscuTaa = meanRscuTaa;
	}
	//get方法
	public Double getMeanRscuTag() {
		return meanRscuTag;
	}

	//set方法
	public void setMeanRscuTag(Double meanRscuTag) {
		this.meanRscuTag = meanRscuTag;
	}
	//get方法
	public Double getMeanRscuTat() {
		return meanRscuTat;
	}

	//set方法
	public void setMeanRscuTat(Double meanRscuTat) {
		this.meanRscuTat = meanRscuTat;
	}
	//get方法
	public Double getMeanRscuTac() {
		return meanRscuTac;
	}

	//set方法
	public void setMeanRscuTac(Double meanRscuTac) {
		this.meanRscuTac = meanRscuTac;
	}
	//get方法
	public Double getMeanRscuAta() {
		return meanRscuAta;
	}

	//set方法
	public void setMeanRscuAta(Double meanRscuAta) {
		this.meanRscuAta = meanRscuAta;
	}
	//get方法
	public Double getMeanRscuAtg() {
		return meanRscuAtg;
	}

	//set方法
	public void setMeanRscuAtg(Double meanRscuAtg) {
		this.meanRscuAtg = meanRscuAtg;
	}
	//get方法
	public Double getMeanRscuAtt() {
		return meanRscuAtt;
	}

	//set方法
	public void setMeanRscuAtt(Double meanRscuAtt) {
		this.meanRscuAtt = meanRscuAtt;
	}
	//get方法
	public Double getMeanRscuAtc() {
		return meanRscuAtc;
	}

	//set方法
	public void setMeanRscuAtc(Double meanRscuAtc) {
		this.meanRscuAtc = meanRscuAtc;
	}
	//get方法
	public Double getMeanRscuTta() {
		return meanRscuTta;
	}

	//set方法
	public void setMeanRscuTta(Double meanRscuTta) {
		this.meanRscuTta = meanRscuTta;
	}
	//get方法
	public Double getMeanRscuTtg() {
		return meanRscuTtg;
	}

	//set方法
	public void setMeanRscuTtg(Double meanRscuTtg) {
		this.meanRscuTtg = meanRscuTtg;
	}
	//get方法
	public Double getMeanRscuTtt() {
		return meanRscuTtt;
	}

	//set方法
	public void setMeanRscuTtt(Double meanRscuTtt) {
		this.meanRscuTtt = meanRscuTtt;
	}
	//get方法
	public Double getMeanRscuTtc() {
		return meanRscuTtc;
	}

	//set方法
	public void setMeanRscuTtc(Double meanRscuTtc) {
		this.meanRscuTtc = meanRscuTtc;
	}
	//get方法
	public Double getMeanRscuGaa() {
		return meanRscuGaa;
	}

	//set方法
	public void setMeanRscuGaa(Double meanRscuGaa) {
		this.meanRscuGaa = meanRscuGaa;
	}
	//get方法
	public Double getMeanRscuGag() {
		return meanRscuGag;
	}

	//set方法
	public void setMeanRscuGag(Double meanRscuGag) {
		this.meanRscuGag = meanRscuGag;
	}
	//get方法
	public Double getMeanRscuGat() {
		return meanRscuGat;
	}

	//set方法
	public void setMeanRscuGat(Double meanRscuGat) {
		this.meanRscuGat = meanRscuGat;
	}
	//get方法
	public Double getMeanRscuGac() {
		return meanRscuGac;
	}

	//set方法
	public void setMeanRscuGac(Double meanRscuGac) {
		this.meanRscuGac = meanRscuGac;
	}
	//get方法
	public Double getMeanRscuCaa() {
		return meanRscuCaa;
	}

	//set方法
	public void setMeanRscuCaa(Double meanRscuCaa) {
		this.meanRscuCaa = meanRscuCaa;
	}
	//get方法
	public Double getMeanRscuCag() {
		return meanRscuCag;
	}

	//set方法
	public void setMeanRscuCag(Double meanRscuCag) {
		this.meanRscuCag = meanRscuCag;
	}
	//get方法
	public Double getMeanRscuCat() {
		return meanRscuCat;
	}

	//set方法
	public void setMeanRscuCat(Double meanRscuCat) {
		this.meanRscuCat = meanRscuCat;
	}
	//get方法
	public Double getMeanRscuCac() {
		return meanRscuCac;
	}

	//set方法
	public void setMeanRscuCac(Double meanRscuCac) {
		this.meanRscuCac = meanRscuCac;
	}
	//get方法
	public Double getMeanRscuGta() {
		return meanRscuGta;
	}

	//set方法
	public void setMeanRscuGta(Double meanRscuGta) {
		this.meanRscuGta = meanRscuGta;
	}
	//get方法
	public Double getMeanRscuGtg() {
		return meanRscuGtg;
	}

	//set方法
	public void setMeanRscuGtg(Double meanRscuGtg) {
		this.meanRscuGtg = meanRscuGtg;
	}
	//get方法
	public Double getMeanRscuGtt() {
		return meanRscuGtt;
	}

	//set方法
	public void setMeanRscuGtt(Double meanRscuGtt) {
		this.meanRscuGtt = meanRscuGtt;
	}
	//get方法
	public Double getMeanRscuGtc() {
		return meanRscuGtc;
	}

	//set方法
	public void setMeanRscuGtc(Double meanRscuGtc) {
		this.meanRscuGtc = meanRscuGtc;
	}
	//get方法
	public Double getMeanRscuCta() {
		return meanRscuCta;
	}

	//set方法
	public void setMeanRscuCta(Double meanRscuCta) {
		this.meanRscuCta = meanRscuCta;
	}
	//get方法
	public Double getMeanRscuCtg() {
		return meanRscuCtg;
	}

	//set方法
	public void setMeanRscuCtg(Double meanRscuCtg) {
		this.meanRscuCtg = meanRscuCtg;
	}
	//get方法
	public Double getMeanRscuCtt() {
		return meanRscuCtt;
	}

	//set方法
	public void setMeanRscuCtt(Double meanRscuCtt) {
		this.meanRscuCtt = meanRscuCtt;
	}
	//get方法
	public Double getMeanRscuCtc() {
		return meanRscuCtc;
	}

	//set方法
	public void setMeanRscuCtc(Double meanRscuCtc) {
		this.meanRscuCtc = meanRscuCtc;
	}
	//get方法
	public Double getMeanRscuAga() {
		return meanRscuAga;
	}

	//set方法
	public void setMeanRscuAga(Double meanRscuAga) {
		this.meanRscuAga = meanRscuAga;
	}
	//get方法
	public Double getMeanRscuAgg() {
		return meanRscuAgg;
	}

	//set方法
	public void setMeanRscuAgg(Double meanRscuAgg) {
		this.meanRscuAgg = meanRscuAgg;
	}
	//get方法
	public Double getMeanRscuAgt() {
		return meanRscuAgt;
	}

	//set方法
	public void setMeanRscuAgt(Double meanRscuAgt) {
		this.meanRscuAgt = meanRscuAgt;
	}
	//get方法
	public Double getMeanRscuAgc() {
		return meanRscuAgc;
	}

	//set方法
	public void setMeanRscuAgc(Double meanRscuAgc) {
		this.meanRscuAgc = meanRscuAgc;
	}
	//get方法
	public Double getMeanRscuTga() {
		return meanRscuTga;
	}

	//set方法
	public void setMeanRscuTga(Double meanRscuTga) {
		this.meanRscuTga = meanRscuTga;
	}
	//get方法
	public Double getMeanRscuTgg() {
		return meanRscuTgg;
	}

	//set方法
	public void setMeanRscuTgg(Double meanRscuTgg) {
		this.meanRscuTgg = meanRscuTgg;
	}
	//get方法
	public Double getMeanRscuTgt() {
		return meanRscuTgt;
	}

	//set方法
	public void setMeanRscuTgt(Double meanRscuTgt) {
		this.meanRscuTgt = meanRscuTgt;
	}
	//get方法
	public Double getMeanRscuTgc() {
		return meanRscuTgc;
	}

	//set方法
	public void setMeanRscuTgc(Double meanRscuTgc) {
		this.meanRscuTgc = meanRscuTgc;
	}
	//get方法
	public Double getMeanRscuAca() {
		return meanRscuAca;
	}

	//set方法
	public void setMeanRscuAca(Double meanRscuAca) {
		this.meanRscuAca = meanRscuAca;
	}
	//get方法
	public Double getMeanRscuAcg() {
		return meanRscuAcg;
	}

	//set方法
	public void setMeanRscuAcg(Double meanRscuAcg) {
		this.meanRscuAcg = meanRscuAcg;
	}
	//get方法
	public Double getMeanRscuAct() {
		return meanRscuAct;
	}

	//set方法
	public void setMeanRscuAct(Double meanRscuAct) {
		this.meanRscuAct = meanRscuAct;
	}
	//get方法
	public Double getMeanRscuAcc() {
		return meanRscuAcc;
	}

	//set方法
	public void setMeanRscuAcc(Double meanRscuAcc) {
		this.meanRscuAcc = meanRscuAcc;
	}
	//get方法
	public Double getMeanRscuTca() {
		return meanRscuTca;
	}

	//set方法
	public void setMeanRscuTca(Double meanRscuTca) {
		this.meanRscuTca = meanRscuTca;
	}
	//get方法
	public Double getMeanRscuTcg() {
		return meanRscuTcg;
	}

	//set方法
	public void setMeanRscuTcg(Double meanRscuTcg) {
		this.meanRscuTcg = meanRscuTcg;
	}
	//get方法
	public Double getMeanRscuTct() {
		return meanRscuTct;
	}

	//set方法
	public void setMeanRscuTct(Double meanRscuTct) {
		this.meanRscuTct = meanRscuTct;
	}
	//get方法
	public Double getMeanRscuTcc() {
		return meanRscuTcc;
	}

	//set方法
	public void setMeanRscuTcc(Double meanRscuTcc) {
		this.meanRscuTcc = meanRscuTcc;
	}
	//get方法
	public Double getMeanRscuGga() {
		return meanRscuGga;
	}

	//set方法
	public void setMeanRscuGga(Double meanRscuGga) {
		this.meanRscuGga = meanRscuGga;
	}
	//get方法
	public Double getMeanRscuGgg() {
		return meanRscuGgg;
	}

	//set方法
	public void setMeanRscuGgg(Double meanRscuGgg) {
		this.meanRscuGgg = meanRscuGgg;
	}
	//get方法
	public Double getMeanRscuGgt() {
		return meanRscuGgt;
	}

	//set方法
	public void setMeanRscuGgt(Double meanRscuGgt) {
		this.meanRscuGgt = meanRscuGgt;
	}
	//get方法
	public Double getMeanRscuGgc() {
		return meanRscuGgc;
	}

	//set方法
	public void setMeanRscuGgc(Double meanRscuGgc) {
		this.meanRscuGgc = meanRscuGgc;
	}
	//get方法
	public Double getMeanRscuCga() {
		return meanRscuCga;
	}

	//set方法
	public void setMeanRscuCga(Double meanRscuCga) {
		this.meanRscuCga = meanRscuCga;
	}
	//get方法
	public Double getMeanRscuCgg() {
		return meanRscuCgg;
	}

	//set方法
	public void setMeanRscuCgg(Double meanRscuCgg) {
		this.meanRscuCgg = meanRscuCgg;
	}
	//get方法
	public Double getMeanRscuCgt() {
		return meanRscuCgt;
	}

	//set方法
	public void setMeanRscuCgt(Double meanRscuCgt) {
		this.meanRscuCgt = meanRscuCgt;
	}
	//get方法
	public Double getMeanRscuCgc() {
		return meanRscuCgc;
	}

	//set方法
	public void setMeanRscuCgc(Double meanRscuCgc) {
		this.meanRscuCgc = meanRscuCgc;
	}
	//get方法
	public Double getMeanRscuGca() {
		return meanRscuGca;
	}

	//set方法
	public void setMeanRscuGca(Double meanRscuGca) {
		this.meanRscuGca = meanRscuGca;
	}
	//get方法
	public Double getMeanRscuGcg() {
		return meanRscuGcg;
	}

	//set方法
	public void setMeanRscuGcg(Double meanRscuGcg) {
		this.meanRscuGcg = meanRscuGcg;
	}
	//get方法
	public Double getMeanRscuGct() {
		return meanRscuGct;
	}

	//set方法
	public void setMeanRscuGct(Double meanRscuGct) {
		this.meanRscuGct = meanRscuGct;
	}
	//get方法
	public Double getMeanRscuGcc() {
		return meanRscuGcc;
	}

	//set方法
	public void setMeanRscuGcc(Double meanRscuGcc) {
		this.meanRscuGcc = meanRscuGcc;
	}
	//get方法
	public Double getMeanRscuCca() {
		return meanRscuCca;
	}

	//set方法
	public void setMeanRscuCca(Double meanRscuCca) {
		this.meanRscuCca = meanRscuCca;
	}
	//get方法
	public Double getMeanRscuCcg() {
		return meanRscuCcg;
	}

	//set方法
	public void setMeanRscuCcg(Double meanRscuCcg) {
		this.meanRscuCcg = meanRscuCcg;
	}
	//get方法
	public Double getMeanRscuCct() {
		return meanRscuCct;
	}

	//set方法
	public void setMeanRscuCct(Double meanRscuCct) {
		this.meanRscuCct = meanRscuCct;
	}
	//get方法
	public Double getMeanRscuCcc() {
		return meanRscuCcc;
	}

	//set方法
	public void setMeanRscuCcc(Double meanRscuCcc) {
		this.meanRscuCcc = meanRscuCcc;
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
