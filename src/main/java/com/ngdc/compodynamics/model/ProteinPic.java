package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:ProteinPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="protein_pic")
public class ProteinPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_mw")
	private Double minMw;//

    @Column(name = "min_sa")
	private Double minSa;//

    @Column(name = "min_rv")
	private Double minRv;//

    @Column(name = "min_kdhydrophobicity")
	private Double minKdhydrophobicity;//

    @Column(name = "min_wwhydrophobicity")
	private Double minWwhydrophobicity;//

    @Column(name = "min_hhhydrophobicity")
	private Double minHhhydrophobicity;//

    @Column(name = "min_positive")
	private Double minPositive;//

    @Column(name = "min_negative")
	private Double minNegative;//

    @Column(name = "min_neutral")
	private Double minNeutral;//

    @Column(name = "min_alpha")
	private Double minAlpha;//

    @Column(name = "min_beta")
	private Double minBeta;//

    @Column(name = "truemin_mw")
	private Double trueminMw;//

    @Column(name = "truemin_sa")
	private Double trueminSa;//

    @Column(name = "truemin_rv")
	private Double trueminRv;//

    @Column(name = "truemin_kdhydrophobicity")
	private Double trueminKdhydrophobicity;//

    @Column(name = "truemin_wwhydrophobicity")
	private Double trueminWwhydrophobicity;//

    @Column(name = "truemin_hhhydrophobicity")
	private Double trueminHhhydrophobicity;//

    @Column(name = "truemin_positive")
	private Double trueminPositive;//

    @Column(name = "truemin_negative")
	private Double trueminNegative;//

    @Column(name = "truemin_neutral")
	private Double trueminNeutral;//

    @Column(name = "truemin_alpha")
	private Double trueminAlpha;//

    @Column(name = "truemin_beta")
	private Double trueminBeta;//

    @Column(name = "q05_mw")
	private Double q05Mw;//

    @Column(name = "q05_sa")
	private Double q05Sa;//

    @Column(name = "q05_rv")
	private Double q05Rv;//

    @Column(name = "q05_kdhydrophobicity")
	private Double q05Kdhydrophobicity;//

    @Column(name = "q05_wwhydrophobicity")
	private Double q05Wwhydrophobicity;//

    @Column(name = "q05_hhhydrophobicity")
	private Double q05Hhhydrophobicity;//

    @Column(name = "q05_positive")
	private Double q05Positive;//

    @Column(name = "q05_negative")
	private Double q05Negative;//

    @Column(name = "q05_neutral")
	private Double q05Neutral;//

    @Column(name = "q05_alpha")
	private Double q05Alpha;//

    @Column(name = "q05_beta")
	private Double q05Beta;//

    @Column(name = "q25_mw")
	private Double q25Mw;//

    @Column(name = "q25_sa")
	private Double q25Sa;//

    @Column(name = "q25_rv")
	private Double q25Rv;//

    @Column(name = "q25_kdhydrophobicity")
	private Double q25Kdhydrophobicity;//

    @Column(name = "q25_wwhydrophobicity")
	private Double q25Wwhydrophobicity;//

    @Column(name = "q25_hhhydrophobicity")
	private Double q25Hhhydrophobicity;//

    @Column(name = "q25_positive")
	private Double q25Positive;//

    @Column(name = "q25_negative")
	private Double q25Negative;//

    @Column(name = "q25_neutral")
	private Double q25Neutral;//

    @Column(name = "q25_alpha")
	private Double q25Alpha;//

    @Column(name = "q25_beta")
	private Double q25Beta;//

    @Column(name = "q50_mw")
	private Double q50Mw;//

    @Column(name = "q50_sa")
	private Double q50Sa;//

    @Column(name = "q50_rv")
	private Double q50Rv;//

    @Column(name = "q50_kdhydrophobicity")
	private Double q50Kdhydrophobicity;//

    @Column(name = "q50_wwhydrophobicity")
	private Double q50Wwhydrophobicity;//

    @Column(name = "q50_hhhydrophobicity")
	private Double q50Hhhydrophobicity;//

    @Column(name = "q50_positive")
	private Double q50Positive;//

    @Column(name = "q50_negative")
	private Double q50Negative;//

    @Column(name = "q50_neutral")
	private Double q50Neutral;//

    @Column(name = "q50_alpha")
	private Double q50Alpha;//

    @Column(name = "q50_beta")
	private Double q50Beta;//

    @Column(name = "q75_mw")
	private Double q75Mw;//

    @Column(name = "q75_sa")
	private Double q75Sa;//

    @Column(name = "q75_rv")
	private Double q75Rv;//

    @Column(name = "q75_kdhydrophobicity")
	private Double q75Kdhydrophobicity;//

    @Column(name = "q75_wwhydrophobicity")
	private Double q75Wwhydrophobicity;//

    @Column(name = "q75_hhhydrophobicity")
	private Double q75Hhhydrophobicity;//

    @Column(name = "q75_positive")
	private Double q75Positive;//

    @Column(name = "q75_negative")
	private Double q75Negative;//

    @Column(name = "q75_neutral")
	private Double q75Neutral;//

    @Column(name = "q75_alpha")
	private Double q75Alpha;//

    @Column(name = "q75_beta")
	private Double q75Beta;//

    @Column(name = "q95_mw")
	private Double q95Mw;//

    @Column(name = "q95_sa")
	private Double q95Sa;//

    @Column(name = "q95_rv")
	private Double q95Rv;//

    @Column(name = "q95_kdhydrophobicity")
	private Double q95Kdhydrophobicity;//

    @Column(name = "q95_wwhydrophobicity")
	private Double q95Wwhydrophobicity;//

    @Column(name = "q95_hhhydrophobicity")
	private Double q95Hhhydrophobicity;//

    @Column(name = "q95_positive")
	private Double q95Positive;//

    @Column(name = "q95_negative")
	private Double q95Negative;//

    @Column(name = "q95_neutral")
	private Double q95Neutral;//

    @Column(name = "q95_alpha")
	private Double q95Alpha;//

    @Column(name = "q95_beta")
	private Double q95Beta;//

    @Column(name = "truemax_mw")
	private Double truemaxMw;//

    @Column(name = "truemax_sa")
	private Double truemaxSa;//

    @Column(name = "truemax_rv")
	private Double truemaxRv;//

    @Column(name = "truemax_kdhydrophobicity")
	private Double truemaxKdhydrophobicity;//

    @Column(name = "truemax_wwhydrophobicity")
	private Double truemaxWwhydrophobicity;//

    @Column(name = "truemax_hhhydrophobicity")
	private Double truemaxHhhydrophobicity;//

    @Column(name = "truemax_positive")
	private Double truemaxPositive;//

    @Column(name = "truemax_negative")
	private Double truemaxNegative;//

    @Column(name = "truemax_neutral")
	private Double truemaxNeutral;//

    @Column(name = "truemax_alpha")
	private Double truemaxAlpha;//

    @Column(name = "truemax_beta")
	private Double truemaxBeta;//

    @Column(name = "max_mw")
	private Double maxMw;//

    @Column(name = "max_sa")
	private Double maxSa;//

    @Column(name = "max_rv")
	private Double maxRv;//

    @Column(name = "max_kdhydrophobicity")
	private Double maxKdhydrophobicity;//

    @Column(name = "max_wwhydrophobicity")
	private Double maxWwhydrophobicity;//

    @Column(name = "max_hhhydrophobicity")
	private Double maxHhhydrophobicity;//

    @Column(name = "max_positive")
	private Double maxPositive;//

    @Column(name = "max_negative")
	private Double maxNegative;//

    @Column(name = "max_neutral")
	private Double maxNeutral;//

    @Column(name = "max_alpha")
	private Double maxAlpha;//

    @Column(name = "max_beta")
	private Double maxBeta;//

    @Column(name = "mean_mw")
	private Double meanMw;//

    @Column(name = "mean_sa")
	private Double meanSa;//

    @Column(name = "mean_rv")
	private Double meanRv;//

    @Column(name = "mean_kdhydrophobicity")
	private Double meanKdhydrophobicity;//

    @Column(name = "mean_wwhydrophobicity")
	private Double meanWwhydrophobicity;//

    @Column(name = "mean_hhhydrophobicity")
	private Double meanHhhydrophobicity;//

    @Column(name = "mean_positive")
	private Double meanPositive;//

    @Column(name = "mean_negative")
	private Double meanNegative;//

    @Column(name = "mean_neutral")
	private Double meanNeutral;//

    @Column(name = "mean_alpha")
	private Double meanAlpha;//

    @Column(name = "mean_beta")
	private Double meanBeta;//

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
	public Double getMinMw() {
		return minMw;
	}

	//set方法
	public void setMinMw(Double minMw) {
		this.minMw = minMw;
	}
	//get方法
	public Double getMinSa() {
		return minSa;
	}

	//set方法
	public void setMinSa(Double minSa) {
		this.minSa = minSa;
	}
	//get方法
	public Double getMinRv() {
		return minRv;
	}

	//set方法
	public void setMinRv(Double minRv) {
		this.minRv = minRv;
	}
	//get方法
	public Double getMinKdhydrophobicity() {
		return minKdhydrophobicity;
	}

	//set方法
	public void setMinKdhydrophobicity(Double minKdhydrophobicity) {
		this.minKdhydrophobicity = minKdhydrophobicity;
	}
	//get方法
	public Double getMinWwhydrophobicity() {
		return minWwhydrophobicity;
	}

	//set方法
	public void setMinWwhydrophobicity(Double minWwhydrophobicity) {
		this.minWwhydrophobicity = minWwhydrophobicity;
	}
	//get方法
	public Double getMinHhhydrophobicity() {
		return minHhhydrophobicity;
	}

	//set方法
	public void setMinHhhydrophobicity(Double minHhhydrophobicity) {
		this.minHhhydrophobicity = minHhhydrophobicity;
	}
	//get方法
	public Double getMinPositive() {
		return minPositive;
	}

	//set方法
	public void setMinPositive(Double minPositive) {
		this.minPositive = minPositive;
	}
	//get方法
	public Double getMinNegative() {
		return minNegative;
	}

	//set方法
	public void setMinNegative(Double minNegative) {
		this.minNegative = minNegative;
	}
	//get方法
	public Double getMinNeutral() {
		return minNeutral;
	}

	//set方法
	public void setMinNeutral(Double minNeutral) {
		this.minNeutral = minNeutral;
	}
	//get方法
	public Double getMinAlpha() {
		return minAlpha;
	}

	//set方法
	public void setMinAlpha(Double minAlpha) {
		this.minAlpha = minAlpha;
	}
	//get方法
	public Double getMinBeta() {
		return minBeta;
	}

	//set方法
	public void setMinBeta(Double minBeta) {
		this.minBeta = minBeta;
	}
	//get方法
	public Double getTrueminMw() {
		return trueminMw;
	}

	//set方法
	public void setTrueminMw(Double trueminMw) {
		this.trueminMw = trueminMw;
	}
	//get方法
	public Double getTrueminSa() {
		return trueminSa;
	}

	//set方法
	public void setTrueminSa(Double trueminSa) {
		this.trueminSa = trueminSa;
	}
	//get方法
	public Double getTrueminRv() {
		return trueminRv;
	}

	//set方法
	public void setTrueminRv(Double trueminRv) {
		this.trueminRv = trueminRv;
	}
	//get方法
	public Double getTrueminKdhydrophobicity() {
		return trueminKdhydrophobicity;
	}

	//set方法
	public void setTrueminKdhydrophobicity(Double trueminKdhydrophobicity) {
		this.trueminKdhydrophobicity = trueminKdhydrophobicity;
	}
	//get方法
	public Double getTrueminWwhydrophobicity() {
		return trueminWwhydrophobicity;
	}

	//set方法
	public void setTrueminWwhydrophobicity(Double trueminWwhydrophobicity) {
		this.trueminWwhydrophobicity = trueminWwhydrophobicity;
	}
	//get方法
	public Double getTrueminHhhydrophobicity() {
		return trueminHhhydrophobicity;
	}

	//set方法
	public void setTrueminHhhydrophobicity(Double trueminHhhydrophobicity) {
		this.trueminHhhydrophobicity = trueminHhhydrophobicity;
	}
	//get方法
	public Double getTrueminPositive() {
		return trueminPositive;
	}

	//set方法
	public void setTrueminPositive(Double trueminPositive) {
		this.trueminPositive = trueminPositive;
	}
	//get方法
	public Double getTrueminNegative() {
		return trueminNegative;
	}

	//set方法
	public void setTrueminNegative(Double trueminNegative) {
		this.trueminNegative = trueminNegative;
	}
	//get方法
	public Double getTrueminNeutral() {
		return trueminNeutral;
	}

	//set方法
	public void setTrueminNeutral(Double trueminNeutral) {
		this.trueminNeutral = trueminNeutral;
	}
	//get方法
	public Double getTrueminAlpha() {
		return trueminAlpha;
	}

	//set方法
	public void setTrueminAlpha(Double trueminAlpha) {
		this.trueminAlpha = trueminAlpha;
	}
	//get方法
	public Double getTrueminBeta() {
		return trueminBeta;
	}

	//set方法
	public void setTrueminBeta(Double trueminBeta) {
		this.trueminBeta = trueminBeta;
	}
	//get方法
	public Double getQ05Mw() {
		return q05Mw;
	}

	//set方法
	public void setQ05Mw(Double q05Mw) {
		this.q05Mw = q05Mw;
	}
	//get方法
	public Double getQ05Sa() {
		return q05Sa;
	}

	//set方法
	public void setQ05Sa(Double q05Sa) {
		this.q05Sa = q05Sa;
	}
	//get方法
	public Double getQ05Rv() {
		return q05Rv;
	}

	//set方法
	public void setQ05Rv(Double q05Rv) {
		this.q05Rv = q05Rv;
	}
	//get方法
	public Double getQ05Kdhydrophobicity() {
		return q05Kdhydrophobicity;
	}

	//set方法
	public void setQ05Kdhydrophobicity(Double q05Kdhydrophobicity) {
		this.q05Kdhydrophobicity = q05Kdhydrophobicity;
	}
	//get方法
	public Double getQ05Wwhydrophobicity() {
		return q05Wwhydrophobicity;
	}

	//set方法
	public void setQ05Wwhydrophobicity(Double q05Wwhydrophobicity) {
		this.q05Wwhydrophobicity = q05Wwhydrophobicity;
	}
	//get方法
	public Double getQ05Hhhydrophobicity() {
		return q05Hhhydrophobicity;
	}

	//set方法
	public void setQ05Hhhydrophobicity(Double q05Hhhydrophobicity) {
		this.q05Hhhydrophobicity = q05Hhhydrophobicity;
	}
	//get方法
	public Double getQ05Positive() {
		return q05Positive;
	}

	//set方法
	public void setQ05Positive(Double q05Positive) {
		this.q05Positive = q05Positive;
	}
	//get方法
	public Double getQ05Negative() {
		return q05Negative;
	}

	//set方法
	public void setQ05Negative(Double q05Negative) {
		this.q05Negative = q05Negative;
	}
	//get方法
	public Double getQ05Neutral() {
		return q05Neutral;
	}

	//set方法
	public void setQ05Neutral(Double q05Neutral) {
		this.q05Neutral = q05Neutral;
	}
	//get方法
	public Double getQ05Alpha() {
		return q05Alpha;
	}

	//set方法
	public void setQ05Alpha(Double q05Alpha) {
		this.q05Alpha = q05Alpha;
	}
	//get方法
	public Double getQ05Beta() {
		return q05Beta;
	}

	//set方法
	public void setQ05Beta(Double q05Beta) {
		this.q05Beta = q05Beta;
	}
	//get方法
	public Double getQ25Mw() {
		return q25Mw;
	}

	//set方法
	public void setQ25Mw(Double q25Mw) {
		this.q25Mw = q25Mw;
	}
	//get方法
	public Double getQ25Sa() {
		return q25Sa;
	}

	//set方法
	public void setQ25Sa(Double q25Sa) {
		this.q25Sa = q25Sa;
	}
	//get方法
	public Double getQ25Rv() {
		return q25Rv;
	}

	//set方法
	public void setQ25Rv(Double q25Rv) {
		this.q25Rv = q25Rv;
	}
	//get方法
	public Double getQ25Kdhydrophobicity() {
		return q25Kdhydrophobicity;
	}

	//set方法
	public void setQ25Kdhydrophobicity(Double q25Kdhydrophobicity) {
		this.q25Kdhydrophobicity = q25Kdhydrophobicity;
	}
	//get方法
	public Double getQ25Wwhydrophobicity() {
		return q25Wwhydrophobicity;
	}

	//set方法
	public void setQ25Wwhydrophobicity(Double q25Wwhydrophobicity) {
		this.q25Wwhydrophobicity = q25Wwhydrophobicity;
	}
	//get方法
	public Double getQ25Hhhydrophobicity() {
		return q25Hhhydrophobicity;
	}

	//set方法
	public void setQ25Hhhydrophobicity(Double q25Hhhydrophobicity) {
		this.q25Hhhydrophobicity = q25Hhhydrophobicity;
	}
	//get方法
	public Double getQ25Positive() {
		return q25Positive;
	}

	//set方法
	public void setQ25Positive(Double q25Positive) {
		this.q25Positive = q25Positive;
	}
	//get方法
	public Double getQ25Negative() {
		return q25Negative;
	}

	//set方法
	public void setQ25Negative(Double q25Negative) {
		this.q25Negative = q25Negative;
	}
	//get方法
	public Double getQ25Neutral() {
		return q25Neutral;
	}

	//set方法
	public void setQ25Neutral(Double q25Neutral) {
		this.q25Neutral = q25Neutral;
	}
	//get方法
	public Double getQ25Alpha() {
		return q25Alpha;
	}

	//set方法
	public void setQ25Alpha(Double q25Alpha) {
		this.q25Alpha = q25Alpha;
	}
	//get方法
	public Double getQ25Beta() {
		return q25Beta;
	}

	//set方法
	public void setQ25Beta(Double q25Beta) {
		this.q25Beta = q25Beta;
	}
	//get方法
	public Double getQ50Mw() {
		return q50Mw;
	}

	//set方法
	public void setQ50Mw(Double q50Mw) {
		this.q50Mw = q50Mw;
	}
	//get方法
	public Double getQ50Sa() {
		return q50Sa;
	}

	//set方法
	public void setQ50Sa(Double q50Sa) {
		this.q50Sa = q50Sa;
	}
	//get方法
	public Double getQ50Rv() {
		return q50Rv;
	}

	//set方法
	public void setQ50Rv(Double q50Rv) {
		this.q50Rv = q50Rv;
	}
	//get方法
	public Double getQ50Kdhydrophobicity() {
		return q50Kdhydrophobicity;
	}

	//set方法
	public void setQ50Kdhydrophobicity(Double q50Kdhydrophobicity) {
		this.q50Kdhydrophobicity = q50Kdhydrophobicity;
	}
	//get方法
	public Double getQ50Wwhydrophobicity() {
		return q50Wwhydrophobicity;
	}

	//set方法
	public void setQ50Wwhydrophobicity(Double q50Wwhydrophobicity) {
		this.q50Wwhydrophobicity = q50Wwhydrophobicity;
	}
	//get方法
	public Double getQ50Hhhydrophobicity() {
		return q50Hhhydrophobicity;
	}

	//set方法
	public void setQ50Hhhydrophobicity(Double q50Hhhydrophobicity) {
		this.q50Hhhydrophobicity = q50Hhhydrophobicity;
	}
	//get方法
	public Double getQ50Positive() {
		return q50Positive;
	}

	//set方法
	public void setQ50Positive(Double q50Positive) {
		this.q50Positive = q50Positive;
	}
	//get方法
	public Double getQ50Negative() {
		return q50Negative;
	}

	//set方法
	public void setQ50Negative(Double q50Negative) {
		this.q50Negative = q50Negative;
	}
	//get方法
	public Double getQ50Neutral() {
		return q50Neutral;
	}

	//set方法
	public void setQ50Neutral(Double q50Neutral) {
		this.q50Neutral = q50Neutral;
	}
	//get方法
	public Double getQ50Alpha() {
		return q50Alpha;
	}

	//set方法
	public void setQ50Alpha(Double q50Alpha) {
		this.q50Alpha = q50Alpha;
	}
	//get方法
	public Double getQ50Beta() {
		return q50Beta;
	}

	//set方法
	public void setQ50Beta(Double q50Beta) {
		this.q50Beta = q50Beta;
	}
	//get方法
	public Double getQ75Mw() {
		return q75Mw;
	}

	//set方法
	public void setQ75Mw(Double q75Mw) {
		this.q75Mw = q75Mw;
	}
	//get方法
	public Double getQ75Sa() {
		return q75Sa;
	}

	//set方法
	public void setQ75Sa(Double q75Sa) {
		this.q75Sa = q75Sa;
	}
	//get方法
	public Double getQ75Rv() {
		return q75Rv;
	}

	//set方法
	public void setQ75Rv(Double q75Rv) {
		this.q75Rv = q75Rv;
	}
	//get方法
	public Double getQ75Kdhydrophobicity() {
		return q75Kdhydrophobicity;
	}

	//set方法
	public void setQ75Kdhydrophobicity(Double q75Kdhydrophobicity) {
		this.q75Kdhydrophobicity = q75Kdhydrophobicity;
	}
	//get方法
	public Double getQ75Wwhydrophobicity() {
		return q75Wwhydrophobicity;
	}

	//set方法
	public void setQ75Wwhydrophobicity(Double q75Wwhydrophobicity) {
		this.q75Wwhydrophobicity = q75Wwhydrophobicity;
	}
	//get方法
	public Double getQ75Hhhydrophobicity() {
		return q75Hhhydrophobicity;
	}

	//set方法
	public void setQ75Hhhydrophobicity(Double q75Hhhydrophobicity) {
		this.q75Hhhydrophobicity = q75Hhhydrophobicity;
	}
	//get方法
	public Double getQ75Positive() {
		return q75Positive;
	}

	//set方法
	public void setQ75Positive(Double q75Positive) {
		this.q75Positive = q75Positive;
	}
	//get方法
	public Double getQ75Negative() {
		return q75Negative;
	}

	//set方法
	public void setQ75Negative(Double q75Negative) {
		this.q75Negative = q75Negative;
	}
	//get方法
	public Double getQ75Neutral() {
		return q75Neutral;
	}

	//set方法
	public void setQ75Neutral(Double q75Neutral) {
		this.q75Neutral = q75Neutral;
	}
	//get方法
	public Double getQ75Alpha() {
		return q75Alpha;
	}

	//set方法
	public void setQ75Alpha(Double q75Alpha) {
		this.q75Alpha = q75Alpha;
	}
	//get方法
	public Double getQ75Beta() {
		return q75Beta;
	}

	//set方法
	public void setQ75Beta(Double q75Beta) {
		this.q75Beta = q75Beta;
	}
	//get方法
	public Double getQ95Mw() {
		return q95Mw;
	}

	//set方法
	public void setQ95Mw(Double q95Mw) {
		this.q95Mw = q95Mw;
	}
	//get方法
	public Double getQ95Sa() {
		return q95Sa;
	}

	//set方法
	public void setQ95Sa(Double q95Sa) {
		this.q95Sa = q95Sa;
	}
	//get方法
	public Double getQ95Rv() {
		return q95Rv;
	}

	//set方法
	public void setQ95Rv(Double q95Rv) {
		this.q95Rv = q95Rv;
	}
	//get方法
	public Double getQ95Kdhydrophobicity() {
		return q95Kdhydrophobicity;
	}

	//set方法
	public void setQ95Kdhydrophobicity(Double q95Kdhydrophobicity) {
		this.q95Kdhydrophobicity = q95Kdhydrophobicity;
	}
	//get方法
	public Double getQ95Wwhydrophobicity() {
		return q95Wwhydrophobicity;
	}

	//set方法
	public void setQ95Wwhydrophobicity(Double q95Wwhydrophobicity) {
		this.q95Wwhydrophobicity = q95Wwhydrophobicity;
	}
	//get方法
	public Double getQ95Hhhydrophobicity() {
		return q95Hhhydrophobicity;
	}

	//set方法
	public void setQ95Hhhydrophobicity(Double q95Hhhydrophobicity) {
		this.q95Hhhydrophobicity = q95Hhhydrophobicity;
	}
	//get方法
	public Double getQ95Positive() {
		return q95Positive;
	}

	//set方法
	public void setQ95Positive(Double q95Positive) {
		this.q95Positive = q95Positive;
	}
	//get方法
	public Double getQ95Negative() {
		return q95Negative;
	}

	//set方法
	public void setQ95Negative(Double q95Negative) {
		this.q95Negative = q95Negative;
	}
	//get方法
	public Double getQ95Neutral() {
		return q95Neutral;
	}

	//set方法
	public void setQ95Neutral(Double q95Neutral) {
		this.q95Neutral = q95Neutral;
	}
	//get方法
	public Double getQ95Alpha() {
		return q95Alpha;
	}

	//set方法
	public void setQ95Alpha(Double q95Alpha) {
		this.q95Alpha = q95Alpha;
	}
	//get方法
	public Double getQ95Beta() {
		return q95Beta;
	}

	//set方法
	public void setQ95Beta(Double q95Beta) {
		this.q95Beta = q95Beta;
	}
	//get方法
	public Double getTruemaxMw() {
		return truemaxMw;
	}

	//set方法
	public void setTruemaxMw(Double truemaxMw) {
		this.truemaxMw = truemaxMw;
	}
	//get方法
	public Double getTruemaxSa() {
		return truemaxSa;
	}

	//set方法
	public void setTruemaxSa(Double truemaxSa) {
		this.truemaxSa = truemaxSa;
	}
	//get方法
	public Double getTruemaxRv() {
		return truemaxRv;
	}

	//set方法
	public void setTruemaxRv(Double truemaxRv) {
		this.truemaxRv = truemaxRv;
	}
	//get方法
	public Double getTruemaxKdhydrophobicity() {
		return truemaxKdhydrophobicity;
	}

	//set方法
	public void setTruemaxKdhydrophobicity(Double truemaxKdhydrophobicity) {
		this.truemaxKdhydrophobicity = truemaxKdhydrophobicity;
	}
	//get方法
	public Double getTruemaxWwhydrophobicity() {
		return truemaxWwhydrophobicity;
	}

	//set方法
	public void setTruemaxWwhydrophobicity(Double truemaxWwhydrophobicity) {
		this.truemaxWwhydrophobicity = truemaxWwhydrophobicity;
	}
	//get方法
	public Double getTruemaxHhhydrophobicity() {
		return truemaxHhhydrophobicity;
	}

	//set方法
	public void setTruemaxHhhydrophobicity(Double truemaxHhhydrophobicity) {
		this.truemaxHhhydrophobicity = truemaxHhhydrophobicity;
	}
	//get方法
	public Double getTruemaxPositive() {
		return truemaxPositive;
	}

	//set方法
	public void setTruemaxPositive(Double truemaxPositive) {
		this.truemaxPositive = truemaxPositive;
	}
	//get方法
	public Double getTruemaxNegative() {
		return truemaxNegative;
	}

	//set方法
	public void setTruemaxNegative(Double truemaxNegative) {
		this.truemaxNegative = truemaxNegative;
	}
	//get方法
	public Double getTruemaxNeutral() {
		return truemaxNeutral;
	}

	//set方法
	public void setTruemaxNeutral(Double truemaxNeutral) {
		this.truemaxNeutral = truemaxNeutral;
	}
	//get方法
	public Double getTruemaxAlpha() {
		return truemaxAlpha;
	}

	//set方法
	public void setTruemaxAlpha(Double truemaxAlpha) {
		this.truemaxAlpha = truemaxAlpha;
	}
	//get方法
	public Double getTruemaxBeta() {
		return truemaxBeta;
	}

	//set方法
	public void setTruemaxBeta(Double truemaxBeta) {
		this.truemaxBeta = truemaxBeta;
	}
	//get方法
	public Double getMaxMw() {
		return maxMw;
	}

	//set方法
	public void setMaxMw(Double maxMw) {
		this.maxMw = maxMw;
	}
	//get方法
	public Double getMaxSa() {
		return maxSa;
	}

	//set方法
	public void setMaxSa(Double maxSa) {
		this.maxSa = maxSa;
	}
	//get方法
	public Double getMaxRv() {
		return maxRv;
	}

	//set方法
	public void setMaxRv(Double maxRv) {
		this.maxRv = maxRv;
	}
	//get方法
	public Double getMaxKdhydrophobicity() {
		return maxKdhydrophobicity;
	}

	//set方法
	public void setMaxKdhydrophobicity(Double maxKdhydrophobicity) {
		this.maxKdhydrophobicity = maxKdhydrophobicity;
	}
	//get方法
	public Double getMaxWwhydrophobicity() {
		return maxWwhydrophobicity;
	}

	//set方法
	public void setMaxWwhydrophobicity(Double maxWwhydrophobicity) {
		this.maxWwhydrophobicity = maxWwhydrophobicity;
	}
	//get方法
	public Double getMaxHhhydrophobicity() {
		return maxHhhydrophobicity;
	}

	//set方法
	public void setMaxHhhydrophobicity(Double maxHhhydrophobicity) {
		this.maxHhhydrophobicity = maxHhhydrophobicity;
	}
	//get方法
	public Double getMaxPositive() {
		return maxPositive;
	}

	//set方法
	public void setMaxPositive(Double maxPositive) {
		this.maxPositive = maxPositive;
	}
	//get方法
	public Double getMaxNegative() {
		return maxNegative;
	}

	//set方法
	public void setMaxNegative(Double maxNegative) {
		this.maxNegative = maxNegative;
	}
	//get方法
	public Double getMaxNeutral() {
		return maxNeutral;
	}

	//set方法
	public void setMaxNeutral(Double maxNeutral) {
		this.maxNeutral = maxNeutral;
	}
	//get方法
	public Double getMaxAlpha() {
		return maxAlpha;
	}

	//set方法
	public void setMaxAlpha(Double maxAlpha) {
		this.maxAlpha = maxAlpha;
	}
	//get方法
	public Double getMaxBeta() {
		return maxBeta;
	}

	//set方法
	public void setMaxBeta(Double maxBeta) {
		this.maxBeta = maxBeta;
	}
	//get方法
	public Double getMeanMw() {
		return meanMw;
	}

	//set方法
	public void setMeanMw(Double meanMw) {
		this.meanMw = meanMw;
	}
	//get方法
	public Double getMeanSa() {
		return meanSa;
	}

	//set方法
	public void setMeanSa(Double meanSa) {
		this.meanSa = meanSa;
	}
	//get方法
	public Double getMeanRv() {
		return meanRv;
	}

	//set方法
	public void setMeanRv(Double meanRv) {
		this.meanRv = meanRv;
	}
	//get方法
	public Double getMeanKdhydrophobicity() {
		return meanKdhydrophobicity;
	}

	//set方法
	public void setMeanKdhydrophobicity(Double meanKdhydrophobicity) {
		this.meanKdhydrophobicity = meanKdhydrophobicity;
	}
	//get方法
	public Double getMeanWwhydrophobicity() {
		return meanWwhydrophobicity;
	}

	//set方法
	public void setMeanWwhydrophobicity(Double meanWwhydrophobicity) {
		this.meanWwhydrophobicity = meanWwhydrophobicity;
	}
	//get方法
	public Double getMeanHhhydrophobicity() {
		return meanHhhydrophobicity;
	}

	//set方法
	public void setMeanHhhydrophobicity(Double meanHhhydrophobicity) {
		this.meanHhhydrophobicity = meanHhhydrophobicity;
	}
	//get方法
	public Double getMeanPositive() {
		return meanPositive;
	}

	//set方法
	public void setMeanPositive(Double meanPositive) {
		this.meanPositive = meanPositive;
	}
	//get方法
	public Double getMeanNegative() {
		return meanNegative;
	}

	//set方法
	public void setMeanNegative(Double meanNegative) {
		this.meanNegative = meanNegative;
	}
	//get方法
	public Double getMeanNeutral() {
		return meanNeutral;
	}

	//set方法
	public void setMeanNeutral(Double meanNeutral) {
		this.meanNeutral = meanNeutral;
	}
	//get方法
	public Double getMeanAlpha() {
		return meanAlpha;
	}

	//set方法
	public void setMeanAlpha(Double meanAlpha) {
		this.meanAlpha = meanAlpha;
	}
	//get方法
	public Double getMeanBeta() {
		return meanBeta;
	}

	//set方法
	public void setMeanBeta(Double meanBeta) {
		this.meanBeta = meanBeta;
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
