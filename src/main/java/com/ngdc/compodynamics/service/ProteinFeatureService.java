package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.ProteinFeatureDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.ProteinFeature;

import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface ProteinFeatureService {
    PageInfo<ProteinFeature> findPage(ProteinFeatureDTO proteinFeatureDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
