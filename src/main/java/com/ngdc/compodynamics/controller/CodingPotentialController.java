package com.ngdc.compodynamics.controller;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodingPicMapper;
import com.ngdc.compodynamics.dao.CodingPotentialGMapper;
import com.ngdc.compodynamics.dao.CodingPotentialMapper;


import com.ngdc.compodynamics.dto.CodingProDTO;

import com.ngdc.compodynamics.model.*;
import com.ngdc.compodynamics.service.CodingPotentialGService;
import com.ngdc.compodynamics.service.CodingPotentialService;
import com.ngdc.compodynamics.tookits.List2Select;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/

@Controller
@RequestMapping("/codpot")
public class CodingPotentialController {

    @Autowired
    private CodingPicMapper codingPicMapper;

    @Autowired
    private CodingPotentialMapper codingPotentialMapper;

    @Autowired
    private CodingPotentialGMapper codingPotentialGMapper;

    @Autowired
    private CodingPotentialService codingPotentialService;

    @Autowired
    private CodingPotentialGService codingPotentialGService;

    @GetMapping
    public String codingPotential(){
        return "codingpro";
    }

    @GetMapping(value = "/codingpic")
    @ResponseBody
    public Map<String, Object> codingpic(Integer term){
        List<CodingPic> codingPics = codingPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codingPics",codingPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<CodingPotentialG> codingPotentialG = codingPotentialGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codingPotentialG",codingPotentialG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<CodingPotential> codingPotential = codingPotentialMapper.findByCdsIndexAndSpeciseIndex(gene, genome);
        Map<String, Object> result = new HashMap<>();
        result.put("codingPotential",codingPotential);
        return result;
    }

    @GetMapping(value = "/genomes")
    @ResponseBody
    public Map<String, Object> searchGenomes(HttpServletRequest request,CodingProDTO codingProDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodingPotentialG> pageInfo = codingPotentialGService.findPage(codingProDTO,orderDir,orderColumn,draw,start,length);
        Map<String, Object> result = new HashMap<>();
        result.put("draw",draw);
        result.put("recordsTotal",pageInfo.getTotal());
        result.put("recordsFiltered",pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        result.put("error", "");
        return result;

    }

    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGene(HttpServletRequest request,CodingProDTO codingProDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodingPotential> pageInfo = codingPotentialService.findPage(codingProDTO,orderDir,orderColumn,draw,start,length);
        System.out.println(pageInfo.getList());
        Map<String, Object> result = new HashMap<>();
        result.put("draw",draw);
        result.put("recordsTotal",200000000);
        result.put("recordsFiltered",200000000);
        result.put("data", pageInfo.getList());
        result.put("error", "");
        return result;

    }
    @GetMapping(value = "/genetax")
    @ResponseBody
    public Map<String, Object> genetax(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = codingPotentialGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = codingPotentialMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = codingPotentialMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
