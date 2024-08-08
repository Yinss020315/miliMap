package com.xiaomi.miliMap.impl;

import com.xiaomi.miliMap.business.TestBusiness;
import org.springframework.stereotype.Service;
import xiaomi.miliMap.api.TestService;

import javax.annotation.Resource;

/**
 * @ClassName: TestServiceImpl
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/7
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestBusiness testBusiness;
    @Override
    public String getTestEntity(int id) {
        return testBusiness.getTestEntity(id);
    }
}
