package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.CodingProDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.CodingPotentialG;

import java.util.List;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:CodingPotentialG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CodingPotentialGService {
    PageInfo<CodingPotentialG> findPage(CodingProDTO codingProGDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
