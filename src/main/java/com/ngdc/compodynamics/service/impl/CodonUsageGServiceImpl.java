package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodonUsageGMapper;
import com.ngdc.compodynamics.dto.CodonUsageDTO;
import com.ngdc.compodynamics.model.CodonRscuG;
import com.ngdc.compodynamics.model.CodonUsageG;
import com.ngdc.compodynamics.service.CodonUsageGService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


/****
 * @Author:shenkunlin
 * @Description:CodonUsageG业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CodonUsageGServiceImpl implements CodonUsageGService {

    @Autowired
    private CodonUsageGMapper codonUsageGMapper;

    @Override
    public PageInfo<CodonUsageG> findPage(CodonUsageDTO codonUsageDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(CodonUsageG.class);
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
        return new PageInfo<CodonUsageG>(codonUsageGMapper.selectByExample(example));
    }
}
