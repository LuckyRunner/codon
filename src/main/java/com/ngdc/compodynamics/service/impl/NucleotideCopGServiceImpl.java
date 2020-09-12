package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.NucleotideCopGMapper;
import com.ngdc.compodynamics.dto.NucleotideCopDTO;
import com.ngdc.compodynamics.model.NucleotideCopG;
import com.ngdc.compodynamics.service.NucleotideCopGService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;



/****
 * @Author:shenkunlin
 * @Description:NucleotideCopG业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class NucleotideCopGServiceImpl implements NucleotideCopGService {

    @Autowired
    private NucleotideCopGMapper nucleotideCopGMapper;

    @Override
    public PageInfo<NucleotideCopG> findPage(NucleotideCopDTO nucleotideCopDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(NucleotideCopG.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(nucleotideCopDTO.getTaxonomy())&&!StringUtils.equals(nucleotideCopDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",nucleotideCopDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(nucleotideCopDTO.getOrganism())&&!StringUtils.equals(nucleotideCopDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",nucleotideCopDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(nucleotideCopDTO.getAssemblyAccession())&&!StringUtils.equals(nucleotideCopDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",nucleotideCopDTO.getAssemblyAccession());
        }

        if (nucleotideCopDTO.getGcStart() != null && nucleotideCopDTO.getGcStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("gc",nucleotideCopDTO.getGcStart());
        }
        if (nucleotideCopDTO.getGcEnd() != null && nucleotideCopDTO.getGcEnd()!=-1) {
            criteria.andLessThanOrEqualTo("gc",nucleotideCopDTO.getGcEnd());
        }
        if (nucleotideCopDTO.getGc1Start() != null && nucleotideCopDTO.getGc1Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("gc1",nucleotideCopDTO.getGc1Start());
        }
        if (nucleotideCopDTO.getGc1End() != null && nucleotideCopDTO.getGc1End()!=-1) {
            criteria.andLessThanOrEqualTo("gc1",nucleotideCopDTO.getGc1End());
        }
        if (nucleotideCopDTO.getGc2Start() != null && nucleotideCopDTO.getGc2Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("gc2",nucleotideCopDTO.getGc2Start());
        }
        if (nucleotideCopDTO.getGc2End() != null && nucleotideCopDTO.getGc2End()!=-1) {
            criteria.andLessThanOrEqualTo("gc2",nucleotideCopDTO.getGc2End());
        }
        if (nucleotideCopDTO.getGc3Start() != null && nucleotideCopDTO.getGc3Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("gc3",nucleotideCopDTO.getGc3Start());
        }
        if (nucleotideCopDTO.getGc3End() != null && nucleotideCopDTO.getGc3End()!=-1) {
            criteria.andLessThanOrEqualTo("gc3",nucleotideCopDTO.getGc3End());
        }
        if (nucleotideCopDTO.getAgStart() != null && nucleotideCopDTO.getAgStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("ag",nucleotideCopDTO.getAgStart());
        }
        if (nucleotideCopDTO.getAgEnd() != null && nucleotideCopDTO.getAgEnd()!=-1) {
            criteria.andLessThanOrEqualTo("ag",nucleotideCopDTO.getAgEnd());
        }
        if (nucleotideCopDTO.getAg1Start() != null && nucleotideCopDTO.getAg1Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("ag1",nucleotideCopDTO.getAg1Start());
        }
        if (nucleotideCopDTO.getAg1End() != null && nucleotideCopDTO.getAg1End()!=-1) {
            criteria.andLessThanOrEqualTo("ag1",nucleotideCopDTO.getAg1End());
        }
        if (nucleotideCopDTO.getAg2Start() != null && nucleotideCopDTO.getAg2Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("ag2",nucleotideCopDTO.getAg2Start());
        }
        if (nucleotideCopDTO.getAg2End() != null && nucleotideCopDTO.getAg2End()!=-1) {
            criteria.andLessThanOrEqualTo("ag2",nucleotideCopDTO.getAg2End());
        }
        if (nucleotideCopDTO.getAg3Start() != null && nucleotideCopDTO.getAg3Start()!=-1) {
            criteria.andGreaterThanOrEqualTo("ag3",nucleotideCopDTO.getAg3Start());
        }
        if (nucleotideCopDTO.getAg3End() != null && nucleotideCopDTO.getAg3End()!=-1) {
            criteria.andLessThanOrEqualTo("ag3",nucleotideCopDTO.getAg3End());
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
        PageHelper.startPage(page+1, length);
        return new PageInfo<NucleotideCopG>(nucleotideCopGMapper.selectByExample(example));
    }
}
