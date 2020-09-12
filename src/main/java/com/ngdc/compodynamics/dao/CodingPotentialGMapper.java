package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.CodingPotentialG;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CodingPotentialG的Dao
 * @Date 2019/6/14 0:12
 *****/
@org.apache.ibatis.annotations.Mapper
public interface CodingPotentialGMapper extends Mapper<CodingPotentialG>{
    @Select("select distinct t.taxonomy from coding_potential_g t where t.taxonomy like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from coding_potential_g t where t.organism like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from coding_potential_g t where t.assembly_accession like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);

    @Select("select * from coding_potential_g t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<CodingPotentialG> findBySpeciseIndex(Integer speciseIndex);
}
