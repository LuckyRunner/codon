package com.ngdc.compodynamics.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StatisticsGccdcencMapper {

    @Select("select gc from statistics_gccdcenc t where t.taxonomy = #{tax} order by id")
    List<Double> findGC(String tax);

    @Select("select gc1 from statistics_gccdcenc t where t.taxonomy = #{tax} order by id")
    List<Double> findGC1(String tax);

    @Select("select gc2 from statistics_gccdcenc t where t.taxonomy = #{tax} order by id")
    List<Double> findGC2(String tax);

    @Select("select gc3 from statistics_gccdcenc t where t.taxonomy = #{tax} order by id")
    List<Double> findGC3(String tax);
}
