package com.xiaomi.miliMap.service.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaomi.miliMap.entity.TestEntity;
import com.xiaomi.miliMap.mapper.test.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: TestDaoService
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/7
 */
@Service
public class TestDaoService {

    @Resource
    private TestMapper testMapper;

    public TestEntity getTestEntity(int id){

        LambdaQueryWrapper<TestEntity> queryWrapper = new QueryWrapper<TestEntity>().lambda()
                .eq(TestEntity::getId,id);

        return testMapper.selectOne(queryWrapper);
    }
}
