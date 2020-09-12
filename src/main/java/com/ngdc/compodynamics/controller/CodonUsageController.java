package com.ngdc.compodynamics.controller;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.CodingPicMapper;
import com.ngdc.compodynamics.dao.CodonPicMapper;
import com.ngdc.compodynamics.dao.CodonUsageGMapper;
import com.ngdc.compodynamics.dao.CodonUsageMapper;
import com.ngdc.compodynamics.dto.CodonUsageDTO;
import com.ngdc.compodynamics.model.*;
import com.ngdc.compodynamics.service.CodonUsageGService;
import com.ngdc.compodynamics.service.CodonUsageService;
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
@RequestMapping("/codonusage")
public class CodonUsageController {

    @Autowired
    private CodonPicMapper codonPicMapper;

    @Autowired
    private CodonUsageMapper codonUsageMapper;

    @Autowired
    private CodonUsageGMapper codonUsageGMapper;

    @Autowired
    private CodonUsageService codonUsageService;

    @Autowired
    private CodonUsageGService codonUsageGService;

    @GetMapping
    public String codonUsage(){
        return "codonues";
    }

    @GetMapping(value = "/codonpic")
    @ResponseBody
    public Map<String, Object> codonpic(Integer term){
        List<CodonPic> codonPics = codonPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codonPics",codonPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<CodonUsageG> codonUsageG = codonUsageGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("codonUsageG",codonUsageG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<CodonUsage> codonUsage = codonUsageMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("codonUsage",codonUsage);
        return result;
    }



    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGene(HttpServletRequest request,CodonUsageDTO codonUsageDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodonUsage> pageInfo = codonUsageService.findPage(codonUsageDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenome(HttpServletRequest request,CodonUsageDTO codonUsageGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<CodonUsageG> pageInfo = codonUsageGService.findPage(codonUsageGDTO,orderDir,orderColumn,draw,start,length);
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
        List<String> result = codonUsageGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = codonUsageGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = codonUsageGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = codonUsageGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = codonUsageGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = codonUsageGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = codonUsageMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = codonUsageMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
