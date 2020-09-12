package com.ngdc.compodynamics.dao;

import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.PhaseSeperationG;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PhaseSeperationGMapper extends Mapper<PhaseSeperationG>{

    @Select("select distinct t.taxonomy from phase_seperation_g t where t.taxonomy like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from phase_seperation_g t where t.organism like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from phase_seperation_g t where t.assembly_accession like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);

    @Select("select * from phase_seperation_g t where t.specise_index = #{speciseIndex}")
    List<PhaseSeperationG> findBySpeciesIndex(Integer speciseIndex);
}
