package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodingPotentialMapper;
import com.ngdc.compodynamics.dto.CodingProDTO;
import com.ngdc.compodynamics.model.CodingPotential;
import com.ngdc.compodynamics.service.CodingPotentialService;
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
public class CodingPotentialServiceImpl implements CodingPotentialService {

    @Autowired
    private CodingPotentialMapper codingPotentialMapper;

    @Override
    public PageInfo<CodingPotential> findPage(CodingProDTO codingProDTO, String orderDir, String orderColumn, int draw, int start, int length) {
        Example example = new Example(CodingPotential.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(codingProDTO.getTaxonomy())&&!StringUtils.equals(codingProDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",codingProDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getOrganism())&&!StringUtils.equals(codingProDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",codingProDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getAssemblyAccession())&&!StringUtils.equals(codingProDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",codingProDTO.getAssemblyAccession());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getGeneId())&&!StringUtils.equals(codingProDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",codingProDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getProteinId())&&!StringUtils.equals(codingProDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",codingProDTO.getProteinId());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getCpcLabel())&&!StringUtils.equals(codingProDTO.getCpcLabel(),"-1")) {
            criteria.andEqualTo("cpc2Label",codingProDTO.getCpcLabel());
        }
        if (StringUtils.isNotEmpty(codingProDTO.getLgcLabel())&&!StringUtils.equals(codingProDTO.getLgcLabel(),"-1")) {
            criteria.andEqualTo("lgcLabel",codingProDTO.getLgcLabel());
        }
        if (codingProDTO.getFickettStart() != null && codingProDTO.getFickettStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("fickettScore",codingProDTO.getFickettStart());
        }
        if (codingProDTO.getFickettEnd() != null && codingProDTO.getFickettEnd()!=-1) {
            criteria.andLessThanOrEqualTo("fickettScore",codingProDTO.getFickettEnd());
        }
        if (codingProDTO.getCpcPStart() != null && codingProDTO.getCpcPStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("cpc2CodingProbability",codingProDTO.getCpcPStart());
        }
        if (codingProDTO.getCpcProEnd() != null && codingProDTO.getCpcProEnd()!=-1) {
            criteria.andLessThanOrEqualTo("cpc2CodingProbability",codingProDTO.getCpcProEnd());
        }
        if (codingProDTO.getLgcProStart() != null && codingProDTO.getLgcProStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("lgcCodingProbability",codingProDTO.getLgcProStart());
        }
        if (codingProDTO.getLgcProEnd() != null && codingProDTO.getLgcProEnd()!=-1) {
            criteria.andLessThanOrEqualTo("lgcCodingProbability",codingProDTO.getLgcProEnd());
        }

        if (StringUtils.isNotEmpty(orderColumn) && StringUtils.isNotEmpty(orderDir)) {
            if ("asc".equals(orderDir)) {
                example.setOrderByClause(orderColumn +" ASC");
            } else {
                example.setOrderByClause(orderColumn +" DESC");
            }
        }
        int page = start/length;
        PageHelper.startPage(page+1, length,false);
        return new PageInfo<CodingPotential>(codingPotentialMapper.selectByExample(example));
    }
}
