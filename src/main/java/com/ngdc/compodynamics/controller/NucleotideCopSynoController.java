package com.ngdc.compodynamics.controller;

import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.NucleotideCopSynoGMapper;
import com.ngdc.compodynamics.dao.NucleotideCopSynoMapper;
import com.ngdc.compodynamics.dao.NucleotideSynoPicMapper;
import com.ngdc.compodynamics.dto.NucleotideCopSynoDTO;
import com.ngdc.compodynamics.model.NucleotideCopG;
import com.ngdc.compodynamics.model.NucleotideCopSyno;
import com.ngdc.compodynamics.model.NucleotideCopSynoG;
import com.ngdc.compodynamics.model.NucleotideSynoPic;
import com.ngdc.compodynamics.service.NucleotideCopSynoGService;
import com.ngdc.compodynamics.service.NucleotideCopSynoService;
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
@RequestMapping("/synnuccop")
public class NucleotideCopSynoController {

    @Autowired
    private NucleotideSynoPicMapper nucleotideSynoPicMapper;

    @Autowired
    private NucleotideCopSynoMapper nucleotideCopSynoMapper;

    @Autowired
    private NucleotideCopSynoGMapper nucleotideCopSynoGMapper;

    @Autowired
    private NucleotideCopSynoService nucleotideCopSynoService;

    @Autowired
    private NucleotideCopSynoGService nucleotideCopSynoGService;

    @GetMapping
    public String synnuccop(){
        return "synnuccop";
    }

    @GetMapping(value = "/sunopic")
    @ResponseBody
    public Map<String, Object> sunopic(Integer term){
        List<NucleotideSynoPic> nucleotideSynoPics = nucleotideSynoPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotideSynoPics",nucleotideSynoPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<NucleotideCopSynoG> nucleotideCopSynoG = nucleotideCopSynoGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotideCopSynoG",nucleotideCopSynoG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<NucleotideCopSyno> nucleotideCopSyno = nucleotideCopSynoMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("nucleotideCopSyno",nucleotideCopSyno);
        return result;
    }



    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGene(HttpServletRequest request,NucleotideCopSynoDTO nucleotideCopSynoDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<NucleotideCopSyno> pageInfo = nucleotideCopSynoService.findPage(nucleotideCopSynoDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenome(HttpServletRequest request,NucleotideCopSynoDTO nucleotideCopSynoGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<NucleotideCopSynoG> pageInfo = nucleotideCopSynoGService.findPage(nucleotideCopSynoGDTO,orderDir,orderColumn,draw,start,length);
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
        List<String> result = nucleotideCopSynoGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = nucleotideCopSynoMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
