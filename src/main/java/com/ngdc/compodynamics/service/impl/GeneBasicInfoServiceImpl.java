package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.ngdc.compodynamics.dao.GeneBasicInfoMapper;
import com.ngdc.compodynamics.dto.GeneInfoDTO;
import com.ngdc.compodynamics.model.GeneBasicInfo;
import com.ngdc.compodynamics.service.GeneBasicInfoService;
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
public class GeneBasicInfoServiceImpl implements GeneBasicInfoService {

    @Autowired
    private GeneBasicInfoMapper geneBasicInfoMapper;

    @Override
    public PageInfo<GeneBasicInfo> findPage(GeneInfoDTO geneInfoDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(GeneBasicInfo.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(geneInfoDTO.getTaxonomy())&&!StringUtils.equals(geneInfoDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",geneInfoDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getOrganism())&&!StringUtils.equals(geneInfoDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",geneInfoDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getAssemblyAccession())&&!StringUtils.equals(geneInfoDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",geneInfoDTO.getAssemblyAccession());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getGeneId())&&!StringUtils.equals(geneInfoDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",geneInfoDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getProteinId())&&!StringUtils.equals(geneInfoDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",geneInfoDTO.getProteinId());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getProteinName())&&!StringUtils.equals(geneInfoDTO.getProteinName(),"-1")) {
            criteria.andEqualTo("proteinName",geneInfoDTO.getProteinName());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getGeneName())&&!StringUtils.equals(geneInfoDTO.getGeneName(),"-1")) {
            criteria.andEqualTo("geneName",geneInfoDTO.getGeneName());
        }
        if (StringUtils.isNotEmpty(geneInfoDTO.getLowQuality())&&!StringUtils.equals(geneInfoDTO.getLowQuality(),"-1")) {
            criteria.andEqualTo("lowQuality",geneInfoDTO.getLowQuality());
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
        return new PageInfo<GeneBasicInfo>(geneBasicInfoMapper.selectByExample(example));
    }
}
