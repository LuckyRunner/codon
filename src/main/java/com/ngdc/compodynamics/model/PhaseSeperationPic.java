package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:PhaseSeperationPic构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="phase_seperation_pic")
public class PhaseSeperationPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "llr_min")
	private Double llrMin;//

    @Column(name = "corescore_min")
	private Double corescoreMin;//

    @Column(name = "papaprop_min")
	private Double papapropMin;//

    @Column(name = "papafi_min")
	private Double papafiMin;//

    @Column(name = "aa_length_min")
	private Double aaLengthMin;//

    @Column(name = "disorder_percent_min")
	private Double disorderPercentMin;//

    @Column(name = "disorder_30aa_num_min")
	private Double disorder30aaNumMin;//

    @Column(name = "disorder_50aa_num_min")
	private Double disorder50aaNumMin;//

    @Column(name = "disorder_segment_num_min")
	private Double disorderSegmentNumMin;//

    @Column(name = "pscore_min")
	private Double pscoreMin;//

    @Column(name = "llr_truemin")
	private Double llrTruemin;//

    @Column(name = "corescore_truemin")
	private Double corescoreTruemin;//

    @Column(name = "papaprop_truemin")
	private Double papapropTruemin;//

    @Column(name = "papafi_truemin")
	private Double papafiTruemin;//

    @Column(name = "aa_length_truemin")
	private Double aaLengthTruemin;//

    @Column(name = "disorder_percent_truemin")
	private Double disorderPercentTruemin;//

    @Column(name = "disorder_30aa_num_truemin")
	private Double disorder30aaNumTruemin;//

    @Column(name = "disorder_50aa_num_truemin")
	private Double disorder50aaNumTruemin;//

    @Column(name = "disorder_segment_num_truemin")
	private Double disorderSegmentNumTruemin;//

    @Column(name = "pscore_truemin")
	private Double pscoreTruemin;//

    @Column(name = "llr_q05")
	private Double llrQ05;//

    @Column(name = "corescore_q05")
	private Double corescoreQ05;//

    @Column(name = "papaprop_q05")
	private Double papapropQ05;//

    @Column(name = "papafi_q05")
	private Double papafiQ05;//

    @Column(name = "aa_length_q05")
	private Double aaLengthQ05;//

    @Column(name = "disorder_percent_q05")
	private Double disorderPercentQ05;//

    @Column(name = "disorder_30aa_num_q05")
	private Double disorder30aaNumQ05;//

    @Column(name = "disorder_50aa_num_q05")
	private Double disorder50aaNumQ05;//

    @Column(name = "disorder_segment_num_q05")
	private Double disorderSegmentNumQ05;//

    @Column(name = "pscore_q05")
	private Double pscoreQ05;//

    @Column(name = "llr_q25")
	private Double llrQ25;//

    @Column(name = "corescore_q25")
	private Double corescoreQ25;//

    @Column(name = "papaprop_q25")
	private Double papapropQ25;//

    @Column(name = "papafi_q25")
	private Double papafiQ25;//

    @Column(name = "aa_length_q25")
	private Double aaLengthQ25;//

    @Column(name = "disorder_percent_q25")
	private Double disorderPercentQ25;//

    @Column(name = "disorder_30aa_num_q25")
	private Double disorder30aaNumQ25;//

    @Column(name = "disorder_50aa_num_q25")
	private Double disorder50aaNumQ25;//

    @Column(name = "disorder_segment_num_q25")
	private Double disorderSegmentNumQ25;//

    @Column(name = "pscore_q25")
	private Double pscoreQ25;//

    @Column(name = "llr_q50")
	private Double llrQ50;//

    @Column(name = "corescore_q50")
	private Double corescoreQ50;//

    @Column(name = "papaprop_q50")
	private Double papapropQ50;//

    @Column(name = "papafi_q50")
	private Double papafiQ50;//

    @Column(name = "aa_length_q50")
	private Double aaLengthQ50;//

    @Column(name = "disorder_percent_q50")
	private Double disorderPercentQ50;//

    @Column(name = "disorder_30aa_num_q50")
	private Double disorder30aaNumQ50;//

    @Column(name = "disorder_50aa_num_q50")
	private Double disorder50aaNumQ50;//

    @Column(name = "disorder_segment_num_q50")
	private Double disorderSegmentNumQ50;//

    @Column(name = "pscore_q50")
	private Double pscoreQ50;//

    @Column(name = "llr_q75")
	private Double llrQ75;//

    @Column(name = "corescore_q75")
	private Double corescoreQ75;//

    @Column(name = "papaprop_q75")
	private Double papapropQ75;//

    @Column(name = "papafi_q75")
	private Double papafiQ75;//

    @Column(name = "aa_length_q75")
	private Double aaLengthQ75;//

    @Column(name = "disorder_percent_q75")
	private Double disorderPercentQ75;//

    @Column(name = "disorder_30aa_num_q75")
	private Double disorder30aaNumQ75;//

    @Column(name = "disorder_50aa_num_q75")
	private Double disorder50aaNumQ75;//

    @Column(name = "disorder_segment_num_q75")
	private Double disorderSegmentNumQ75;//

    @Column(name = "pscore_q75")
	private Double pscoreQ75;//

    @Column(name = "llr_q95")
	private Double llrQ95;//

    @Column(name = "corescore_q95")
	private Double corescoreQ95;//

    @Column(name = "papaprop_q95")
	private Double papapropQ95;//

    @Column(name = "papafi_q95")
	private Double papafiQ95;//

    @Column(name = "aa_length_q95")
	private Double aaLengthQ95;//

    @Column(name = "disorder_percent_q95")
	private Double disorderPercentQ95;//

    @Column(name = "disorder_30aa_num_q95")
	private Double disorder30aaNumQ95;//

    @Column(name = "disorder_50aa_num_q95")
	private Double disorder50aaNumQ95;//

    @Column(name = "disorder_segment_num_q95")
	private Double disorderSegmentNumQ95;//

    @Column(name = "pscore_q95")
	private Double pscoreQ95;//

    @Column(name = "llr_truemax")
	private Double llrTruemax;//

    @Column(name = "corescore_truemax")
	private Double corescoreTruemax;//

    @Column(name = "papaprop_truemax")
	private Double papapropTruemax;//

    @Column(name = "papafi_truemax")
	private Double papafiTruemax;//

    @Column(name = "aa_length_truemax")
	private Double aaLengthTruemax;//

    @Column(name = "disorder_percent_truemax")
	private Double disorderPercentTruemax;//

    @Column(name = "disorder_30aa_num_truemax")
	private Double disorder30aaNumTruemax;//

    @Column(name = "disorder_50aa_num_truemax")
	private Double disorder50aaNumTruemax;//

    @Column(name = "disorder_segment_num_truemax")
	private Double disorderSegmentNumTruemax;//

    @Column(name = "pscore_truemax")
	private Double pscoreTruemax;//

    @Column(name = "llr_max")
	private Double llrMax;//

    @Column(name = "corescore_max")
	private Double corescoreMax;//

    @Column(name = "papaprop_max")
	private Double papapropMax;//

    @Column(name = "papafi_max")
	private Double papafiMax;//

    @Column(name = "aa_length_max")
	private Double aaLengthMax;//

    @Column(name = "disorder_percent_max")
	private Double disorderPercentMax;//

    @Column(name = "disorder_30aa_num_max")
	private Double disorder30aaNumMax;//

    @Column(name = "disorder_50aa_num_max")
	private Double disorder50aaNumMax;//

    @Column(name = "disorder_segment_num_max")
	private Double disorderSegmentNumMax;//

    @Column(name = "pscore_max")
	private Double pscoreMax;//

    @Column(name = "llr_mean")
	private Double llrMean;//

    @Column(name = "corescore_mean")
	private Double corescoreMean;//

    @Column(name = "papaprop_mean")
	private Double papapropMean;//

    @Column(name = "papafi_mean")
	private Double papafiMean;//

    @Column(name = "aa_length_mean")
	private Double aaLengthMean;//

    @Column(name = "disorder_percent_mean")
	private Double disorderPercentMean;//

    @Column(name = "disorder_30aa_num_mean")
	private Double disorder30aaNumMean;//

    @Column(name = "disorder_50aa_num_mean")
	private Double disorder50aaNumMean;//

    @Column(name = "disorder_segment_num_mean")
	private Double disorderSegmentNumMean;//

    @Column(name = "pscore_mean")
	private Double pscoreMean;//

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
	public Double getLlrMin() {
		return llrMin;
	}

	//set方法
	public void setLlrMin(Double llrMin) {
		this.llrMin = llrMin;
	}
	//get方法
	public Double getCorescoreMin() {
		return corescoreMin;
	}

	//set方法
	public void setCorescoreMin(Double corescoreMin) {
		this.corescoreMin = corescoreMin;
	}
	//get方法
	public Double getPapapropMin() {
		return papapropMin;
	}

	//set方法
	public void setPapapropMin(Double papapropMin) {
		this.papapropMin = papapropMin;
	}
	//get方法
	public Double getPapafiMin() {
		return papafiMin;
	}

	//set方法
	public void setPapafiMin(Double papafiMin) {
		this.papafiMin = papafiMin;
	}
	//get方法
	public Double getAaLengthMin() {
		return aaLengthMin;
	}

	//set方法
	public void setAaLengthMin(Double aaLengthMin) {
		this.aaLengthMin = aaLengthMin;
	}
	//get方法
	public Double getDisorderPercentMin() {
		return disorderPercentMin;
	}

	//set方法
	public void setDisorderPercentMin(Double disorderPercentMin) {
		this.disorderPercentMin = disorderPercentMin;
	}
	//get方法
	public Double getDisorder30aaNumMin() {
		return disorder30aaNumMin;
	}

	//set方法
	public void setDisorder30aaNumMin(Double disorder30aaNumMin) {
		this.disorder30aaNumMin = disorder30aaNumMin;
	}
	//get方法
	public Double getDisorder50aaNumMin() {
		return disorder50aaNumMin;
	}

	//set方法
	public void setDisorder50aaNumMin(Double disorder50aaNumMin) {
		this.disorder50aaNumMin = disorder50aaNumMin;
	}
	//get方法
	public Double getDisorderSegmentNumMin() {
		return disorderSegmentNumMin;
	}

	//set方法
	public void setDisorderSegmentNumMin(Double disorderSegmentNumMin) {
		this.disorderSegmentNumMin = disorderSegmentNumMin;
	}
	//get方法
	public Double getPscoreMin() {
		return pscoreMin;
	}

	//set方法
	public void setPscoreMin(Double pscoreMin) {
		this.pscoreMin = pscoreMin;
	}
	//get方法
	public Double getLlrTruemin() {
		return llrTruemin;
	}

	//set方法
	public void setLlrTruemin(Double llrTruemin) {
		this.llrTruemin = llrTruemin;
	}
	//get方法
	public Double getCorescoreTruemin() {
		return corescoreTruemin;
	}

	//set方法
	public void setCorescoreTruemin(Double corescoreTruemin) {
		this.corescoreTruemin = corescoreTruemin;
	}
	//get方法
	public Double getPapapropTruemin() {
		return papapropTruemin;
	}

	//set方法
	public void setPapapropTruemin(Double papapropTruemin) {
		this.papapropTruemin = papapropTruemin;
	}
	//get方法
	public Double getPapafiTruemin() {
		return papafiTruemin;
	}

	//set方法
	public void setPapafiTruemin(Double papafiTruemin) {
		this.papafiTruemin = papafiTruemin;
	}
	//get方法
	public Double getAaLengthTruemin() {
		return aaLengthTruemin;
	}

	//set方法
	public void setAaLengthTruemin(Double aaLengthTruemin) {
		this.aaLengthTruemin = aaLengthTruemin;
	}
	//get方法
	public Double getDisorderPercentTruemin() {
		return disorderPercentTruemin;
	}

	//set方法
	public void setDisorderPercentTruemin(Double disorderPercentTruemin) {
		this.disorderPercentTruemin = disorderPercentTruemin;
	}
	//get方法
	public Double getDisorder30aaNumTruemin() {
		return disorder30aaNumTruemin;
	}

	//set方法
	public void setDisorder30aaNumTruemin(Double disorder30aaNumTruemin) {
		this.disorder30aaNumTruemin = disorder30aaNumTruemin;
	}
	//get方法
	public Double getDisorder50aaNumTruemin() {
		return disorder50aaNumTruemin;
	}

	//set方法
	public void setDisorder50aaNumTruemin(Double disorder50aaNumTruemin) {
		this.disorder50aaNumTruemin = disorder50aaNumTruemin;
	}
	//get方法
	public Double getDisorderSegmentNumTruemin() {
		return disorderSegmentNumTruemin;
	}

	//set方法
	public void setDisorderSegmentNumTruemin(Double disorderSegmentNumTruemin) {
		this.disorderSegmentNumTruemin = disorderSegmentNumTruemin;
	}
	//get方法
	public Double getPscoreTruemin() {
		return pscoreTruemin;
	}

	//set方法
	public void setPscoreTruemin(Double pscoreTruemin) {
		this.pscoreTruemin = pscoreTruemin;
	}
	//get方法
	public Double getLlrQ05() {
		return llrQ05;
	}

	//set方法
	public void setLlrQ05(Double llrQ05) {
		this.llrQ05 = llrQ05;
	}
	//get方法
	public Double getCorescoreQ05() {
		return corescoreQ05;
	}

	//set方法
	public void setCorescoreQ05(Double corescoreQ05) {
		this.corescoreQ05 = corescoreQ05;
	}
	//get方法
	public Double getPapapropQ05() {
		return papapropQ05;
	}

	//set方法
	public void setPapapropQ05(Double papapropQ05) {
		this.papapropQ05 = papapropQ05;
	}
	//get方法
	public Double getPapafiQ05() {
		return papafiQ05;
	}

	//set方法
	public void setPapafiQ05(Double papafiQ05) {
		this.papafiQ05 = papafiQ05;
	}
	//get方法
	public Double getAaLengthQ05() {
		return aaLengthQ05;
	}

	//set方法
	public void setAaLengthQ05(Double aaLengthQ05) {
		this.aaLengthQ05 = aaLengthQ05;
	}
	//get方法
	public Double getDisorderPercentQ05() {
		return disorderPercentQ05;
	}

	//set方法
	public void setDisorderPercentQ05(Double disorderPercentQ05) {
		this.disorderPercentQ05 = disorderPercentQ05;
	}
	//get方法
	public Double getDisorder30aaNumQ05() {
		return disorder30aaNumQ05;
	}

	//set方法
	public void setDisorder30aaNumQ05(Double disorder30aaNumQ05) {
		this.disorder30aaNumQ05 = disorder30aaNumQ05;
	}
	//get方法
	public Double getDisorder50aaNumQ05() {
		return disorder50aaNumQ05;
	}

	//set方法
	public void setDisorder50aaNumQ05(Double disorder50aaNumQ05) {
		this.disorder50aaNumQ05 = disorder50aaNumQ05;
	}
	//get方法
	public Double getDisorderSegmentNumQ05() {
		return disorderSegmentNumQ05;
	}

	//set方法
	public void setDisorderSegmentNumQ05(Double disorderSegmentNumQ05) {
		this.disorderSegmentNumQ05 = disorderSegmentNumQ05;
	}
	//get方法
	public Double getPscoreQ05() {
		return pscoreQ05;
	}

	//set方法
	public void setPscoreQ05(Double pscoreQ05) {
		this.pscoreQ05 = pscoreQ05;
	}
	//get方法
	public Double getLlrQ25() {
		return llrQ25;
	}

	//set方法
	public void setLlrQ25(Double llrQ25) {
		this.llrQ25 = llrQ25;
	}
	//get方法
	public Double getCorescoreQ25() {
		return corescoreQ25;
	}

	//set方法
	public void setCorescoreQ25(Double corescoreQ25) {
		this.corescoreQ25 = corescoreQ25;
	}
	//get方法
	public Double getPapapropQ25() {
		return papapropQ25;
	}

	//set方法
	public void setPapapropQ25(Double papapropQ25) {
		this.papapropQ25 = papapropQ25;
	}
	//get方法
	public Double getPapafiQ25() {
		return papafiQ25;
	}

	//set方法
	public void setPapafiQ25(Double papafiQ25) {
		this.papafiQ25 = papafiQ25;
	}
	//get方法
	public Double getAaLengthQ25() {
		return aaLengthQ25;
	}

	//set方法
	public void setAaLengthQ25(Double aaLengthQ25) {
		this.aaLengthQ25 = aaLengthQ25;
	}
	//get方法
	public Double getDisorderPercentQ25() {
		return disorderPercentQ25;
	}

	//set方法
	public void setDisorderPercentQ25(Double disorderPercentQ25) {
		this.disorderPercentQ25 = disorderPercentQ25;
	}
	//get方法
	public Double getDisorder30aaNumQ25() {
		return disorder30aaNumQ25;
	}

	//set方法
	public void setDisorder30aaNumQ25(Double disorder30aaNumQ25) {
		this.disorder30aaNumQ25 = disorder30aaNumQ25;
	}
	//get方法
	public Double getDisorder50aaNumQ25() {
		return disorder50aaNumQ25;
	}

	//set方法
	public void setDisorder50aaNumQ25(Double disorder50aaNumQ25) {
		this.disorder50aaNumQ25 = disorder50aaNumQ25;
	}
	//get方法
	public Double getDisorderSegmentNumQ25() {
		return disorderSegmentNumQ25;
	}

	//set方法
	public void setDisorderSegmentNumQ25(Double disorderSegmentNumQ25) {
		this.disorderSegmentNumQ25 = disorderSegmentNumQ25;
	}
	//get方法
	public Double getPscoreQ25() {
		return pscoreQ25;
	}

	//set方法
	public void setPscoreQ25(Double pscoreQ25) {
		this.pscoreQ25 = pscoreQ25;
	}
	//get方法
	public Double getLlrQ50() {
		return llrQ50;
	}

	//set方法
	public void setLlrQ50(Double llrQ50) {
		this.llrQ50 = llrQ50;
	}
	//get方法
	public Double getCorescoreQ50() {
		return corescoreQ50;
	}

	//set方法
	public void setCorescoreQ50(Double corescoreQ50) {
		this.corescoreQ50 = corescoreQ50;
	}
	//get方法
	public Double getPapapropQ50() {
		return papapropQ50;
	}

	//set方法
	public void setPapapropQ50(Double papapropQ50) {
		this.papapropQ50 = papapropQ50;
	}
	//get方法
	public Double getPapafiQ50() {
		return papafiQ50;
	}

	//set方法
	public void setPapafiQ50(Double papafiQ50) {
		this.papafiQ50 = papafiQ50;
	}
	//get方法
	public Double getAaLengthQ50() {
		return aaLengthQ50;
	}

	//set方法
	public void setAaLengthQ50(Double aaLengthQ50) {
		this.aaLengthQ50 = aaLengthQ50;
	}
	//get方法
	public Double getDisorderPercentQ50() {
		return disorderPercentQ50;
	}

	//set方法
	public void setDisorderPercentQ50(Double disorderPercentQ50) {
		this.disorderPercentQ50 = disorderPercentQ50;
	}
	//get方法
	public Double getDisorder30aaNumQ50() {
		return disorder30aaNumQ50;
	}

	//set方法
	public void setDisorder30aaNumQ50(Double disorder30aaNumQ50) {
		this.disorder30aaNumQ50 = disorder30aaNumQ50;
	}
	//get方法
	public Double getDisorder50aaNumQ50() {
		return disorder50aaNumQ50;
	}

	//set方法
	public void setDisorder50aaNumQ50(Double disorder50aaNumQ50) {
		this.disorder50aaNumQ50 = disorder50aaNumQ50;
	}
	//get方法
	public Double getDisorderSegmentNumQ50() {
		return disorderSegmentNumQ50;
	}

	//set方法
	public void setDisorderSegmentNumQ50(Double disorderSegmentNumQ50) {
		this.disorderSegmentNumQ50 = disorderSegmentNumQ50;
	}
	//get方法
	public Double getPscoreQ50() {
		return pscoreQ50;
	}

	//set方法
	public void setPscoreQ50(Double pscoreQ50) {
		this.pscoreQ50 = pscoreQ50;
	}
	//get方法
	public Double getLlrQ75() {
		return llrQ75;
	}

	//set方法
	public void setLlrQ75(Double llrQ75) {
		this.llrQ75 = llrQ75;
	}
	//get方法
	public Double getCorescoreQ75() {
		return corescoreQ75;
	}

	//set方法
	public void setCorescoreQ75(Double corescoreQ75) {
		this.corescoreQ75 = corescoreQ75;
	}
	//get方法
	public Double getPapapropQ75() {
		return papapropQ75;
	}

	//set方法
	public void setPapapropQ75(Double papapropQ75) {
		this.papapropQ75 = papapropQ75;
	}
	//get方法
	public Double getPapafiQ75() {
		return papafiQ75;
	}

	//set方法
	public void setPapafiQ75(Double papafiQ75) {
		this.papafiQ75 = papafiQ75;
	}
	//get方法
	public Double getAaLengthQ75() {
		return aaLengthQ75;
	}

	//set方法
	public void setAaLengthQ75(Double aaLengthQ75) {
		this.aaLengthQ75 = aaLengthQ75;
	}
	//get方法
	public Double getDisorderPercentQ75() {
		return disorderPercentQ75;
	}

	//set方法
	public void setDisorderPercentQ75(Double disorderPercentQ75) {
		this.disorderPercentQ75 = disorderPercentQ75;
	}
	//get方法
	public Double getDisorder30aaNumQ75() {
		return disorder30aaNumQ75;
	}

	//set方法
	public void setDisorder30aaNumQ75(Double disorder30aaNumQ75) {
		this.disorder30aaNumQ75 = disorder30aaNumQ75;
	}
	//get方法
	public Double getDisorder50aaNumQ75() {
		return disorder50aaNumQ75;
	}

	//set方法
	public void setDisorder50aaNumQ75(Double disorder50aaNumQ75) {
		this.disorder50aaNumQ75 = disorder50aaNumQ75;
	}
	//get方法
	public Double getDisorderSegmentNumQ75() {
		return disorderSegmentNumQ75;
	}

	//set方法
	public void setDisorderSegmentNumQ75(Double disorderSegmentNumQ75) {
		this.disorderSegmentNumQ75 = disorderSegmentNumQ75;
	}
	//get方法
	public Double getPscoreQ75() {
		return pscoreQ75;
	}

	//set方法
	public void setPscoreQ75(Double pscoreQ75) {
		this.pscoreQ75 = pscoreQ75;
	}
	//get方法
	public Double getLlrQ95() {
		return llrQ95;
	}

	//set方法
	public void setLlrQ95(Double llrQ95) {
		this.llrQ95 = llrQ95;
	}
	//get方法
	public Double getCorescoreQ95() {
		return corescoreQ95;
	}

	//set方法
	public void setCorescoreQ95(Double corescoreQ95) {
		this.corescoreQ95 = corescoreQ95;
	}
	//get方法
	public Double getPapapropQ95() {
		return papapropQ95;
	}

	//set方法
	public void setPapapropQ95(Double papapropQ95) {
		this.papapropQ95 = papapropQ95;
	}
	//get方法
	public Double getPapafiQ95() {
		return papafiQ95;
	}

	//set方法
	public void setPapafiQ95(Double papafiQ95) {
		this.papafiQ95 = papafiQ95;
	}
	//get方法
	public Double getAaLengthQ95() {
		return aaLengthQ95;
	}

	//set方法
	public void setAaLengthQ95(Double aaLengthQ95) {
		this.aaLengthQ95 = aaLengthQ95;
	}
	//get方法
	public Double getDisorderPercentQ95() {
		return disorderPercentQ95;
	}

	//set方法
	public void setDisorderPercentQ95(Double disorderPercentQ95) {
		this.disorderPercentQ95 = disorderPercentQ95;
	}
	//get方法
	public Double getDisorder30aaNumQ95() {
		return disorder30aaNumQ95;
	}

	//set方法
	public void setDisorder30aaNumQ95(Double disorder30aaNumQ95) {
		this.disorder30aaNumQ95 = disorder30aaNumQ95;
	}
	//get方法
	public Double getDisorder50aaNumQ95() {
		return disorder50aaNumQ95;
	}

	//set方法
	public void setDisorder50aaNumQ95(Double disorder50aaNumQ95) {
		this.disorder50aaNumQ95 = disorder50aaNumQ95;
	}
	//get方法
	public Double getDisorderSegmentNumQ95() {
		return disorderSegmentNumQ95;
	}

	//set方法
	public void setDisorderSegmentNumQ95(Double disorderSegmentNumQ95) {
		this.disorderSegmentNumQ95 = disorderSegmentNumQ95;
	}
	//get方法
	public Double getPscoreQ95() {
		return pscoreQ95;
	}

	//set方法
	public void setPscoreQ95(Double pscoreQ95) {
		this.pscoreQ95 = pscoreQ95;
	}
	//get方法
	public Double getLlrTruemax() {
		return llrTruemax;
	}

	//set方法
	public void setLlrTruemax(Double llrTruemax) {
		this.llrTruemax = llrTruemax;
	}
	//get方法
	public Double getCorescoreTruemax() {
		return corescoreTruemax;
	}

	//set方法
	public void setCorescoreTruemax(Double corescoreTruemax) {
		this.corescoreTruemax = corescoreTruemax;
	}
	//get方法
	public Double getPapapropTruemax() {
		return papapropTruemax;
	}

	//set方法
	public void setPapapropTruemax(Double papapropTruemax) {
		this.papapropTruemax = papapropTruemax;
	}
	//get方法
	public Double getPapafiTruemax() {
		return papafiTruemax;
	}

	//set方法
	public void setPapafiTruemax(Double papafiTruemax) {
		this.papafiTruemax = papafiTruemax;
	}
	//get方法
	public Double getAaLengthTruemax() {
		return aaLengthTruemax;
	}

	//set方法
	public void setAaLengthTruemax(Double aaLengthTruemax) {
		this.aaLengthTruemax = aaLengthTruemax;
	}
	//get方法
	public Double getDisorderPercentTruemax() {
		return disorderPercentTruemax;
	}

	//set方法
	public void setDisorderPercentTruemax(Double disorderPercentTruemax) {
		this.disorderPercentTruemax = disorderPercentTruemax;
	}
	//get方法
	public Double getDisorder30aaNumTruemax() {
		return disorder30aaNumTruemax;
	}

	//set方法
	public void setDisorder30aaNumTruemax(Double disorder30aaNumTruemax) {
		this.disorder30aaNumTruemax = disorder30aaNumTruemax;
	}
	//get方法
	public Double getDisorder50aaNumTruemax() {
		return disorder50aaNumTruemax;
	}

	//set方法
	public void setDisorder50aaNumTruemax(Double disorder50aaNumTruemax) {
		this.disorder50aaNumTruemax = disorder50aaNumTruemax;
	}
	//get方法
	public Double getDisorderSegmentNumTruemax() {
		return disorderSegmentNumTruemax;
	}

	//set方法
	public void setDisorderSegmentNumTruemax(Double disorderSegmentNumTruemax) {
		this.disorderSegmentNumTruemax = disorderSegmentNumTruemax;
	}
	//get方法
	public Double getPscoreTruemax() {
		return pscoreTruemax;
	}

	//set方法
	public void setPscoreTruemax(Double pscoreTruemax) {
		this.pscoreTruemax = pscoreTruemax;
	}
	//get方法
	public Double getLlrMax() {
		return llrMax;
	}

	//set方法
	public void setLlrMax(Double llrMax) {
		this.llrMax = llrMax;
	}
	//get方法
	public Double getCorescoreMax() {
		return corescoreMax;
	}

	//set方法
	public void setCorescoreMax(Double corescoreMax) {
		this.corescoreMax = corescoreMax;
	}
	//get方法
	public Double getPapapropMax() {
		return papapropMax;
	}

	//set方法
	public void setPapapropMax(Double papapropMax) {
		this.papapropMax = papapropMax;
	}
	//get方法
	public Double getPapafiMax() {
		return papafiMax;
	}

	//set方法
	public void setPapafiMax(Double papafiMax) {
		this.papafiMax = papafiMax;
	}
	//get方法
	public Double getAaLengthMax() {
		return aaLengthMax;
	}

	//set方法
	public void setAaLengthMax(Double aaLengthMax) {
		this.aaLengthMax = aaLengthMax;
	}
	//get方法
	public Double getDisorderPercentMax() {
		return disorderPercentMax;
	}

	//set方法
	public void setDisorderPercentMax(Double disorderPercentMax) {
		this.disorderPercentMax = disorderPercentMax;
	}
	//get方法
	public Double getDisorder30aaNumMax() {
		return disorder30aaNumMax;
	}

	//set方法
	public void setDisorder30aaNumMax(Double disorder30aaNumMax) {
		this.disorder30aaNumMax = disorder30aaNumMax;
	}
	//get方法
	public Double getDisorder50aaNumMax() {
		return disorder50aaNumMax;
	}

	//set方法
	public void setDisorder50aaNumMax(Double disorder50aaNumMax) {
		this.disorder50aaNumMax = disorder50aaNumMax;
	}
	//get方法
	public Double getDisorderSegmentNumMax() {
		return disorderSegmentNumMax;
	}

	//set方法
	public void setDisorderSegmentNumMax(Double disorderSegmentNumMax) {
		this.disorderSegmentNumMax = disorderSegmentNumMax;
	}
	//get方法
	public Double getPscoreMax() {
		return pscoreMax;
	}

	//set方法
	public void setPscoreMax(Double pscoreMax) {
		this.pscoreMax = pscoreMax;
	}
	//get方法
	public Double getLlrMean() {
		return llrMean;
	}

	//set方法
	public void setLlrMean(Double llrMean) {
		this.llrMean = llrMean;
	}
	//get方法
	public Double getCorescoreMean() {
		return corescoreMean;
	}

	//set方法
	public void setCorescoreMean(Double corescoreMean) {
		this.corescoreMean = corescoreMean;
	}
	//get方法
	public Double getPapapropMean() {
		return papapropMean;
	}

	//set方法
	public void setPapapropMean(Double papapropMean) {
		this.papapropMean = papapropMean;
	}
	//get方法
	public Double getPapafiMean() {
		return papafiMean;
	}

	//set方法
	public void setPapafiMean(Double papafiMean) {
		this.papafiMean = papafiMean;
	}
	//get方法
	public Double getAaLengthMean() {
		return aaLengthMean;
	}

	//set方法
	public void setAaLengthMean(Double aaLengthMean) {
		this.aaLengthMean = aaLengthMean;
	}
	//get方法
	public Double getDisorderPercentMean() {
		return disorderPercentMean;
	}

	//set方法
	public void setDisorderPercentMean(Double disorderPercentMean) {
		this.disorderPercentMean = disorderPercentMean;
	}
	//get方法
	public Double getDisorder30aaNumMean() {
		return disorder30aaNumMean;
	}

	//set方法
	public void setDisorder30aaNumMean(Double disorder30aaNumMean) {
		this.disorder30aaNumMean = disorder30aaNumMean;
	}
	//get方法
	public Double getDisorder50aaNumMean() {
		return disorder50aaNumMean;
	}

	//set方法
	public void setDisorder50aaNumMean(Double disorder50aaNumMean) {
		this.disorder50aaNumMean = disorder50aaNumMean;
	}
	//get方法
	public Double getDisorderSegmentNumMean() {
		return disorderSegmentNumMean;
	}

	//set方法
	public void setDisorderSegmentNumMean(Double disorderSegmentNumMean) {
		this.disorderSegmentNumMean = disorderSegmentNumMean;
	}
	//get方法
	public Double getPscoreMean() {
		return pscoreMean;
	}

	//set方法
	public void setPscoreMean(Double pscoreMean) {
		this.pscoreMean = pscoreMean;
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
