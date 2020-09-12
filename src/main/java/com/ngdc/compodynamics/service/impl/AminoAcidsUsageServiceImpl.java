package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.AminoAcidsUsageMapper;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsage;

import com.ngdc.compodynamics.service.AminoAcidsUsageService;
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
public class AminoAcidsUsageServiceImpl implements AminoAcidsUsageService {

    @Autowired
    private AminoAcidsUsageMapper aminoAcidsUsageMapper;

    @Override
    public PageInfo<AminoAcidsUsage> findPage(AminoDTO aminoDTO, String orderDir, String orderColumn, int draw, int start, int length) {//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        Example example = new Example(AminoAcidsUsage.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(aminoDTO.getTaxonomy())&&!StringUtils.equals(aminoDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",aminoDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(aminoDTO.getOrganism())&&!StringUtils.equals(aminoDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",aminoDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(aminoDTO.getAssemblyAccession())&&!StringUtils.equals(aminoDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",aminoDTO.getAssemblyAccession());
        }
        if (StringUtils.isNotEmpty(aminoDTO.getGeneId())&&!StringUtils.equals(aminoDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",aminoDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(aminoDTO.getProteinId())&&!StringUtils.equals(aminoDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",aminoDTO.getProteinId());
        }
//        criteria.andGreaterThan("id",start);
        if (StringUtils.isNotEmpty(orderColumn) && StringUtils.isNotEmpty(orderDir)) {
            if ("asc".equals(orderDir)) {
                example.setOrderByClause(orderColumn +" ASC");
            } else {
                example.setOrderByClause(orderColumn +" DESC");
            }
        }
        int page = start/length;
        PageHelper.startPage(page+1, length,false);

        return new PageInfo<AminoAcidsUsage>(aminoAcidsUsageMapper.selectByExample(example));
    }
}
