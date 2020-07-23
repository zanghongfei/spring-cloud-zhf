package com.springcloud.zhf.provider.a.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AService {

    /**
     * 计算一组数之和
     * @author zhf
     * @param list
     * @return
     */
    public int addToSum(List<Integer> list){
        int n = list.size();
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += list.get(i);
        }
        return sum;
    }
}
