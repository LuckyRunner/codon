package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.PhaseSeperationGMapper;
import com.ngdc.compodynamics.dto.PhaseSeperationDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.PhaseSeperationG;
import com.ngdc.compodynamics.service.PhaseSeperationGService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class PhaseSeperationGServiceImpl implements PhaseSeperationGService {

    @Autowired
    private PhaseSeperationGMapper  phaseSeperationGMapper;

    @Override
    public PageInfo<PhaseSeperationG> findPage(PhaseSeperationDTO phaseSeperationDTO, String orderDir, String orderColumn, int draw, int start, int length) {
        Example example = new Example(AminoAcidsUsageG.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(phaseSeperationDTO.getTaxonomy())&&!StringUtils.equals(phaseSeperationDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",phaseSeperationDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(phaseSeperationDTO.getOrganism())&&!StringUtils.equals(phaseSeperationDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",phaseSeperationDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(phaseSeperationDTO.getAssemblyAccession())&&!StringUtils.equals(phaseSeperationDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",phaseSeperationDTO.getAssemblyAccession());
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
        return new PageInfo<PhaseSeperationG>(phaseSeperationGMapper.selectByExample(example));
    }
}
