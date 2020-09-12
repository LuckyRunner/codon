package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.AminoAcidsUsage;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
@org.apache.ibatis.annotations.Mapper
public interface AminoAcidsUsageMapper extends Mapper<AminoAcidsUsage> {

    @Select("select distinct t.taxonomy from amino_acids_usage t where t.taxonomy like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from amino_acids_usage t where t.organism like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from amino_acids_usage t where t.assembly_accession like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);
    @Select("select distinct t.gene_id from amino_acids_usage t where t.gene_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneId(String description);
    @Select("select distinct t.protein_id from amino_acids_usage t where t.protein_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinId(String description);

    @Select("select * from amino_acids_usage t where t.cds_index = #{cdsIndex} and t.specise_index = #{speciseIndex} limit 0,10 ")
    List<AminoAcidsUsage> findByCdsIndexAndSpeciseIndex(Integer cdsIndex, Integer speciseIndex);
}
