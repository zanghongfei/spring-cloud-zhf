package com.springcloud.zhf.b.controller;

import com.springcloud.zhf.b.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BController {

    @Autowired
    BService bService;

    @GetMapping("/twoNumDiff")
    public String twoNumDiff(@RequestParam("i1,i2") Integer i1,Integer i2){
        int diff = bService.twoNumDiff(i1,i2);
        return "两数之差是："+ diff;
    }
}
