package com.ngdc.compodynamics.tookits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List2SelectCds {
    public static Map<String, Object> convert(List<String> stringList) {
        List<Map<String,Object>> maps = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            Map<String,Object> map1 = new HashMap<>();
            Map<String,Object> map2 = new HashMap<>();
            if(!stringList.get(i).equals("NA")){
                String cds1 = stringList.get(i).split("_cds_")[0];
                String cds2 = stringList.get(i).split("_cds_")[1];
                map1.put("id",cds1);
                map1.put("text",cds1);
                map2.put("id",cds2);
                map2.put("text",cds2);
                maps.add(map1);
                maps.add(map2);
            }
        }
        Map<String, Object> result = new HashMap<>();
        result.put("results", maps);
        return result;
    }
}
