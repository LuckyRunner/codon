package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:NucleotideSynoPic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="nucleotide_syno_pic")
public class NucleotideSynoPic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_t3s")
	private Double minT3s;//

    @Column(name = "min_c3s")
	private Double minC3s;//

    @Column(name = "min_a3s")
	private Double minA3s;//

    @Column(name = "min_g3s")
	private Double minG3s;//

    @Column(name = "min_gc3s")
	private Double minGc3s;//

    @Column(name = "truemin_t3s")
	private Double trueminT3s;//

    @Column(name = "truemin_c3s")
	private Double trueminC3s;//

    @Column(name = "truemin_a3s")
	private Double trueminA3s;//

    @Column(name = "truemin_g3s")
	private Double trueminG3s;//

    @Column(name = "truemin_gc3s")
	private Double trueminGc3s;//

    @Column(name = "X05q_t3s")
	private Double X05qT3s;//

    @Column(name = "X05q_c3s")
	private Double X05qC3s;//

    @Column(name = "X05q_a3s")
	private Double X05qA3s;//

    @Column(name = "X05q_g3s")
	private Double X05qG3s;//

    @Column(name = "X05q_gc3s")
	private Double X05qGc3s;//

    @Column(name = "X25q_t3s")
	private Double X25qT3s;//

    @Column(name = "X25q_c3s")
	private Double X25qC3s;//

    @Column(name = "X25q_a3s")
	private Double X25qA3s;//

    @Column(name = "X25q_g3s")
	private Double X25qG3s;//

    @Column(name = "X25q_gc3s")
	private Double X25qGc3s;//

    @Column(name = "X50q_t3s")
	private Double X50qT3s;//

    @Column(name = "X50q_c3s")
	private Double X50qC3s;//

    @Column(name = "X50q_a3s")
	private Double X50qA3s;//

    @Column(name = "X50q_g3s")
	private Double X50qG3s;//

    @Column(name = "X50q_gc3s")
	private Double X50qGc3s;//

    @Column(name = "X75q_t3s")
	private Double X75qT3s;//

    @Column(name = "X75q_c3s")
	private Double X75qC3s;//

    @Column(name = "X75q_a3s")
	private Double X75qA3s;//

    @Column(name = "X75q_g3s")
	private Double X75qG3s;//

    @Column(name = "X75q_gc3s")
	private Double X75qGc3s;//

    @Column(name = "X95q_t3s")
	private Double X95qT3s;//

    @Column(name = "X95q_c3s")
	private Double X95qC3s;//

    @Column(name = "X95q_a3s")
	private Double X95qA3s;//

    @Column(name = "X95q_g3s")
	private Double X95qG3s;//

    @Column(name = "X95q_gc3s")
	private Double X95qGc3s;//

    @Column(name = "truemax_t3s")
	private Double truemaxT3s;//

    @Column(name = "truemax_c3s")
	private Double truemaxC3s;//

    @Column(name = "truemax_a3s")
	private Double truemaxA3s;//

    @Column(name = "truemax_g3s")
	private Double truemaxG3s;//

    @Column(name = "truemax_gc3s")
	private Double truemaxGc3s;//

    @Column(name = "max_t3s")
	private Double maxT3s;//

    @Column(name = "max_c3s")
	private Double maxC3s;//

    @Column(name = "max_a3s")
	private Double maxA3s;//

    @Column(name = "max_g3s")
	private Double maxG3s;//

    @Column(name = "max_gc3s")
	private Double maxGc3s;//

    @Column(name = "mean_t3s")
	private Double meanT3s;//

    @Column(name = "mean_c3s")
	private Double meanC3s;//

    @Column(name = "mean_a3s")
	private Double meanA3s;//

    @Column(name = "mean_g3s")
	private Double meanG3s;//

    @Column(name = "mean_gc3s")
	private Double meanGc3s;//

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
	public Double getMinT3s() {
		return minT3s;
	}

	//set方法
	public void setMinT3s(Double minT3s) {
		this.minT3s = minT3s;
	}
	//get方法
	public Double getMinC3s() {
		return minC3s;
	}

	//set方法
	public void setMinC3s(Double minC3s) {
		this.minC3s = minC3s;
	}
	//get方法
	public Double getMinA3s() {
		return minA3s;
	}

	//set方法
	public void setMinA3s(Double minA3s) {
		this.minA3s = minA3s;
	}
	//get方法
	public Double getMinG3s() {
		return minG3s;
	}

	//set方法
	public void setMinG3s(Double minG3s) {
		this.minG3s = minG3s;
	}
	//get方法
	public Double getMinGc3s() {
		return minGc3s;
	}

	//set方法
	public void setMinGc3s(Double minGc3s) {
		this.minGc3s = minGc3s;
	}
	//get方法
	public Double getTrueminT3s() {
		return trueminT3s;
	}

	//set方法
	public void setTrueminT3s(Double trueminT3s) {
		this.trueminT3s = trueminT3s;
	}
	//get方法
	public Double getTrueminC3s() {
		return trueminC3s;
	}

	//set方法
	public void setTrueminC3s(Double trueminC3s) {
		this.trueminC3s = trueminC3s;
	}
	//get方法
	public Double getTrueminA3s() {
		return trueminA3s;
	}

	//set方法
	public void setTrueminA3s(Double trueminA3s) {
		this.trueminA3s = trueminA3s;
	}
	//get方法
	public Double getTrueminG3s() {
		return trueminG3s;
	}

	//set方法
	public void setTrueminG3s(Double trueminG3s) {
		this.trueminG3s = trueminG3s;
	}
	//get方法
	public Double getTrueminGc3s() {
		return trueminGc3s;
	}

	//set方法
	public void setTrueminGc3s(Double trueminGc3s) {
		this.trueminGc3s = trueminGc3s;
	}
	//get方法
	public Double getX05qT3s() {
		return X05qT3s;
	}

	//set方法
	public void setX05qT3s(Double X05qT3s) {
		this.X05qT3s = X05qT3s;
	}
	//get方法
	public Double getX05qC3s() {
		return X05qC3s;
	}

	//set方法
	public void setX05qC3s(Double X05qC3s) {
		this.X05qC3s = X05qC3s;
	}
	//get方法
	public Double getX05qA3s() {
		return X05qA3s;
	}

	//set方法
	public void setX05qA3s(Double X05qA3s) {
		this.X05qA3s = X05qA3s;
	}
	//get方法
	public Double getX05qG3s() {
		return X05qG3s;
	}

	//set方法
	public void setX05qG3s(Double X05qG3s) {
		this.X05qG3s = X05qG3s;
	}
	//get方法
	public Double getX05qGc3s() {
		return X05qGc3s;
	}

	//set方法
	public void setX05qGc3s(Double X05qGc3s) {
		this.X05qGc3s = X05qGc3s;
	}
	//get方法
	public Double getX25qT3s() {
		return X25qT3s;
	}

	//set方法
	public void setX25qT3s(Double X25qT3s) {
		this.X25qT3s = X25qT3s;
	}
	//get方法
	public Double getX25qC3s() {
		return X25qC3s;
	}

	//set方法
	public void setX25qC3s(Double X25qC3s) {
		this.X25qC3s = X25qC3s;
	}
	//get方法
	public Double getX25qA3s() {
		return X25qA3s;
	}

	//set方法
	public void setX25qA3s(Double X25qA3s) {
		this.X25qA3s = X25qA3s;
	}
	//get方法
	public Double getX25qG3s() {
		return X25qG3s;
	}

	//set方法
	public void setX25qG3s(Double X25qG3s) {
		this.X25qG3s = X25qG3s;
	}
	//get方法
	public Double getX25qGc3s() {
		return X25qGc3s;
	}

	//set方法
	public void setX25qGc3s(Double X25qGc3s) {
		this.X25qGc3s = X25qGc3s;
	}
	//get方法
	public Double getX50qT3s() {
		return X50qT3s;
	}

	//set方法
	public void setX50qT3s(Double X50qT3s) {
		this.X50qT3s = X50qT3s;
	}
	//get方法
	public Double getX50qC3s() {
		return X50qC3s;
	}

	//set方法
	public void setX50qC3s(Double X50qC3s) {
		this.X50qC3s = X50qC3s;
	}
	//get方法
	public Double getX50qA3s() {
		return X50qA3s;
	}

	//set方法
	public void setX50qA3s(Double X50qA3s) {
		this.X50qA3s = X50qA3s;
	}
	//get方法
	public Double getX50qG3s() {
		return X50qG3s;
	}

	//set方法
	public void setX50qG3s(Double X50qG3s) {
		this.X50qG3s = X50qG3s;
	}
	//get方法
	public Double getX50qGc3s() {
		return X50qGc3s;
	}

	//set方法
	public void setX50qGc3s(Double X50qGc3s) {
		this.X50qGc3s = X50qGc3s;
	}
	//get方法
	public Double getX75qT3s() {
		return X75qT3s;
	}

	//set方法
	public void setX75qT3s(Double X75qT3s) {
		this.X75qT3s = X75qT3s;
	}
	//get方法
	public Double getX75qC3s() {
		return X75qC3s;
	}

	//set方法
	public void setX75qC3s(Double X75qC3s) {
		this.X75qC3s = X75qC3s;
	}
	//get方法
	public Double getX75qA3s() {
		return X75qA3s;
	}

	//set方法
	public void setX75qA3s(Double X75qA3s) {
		this.X75qA3s = X75qA3s;
	}
	//get方法
	public Double getX75qG3s() {
		return X75qG3s;
	}

	//set方法
	public void setX75qG3s(Double X75qG3s) {
		this.X75qG3s = X75qG3s;
	}
	//get方法
	public Double getX75qGc3s() {
		return X75qGc3s;
	}

	//set方法
	public void setX75qGc3s(Double X75qGc3s) {
		this.X75qGc3s = X75qGc3s;
	}
	//get方法
	public Double getX95qT3s() {
		return X95qT3s;
	}

	//set方法
	public void setX95qT3s(Double X95qT3s) {
		this.X95qT3s = X95qT3s;
	}
	//get方法
	public Double getX95qC3s() {
		return X95qC3s;
	}

	//set方法
	public void setX95qC3s(Double X95qC3s) {
		this.X95qC3s = X95qC3s;
	}
	//get方法
	public Double getX95qA3s() {
		return X95qA3s;
	}

	//set方法
	public void setX95qA3s(Double X95qA3s) {
		this.X95qA3s = X95qA3s;
	}
	//get方法
	public Double getX95qG3s() {
		return X95qG3s;
	}

	//set方法
	public void setX95qG3s(Double X95qG3s) {
		this.X95qG3s = X95qG3s;
	}
	//get方法
	public Double getX95qGc3s() {
		return X95qGc3s;
	}

	//set方法
	public void setX95qGc3s(Double X95qGc3s) {
		this.X95qGc3s = X95qGc3s;
	}
	//get方法
	public Double getTruemaxT3s() {
		return truemaxT3s;
	}

	//set方法
	public void setTruemaxT3s(Double truemaxT3s) {
		this.truemaxT3s = truemaxT3s;
	}
	//get方法
	public Double getTruemaxC3s() {
		return truemaxC3s;
	}

	//set方法
	public void setTruemaxC3s(Double truemaxC3s) {
		this.truemaxC3s = truemaxC3s;
	}
	//get方法
	public Double getTruemaxA3s() {
		return truemaxA3s;
	}

	//set方法
	public void setTruemaxA3s(Double truemaxA3s) {
		this.truemaxA3s = truemaxA3s;
	}
	//get方法
	public Double getTruemaxG3s() {
		return truemaxG3s;
	}

	//set方法
	public void setTruemaxG3s(Double truemaxG3s) {
		this.truemaxG3s = truemaxG3s;
	}
	//get方法
	public Double getTruemaxGc3s() {
		return truemaxGc3s;
	}

	//set方法
	public void setTruemaxGc3s(Double truemaxGc3s) {
		this.truemaxGc3s = truemaxGc3s;
	}
	//get方法
	public Double getMaxT3s() {
		return maxT3s;
	}

	//set方法
	public void setMaxT3s(Double maxT3s) {
		this.maxT3s = maxT3s;
	}
	//get方法
	public Double getMaxC3s() {
		return maxC3s;
	}

	//set方法
	public void setMaxC3s(Double maxC3s) {
		this.maxC3s = maxC3s;
	}
	//get方法
	public Double getMaxA3s() {
		return maxA3s;
	}

	//set方法
	public void setMaxA3s(Double maxA3s) {
		this.maxA3s = maxA3s;
	}
	//get方法
	public Double getMaxG3s() {
		return maxG3s;
	}

	//set方法
	public void setMaxG3s(Double maxG3s) {
		this.maxG3s = maxG3s;
	}
	//get方法
	public Double getMaxGc3s() {
		return maxGc3s;
	}

	//set方法
	public void setMaxGc3s(Double maxGc3s) {
		this.maxGc3s = maxGc3s;
	}
	//get方法
	public Double getMeanT3s() {
		return meanT3s;
	}

	//set方法
	public void setMeanT3s(Double meanT3s) {
		this.meanT3s = meanT3s;
	}
	//get方法
	public Double getMeanC3s() {
		return meanC3s;
	}

	//set方法
	public void setMeanC3s(Double meanC3s) {
		this.meanC3s = meanC3s;
	}
	//get方法
	public Double getMeanA3s() {
		return meanA3s;
	}

	//set方法
	public void setMeanA3s(Double meanA3s) {
		this.meanA3s = meanA3s;
	}
	//get方法
	public Double getMeanG3s() {
		return meanG3s;
	}

	//set方法
	public void setMeanG3s(Double meanG3s) {
		this.meanG3s = meanG3s;
	}
	//get方法
	public Double getMeanGc3s() {
		return meanGc3s;
	}

	//set方法
	public void setMeanGc3s(Double meanGc3s) {
		this.meanGc3s = meanGc3s;
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
