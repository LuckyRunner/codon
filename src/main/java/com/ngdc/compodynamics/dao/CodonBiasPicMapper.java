package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.CodonBiasPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface CodonBiasPicMapper extends Mapper<CodonBiasPic>{
    @Select("select * from codon_bias_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<CodonBiasPic> findBySpeciesIndex(Integer speciseIndex);
}
