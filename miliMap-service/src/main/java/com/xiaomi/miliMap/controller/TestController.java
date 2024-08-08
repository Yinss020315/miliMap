package com.xiaomi.miliMap.controller;

import com.xiaomi.miliMap.impl.TestServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/7
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class TestController {

    @Resource
    TestServiceImpl testServiceImpl;
    @GetMapping("test")
    public String test(){
        return testServiceImpl.getTestEntity(1);
    }
}
