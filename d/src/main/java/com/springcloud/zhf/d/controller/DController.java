package com.springcloud.zhf.d.controller;

import com.springcloud.zhf.d.service.DService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DController {

    @Autowired
    DService dService;

    @GetMapping("/twoNumOfMerchant")
    public String twoNumOfMerchant(@RequestParam("i1,i2") Integer i1,Integer i2){
        int merchant = dService.twoNumOfMerchant(i1,i2);
        return "两数之差是："+ merchant;
    }
}
