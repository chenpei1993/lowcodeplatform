package com.jenschen.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("customer")
@Builder
@EqualsAndHashCode(callSuper = true)
public class CustomerEntity extends BaseEntity{

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户邮箱号
     */
    private String email;

    /**
     * 用户标签
     */
    @TableField(exist = false)
    private String tags;
}
