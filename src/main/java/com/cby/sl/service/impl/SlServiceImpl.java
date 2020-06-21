package com.cby.sl.service.impl;

import com.cby.sl.service.SlService;
import org.springframework.stereotype.Service;

@Service
public class SlServiceImpl implements SlService {
    @Override
    public void test() {
        System.out.println(">>>>>>>>>>>>>>>test");
    }
}
