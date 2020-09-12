package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.dto.AminoHotmapDTO;
import com.ngdc.compodynamics.dto.CodonBiasHotmapDTO;
import com.ngdc.compodynamics.dto.CodonHotmapDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StatisticsHotmapMapper {

    @Select("select * from statistics_hotmap order by id")
    List<AminoHotmapDTO> findAmino();

    @Select("select * from statistics_hotmap order by id")
    List<CodonHotmapDTO> findCodon();

    @Select("select * from statistics_hotmap order by id")
    List<CodonBiasHotmapDTO> findBias();
}
