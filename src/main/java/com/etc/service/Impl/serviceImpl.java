package com.etc.service.Impl;

import com.etc.service.ServiceW;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements ServiceW {
    @Override
    public String hello() {
        return "你好";
    }
}
