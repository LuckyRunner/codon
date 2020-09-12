package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:AminoAcidsUsageG的Dao
 * @Date 2019/6/14 0:12
 *****/
@org.apache.ibatis.annotations.Mapper
public interface AminoAcidsUsageGMapper extends Mapper<AminoAcidsUsageG> {
    @Select("select distinct t.taxonomy from amino_acids_usage_g t where t.taxonomy like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from amino_acids_usage_g t where t.organism like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from amino_acids_usage_g t where t.assembly_accession like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);

    @Select("select * from amino_acids_usage_g t where t.species_index = #{speciseIndex}")
    List<AminoAcidsUsageG> findBySpeciesIndex(Integer speciseIndex);

}
