package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.ProteinFeatureMapper;
import com.ngdc.compodynamics.dto.ProteinFeatureDTO;
import com.ngdc.compodynamics.model.ProteinFeature;
import com.ngdc.compodynamics.service.ProteinFeatureService;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
@Service
public class ProteinFeatureServiceImpl implements ProteinFeatureService {

    @Autowired
    private ProteinFeatureMapper proteinFeatureMapper;

    @Override
    public PageInfo<ProteinFeature> findPage(ProteinFeatureDTO proteinFeatureDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(ProteinFeature.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(proteinFeatureDTO.getTaxonomy())&&!StringUtils.equals(proteinFeatureDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",proteinFeatureDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(proteinFeatureDTO.getOrganism())&&!StringUtils.equals(proteinFeatureDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",proteinFeatureDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(proteinFeatureDTO.getAssemblyAccession())&&!StringUtils.equals(proteinFeatureDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",proteinFeatureDTO.getAssemblyAccession());
        }

        if (StringUtils.isNotEmpty(proteinFeatureDTO.getGeneId())&&!StringUtils.equals(proteinFeatureDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",proteinFeatureDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(proteinFeatureDTO.getProteinId())&&!StringUtils.equals(proteinFeatureDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",proteinFeatureDTO.getProteinId());
        }
        if (proteinFeatureDTO.getMwStart() != null && proteinFeatureDTO.getMwStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("mw",proteinFeatureDTO.getMwStart());
        }
        if (proteinFeatureDTO.getMwEnd() != null && proteinFeatureDTO.getMwEnd()!=-1) {
            criteria.andLessThanOrEqualTo("mw",proteinFeatureDTO.getMwEnd());
        }
        if (proteinFeatureDTO.getSaStart() != null && proteinFeatureDTO.getSaStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("sa",proteinFeatureDTO.getSaStart());
        }
        if (proteinFeatureDTO.getSaEnd() != null && proteinFeatureDTO.getSaEnd()!=-1) {
            criteria.andLessThanOrEqualTo("sa",proteinFeatureDTO.getSaEnd());
        }
        if (proteinFeatureDTO.getRvStart() != null && proteinFeatureDTO.getRvStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("rv",proteinFeatureDTO.getRvStart());
        }
        if (proteinFeatureDTO.getRvEnd() != null && proteinFeatureDTO.getRvEnd()!=-1) {
            criteria.andLessThanOrEqualTo("rv",proteinFeatureDTO.getRvEnd());
        }
        if (proteinFeatureDTO.getKdStart() != null && proteinFeatureDTO.getKdStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("kd",proteinFeatureDTO.getKdStart());
        }
        if (proteinFeatureDTO.getKdEnd() != null && proteinFeatureDTO.getKdEnd()!=-1) {
            criteria.andLessThanOrEqualTo("kd",proteinFeatureDTO.getKdEnd());
        }
        if (proteinFeatureDTO.getWwStart() != null && proteinFeatureDTO.getWwStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("ww",proteinFeatureDTO.getWwStart());
        }
        if (proteinFeatureDTO.getWwEnd() != null && proteinFeatureDTO.getWwEnd()!=-1) {
            criteria.andLessThanOrEqualTo("ww",proteinFeatureDTO.getWwEnd());
        }
        if (proteinFeatureDTO.getHhStart() != null && proteinFeatureDTO.getHhStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("hh",proteinFeatureDTO.getHhStart());
        }
        if (proteinFeatureDTO.getHhEnd() != null && proteinFeatureDTO.getHhEnd()!=-1) {
            criteria.andLessThanOrEqualTo("hh",proteinFeatureDTO.getHhEnd());
        }
        if (proteinFeatureDTO.getPositiveStart() != null && proteinFeatureDTO.getPositiveStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("positive",proteinFeatureDTO.getPositiveStart());
        }
        if (proteinFeatureDTO.getPositiveEnd() != null && proteinFeatureDTO.getPositiveEnd()!=-1) {
            criteria.andLessThanOrEqualTo("positive",proteinFeatureDTO.getPositiveEnd());
        }
        if (proteinFeatureDTO.getNegativeStart() != null && proteinFeatureDTO.getNegativeStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("negative",proteinFeatureDTO.getNegativeStart());
        }
        if (proteinFeatureDTO.getNegativeEnd() != null && proteinFeatureDTO.getNegativeEnd()!=-1) {
            criteria.andLessThanOrEqualTo("negative",proteinFeatureDTO.getNegativeEnd());
        }
        if (proteinFeatureDTO.getNeutralStart() != null && proteinFeatureDTO.getNeutralStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("neutral",proteinFeatureDTO.getNeutralStart());
        }
        if (proteinFeatureDTO.getNeutralEnd() != null && proteinFeatureDTO.getNeutralEnd()!=-1) {
            criteria.andLessThanOrEqualTo("neutral",proteinFeatureDTO.getNeutralEnd());
        }
        if (proteinFeatureDTO.getAlphaStart() != null && proteinFeatureDTO.getAlphaStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("alpha",proteinFeatureDTO.getAlphaStart());
        }
        if (proteinFeatureDTO.getAlphaEnd() != null && proteinFeatureDTO.getAlphaEnd()!=-1) {
            criteria.andLessThanOrEqualTo("alpha",proteinFeatureDTO.getAlphaEnd());
        }
        if (proteinFeatureDTO.getBetaStart() != null && proteinFeatureDTO.getBetaStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("beta",proteinFeatureDTO.getBetaStart());
        }
        if (proteinFeatureDTO.getBetaEnd() != null && proteinFeatureDTO.getBetaEnd()!=-1) {
            criteria.andLessThanOrEqualTo("beta",proteinFeatureDTO.getBetaEnd());
        }

//        criteria.andGreaterThanOrEqualTo("id",start);
        if (StringUtils.isNotEmpty(orderColumn) && StringUtils.isNotEmpty(orderDir)) {
            if ("asc".equals(orderDir)) {
                example.setOrderByClause(orderColumn +" ASC");
            } else {
                example.setOrderByClause(orderColumn +" DESC");
            }
        }
        int page = start/length;
        PageHelper.startPage(page+1, length, false);
        return new PageInfo<ProteinFeature>(proteinFeatureMapper.selectByExample(example));
    }
}
