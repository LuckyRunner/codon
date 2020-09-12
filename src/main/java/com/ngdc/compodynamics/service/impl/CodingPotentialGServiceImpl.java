package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodingPotentialGMapper;
import com.ngdc.compodynamics.dto.CodingProDTO;
import com.ngdc.compodynamics.model.CodingPotentialG;
import com.ngdc.compodynamics.service.CodingPotentialGService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/****
 * @Author:shenkunlin
 * @Description:CodingPotentialG业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CodingPotentialGServiceImpl implements CodingPotentialGService {

    @Autowired
    private CodingPotentialGMapper codingPotentialGMapper;


    @Override
    public PageInfo<CodingPotentialG> findPage(CodingProDTO codingProDTO, String orderDir, String orderColumn, int draw, int start, int length) {
        Example example = new Example(CodingPotentialG.class);
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

        if (codingProDTO.getCpcPStart() != null && codingProDTO.getCpcPStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("cpc2Label",codingProDTO.getCpcPStart());
        }
        if (codingProDTO.getCpcPEnd() != null && codingProDTO.getCpcPEnd()!=-1) {
            criteria.andLessThanOrEqualTo("cpc2Label",codingProDTO.getCpcPEnd());
        }
        if (codingProDTO.getLgcPStart() != null && codingProDTO.getLgcPStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("lgcLabel",codingProDTO.getLgcPStart());
        }
        if (codingProDTO.getLgcPEnd() != null && codingProDTO.getLgcPEnd()!=-1) {
            criteria.andLessThanOrEqualTo("lgcLabel",codingProDTO.getLgcPEnd());
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
        if (codingProDTO.getCodingInBothStart() != null && codingProDTO.getCodingInBothStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("codingInBoth",codingProDTO.getCodingInBothStart());
        }
        if (codingProDTO.getCodingInBothEnd() != null && codingProDTO.getCodingInBothEnd()!=-1) {
            criteria.andLessThanOrEqualTo("codingInBoth",codingProDTO.getCodingInBothEnd());
        }

        if (StringUtils.isNotEmpty(orderColumn) && StringUtils.isNotEmpty(orderDir)) {
            if ("asc".equals(orderDir)) {
                example.setOrderByClause(orderColumn +" ASC");
            } else {
                example.setOrderByClause(orderColumn +" DESC");
            }
        }
        int page = start/length;
        PageHelper.startPage(page+1, length);
        return new PageInfo<CodingPotentialG>(codingPotentialGMapper.selectByExample(example));
    }
}
