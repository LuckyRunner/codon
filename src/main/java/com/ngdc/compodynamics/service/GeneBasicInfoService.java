package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.GeneInfoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.GeneBasicInfo;

import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface GeneBasicInfoService {


    PageInfo<GeneBasicInfo> findPage(GeneInfoDTO geneInfoDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
