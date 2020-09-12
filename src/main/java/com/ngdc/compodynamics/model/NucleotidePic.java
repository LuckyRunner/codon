package com.ngdc.compodynamics.model;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:NucleotidePic构建
 * @Date 2019/6/14 19:13
 *****/

@Table(name="nucleotide_pic")
public class NucleotidePic implements Serializable{

    @Column(name = "specise_index")
	private Integer speciseIndex;//

    @Column(name = "min_gc")
	private Double minGc;//

    @Column(name = "min_ag")
	private Double minAg;//

    @Column(name = "min_gc1")
	private Double minGc1;//

    @Column(name = "min_ag1")
	private Double minAg1;//

    @Column(name = "min_gc2")
	private Double minGc2;//

    @Column(name = "min_ag2")
	private Double minAg2;//

    @Column(name = "min_gc3")
	private Double minGc3;//

    @Column(name = "min_ag3")
	private Double minAg3;//

    @Column(name = "truemin_gc")
	private Double trueminGc;//

    @Column(name = "truemin_ag")
	private Double trueminAg;//

    @Column(name = "truemin_gc1")
	private Double trueminGc1;//

    @Column(name = "truemin_ag1")
	private Double trueminAg1;//

    @Column(name = "truemin_gc2")
	private Double trueminGc2;//

    @Column(name = "truemin_ag2")
	private Double trueminAg2;//

    @Column(name = "truemin_gc3")
	private Double trueminGc3;//

    @Column(name = "truemin_ag3")
	private Double trueminAg3;//

    @Column(name = "q05_gc")
	private Double q05Gc;//

    @Column(name = "q05_ag")
	private Double q05Ag;//

    @Column(name = "q05_gc1")
	private Double q05Gc1;//

    @Column(name = "q05_ag1")
	private Double q05Ag1;//

    @Column(name = "q05_gc2")
	private Double q05Gc2;//

    @Column(name = "q05_ag2")
	private Double q05Ag2;//

    @Column(name = "q05_gc3")
	private Double q05Gc3;//

    @Column(name = "q05_ag3")
	private Double q05Ag3;//

    @Column(name = "q25_gc")
	private Double q25Gc;//

    @Column(name = "q25_ag")
	private Double q25Ag;//

    @Column(name = "q25_gc1")
	private Double q25Gc1;//

    @Column(name = "q25_ag1")
	private Double q25Ag1;//

    @Column(name = "q25_gc2")
	private Double q25Gc2;//

    @Column(name = "q25_ag2")
	private Double q25Ag2;//

    @Column(name = "q25_gc3")
	private Double q25Gc3;//

    @Column(name = "q25_ag3")
	private Double q25Ag3;//

    @Column(name = "q50_gc")
	private Double q50Gc;//

    @Column(name = "q50_ag")
	private Double q50Ag;//

    @Column(name = "q50_gc1")
	private Double q50Gc1;//

    @Column(name = "q50_ag1")
	private Double q50Ag1;//

    @Column(name = "q50_gc2")
	private Double q50Gc2;//

    @Column(name = "q50_ag2")
	private Double q50Ag2;//

    @Column(name = "q50_gc3")
	private Double q50Gc3;//

    @Column(name = "q50_ag3")
	private Double q50Ag3;//

    @Column(name = "q75_gc")
	private Double q75Gc;//

    @Column(name = "q75_ag")
	private Double q75Ag;//

    @Column(name = "q75_gc1")
	private Double q75Gc1;//

    @Column(name = "q75_ag1")
	private Double q75Ag1;//

    @Column(name = "q75_gc2")
	private Double q75Gc2;//

    @Column(name = "q75_ag2")
	private Double q75Ag2;//

    @Column(name = "q75_gc3")
	private Double q75Gc3;//

    @Column(name = "q75_ag3")
	private Double q75Ag3;//

    @Column(name = "q95_gc")
	private Double q95Gc;//

    @Column(name = "q95_ag")
	private Double q95Ag;//

    @Column(name = "q95_gc1")
	private Double q95Gc1;//

    @Column(name = "q95_ag1")
	private Double q95Ag1;//

    @Column(name = "q95_gc2")
	private Double q95Gc2;//

    @Column(name = "q95_ag2")
	private Double q95Ag2;//

    @Column(name = "q95_gc3")
	private Double q95Gc3;//

    @Column(name = "q95_ag3")
	private Double q95Ag3;//

    @Column(name = "truemax_gc")
	private Double truemaxGc;//

    @Column(name = "truemax_ag")
	private Double truemaxAg;//

    @Column(name = "truemax_gc1")
	private Double truemaxGc1;//

    @Column(name = "truemax_ag1")
	private Double truemaxAg1;//

    @Column(name = "truemax_gc2")
	private Double truemaxGc2;//

    @Column(name = "truemax_ag2")
	private Double truemaxAg2;//

    @Column(name = "truemax_gc3")
	private Double truemaxGc3;//

    @Column(name = "truemax_ag3")
	private Double truemaxAg3;//

    @Column(name = "max_gc")
	private Double maxGc;//

    @Column(name = "max_ag")
	private Double maxAg;//

    @Column(name = "max_gc1")
	private Double maxGc1;//

    @Column(name = "max_ag1")
	private Double maxAg1;//

    @Column(name = "max_gc2")
	private Double maxGc2;//

    @Column(name = "max_ag2")
	private Double maxAg2;//

    @Column(name = "max_gc3")
	private Double maxGc3;//

    @Column(name = "max_ag3")
	private Double maxAg3;//

    @Column(name = "mean_gc")
	private Double meanGc;//

    @Column(name = "mean_ag")
	private Double meanAg;//

    @Column(name = "mean_gc1")
	private Double meanGc1;//

    @Column(name = "mean_ag1")
	private Double meanAg1;//

    @Column(name = "mean_gc2")
	private Double meanGc2;//

    @Column(name = "mean_ag2")
	private Double meanAg2;//

    @Column(name = "mean_gc3")
	private Double meanGc3;//

    @Column(name = "mean_ag3")
	private Double meanAg3;//

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
	public Double getMinGc() {
		return minGc;
	}

	//set方法
	public void setMinGc(Double minGc) {
		this.minGc = minGc;
	}
	//get方法
	public Double getMinAg() {
		return minAg;
	}

	//set方法
	public void setMinAg(Double minAg) {
		this.minAg = minAg;
	}
	//get方法
	public Double getMinGc1() {
		return minGc1;
	}

	//set方法
	public void setMinGc1(Double minGc1) {
		this.minGc1 = minGc1;
	}
	//get方法
	public Double getMinAg1() {
		return minAg1;
	}

	//set方法
	public void setMinAg1(Double minAg1) {
		this.minAg1 = minAg1;
	}
	//get方法
	public Double getMinGc2() {
		return minGc2;
	}

	//set方法
	public void setMinGc2(Double minGc2) {
		this.minGc2 = minGc2;
	}
	//get方法
	public Double getMinAg2() {
		return minAg2;
	}

	//set方法
	public void setMinAg2(Double minAg2) {
		this.minAg2 = minAg2;
	}
	//get方法
	public Double getMinGc3() {
		return minGc3;
	}

	//set方法
	public void setMinGc3(Double minGc3) {
		this.minGc3 = minGc3;
	}
	//get方法
	public Double getMinAg3() {
		return minAg3;
	}

	//set方法
	public void setMinAg3(Double minAg3) {
		this.minAg3 = minAg3;
	}
	//get方法
	public Double getTrueminGc() {
		return trueminGc;
	}

	//set方法
	public void setTrueminGc(Double trueminGc) {
		this.trueminGc = trueminGc;
	}
	//get方法
	public Double getTrueminAg() {
		return trueminAg;
	}

	//set方法
	public void setTrueminAg(Double trueminAg) {
		this.trueminAg = trueminAg;
	}
	//get方法
	public Double getTrueminGc1() {
		return trueminGc1;
	}

	//set方法
	public void setTrueminGc1(Double trueminGc1) {
		this.trueminGc1 = trueminGc1;
	}
	//get方法
	public Double getTrueminAg1() {
		return trueminAg1;
	}

	//set方法
	public void setTrueminAg1(Double trueminAg1) {
		this.trueminAg1 = trueminAg1;
	}
	//get方法
	public Double getTrueminGc2() {
		return trueminGc2;
	}

	//set方法
	public void setTrueminGc2(Double trueminGc2) {
		this.trueminGc2 = trueminGc2;
	}
	//get方法
	public Double getTrueminAg2() {
		return trueminAg2;
	}

	//set方法
	public void setTrueminAg2(Double trueminAg2) {
		this.trueminAg2 = trueminAg2;
	}
	//get方法
	public Double getTrueminGc3() {
		return trueminGc3;
	}

	//set方法
	public void setTrueminGc3(Double trueminGc3) {
		this.trueminGc3 = trueminGc3;
	}
	//get方法
	public Double getTrueminAg3() {
		return trueminAg3;
	}

	//set方法
	public void setTrueminAg3(Double trueminAg3) {
		this.trueminAg3 = trueminAg3;
	}
	//get方法
	public Double getQ05Gc() {
		return q05Gc;
	}

	//set方法
	public void setQ05Gc(Double q05Gc) {
		this.q05Gc = q05Gc;
	}
	//get方法
	public Double getQ05Ag() {
		return q05Ag;
	}

	//set方法
	public void setQ05Ag(Double q05Ag) {
		this.q05Ag = q05Ag;
	}
	//get方法
	public Double getQ05Gc1() {
		return q05Gc1;
	}

	//set方法
	public void setQ05Gc1(Double q05Gc1) {
		this.q05Gc1 = q05Gc1;
	}
	//get方法
	public Double getQ05Ag1() {
		return q05Ag1;
	}

	//set方法
	public void setQ05Ag1(Double q05Ag1) {
		this.q05Ag1 = q05Ag1;
	}
	//get方法
	public Double getQ05Gc2() {
		return q05Gc2;
	}

	//set方法
	public void setQ05Gc2(Double q05Gc2) {
		this.q05Gc2 = q05Gc2;
	}
	//get方法
	public Double getQ05Ag2() {
		return q05Ag2;
	}

	//set方法
	public void setQ05Ag2(Double q05Ag2) {
		this.q05Ag2 = q05Ag2;
	}
	//get方法
	public Double getQ05Gc3() {
		return q05Gc3;
	}

	//set方法
	public void setQ05Gc3(Double q05Gc3) {
		this.q05Gc3 = q05Gc3;
	}
	//get方法
	public Double getQ05Ag3() {
		return q05Ag3;
	}

	//set方法
	public void setQ05Ag3(Double q05Ag3) {
		this.q05Ag3 = q05Ag3;
	}
	//get方法
	public Double getQ25Gc() {
		return q25Gc;
	}

	//set方法
	public void setQ25Gc(Double q25Gc) {
		this.q25Gc = q25Gc;
	}
	//get方法
	public Double getQ25Ag() {
		return q25Ag;
	}

	//set方法
	public void setQ25Ag(Double q25Ag) {
		this.q25Ag = q25Ag;
	}
	//get方法
	public Double getQ25Gc1() {
		return q25Gc1;
	}

	//set方法
	public void setQ25Gc1(Double q25Gc1) {
		this.q25Gc1 = q25Gc1;
	}
	//get方法
	public Double getQ25Ag1() {
		return q25Ag1;
	}

	//set方法
	public void setQ25Ag1(Double q25Ag1) {
		this.q25Ag1 = q25Ag1;
	}
	//get方法
	public Double getQ25Gc2() {
		return q25Gc2;
	}

	//set方法
	public void setQ25Gc2(Double q25Gc2) {
		this.q25Gc2 = q25Gc2;
	}
	//get方法
	public Double getQ25Ag2() {
		return q25Ag2;
	}

	//set方法
	public void setQ25Ag2(Double q25Ag2) {
		this.q25Ag2 = q25Ag2;
	}
	//get方法
	public Double getQ25Gc3() {
		return q25Gc3;
	}

	//set方法
	public void setQ25Gc3(Double q25Gc3) {
		this.q25Gc3 = q25Gc3;
	}
	//get方法
	public Double getQ25Ag3() {
		return q25Ag3;
	}

	//set方法
	public void setQ25Ag3(Double q25Ag3) {
		this.q25Ag3 = q25Ag3;
	}
	//get方法
	public Double getQ50Gc() {
		return q50Gc;
	}

	//set方法
	public void setQ50Gc(Double q50Gc) {
		this.q50Gc = q50Gc;
	}
	//get方法
	public Double getQ50Ag() {
		return q50Ag;
	}

	//set方法
	public void setQ50Ag(Double q50Ag) {
		this.q50Ag = q50Ag;
	}
	//get方法
	public Double getQ50Gc1() {
		return q50Gc1;
	}

	//set方法
	public void setQ50Gc1(Double q50Gc1) {
		this.q50Gc1 = q50Gc1;
	}
	//get方法
	public Double getQ50Ag1() {
		return q50Ag1;
	}

	//set方法
	public void setQ50Ag1(Double q50Ag1) {
		this.q50Ag1 = q50Ag1;
	}
	//get方法
	public Double getQ50Gc2() {
		return q50Gc2;
	}

	//set方法
	public void setQ50Gc2(Double q50Gc2) {
		this.q50Gc2 = q50Gc2;
	}
	//get方法
	public Double getQ50Ag2() {
		return q50Ag2;
	}

	//set方法
	public void setQ50Ag2(Double q50Ag2) {
		this.q50Ag2 = q50Ag2;
	}
	//get方法
	public Double getQ50Gc3() {
		return q50Gc3;
	}

	//set方法
	public void setQ50Gc3(Double q50Gc3) {
		this.q50Gc3 = q50Gc3;
	}
	//get方法
	public Double getQ50Ag3() {
		return q50Ag3;
	}

	//set方法
	public void setQ50Ag3(Double q50Ag3) {
		this.q50Ag3 = q50Ag3;
	}
	//get方法
	public Double getQ75Gc() {
		return q75Gc;
	}

	//set方法
	public void setQ75Gc(Double q75Gc) {
		this.q75Gc = q75Gc;
	}
	//get方法
	public Double getQ75Ag() {
		return q75Ag;
	}

	//set方法
	public void setQ75Ag(Double q75Ag) {
		this.q75Ag = q75Ag;
	}
	//get方法
	public Double getQ75Gc1() {
		return q75Gc1;
	}

	//set方法
	public void setQ75Gc1(Double q75Gc1) {
		this.q75Gc1 = q75Gc1;
	}
	//get方法
	public Double getQ75Ag1() {
		return q75Ag1;
	}

	//set方法
	public void setQ75Ag1(Double q75Ag1) {
		this.q75Ag1 = q75Ag1;
	}
	//get方法
	public Double getQ75Gc2() {
		return q75Gc2;
	}

	//set方法
	public void setQ75Gc2(Double q75Gc2) {
		this.q75Gc2 = q75Gc2;
	}
	//get方法
	public Double getQ75Ag2() {
		return q75Ag2;
	}

	//set方法
	public void setQ75Ag2(Double q75Ag2) {
		this.q75Ag2 = q75Ag2;
	}
	//get方法
	public Double getQ75Gc3() {
		return q75Gc3;
	}

	//set方法
	public void setQ75Gc3(Double q75Gc3) {
		this.q75Gc3 = q75Gc3;
	}
	//get方法
	public Double getQ75Ag3() {
		return q75Ag3;
	}

	//set方法
	public void setQ75Ag3(Double q75Ag3) {
		this.q75Ag3 = q75Ag3;
	}
	//get方法
	public Double getQ95Gc() {
		return q95Gc;
	}

	//set方法
	public void setQ95Gc(Double q95Gc) {
		this.q95Gc = q95Gc;
	}
	//get方法
	public Double getQ95Ag() {
		return q95Ag;
	}

	//set方法
	public void setQ95Ag(Double q95Ag) {
		this.q95Ag = q95Ag;
	}
	//get方法
	public Double getQ95Gc1() {
		return q95Gc1;
	}

	//set方法
	public void setQ95Gc1(Double q95Gc1) {
		this.q95Gc1 = q95Gc1;
	}
	//get方法
	public Double getQ95Ag1() {
		return q95Ag1;
	}

	//set方法
	public void setQ95Ag1(Double q95Ag1) {
		this.q95Ag1 = q95Ag1;
	}
	//get方法
	public Double getQ95Gc2() {
		return q95Gc2;
	}

	//set方法
	public void setQ95Gc2(Double q95Gc2) {
		this.q95Gc2 = q95Gc2;
	}
	//get方法
	public Double getQ95Ag2() {
		return q95Ag2;
	}

	//set方法
	public void setQ95Ag2(Double q95Ag2) {
		this.q95Ag2 = q95Ag2;
	}
	//get方法
	public Double getQ95Gc3() {
		return q95Gc3;
	}

	//set方法
	public void setQ95Gc3(Double q95Gc3) {
		this.q95Gc3 = q95Gc3;
	}
	//get方法
	public Double getQ95Ag3() {
		return q95Ag3;
	}

	//set方法
	public void setQ95Ag3(Double q95Ag3) {
		this.q95Ag3 = q95Ag3;
	}
	//get方法
	public Double getTruemaxGc() {
		return truemaxGc;
	}

	//set方法
	public void setTruemaxGc(Double truemaxGc) {
		this.truemaxGc = truemaxGc;
	}
	//get方法
	public Double getTruemaxAg() {
		return truemaxAg;
	}

	//set方法
	public void setTruemaxAg(Double truemaxAg) {
		this.truemaxAg = truemaxAg;
	}
	//get方法
	public Double getTruemaxGc1() {
		return truemaxGc1;
	}

	//set方法
	public void setTruemaxGc1(Double truemaxGc1) {
		this.truemaxGc1 = truemaxGc1;
	}
	//get方法
	public Double getTruemaxAg1() {
		return truemaxAg1;
	}

	//set方法
	public void setTruemaxAg1(Double truemaxAg1) {
		this.truemaxAg1 = truemaxAg1;
	}
	//get方法
	public Double getTruemaxGc2() {
		return truemaxGc2;
	}

	//set方法
	public void setTruemaxGc2(Double truemaxGc2) {
		this.truemaxGc2 = truemaxGc2;
	}
	//get方法
	public Double getTruemaxAg2() {
		return truemaxAg2;
	}

	//set方法
	public void setTruemaxAg2(Double truemaxAg2) {
		this.truemaxAg2 = truemaxAg2;
	}
	//get方法
	public Double getTruemaxGc3() {
		return truemaxGc3;
	}

	//set方法
	public void setTruemaxGc3(Double truemaxGc3) {
		this.truemaxGc3 = truemaxGc3;
	}
	//get方法
	public Double getTruemaxAg3() {
		return truemaxAg3;
	}

	//set方法
	public void setTruemaxAg3(Double truemaxAg3) {
		this.truemaxAg3 = truemaxAg3;
	}
	//get方法
	public Double getMaxGc() {
		return maxGc;
	}

	//set方法
	public void setMaxGc(Double maxGc) {
		this.maxGc = maxGc;
	}
	//get方法
	public Double getMaxAg() {
		return maxAg;
	}

	//set方法
	public void setMaxAg(Double maxAg) {
		this.maxAg = maxAg;
	}
	//get方法
	public Double getMaxGc1() {
		return maxGc1;
	}

	//set方法
	public void setMaxGc1(Double maxGc1) {
		this.maxGc1 = maxGc1;
	}
	//get方法
	public Double getMaxAg1() {
		return maxAg1;
	}

	//set方法
	public void setMaxAg1(Double maxAg1) {
		this.maxAg1 = maxAg1;
	}
	//get方法
	public Double getMaxGc2() {
		return maxGc2;
	}

	//set方法
	public void setMaxGc2(Double maxGc2) {
		this.maxGc2 = maxGc2;
	}
	//get方法
	public Double getMaxAg2() {
		return maxAg2;
	}

	//set方法
	public void setMaxAg2(Double maxAg2) {
		this.maxAg2 = maxAg2;
	}
	//get方法
	public Double getMaxGc3() {
		return maxGc3;
	}

	//set方法
	public void setMaxGc3(Double maxGc3) {
		this.maxGc3 = maxGc3;
	}
	//get方法
	public Double getMaxAg3() {
		return maxAg3;
	}

	//set方法
	public void setMaxAg3(Double maxAg3) {
		this.maxAg3 = maxAg3;
	}
	//get方法
	public Double getMeanGc() {
		return meanGc;
	}

	//set方法
	public void setMeanGc(Double meanGc) {
		this.meanGc = meanGc;
	}
	//get方法
	public Double getMeanAg() {
		return meanAg;
	}

	//set方法
	public void setMeanAg(Double meanAg) {
		this.meanAg = meanAg;
	}
	//get方法
	public Double getMeanGc1() {
		return meanGc1;
	}

	//set方法
	public void setMeanGc1(Double meanGc1) {
		this.meanGc1 = meanGc1;
	}
	//get方法
	public Double getMeanAg1() {
		return meanAg1;
	}

	//set方法
	public void setMeanAg1(Double meanAg1) {
		this.meanAg1 = meanAg1;
	}
	//get方法
	public Double getMeanGc2() {
		return meanGc2;
	}

	//set方法
	public void setMeanGc2(Double meanGc2) {
		this.meanGc2 = meanGc2;
	}
	//get方法
	public Double getMeanAg2() {
		return meanAg2;
	}

	//set方法
	public void setMeanAg2(Double meanAg2) {
		this.meanAg2 = meanAg2;
	}
	//get方法
	public Double getMeanGc3() {
		return meanGc3;
	}

	//set方法
	public void setMeanGc3(Double meanGc3) {
		this.meanGc3 = meanGc3;
	}
	//get方法
	public Double getMeanAg3() {
		return meanAg3;
	}

	//set方法
	public void setMeanAg3(Double meanAg3) {
		this.meanAg3 = meanAg3;
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
