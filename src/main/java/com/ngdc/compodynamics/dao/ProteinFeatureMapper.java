package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.ProteinFeature;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;


/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
@org.apache.ibatis.annotations.Mapper
public interface ProteinFeatureMapper extends Mapper<ProteinFeature>{

    @Select("select distinct t.taxonomy from protein_feature t where t.taxonomy like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from protein_feature t where t.organism like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from protein_feature t where t.assembly_accession like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);
    @Select("select distinct t.gene_id from protein_feature t where t.gene_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneId(String description);
    @Select("select distinct t.protein_id from protein_feature t where t.protein_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinId(String description);
    @Select("select * from protein_feature t where t.cds_index = #{cdsIndex} and t.specise_index = #{speciseIndex} limit 0,10 ")
    List<ProteinFeature> findByCdsIndexAndSpeciseIndex(Integer cdsIndex, Integer speciseIndex);
}
