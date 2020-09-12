package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.CodonUsageDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.CodonUsageG;

import java.util.List;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:CodonUsageG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CodonUsageGService {
    PageInfo<CodonUsageG> findPage(CodonUsageDTO codonUsageGDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
