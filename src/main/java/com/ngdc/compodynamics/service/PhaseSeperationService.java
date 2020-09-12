package com.ngdc.compodynamics.service;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dto.PhaseSeperationDTO;
import com.ngdc.compodynamics.model.PhaseSeperation;

public interface PhaseSeperationService {
    PageInfo<PhaseSeperation> findPage(PhaseSeperationDTO phaseSeperationDTO, String orderDir, String orderColumn, int draw, int start, int length);
}
