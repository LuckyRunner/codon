package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.NucleotideCopDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.NucleotideCopG;

import java.util.List;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:NucleotideCopG业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface NucleotideCopGService {
    PageInfo<NucleotideCopG> findPage(NucleotideCopDTO nucleotideCopGDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
