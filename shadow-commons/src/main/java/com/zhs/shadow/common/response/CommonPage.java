package com.zhs.shadow.common.response;

import java.util.List;

import lombok.Data;


/**
 * 分页数据封装类
 * @author Austin
 */
@Data
public class CommonPage<T> {

    /**
     * 当前页
     */
    private long current = 1;

    /**
     * 每页显示条数，默认 10
     */
    private long size;

    /**
     * 总数
     */
    private long total;

    /**
     * 查询数据列表
     */
    private List<T> records;

    /**
     * 构造方法
     * @param current
     * @param size
     * @param total
     * @param records
     */
    public CommonPage(long current, long size, long total, List<T> records) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.records = records;
    }
}
