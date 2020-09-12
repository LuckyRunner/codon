package com.ngdc.compodynamics.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodonRscuMapper;
import com.ngdc.compodynamics.dto.CodonRscuDTO;
import com.ngdc.compodynamics.model.CodonRscu;
import com.ngdc.compodynamics.model.CodonRscuG;
import com.ngdc.compodynamics.service.CodonRscuService;


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
public class CodonRscuServiceImpl implements CodonRscuService {

    @Autowired
    private CodonRscuMapper codonRscuMapper;

    @Override
    public PageInfo<CodonRscu> findPage(CodonRscuDTO codonRscuDTO, String orderDir, String orderColumn, int draw, int start, int length) {

        Example example = new Example(CodonRscu.class);
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
        if (StringUtils.isNotEmpty(codonRscuDTO.getGeneId())&&!StringUtils.equals(codonRscuDTO.getGeneId(),"-1")) {
            criteria.andEqualTo("geneId",codonRscuDTO.getGeneId());
        }
        if (StringUtils.isNotEmpty(codonRscuDTO.getProteinId())&&!StringUtils.equals(codonRscuDTO.getProteinId(),"-1")) {
            criteria.andEqualTo("proteinId",codonRscuDTO.getProteinId());
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
        PageHelper.startPage(page+1, length, false);
        return new PageInfo<CodonRscu>(codonRscuMapper.selectByExample(example));
    }
}
