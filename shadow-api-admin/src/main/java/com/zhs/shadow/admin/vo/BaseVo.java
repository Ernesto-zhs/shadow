package com.zhs.shadow.admin.vo;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Austin
 * 基础返回对象
 */
@Data
@ApiModel(value = "基础返回对象")
public class BaseVo {

    @ApiModelProperty(value = "唯一ID")
    private Long id;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
}
