package com.etc.service.Impl;

import com.etc.service.ServiceW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class serviceImplTest {

    @Resource
    private ServiceW service;
    @Test
    public void hello() {
        String hello = service.hello();
        System.out.println(hello);


    }
}