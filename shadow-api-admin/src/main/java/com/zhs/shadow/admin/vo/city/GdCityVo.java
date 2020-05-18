package com.zhs.shadow.admin.vo.city;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhs.shadow.admin.vo.BaseVo;
import com.zhs.shadow.domain.entity.BaseEntity;

/**
 * <p>
 * 高德地图城市数据信息表
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class GdCityVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一编号
     */
    private Integer adcode;

    /**
     * 父级adcode
     */
    private Integer parentId;

    /**
     * 省市区县编号
     */
    private Integer citycode;

    /**
     * 名称
     */
    private String name;

    /**
     * 经度
     */
    private BigDecimal gpsLongitude;

    /**
     * 纬度
     */
    private BigDecimal gpsLatitude;

    /**
     * 是否启用 0:是 1:否
     */
    private Integer state;


}
