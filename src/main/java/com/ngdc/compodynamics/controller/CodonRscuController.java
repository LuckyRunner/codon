package com.ngdc.compodynamics.controller;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodonBiasPicMapper;
import com.ngdc.compodynamics.dao.CodonRscuGMapper;
import com.ngdc.compodynamics.dao.CodonRscuMapper;
import com.ngdc.compodynamics.dto.CodonRscuDTO;
import com.ngdc.compodynamics.model.*;
import com.ngdc.compodynamics.service.CodonRscuGService;
import com.ngdc.compodynamics.service.CodonRscuService;

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
@RequestMapping("/usagebias")
public class CodonRscuController {

    @Autowired
    private CodonBiasPicMapper codonBiasPicMapper;

    @Autowired
    private CodonRscuMapper codonRscuMapper;

    @Autowired
    private CodonRscuGMapper codonRscuGMapper;

    @Autowired
    private CodonRscuService codonRscuService;

    @Autowired
    private CodonRscuGService codonRscuGService;

    @GetMapping(value = "/biaspic")
    @ResponseBody
    public Map<String, Object> biaspic(Integer term){
        List<CodonBiasPic> codonBiasPics = codonBiasPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codonBiasPics",codonBiasPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<CodonRscuG> codonRscuG = codonRscuGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codonRscuG",codonRscuG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<CodonRscu> codonRscu = codonRscuMapper.findByCdsIndexAndSpeciseIndex(gene, genome);
        Map<String, Object> result = new HashMap<>();
        result.put("codonRscu",codonRscu);
        return result;
    }

    @GetMapping
    public String usagebias(){
        return "usagebias";
    }

    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGene(HttpServletRequest request,CodonRscuDTO codonRscuDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodonRscu> pageInfo = codonRscuService.findPage(codonRscuDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenome(HttpServletRequest request,CodonRscuDTO codonRscuGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodonRscuG> pageInfo = codonRscuGService.findPage(codonRscuGDTO,orderDir,orderColumn,draw,start,length);
        Map<String, Object> result = new HashMap<>();
        result.put("draw",draw);
        result.put("recordsTotal",pageInfo.getTotal());
        result.put("recordsFiltered",pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        result.put("error", "");
        return result;
    }

    @GetMapping(value = "/genetax")
    @ResponseBody
    public Map<String, Object> genetax(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = codonRscuGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = codonRscuMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = codonRscuMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
