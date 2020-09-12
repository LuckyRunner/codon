package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.SpeciseInfoMapper;
import com.ngdc.compodynamics.dto.GeneInfoDTO;
import com.ngdc.compodynamics.model.SpeciseInfo;
import com.ngdc.compodynamics.service.SpeciseInfoService;
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
public class SpeciseInfoServiceImpl implements SpeciseInfoService {

    @Autowired
    private SpeciseInfoMapper speciseInfoMapper;

    @Override
    public PageInfo<SpeciseInfo> findPage(GeneInfoDTO speciseInfoDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(SpeciseInfo.class);
        Example.Criteria criteria = example.createCriteria();


        if (StringUtils.isNotEmpty(speciseInfoDTO.getTaxonomy())&&!StringUtils.equals(speciseInfoDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",speciseInfoDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(speciseInfoDTO.getOrganism())&&!StringUtils.equals(speciseInfoDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",speciseInfoDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(speciseInfoDTO.getAssemblyAccession())&&!StringUtils.equals(speciseInfoDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",speciseInfoDTO.getAssemblyAccession());
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
        return new PageInfo<SpeciseInfo>(speciseInfoMapper.selectByExample(example));
    }

    @Override
    public SpeciseInfo findById(Long id) {
        return null;
    }

}
