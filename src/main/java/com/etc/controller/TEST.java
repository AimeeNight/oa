package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TEST {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "HELLOWORLD1";
    }
    @RequestMapping("test1")
    public ModelAndView test(){
        return new ModelAndView("index","key","name");
    }
    @RequestMapping("test2")
    public ModelAndView test1(){
        List<String> objects = new ArrayList<>();
        objects.add("a");
        objects.add("b");
        objects.add("c");
        return new ModelAndView("index","list",objects);
    }
}
