package com.ngdc.compodynamics.service;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.CodonRscuDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.CodonRscu;
import java.util.List;
import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/
public interface CodonRscuService {
    PageInfo<CodonRscu> findPage(CodonRscuDTO codonRscuDTO, String orderDir, String orderColumn, int draw, int start, int length);

}
