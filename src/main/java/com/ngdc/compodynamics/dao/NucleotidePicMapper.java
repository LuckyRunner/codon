package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.NucleotidePic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface NucleotidePicMapper extends Mapper<NucleotidePic>{
    @Select("select * from nucleotide_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<NucleotidePic> findBySpeciesIndex(Integer speciseIndex);
}
