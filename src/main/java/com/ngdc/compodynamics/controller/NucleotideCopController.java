package com.ngdc.compodynamics.controller;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.NucleotideCopGMapper;
import com.ngdc.compodynamics.dao.NucleotideCopMapper;
import com.ngdc.compodynamics.dao.NucleotidePicMapper;
import com.ngdc.compodynamics.dto.NucleotideCopDTO;
import com.ngdc.compodynamics.model.CodonUsageG;
import com.ngdc.compodynamics.model.NucleotideCop;
import com.ngdc.compodynamics.model.NucleotideCopG;
import com.ngdc.compodynamics.model.NucleotidePic;
import com.ngdc.compodynamics.service.NucleotideCopGService;
import com.ngdc.compodynamics.service.NucleotideCopService;
import com.ngdc.compodynamics.tookits.List2Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@Controller
@RequestMapping("/nucleotidecop")
public class NucleotideCopController {

    @Autowired
    private NucleotidePicMapper nucleotidePicMapper;

    @Autowired
    private NucleotideCopMapper nucleotideCopMapper;

    @Autowired
    private NucleotideCopGMapper nucleotideCopGMapper;

    @Autowired
    private NucleotideCopGService nucleotideCopGService;

    @Autowired
    private NucleotideCopService nucleotideCopService;

    @GetMapping
    public String nuclcom(){
        return "nuccom";
    }

    @GetMapping(value = "/nucleotidepic")
    @ResponseBody
    public Map<String, Object> nucleotidepic(Integer term){
        List<NucleotidePic> nucleotidePics = nucleotidePicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotidePics",nucleotidePics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<NucleotideCopG> nucleotideCopG = nucleotideCopGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotideCopG",nucleotideCopG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<NucleotideCop> nucleotideCop = nucleotideCopMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotideCop",nucleotideCop);
        return result;
    }



    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGene(HttpServletRequest request,NucleotideCopDTO nucleotideCopDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<NucleotideCop> pageInfo = nucleotideCopService.findPage(nucleotideCopDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenomes(HttpServletRequest request,NucleotideCopDTO nucleotideCopGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<NucleotideCopG> pageInfo = nucleotideCopGService.findPage(nucleotideCopGDTO,orderDir,orderColumn,draw,start,length);
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
        List<String> result = nucleotideCopGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = nucleotideCopGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = nucleotideCopGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = nucleotideCopGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = nucleotideCopGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = nucleotideCopGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = nucleotideCopMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = nucleotideCopMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
