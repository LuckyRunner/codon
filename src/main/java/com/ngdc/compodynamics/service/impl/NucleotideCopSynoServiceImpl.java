package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.NucleotideCopSynoMapper;
import com.ngdc.compodynamics.dto.NucleotideCopSynoDTO;
import com.ngdc.compodynamics.model.NucleotideCopSyno;
import com.ngdc.compodynamics.service.NucleotideCopSynoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


/****
 * @Author:shenkunlin
 * @Description:NucleotideCopSyno业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class NucleotideCopSynoServiceImpl implements NucleotideCopSynoService {

    @Autowired
    private NucleotideCopSynoMapper nucleotideCopSynoMapper;

    @Override
    public PageInfo<NucleotideCopSyno> findPage(NucleotideCopSynoDTO nucleotideCopSynoDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(NucleotideCopSyno.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(nucleotideCopSynoDTO.getTaxonomy())&&!StringUtils.equals(nucleotideCopSynoDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",nucleotideCopSynoDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(nucleotideCopSynoDTO.getOrganism())&&!StringUtils.equals(nucleotideCopSynoDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",nucleotideCopSynoDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(nucleotideCopSynoDTO.getAssemblyAccession())&&!StringUtils.equals(nucleotideCopSynoDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",nucleotideCopSynoDTO.getAssemblyAccession());
        }
        if (StringUtils.isNotEmpty(nucleotideCopSynoDTO.getGeneId())&&!StringUtils.equals(nucleotideCopSynoDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",nucleotideCopSynoDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(nucleotideCopSynoDTO.getProteinId())&&!StringUtils.equals(nucleotideCopSynoDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",nucleotideCopSynoDTO.getProteinId());
        }
        if (nucleotideCopSynoDTO.getT3sStart() != null && nucleotideCopSynoDTO.getT3sStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("t3s",nucleotideCopSynoDTO.getT3sStart());
        }
        if (nucleotideCopSynoDTO.getT3sEnd() != null && nucleotideCopSynoDTO.getT3sEnd()!=-1) {
            criteria.andLessThanOrEqualTo("t3s",nucleotideCopSynoDTO.getT3sEnd());
        }
        if (nucleotideCopSynoDTO.getC3sStart() != null && nucleotideCopSynoDTO.getC3sStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("c3s",nucleotideCopSynoDTO.getC3sStart());
        }
        if (nucleotideCopSynoDTO.getC3sEnd() != null && nucleotideCopSynoDTO.getC3sEnd()!=-1) {
            criteria.andLessThanOrEqualTo("c3s",nucleotideCopSynoDTO.getC3sEnd());
        }
        if (nucleotideCopSynoDTO.getA3sStart() != null && nucleotideCopSynoDTO.getA3sStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("a3s",nucleotideCopSynoDTO.getA3sStart());
        }
        if (nucleotideCopSynoDTO.getA3sEnd() != null && nucleotideCopSynoDTO.getA3sEnd()!=-1) {
            criteria.andLessThanOrEqualTo("a3s",nucleotideCopSynoDTO.getA3sEnd());
        }
        if (nucleotideCopSynoDTO.getG3sStart() != null && nucleotideCopSynoDTO.getG3sStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("g3s",nucleotideCopSynoDTO.getG3sStart());
        }
        if (nucleotideCopSynoDTO.getG3sEnd() != null && nucleotideCopSynoDTO.getG3sEnd()!=-1) {
            criteria.andLessThanOrEqualTo("g3s",nucleotideCopSynoDTO.getG3sEnd());
        }
        if (nucleotideCopSynoDTO.getGc3sStart() != null && nucleotideCopSynoDTO.getGc3sStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("gc3s",nucleotideCopSynoDTO.getGc3sStart());
        }
        if (nucleotideCopSynoDTO.getGc3sEnd() != null && nucleotideCopSynoDTO.getGc3sEnd()!=-1) {
            criteria.andLessThanOrEqualTo("gc3s",nucleotideCopSynoDTO.getGc3sEnd());
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
        return new PageInfo<NucleotideCopSyno>(nucleotideCopSynoMapper.selectByExample(example));
    }
}
