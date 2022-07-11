package com.jenschen.entity;


import lombok.Data;

import java.util.Date;

/**
 * 公共实例类
 */
@Data
public class BaseEntity {

    /**
     * 主键ID
     */
    private int id;

    /**
     * 是否删除
     */
    private Boolean isDeleted;

    /**
     * 删除时间
     */
    private Date deletedAt;

    /**
     * 删除人
     */
    private int deletedBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private int createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 更信任
     */
    private int updatedBy;


    public void deleted(Date now, int user){
        setIsDeleted(true);
        setDeletedAt(now);
        setDeletedBy(user);
        updated(now, createdBy);
    }

    public void created(Date now, int user){
        setCreatedAt(now);
        setCreatedBy(user);
        updated(now, createdBy);
    }

    public void updated(Date now, int user){
        setCreatedAt(now);
        setCreatedBy(user);
    }

}