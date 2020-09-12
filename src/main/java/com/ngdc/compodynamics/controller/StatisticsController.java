package com.ngdc.compodynamics.controller;

import com.ngdc.compodynamics.dao.StatisticsGccdcencMapper;
import com.ngdc.compodynamics.dao.StatisticsHotmapMapper;
import com.ngdc.compodynamics.dto.AminoHotmapDTO;
import com.ngdc.compodynamics.dto.CodonBiasHotmapDTO;
import com.ngdc.compodynamics.dto.CodonHotmapDTO;
import com.ngdc.compodynamics.service.searchAll.SearchAllService;
import com.ngdc.compodynamics.tookits.List2Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/statistic")
public class StatisticsController {


    @Autowired
    private StatisticsGccdcencMapper statisticsGccdcencMapper;

    @Autowired
    private StatisticsHotmapMapper statisticsHotmapMapper;

    @GetMapping(value = "/gc_list")
    @ResponseBody
    public Map<String, Object>  gc123(String term) throws Exception{

        Map<String, Object> map = new HashMap<>();

        List<List<Double>> gc3List =new ArrayList<>();
        List<List<Double>> gc1List = new ArrayList<>();
        List<List<Double>> gc2List = new ArrayList<>();

        List<Double> gc = statisticsGccdcencMapper.findGC(term);
        List<Double> gc1 = statisticsGccdcencMapper.findGC1(term);
        List<Double> gc2 = statisticsGccdcencMapper.findGC2(term);
        List<Double> gc3 = statisticsGccdcencMapper.findGC3(term);

        for (int i=0;i<gc.size();i++ ){
            List<Double> gc1list = new ArrayList<>();
            List<Double> gc2list = new ArrayList<>();
            List<Double> gc3list = new ArrayList<>();

            gc1list.add(gc.get(i));
            gc1list.add(gc1.get(i));
            gc1List.add(gc1list);

            gc2list.add(gc.get(i));
            gc2list.add(gc2.get(i));
            gc2List.add(gc2list);

            gc3list.add(gc.get(i));
            gc3list.add(gc3.get(i));
            gc3List.add(gc3list);
        }
        map.put("gc1List", gc1List);
        map.put("gc2List", gc2List);
        map.put("gc3List", gc3List);
        return map;
    }

    @GetMapping(value = "/amino_hotmap")
    @ResponseBody
    public Map<String, Object>  amino_hotmap() throws Exception{

        DecimalFormat df = new DecimalFormat("#.000");
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> result = new ArrayList<>();
        List<AminoHotmapDTO> aminoHotmapDTOS =  statisticsHotmapMapper.findAmino();
        for (int i=0;i<aminoHotmapDTOS.size();i++){
            Map<String, Object> map0 = new HashMap<>();
            Map<String, Object> map1 = new HashMap<>();
            Map<String, Object> map2 = new HashMap<>();
            Map<String, Object> map3 = new HashMap<>();
            Map<String, Object> map4 = new HashMap<>();
            Map<String, Object> map5 = new HashMap<>();
            Map<String, Object> map6 = new HashMap<>();
            Map<String, Object> map7 = new HashMap<>();
            Map<String, Object> map8 = new HashMap<>();
            Map<String, Object> map9 = new HashMap<>();
            Map<String, Object> map10 = new HashMap<>();
            Map<String, Object> map11 = new HashMap<>();
            Map<String, Object> map12 = new HashMap<>();
            Map<String, Object> map13 = new HashMap<>();
            Map<String, Object> map14 = new HashMap<>();
            Map<String, Object> map15 = new HashMap<>();
            Map<String, Object> map16 = new HashMap<>();
            Map<String, Object> map17 = new HashMap<>();
            Map<String, Object> map18 = new HashMap<>();
            Map<String, Object> map19 = new HashMap<>();

            map0.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map1.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map2.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map3.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map4.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map5.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map6.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map7.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map8.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map9.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map10.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map11.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map12.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map13.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map14.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map15.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map16.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map17.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map18.put("xValue", aminoHotmapDTOS.get(i).getOrganism());
            map19.put("xValue", aminoHotmapDTOS.get(i).getOrganism());

            map0.put("yValue",  "Ala");
            map1.put("yValue",  "Cys");
            map2.put("yValue",  "Asp");
            map3.put("yValue",  "Glu");
            map4.put("yValue",  "Phe");
            map5.put("yValue",  "Gly");
            map6.put("yValue",  "His");
            map7.put("yValue",  "Ile");
            map8.put("yValue",  "Lys");
            map9.put("yValue",  "Leu");
            map10.put("yValue", "Met");
            map11.put("yValue", "Asn");
            map12.put("yValue", "Pro");
            map13.put("yValue", "Gln");
            map14.put("yValue", "Arg");
            map15.put("yValue", "Ser");
            map16.put("yValue", "Thr");
            map17.put("yValue", "Val");
            map18.put("yValue", "Trp");
            map19.put("yValue", "Tyr");
            
            map0.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedAla()));
            map1.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedCys()));
            map2.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedAsp()));
            map3.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedGlu()));
            map4.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedPhe()));
            map5.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedGly()));
            map6.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedHis()));
            map7.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedIle()));
            map8.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedLys()));
            map9.put("zValue",  df.format(aminoHotmapDTOS.get(i).getObservedLeu()));
            map10.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedMet()));
            map11.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedAsn()));
            map12.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedPro()));
            map13.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedGln()));
            map14.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedArg()));
            map15.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedSer()));
            map16.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedThr()));
            map17.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedVal()));
            map18.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedTrp()));
            map19.put("zValue", df.format(aminoHotmapDTOS.get(i).getObservedTyr()));

            result.add(map0);
            result.add(map1);
            result.add(map2);
            result.add(map3);
            result.add(map4);
            result.add(map5);
            result.add(map6);
            result.add(map7);
            result.add(map8);
            result.add(map9);
            result.add(map10);
            result.add(map11);
            result.add(map12);
            result.add(map13);
            result.add(map14);
            result.add(map15);
            result.add(map16);
            result.add(map17);
            result.add(map18);
            result.add(map19);
        }
        map.put("result", result);
        return map;
    }

    @GetMapping(value = "/codon_hotmap")
    @ResponseBody
    public Map<String, Object>  codon_hotmap() throws Exception{

        Map<String, Object> map = new HashMap<>();
        List<CodonHotmapDTO> codonHotmapDTOS =  statisticsHotmapMapper.findCodon();
        map.put("codonHotmapDTOS", codonHotmapDTOS);
        return map;
    }

    @GetMapping(value = "/bias_hotmap")
    @ResponseBody
    public Map<String, Object>  bias_hotmap() throws Exception{

        Map<String, Object> map = new HashMap<>();
        List<CodonBiasHotmapDTO> codonBiasHotmapDTOS =  statisticsHotmapMapper.findBias();
        map.put("codonBiasHotmapDTOS", codonBiasHotmapDTOS);
        return map;
    }

    
}
