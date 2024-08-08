package com.xiaomi.miliMap.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Entity
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/7
 */
@Data
@TableName("test")
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
    @TableId(type = IdType.AUTO, value = "id")
    public long id;
    /**
     * 活动名称
     */
    @TableField("name")
    public String name;
}
