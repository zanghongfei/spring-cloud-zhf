package com.springcloud.zhf.b.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name= "a")
public interface AClient {
    @RequestMapping(value = "/addToSum")
    public String addToSum(@RequestParam("list") List<Integer> list);
}