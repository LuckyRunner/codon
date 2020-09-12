package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.AminoAcidsUsageGMapper;
import com.ngdc.compodynamics.dao.AminoPicMapper;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;

import com.ngdc.compodynamics.service.AminoAcidsUsageGService;
import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


/****
 * @Author:shenkunlin
 * @Description:AminoAcidsUsageG业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class AminoAcidsUsageGServiceImpl implements AminoAcidsUsageGService {


    @Autowired
    private AminoAcidsUsageGMapper aminoAcidsUsageGMapper;

    @Override
    public PageInfo<AminoAcidsUsageG> findPage(AminoDTO aminoGDTO, String orderDir, String orderColumn, int draw, int start, int length) {
        Example example = new Example(AminoAcidsUsageG.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(aminoGDTO.getTaxonomy())&&!StringUtils.equals(aminoGDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",aminoGDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(aminoGDTO.getOrganism())&&!StringUtils.equals(aminoGDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",aminoGDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(aminoGDTO.getAssemblyAccession())&&!StringUtils.equals(aminoGDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",aminoGDTO.getAssemblyAccession());
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
        return new PageInfo<AminoAcidsUsageG>(aminoAcidsUsageGMapper.selectByExample(example));
    }


}
