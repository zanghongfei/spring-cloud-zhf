package com.springcloud.zhf.b.service;

import org.springframework.stereotype.Service;


@Service
public class BService {

    /**
     * 计算两数的差
     * @author zhf
     * @param i1
     * @param i2
     * @return
     */
    public int twoNumDiff(Integer i1, Integer i2) {
            return i1 - i2;
    }
}
