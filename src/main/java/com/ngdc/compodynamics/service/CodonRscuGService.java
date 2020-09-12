package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.CodonRscuDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.CodonRscuG;

import java.util.List;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:CodonRscuG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CodonRscuGService {
    PageInfo<CodonRscuG> findPage(CodonRscuDTO codonRscuGDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
