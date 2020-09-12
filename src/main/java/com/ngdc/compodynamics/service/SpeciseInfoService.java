package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.GeneInfoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.SpeciseInfo;

import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface SpeciseInfoService {


    PageInfo<SpeciseInfo> findPage(GeneInfoDTO speciseInfoDTO, String orderDir, String orderColumn, int draw, int start, int length);
    /**
     * 根据ID查询SpeciseInfo
     * @param id
     * @return
     */
     SpeciseInfo findById(Long id);
}
