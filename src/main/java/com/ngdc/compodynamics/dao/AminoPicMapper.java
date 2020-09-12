package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.AminoPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface AminoPicMapper extends Mapper<AminoPic>{
    @Select("select * from amino_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<AminoPic> findBySpeciesIndex(Integer speciseIndex);
}
