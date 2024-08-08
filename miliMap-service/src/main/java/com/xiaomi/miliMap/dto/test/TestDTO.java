package com.xiaomi.miliMap.dto.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: TestDTO
 * @Description: 测试数据库
 * @Author: YourName
 * @Date: 2024/8/7
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestDTO {
    /**
     * id
     */
    private int id;
    /**
     * 名称
     */
    private String name;
}
