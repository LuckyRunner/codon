package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CodingPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="coding_pic")
public class CodingPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_fickett_score")
	private Double minFickettScore;//

    @Column(name = "min_cpc2_coding_probability")
	private Double minCpc2CodingProbability;//

    @Column(name = "min_lgc_coding_probability")
	private Double minLgcCodingProbability;//

    @Column(name = "truemin_fickett_score")
	private Double trueminFickettScore;//

    @Column(name = "truemin_cpc2_coding_probability")
	private Double trueminCpc2CodingProbability;//

    @Column(name = "truemin_lgc_coding_probability")
	private Double trueminLgcCodingProbability;//

    @Column(name = "q05_fickett_score")
	private Double q05FickettScore;//

    @Column(name = "q05_cpc2_coding_probability")
	private Double q05Cpc2CodingProbability;//

    @Column(name = "q05_lgc_coding_probability")
	private Double q05LgcCodingProbability;//

    @Column(name = "q25_fickett_score")
	private Double q25FickettScore;//

    @Column(name = "q25_cpc2_coding_probability")
	private Double q25Cpc2CodingProbability;//

    @Column(name = "q25_lgc_coding_probability")
	private Double q25LgcCodingProbability;//

    @Column(name = "q50_fickett_score")
	private Double q50FickettScore;//

    @Column(name = "q50_cpc2_coding_probability")
	private Double q50Cpc2CodingProbability;//

    @Column(name = "q50_lgc_coding_probability")
	private Double q50LgcCodingProbability;//

    @Column(name = "q75_fickett_score")
	private Double q75FickettScore;//

    @Column(name = "q75_cpc2_coding_probability")
	private Double q75Cpc2CodingProbability;//

    @Column(name = "q75_lgc_coding_probability")
	private Double q75LgcCodingProbability;//

    @Column(name = "q95_fickett_score")
	private Double q95FickettScore;//

    @Column(name = "q95_cpc2_coding_probability")
	private Double q95Cpc2CodingProbability;//

    @Column(name = "q95_lgc_coding_probability")
	private Double q95LgcCodingProbability;//

    @Column(name = "truemax_fickett_score")
	private Double truemaxFickettScore;//

    @Column(name = "truemax_cpc2_coding_probability")
	private Double truemaxCpc2CodingProbability;//

    @Column(name = "truemax_lgc_coding_probability")
	private Double truemaxLgcCodingProbability;//

    @Column(name = "max_fickett_score")
	private Double maxFickettScore;//

    @Column(name = "max_cpc2_coding_probability")
	private Double maxCpc2CodingProbability;//

    @Column(name = "max_lgc_coding_probability")
	private Double maxLgcCodingProbability;//

    @Column(name = "mean_fickett_score")
	private Double meanFickettScore;//

    @Column(name = "mean_cpc2_coding_probability")
	private Double meanCpc2CodingProbability;//

    @Column(name = "mean_lgc_coding_probability")
	private Double meanLgcCodingProbability;//

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
	public Double getMinFickettScore() {
		return minFickettScore;
	}

	//set方法
	public void setMinFickettScore(Double minFickettScore) {
		this.minFickettScore = minFickettScore;
	}
	//get方法
	public Double getMinCpc2CodingProbability() {
		return minCpc2CodingProbability;
	}

	//set方法
	public void setMinCpc2CodingProbability(Double minCpc2CodingProbability) {
		this.minCpc2CodingProbability = minCpc2CodingProbability;
	}
	//get方法
	public Double getMinLgcCodingProbability() {
		return minLgcCodingProbability;
	}

	//set方法
	public void setMinLgcCodingProbability(Double minLgcCodingProbability) {
		this.minLgcCodingProbability = minLgcCodingProbability;
	}
	//get方法
	public Double getTrueminFickettScore() {
		return trueminFickettScore;
	}

	//set方法
	public void setTrueminFickettScore(Double trueminFickettScore) {
		this.trueminFickettScore = trueminFickettScore;
	}
	//get方法
	public Double getTrueminCpc2CodingProbability() {
		return trueminCpc2CodingProbability;
	}

	//set方法
	public void setTrueminCpc2CodingProbability(Double trueminCpc2CodingProbability) {
		this.trueminCpc2CodingProbability = trueminCpc2CodingProbability;
	}
	//get方法
	public Double getTrueminLgcCodingProbability() {
		return trueminLgcCodingProbability;
	}

	//set方法
	public void setTrueminLgcCodingProbability(Double trueminLgcCodingProbability) {
		this.trueminLgcCodingProbability = trueminLgcCodingProbability;
	}
	//get方法
	public Double getQ05FickettScore() {
		return q05FickettScore;
	}

	//set方法
	public void setQ05FickettScore(Double q05FickettScore) {
		this.q05FickettScore = q05FickettScore;
	}
	//get方法
	public Double getQ05Cpc2CodingProbability() {
		return q05Cpc2CodingProbability;
	}

	//set方法
	public void setQ05Cpc2CodingProbability(Double q05Cpc2CodingProbability) {
		this.q05Cpc2CodingProbability = q05Cpc2CodingProbability;
	}
	//get方法
	public Double getQ05LgcCodingProbability() {
		return q05LgcCodingProbability;
	}

	//set方法
	public void setQ05LgcCodingProbability(Double q05LgcCodingProbability) {
		this.q05LgcCodingProbability = q05LgcCodingProbability;
	}
	//get方法
	public Double getQ25FickettScore() {
		return q25FickettScore;
	}

	//set方法
	public void setQ25FickettScore(Double q25FickettScore) {
		this.q25FickettScore = q25FickettScore;
	}
	//get方法
	public Double getQ25Cpc2CodingProbability() {
		return q25Cpc2CodingProbability;
	}

	//set方法
	public void setQ25Cpc2CodingProbability(Double q25Cpc2CodingProbability) {
		this.q25Cpc2CodingProbability = q25Cpc2CodingProbability;
	}
	//get方法
	public Double getQ25LgcCodingProbability() {
		return q25LgcCodingProbability;
	}

	//set方法
	public void setQ25LgcCodingProbability(Double q25LgcCodingProbability) {
		this.q25LgcCodingProbability = q25LgcCodingProbability;
	}
	//get方法
	public Double getQ50FickettScore() {
		return q50FickettScore;
	}

	//set方法
	public void setQ50FickettScore(Double q50FickettScore) {
		this.q50FickettScore = q50FickettScore;
	}
	//get方法
	public Double getQ50Cpc2CodingProbability() {
		return q50Cpc2CodingProbability;
	}

	//set方法
	public void setQ50Cpc2CodingProbability(Double q50Cpc2CodingProbability) {
		this.q50Cpc2CodingProbability = q50Cpc2CodingProbability;
	}
	//get方法
	public Double getQ50LgcCodingProbability() {
		return q50LgcCodingProbability;
	}

	//set方法
	public void setQ50LgcCodingProbability(Double q50LgcCodingProbability) {
		this.q50LgcCodingProbability = q50LgcCodingProbability;
	}
	//get方法
	public Double getQ75FickettScore() {
		return q75FickettScore;
	}

	//set方法
	public void setQ75FickettScore(Double q75FickettScore) {
		this.q75FickettScore = q75FickettScore;
	}
	//get方法
	public Double getQ75Cpc2CodingProbability() {
		return q75Cpc2CodingProbability;
	}

	//set方法
	public void setQ75Cpc2CodingProbability(Double q75Cpc2CodingProbability) {
		this.q75Cpc2CodingProbability = q75Cpc2CodingProbability;
	}
	//get方法
	public Double getQ75LgcCodingProbability() {
		return q75LgcCodingProbability;
	}

	//set方法
	public void setQ75LgcCodingProbability(Double q75LgcCodingProbability) {
		this.q75LgcCodingProbability = q75LgcCodingProbability;
	}
	//get方法
	public Double getQ95FickettScore() {
		return q95FickettScore;
	}

	//set方法
	public void setQ95FickettScore(Double q95FickettScore) {
		this.q95FickettScore = q95FickettScore;
	}
	//get方法
	public Double getQ95Cpc2CodingProbability() {
		return q95Cpc2CodingProbability;
	}

	//set方法
	public void setQ95Cpc2CodingProbability(Double q95Cpc2CodingProbability) {
		this.q95Cpc2CodingProbability = q95Cpc2CodingProbability;
	}
	//get方法
	public Double getQ95LgcCodingProbability() {
		return q95LgcCodingProbability;
	}

	//set方法
	public void setQ95LgcCodingProbability(Double q95LgcCodingProbability) {
		this.q95LgcCodingProbability = q95LgcCodingProbability;
	}
	//get方法
	public Double getTruemaxFickettScore() {
		return truemaxFickettScore;
	}

	//set方法
	public void setTruemaxFickettScore(Double truemaxFickettScore) {
		this.truemaxFickettScore = truemaxFickettScore;
	}
	//get方法
	public Double getTruemaxCpc2CodingProbability() {
		return truemaxCpc2CodingProbability;
	}

	//set方法
	public void setTruemaxCpc2CodingProbability(Double truemaxCpc2CodingProbability) {
		this.truemaxCpc2CodingProbability = truemaxCpc2CodingProbability;
	}
	//get方法
	public Double getTruemaxLgcCodingProbability() {
		return truemaxLgcCodingProbability;
	}

	//set方法
	public void setTruemaxLgcCodingProbability(Double truemaxLgcCodingProbability) {
		this.truemaxLgcCodingProbability = truemaxLgcCodingProbability;
	}
	//get方法
	public Double getMaxFickettScore() {
		return maxFickettScore;
	}

	//set方法
	public void setMaxFickettScore(Double maxFickettScore) {
		this.maxFickettScore = maxFickettScore;
	}
	//get方法
	public Double getMaxCpc2CodingProbability() {
		return maxCpc2CodingProbability;
	}

	//set方法
	public void setMaxCpc2CodingProbability(Double maxCpc2CodingProbability) {
		this.maxCpc2CodingProbability = maxCpc2CodingProbability;
	}
	//get方法
	public Double getMaxLgcCodingProbability() {
		return maxLgcCodingProbability;
	}

	//set方法
	public void setMaxLgcCodingProbability(Double maxLgcCodingProbability) {
		this.maxLgcCodingProbability = maxLgcCodingProbability;
	}
	//get方法
	public Double getMeanFickettScore() {
		return meanFickettScore;
	}

	//set方法
	public void setMeanFickettScore(Double meanFickettScore) {
		this.meanFickettScore = meanFickettScore;
	}
	//get方法
	public Double getMeanCpc2CodingProbability() {
		return meanCpc2CodingProbability;
	}

	//set方法
	public void setMeanCpc2CodingProbability(Double meanCpc2CodingProbability) {
		this.meanCpc2CodingProbability = meanCpc2CodingProbability;
	}
	//get方法
	public Double getMeanLgcCodingProbability() {
		return meanLgcCodingProbability;
	}

	//set方法
	public void setMeanLgcCodingProbability(Double meanLgcCodingProbability) {
		this.meanLgcCodingProbability = meanLgcCodingProbability;
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
