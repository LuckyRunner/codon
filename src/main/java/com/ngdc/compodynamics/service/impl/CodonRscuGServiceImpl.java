package com.ngdc.compodynamics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodonRscuGMapper;
import com.ngdc.compodynamics.dto.CodonRscuDTO;
import com.ngdc.compodynamics.model.CodonRscuG;
import com.ngdc.compodynamics.service.CodonRscuGService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


/****
 * @Author:shenkunlin
 * @Description:CodonRscuG业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CodonRscuGServiceImpl implements CodonRscuGService {


    @Autowired
    private CodonRscuGMapper codonRscuGMapper;

    @Override
    public PageInfo<CodonRscuG> findPage(CodonRscuDTO codonRscuDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(CodonRscuG.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(codonRscuDTO.getTaxonomy())&&!StringUtils.equals(codonRscuDTO.getTaxonomy(),"-1")) {
            criteria.andEqualTo("taxonomy",codonRscuDTO.getTaxonomy());
        }
        if (StringUtils.isNotEmpty(codonRscuDTO.getOrganism())&&!StringUtils.equals(codonRscuDTO.getOrganism(),"-1")) {
            criteria.andEqualTo("organism",codonRscuDTO.getOrganism());
        }
        if (StringUtils.isNotEmpty(codonRscuDTO.getAssemblyAccession())&&!StringUtils.equals(codonRscuDTO.getAssemblyAccession(),"-1")) {
            criteria.andEqualTo("assemblyAccession",codonRscuDTO.getAssemblyAccession());
        }
        if (codonRscuDTO.getCdcStart() != null && codonRscuDTO.getCdcStart() !=-1) {
            criteria.andGreaterThanOrEqualTo("cdc",codonRscuDTO.getCdcStart());
        }
        if (codonRscuDTO.getCdcEnd()  != null && codonRscuDTO.getCdcEnd() !=-1) {
            criteria.andLessThanOrEqualTo("cdc",codonRscuDTO.getCdcEnd());
        }
        if (codonRscuDTO.getEncStart()  != null && codonRscuDTO.getEncStart()!=-1) {
            criteria.andGreaterThanOrEqualTo("enc",codonRscuDTO.getEncStart());
        }
        if (codonRscuDTO.getEncEnd() != null && codonRscuDTO.getEncEnd()!=-1) {
            criteria.andLessThanOrEqualTo("enc",codonRscuDTO.getEncEnd());
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
        return new PageInfo<CodonRscuG>(codonRscuGMapper.selectByExample(example));
    }
}
