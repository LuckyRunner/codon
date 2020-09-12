package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsage;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;

import java.util.List;
import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface AminoAcidsUsageService {
    PageInfo<AminoAcidsUsage> findPage(AminoDTO aminoDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
