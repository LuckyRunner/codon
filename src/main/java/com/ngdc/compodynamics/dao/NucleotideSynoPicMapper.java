package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.NucleotideSynoPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface NucleotideSynoPicMapper extends Mapper<NucleotideSynoPic>{
    @Select("select * from nucleotide_syno_pic t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<NucleotideSynoPic> findBySpeciesIndex(Integer speciseIndex);
}
