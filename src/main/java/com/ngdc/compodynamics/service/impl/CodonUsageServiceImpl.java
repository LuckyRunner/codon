package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.ngdc.compodynamics.dao.CodonUsageMapper;
import com.ngdc.compodynamics.dto.CodonUsageDTO;
import com.ngdc.compodynamics.model.CodonUsage;
import com.ngdc.compodynamics.service.CodonUsageService;
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
public class CodonUsageServiceImpl implements CodonUsageService {

    @Autowired
    private CodonUsageMapper codonUsageMapper;

    @Override
    public PageInfo<CodonUsage> findPage(CodonUsageDTO codonUsageDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(CodonUsage.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(codonUsageDTO.getTaxonomy())&&!StringUtils.equals(codonUsageDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",codonUsageDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(codonUsageDTO.getOrganism())&&!StringUtils.equals(codonUsageDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",codonUsageDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(codonUsageDTO.getAssemblyAccession())&&!StringUtils.equals(codonUsageDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",codonUsageDTO.getAssemblyAccession());
        }
        if (StringUtils.isNotEmpty(codonUsageDTO.getGeneId())&&!StringUtils.equals(codonUsageDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",codonUsageDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(codonUsageDTO.getProteinId())&&!StringUtils.equals(codonUsageDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",codonUsageDTO.getProteinId());
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
        PageHelper.startPage(page+1, length, false);
        return new PageInfo<CodonUsage>(codonUsageMapper.selectByExample(example));
    }
}
