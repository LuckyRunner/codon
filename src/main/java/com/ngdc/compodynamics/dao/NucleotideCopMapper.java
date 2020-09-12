package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.NucleotideCop;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCop的Dao
 * @Date 2019/6/14 0:12
 *****/
@org.apache.ibatis.annotations.Mapper
public interface NucleotideCopMapper extends Mapper<NucleotideCop> {
    @Select("select distinct t.taxonomy from nucleotide_cop t where t.taxonomy like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from nucleotide_cop t where t.organism like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from nucleotide_cop t where t.assembly_accession like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);
    @Select("select distinct t.gene_id from nucleotide_cop t where t.gene_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneId(String description);
    @Select("select distinct t.protein_id from nucleotide_cop t where t.protein_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinId(String description);

    @Select("select * from nucleotide_cop t where t.cds_index = #{cdsIndex} and t.specise_index = #{speciseIndex} limit 0,10 ")
    List<NucleotideCop> findByCdsIndexAndSpeciseIndex(Integer cdsIndex, Integer speciseIndex);
}
