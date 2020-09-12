package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:StatisticsGccdcenc构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="statistics_gccdcenc")
public class StatisticsGccdcenc implements Serializable{

    @Column(name = "taxonomy")
	private String taxonomy;//

    @Column(name = "gc")
	private Double gc;//

    @Column(name = "gc1")
	private Double gc1;//

    @Column(name = "gc2")
	private Double gc2;//

    @Column(name = "gc3")
	private Double gc3;//

    @Column(name = "cdc_median")
	private Double cdcMedian;//

    @Column(name = "enc_median")
	private Double encMedian;//

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
	public Double getGc() {
		return gc;
	}

	//set方法
	public void setGc(Double gc) {
		this.gc = gc;
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
	public Double getGc2() {
		return gc2;
	}

	//set方法
	public void setGc2(Double gc2) {
		this.gc2 = gc2;
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
	public Double getCdcMedian() {
		return cdcMedian;
	}

	//set方法
	public void setCdcMedian(Double cdcMedian) {
		this.cdcMedian = cdcMedian;
	}
	//get方法
	public Double getEncMedian() {
		return encMedian;
	}

	//set方法
	public void setEncMedian(Double encMedian) {
		this.encMedian = encMedian;
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
