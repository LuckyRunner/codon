package com.ngdc.compodynamics.controller;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.GeneBasicInfoMapper;
import com.ngdc.compodynamics.dao.SpeciseInfoMapper;
import com.ngdc.compodynamics.dto.GeneInfoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsage;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.GeneBasicInfo;
import com.ngdc.compodynamics.model.SpeciseInfo;
import com.ngdc.compodynamics.service.GeneBasicInfoService;
import com.ngdc.compodynamics.service.SpeciseInfoService;
import com.ngdc.compodynamics.tookits.List2Select;
import entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/browse")
public class BrowseController {

    @Autowired
    private GeneBasicInfoMapper geneBasicInfoMapper;

    @Autowired
    private SpeciseInfoMapper speciseInfoMapper;

    @Autowired
    private SpeciseInfoService speciseInfoService;

    @Autowired
    private GeneBasicInfoService geneBasicInfoService;

    @GetMapping
    public String browse() { return "browse"; }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<SpeciseInfo> speciseInfo = speciseInfoMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("speciseInfo",speciseInfo);
        return result;
    }

    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object> gene(int gene,int genome) {
        List<GeneBasicInfo> geneBasicInfo = geneBasicInfoMapper.findByGeneIndexAndFileIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("geneBasicInfo",geneBasicInfo);
        return result;
    }


    @GetMapping(value = "/genomes")
    @ResponseBody
    public Map<String, Object> searchGenomes(HttpServletRequest request,GeneInfoDTO geneInfoDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<SpeciseInfo> pageInfo = speciseInfoService.findPage(geneInfoDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGene(HttpServletRequest request,GeneInfoDTO geneInfoDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<GeneBasicInfo> pageInfo = geneBasicInfoService.findPage(geneInfoDTO,orderDir,orderColumn,draw,start,length);
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
        List<String> result = speciseInfoMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = speciseInfoMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = speciseInfoMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = speciseInfoMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = speciseInfoMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = speciseInfoMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = geneBasicInfoMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = geneBasicInfoMapper.findProteinId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genename")
    @ResponseBody
    public Map<String, Object> genename(@RequestParam("term") String term){
        List<String> result = geneBasicInfoMapper.findGeneName(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinname")
    @ResponseBody
    public Map<String, Object> proteinname(@RequestParam("term") String term){
        List<String> result = geneBasicInfoMapper.findProteinName(term);
        return List2Select.convert(result);
    }
}
