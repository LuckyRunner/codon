
package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.GeneBasicInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GeneBasicInfoMapper extends Mapper<GeneBasicInfo>{
    @Select("select distinct t.taxonomy from gene_basic_info t where t.taxonomy like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findTaxonomy(String description);
    @Select("select distinct t.organism from gene_basic_info t where t.organism like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findOrganism(String description);
    @Select("select distinct t.assembly_accession from gene_basic_info t where t.assembly_accession like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findAssemblyAccession(String description);
    @Select("select distinct t.gene_id from gene_basic_info t where t.gene_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneId(String description);
    @Select("select distinct t.protein_id from gene_basic_info t where t.protein_id like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinId(String description);

    @Select("select distinct t.gene_name from gene_basic_info t where t.gene_name like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findGeneName(String description);
    @Select("select distinct t.protein_name from gene_basic_info t where t.protein_name like CONCAT(#{0},'%') limit 0,10 ")
    List<String> findProteinName(String description);

    @Select("select * from gene_basic_info t where t.gene_index = #{cdsIndex} and t.file_index = #{fileIndex} limit 0,10 ")
    List<GeneBasicInfo> findByGeneIndexAndFileIndex(Integer cdsIndex, Integer fileIndex);
}
