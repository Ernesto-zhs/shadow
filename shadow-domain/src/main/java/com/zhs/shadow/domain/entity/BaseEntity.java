package com.zhs.shadow.domain.entity;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Austin
 * 公共属性对象
 */
@Data
@Accessors(chain = true)
public class BaseEntity {

    /**
     * 唯一Id
     */
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除 0否 1是
     */
    private Short deleted;
}
