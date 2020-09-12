package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.SpeciseInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface SpeciseInfoMapper extends Mapper<SpeciseInfo> {
    @Select("select distinct t.taxonomy from specise_info t where t.taxonomy like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from specise_info t where t.organism like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from specise_info t where t.assembly_accession like CONCAT('%',#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);

    @Select("select * from specise_info t where t.specise_index = #{speciseIndex} limit 0,10 ")
    List<SpeciseInfo> findBySpeciseIndex(Integer speciseIndex);
}
