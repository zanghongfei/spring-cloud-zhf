package com.springcloud.zhf.c.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CService {

    /**
     * 计算一组数的乘积
     * @author zhf
     * @param list
     * @return
     */
    public int mutiToSum(List<Integer> list){
        int n = list.size();
        int sum = 1;
        for(int i = 0;i < n;i++){
            sum *= list.get(i);
        }
        return sum;
    }
}
