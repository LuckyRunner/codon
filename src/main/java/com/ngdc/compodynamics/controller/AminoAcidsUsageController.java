package com.ngdc.compodynamics.controller;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.AminoAcidsUsageGMapper;
import com.ngdc.compodynamics.dao.AminoAcidsUsageMapper;
import com.ngdc.compodynamics.dao.AminoPicMapper;
import com.ngdc.compodynamics.dto.AminoDTO;
import com.ngdc.compodynamics.model.AminoAcidsUsage;
import com.ngdc.compodynamics.model.AminoAcidsUsageG;
import com.ngdc.compodynamics.model.AminoPic;
import com.ngdc.compodynamics.service.AminoAcidsUsageGService;
import com.ngdc.compodynamics.service.AminoAcidsUsageService;

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
@RequestMapping("/amino")
public class AminoAcidsUsageController {

    @Autowired
    private AminoPicMapper aminoPicMapper;

    @Autowired
    private AminoAcidsUsageGMapper aminoAcidsUsageGMapper;

    @Autowired
    private AminoAcidsUsageMapper aminoAcidsUsageMapper;

    @Autowired
    private AminoAcidsUsageService aminoAcidsUsageService;

    @Autowired
    private AminoAcidsUsageGService aminoAcidsUsageGService;

    @GetMapping
    public String amino(){
        return "amino";
    }

    @GetMapping(value = "/aminopic")
    @ResponseBody
    public Map<String, Object> aminopic(Integer term){
        List<AminoPic> aminoPics = aminoPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("aminoPics",aminoPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<AminoAcidsUsageG> aminoAcidsUsageG = aminoAcidsUsageGMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("aminoAcidsUsageG",aminoAcidsUsageG);
        return result;
    }

    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object> gene(int gene,int genome) {
        List<AminoAcidsUsage> aminoAcidsUsage = aminoAcidsUsageMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("aminoAcidsUsage",aminoAcidsUsage);
        return result;
    }


    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGenes(HttpServletRequest request,AminoDTO aminoDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<AminoAcidsUsage> pageInfo = aminoAcidsUsageService.findPage(aminoDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenomes(HttpServletRequest request,AminoDTO aminoGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<AminoAcidsUsageG> pageInfo = aminoAcidsUsageGService.findPage(aminoGDTO,orderDir,orderColumn,draw,start+1,length);
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
        List<String> result = aminoAcidsUsageGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = aminoAcidsUsageMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
