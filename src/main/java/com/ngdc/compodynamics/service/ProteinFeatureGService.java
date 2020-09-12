package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.ProteinFeatureDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.ProteinFeatureG;

import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:ProteinFeatureG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface ProteinFeatureGService {
    PageInfo<ProteinFeatureG> findPage(ProteinFeatureDTO proteinFeatureGDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
