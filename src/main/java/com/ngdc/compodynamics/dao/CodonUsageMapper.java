package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.CodonUsage;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface CodonUsageMapper extends Mapper<CodonUsage>{
    @Select("select distinct t.taxonomy from codon_usage t where t.taxonomy like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from codon_usage t where t.organism like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from codon_usage t where t.assembly_accession like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);
    @Select("select distinct t.gene_id from codon_usage t where t.gene_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneId(String description);
    @Select("select distinct t.protein_id from codon_usage t where t.protein_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinId(String description);

    @Select("select * from codon_usage t where t.cds_index = #{cdsIndex} and t.specise_index = #{speciseIndex} limit 0,10 ")
    List<CodonUsage> findByCdsIndexAndSpeciseIndex(Integer cdsIndex, Integer speciseIndex);
}
