package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.PhaseSeperationPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PhaseSeperationPicMapper extends Mapper<PhaseSeperationPic> {
    @Select("select * from phase_seperation_pic t where t.specise_index = #{speciseIndex}  limit 0,10 ")
    List<PhaseSeperationPic> findBySpeciesIndex(Integer speciseIndex);
}
