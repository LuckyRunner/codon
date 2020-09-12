package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.PhaseSeperationDTO;
import com.ngdc.compodynamics.model.PhaseSeperationG;

public interface PhaseSeperationGService {
    PageInfo<PhaseSeperationG> findPage(PhaseSeperationDTO phaseSeperationDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
