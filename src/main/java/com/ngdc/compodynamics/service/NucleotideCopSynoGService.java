package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.NucleotideCopSynoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.NucleotideCopSynoG;

import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCopSynoG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface NucleotideCopSynoGService {
    PageInfo<NucleotideCopSynoG> findPage(NucleotideCopSynoDTO nucleotideCopSynoGDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
