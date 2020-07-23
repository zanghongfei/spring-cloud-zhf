package com.springcloud.zhf.provider.a.controller;

import com.springcloud.zhf.provider.a.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AController {

    @Autowired
    AService aService;

    @GetMapping("/addToSum")
    public String addToSum(@RequestParam("list") List<Integer> list){
        int sum = aService.addToSum(list);
        return "这组数字的总和是："+ sum;
    }
}
