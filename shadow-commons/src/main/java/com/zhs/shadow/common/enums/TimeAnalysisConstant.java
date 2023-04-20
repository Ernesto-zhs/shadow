package com.zhs.shadow.common.enums;

/**
 * @author Austin
 * 时间解析常量
 */
public class TimeAnalysisConstant {

    private TimeAnalysisConstant() {
    }

    /**
     * 解析格式为 yyyy-MM-dd
     */
    private static final String DATE_PARTTEN_STR = "yyyy-MM-dd";

    /**
     * 解析为yyyyMMdd格式的数据
     */
    private static final String DATE_PATTERN_INT = "yyyyMMdd";

    /**
     * 解析为 yyyy-MM-dd HH:mm:ss
     * 24小时计时法
     */
    private static final String TWENTY_FOUR_SECONDS_MINIUTES_HOUR_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 解析为 yyy-MM-dd hh:mm:ss
     */
    private static final String SPLIT_TIMEKEEPING_SECONDS_MINIUTES_HOUR_DATE_PATTERN = "yyy-MM-dd hh:mm:ss";


}
