package com.ngdc.compodynamics.controller;

import com.ngdc.compodynamics.service.searchAll.SearchAllService;
import com.ngdc.compodynamics.tookits.List2Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class AllSearchController {

    @Autowired
    private SearchAllService searchAllService;

    @GetMapping(value = "/all_list")
    @ResponseBody
    public Map<String, Object> genomeass(@RequestParam("term") String term) throws Exception{
        return List2Select.convert(searchAllService.searchAll(term));
    }
}
