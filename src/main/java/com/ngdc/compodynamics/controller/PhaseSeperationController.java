package com.ngdc.compodynamics.controller;


import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.PhaseSeperationGMapper;
import com.ngdc.compodynamics.dao.PhaseSeperationMapper;
import com.ngdc.compodynamics.dao.PhaseSeperationPicMapper;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.dto.PhaseSeperationDTO;
import com.ngdc.compodynamics.model.*;
import com.ngdc.compodynamics.service.PhaseSeperationGService;
import com.ngdc.compodynamics.service.PhaseSeperationService;
import com.ngdc.compodynamics.tookits.List2Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/phase")
public class PhaseSeperationController {

    @Autowired
    private PhaseSeperationPicMapper phaseSeperationPicMapper;

    @Autowired
    private PhaseSeperationService phaseSeperationService;

    @Autowired
    private PhaseSeperationGService phaseSeperationGService;

    @Autowired
    private PhaseSeperationGMapper phaseSeperationGMapper;

    @Autowired
    private PhaseSeperationMapper phaseSeperationMapper;

    @GetMapping
    public String phase(){
        return "phase";
    }

    @GetMapping(value = "/phasepic")
    @ResponseBody
    public Map<String, Object> aminopic(Integer term){
        List<PhaseSeperationPic> phasePics = phaseSeperationPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("phasePics",phasePics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<PhaseSeperationG> phaseSeperationGS = phaseSeperationGMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("phaseSeperationGS",phaseSeperationGS);
        return result;
    }

    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object> gene(int gene,int genome) {
        List<PhaseSeperation> phaseSeperations = phaseSeperationMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("phaseSeperations",phaseSeperations);
        return result;
    }

    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGenes(HttpServletRequest request, PhaseSeperationDTO phaseSeperationDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<PhaseSeperation> pageInfo = phaseSeperationService.findPage(phaseSeperationDTO,orderDir,orderColumn,draw,start,length);
        Map<String, Object> result = new HashMap<>();
        result.put("draw",draw);
        result.put("recordsTotal",200000000);
        result.put("recordsFiltered",200000000);
        result.put("data", pageInfo.getList());
        result.put("error", "");
        return result;
    }

    @GetMapping(value = "/genomes")
    @ResponseBody
    public Map<String, Object> searchGenomes(HttpServletRequest request,PhaseSeperationDTO phaseSeperationDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<PhaseSeperationG> pageInfo = phaseSeperationGService.findPage(phaseSeperationDTO,orderDir,orderColumn,draw,start,length);
        Map<String, Object> result = new HashMap<>();
        result.put("draw",draw);
        result.put("recordsTotal",pageInfo.getTotal());
        result.put("recordsFiltered",pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        result.put("error", "");
        return result;
    }

    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = phaseSeperationGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = phaseSeperationGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = phaseSeperationGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = phaseSeperationMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = phaseSeperationMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
