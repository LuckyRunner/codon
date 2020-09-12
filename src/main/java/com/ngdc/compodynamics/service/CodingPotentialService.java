package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.CodingProDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.CodingPotential;
import com.ngdc.compodynamics.model.CodingPotentialG;

import java.util.List;
import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface CodingPotentialService {
    PageInfo<CodingPotential> findPage(CodingProDTO codingProDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
