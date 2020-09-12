package com.ngdc.compodynamics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/****
 * @Author:duqiang
 * @Description:
 * @Date 2020/6/14 23:43
 *****/

@Controller
public class PageController {

    @RequestMapping(value = {"", "home"}, method = RequestMethod.GET)
    public String root(){
        return "index";
    }
    @RequestMapping(value = "introduction", method = RequestMethod.GET)
    public String statistics(){
        return "introduction";
    }
    @RequestMapping(value = "statistics", method = RequestMethod.GET)
    public String help(){
        return "statistics";
    }
    @RequestMapping(value = {"contact"}, method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }
    @RequestMapping(value = {"genepage"}, method = RequestMethod.GET)
    public String gene(Integer term){
        return "genepage";
    }
    @RequestMapping(value = {"geneomepage"}, method = RequestMethod.GET)
    public String geneome(Integer term){
        return "geneomepage";
    }

    @RequestMapping(value = {"slider"}, method = RequestMethod.GET)
    public String slider(Integer term){
        return "slider";
    }

}
