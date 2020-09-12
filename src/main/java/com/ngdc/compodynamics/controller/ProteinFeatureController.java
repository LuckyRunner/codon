package com.ngdc.compodynamics.controller;
import com.github.pagehelper.PageInfo;
import com.ngdc.compodynamics.dao.ProteinFeatureGMapper;
import com.ngdc.compodynamics.dao.ProteinFeatureMapper;
import com.ngdc.compodynamics.dao.ProteinPicMapper;
import com.ngdc.compodynamics.dto.ProteinFeatureDTO;
import com.ngdc.compodynamics.model.NucleotideCopSynoG;
import com.ngdc.compodynamics.model.ProteinFeature;
import com.ngdc.compodynamics.model.ProteinFeatureG;
import com.ngdc.compodynamics.model.ProteinPic;
import com.ngdc.compodynamics.service.ProteinFeatureGService;
import com.ngdc.compodynamics.service.ProteinFeatureService;
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
@RequestMapping("/proteinfeature")
public class ProteinFeatureController {

    @Autowired
    private ProteinPicMapper proteinPicMapper;

    @Autowired
    private ProteinFeatureMapper proteinFeatureMapper;

    @Autowired
    private ProteinFeatureGMapper proteinFeatureGMapper;

    @Autowired
    private ProteinFeatureService proteinFeatureService;

    @Autowired
    private ProteinFeatureGService proteinFeatureGService;

    @GetMapping
    public String protein(){
        return "protein";
    }

    @GetMapping(value = "/proteinpic")
    @ResponseBody
    public Map<String, Object> proteinpic(Integer term){
        List<ProteinPic> proteinPics = proteinPicMapper.findBySpeciesIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("proteinPics",proteinPics);
        return result;
    }

    @GetMapping(value = "/genomepage")
    @ResponseBody
    public Map<String, Object> genome(Integer term){
        List<ProteinFeatureG> proteinFeatureG = proteinFeatureGMapper.findBySpeciseIndex(term);
        Map<String, Object> result = new HashMap<>();
        result.put("proteinFeatureG",proteinFeatureG);
        return result;
    }
    @GetMapping(value = "/genepage")
    @ResponseBody
    public Map<String, Object>  gene(int gene,int genome) {
        List<ProteinFeature> proteinFeature = proteinFeatureMapper.findByCdsIndexAndSpeciseIndex(gene,genome);
        Map<String, Object> result = new HashMap<>();
        result.put("proteinFeature",proteinFeature);
        return result;
    }



    @GetMapping(value = "/genes")
    @ResponseBody
    public Map<String, Object> searchGenes(HttpServletRequest request,ProteinFeatureDTO proteinFeatureDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<ProteinFeature> pageInfo = proteinFeatureService.findPage(proteinFeatureDTO,orderDir,orderColumn,draw,start,length);
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
    public Map<String, Object> searchGenome(HttpServletRequest request,ProteinFeatureDTO proteinFeatureGDTO){

        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        String strDraw = request.getParameter("draw");
        String order = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String orderColumn = request.getParameter("columns["+order+"][data]");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);

        PageInfo<ProteinFeatureG> pageInfo = proteinFeatureGService.findPage(proteinFeatureGDTO,orderDir,orderColumn,draw,start,length);
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
        List<String> result = proteinFeatureGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genometax")
    @ResponseBody
    public Map<String, Object> genometax(@RequestParam("term") String term){
        List<String> result = proteinFeatureGMapper.findTaxonomy(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneorg")
    @ResponseBody
    public Map<String, Object> geneorg(@RequestParam("term") String term){
        List<String> result = proteinFeatureGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeorg")
    @ResponseBody
    public Map<String, Object> genomeorg(@RequestParam("term") String term){
        List<String> result = proteinFeatureGMapper.findOrganism(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneass")
    @ResponseBody
    public Map<String, Object> geneass(@RequestParam("term") String term){
        List<String> result = proteinFeatureGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/genomeass")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term){
        List<String> result = proteinFeatureGMapper.findAssemblyAccession(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/geneid")
    @ResponseBody
    public Map<String, Object> geneid(@RequestParam("term") String term){
        List<String> result = proteinFeatureMapper.findGeneId(term);
        return List2Select.convert(result);
    }
    @GetMapping(value = "/proteinid")
    @ResponseBody
    public Map<String, Object> proteinid(@RequestParam("term") String term){
        List<String> result = proteinFeatureMapper.findProteinId(term);
        return List2Select.convert(result);
    }
}
