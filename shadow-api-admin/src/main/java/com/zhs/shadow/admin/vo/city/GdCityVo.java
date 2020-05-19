package com.zhs.shadow.admin.vo.city;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * @author zhs
 * @since 2020-05-18
 */
@Data
@ApiModel(value = "高德地图城市数据信息表")
public class GdCityVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "唯一编号")
    private Integer adcode;

    @ApiModelProperty(value = "父级adcode")
    private Integer parentId;

    @ApiModelProperty(value = "省市区县编号")
    private Integer citycode;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "经度")
    private BigDecimal gpsLongitude;

    @ApiModelProperty(value = "纬度")
    private BigDecimal gpsLatitude;

    @ApiModelProperty(value = "是否启用 0:是 1:否")
    private Integer state;


}
