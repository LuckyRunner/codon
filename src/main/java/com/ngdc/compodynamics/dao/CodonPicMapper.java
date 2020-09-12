package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.CodonPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface CodonPicMapper extends Mapper<CodonPic>{
    @Select("select * from codon_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<CodonPic> findBySpeciesIndex(Integer speciseIndex);
}
