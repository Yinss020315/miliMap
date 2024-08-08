package com.xiaomi.miliMap.business;

import com.xiaomi.miliMap.common.utils.GsonUtils;
import com.xiaomi.miliMap.service.dao.TestDaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: TestBusiness
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/7
 */
@Service
public class TestBusiness {

    @Resource
    private TestDaoService testDaoService;

    public String getTestEntity(int id)
    {
        return GsonUtils.toString(testDaoService.getTestEntity(id));
    }
}
