package com.springcloud.zhf.d.service;

import org.springframework.stereotype.Service;

@Service
public class DService {

    /**
     * 计算两数的商
     * @author zhf
     * @param i1
     * @param i2
     * @return
     */
    public int twoNumOfMerchant(Integer i1,Integer i2){
        return i1/i2;
    }
}
