package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.CodingPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface CodingPicMapper extends Mapper<CodingPic>{
    @Select("select * from coding_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<CodingPic> findBySpeciesIndex(Integer speciseIndex);
}
