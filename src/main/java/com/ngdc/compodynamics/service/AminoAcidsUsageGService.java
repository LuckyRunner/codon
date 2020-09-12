package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;

import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:AminoAcidsUsageG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface AminoAcidsUsageGService {
    PageInfo<AminoAcidsUsageG> findPage(AminoDTO aminoGDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
