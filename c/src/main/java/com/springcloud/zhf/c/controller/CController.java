package com.springcloud.zhf.c.controller;


import com.springcloud.zhf.c.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CController {

    @Autowired
    CService cService;

    @GetMapping("/mutiToSum")
    public String mutiToSum(@RequestParam("list") List<Integer> list){
        int sum = cService.mutiToSum(list);
        return "这组数字的乘积是："+ sum;
    }
}
