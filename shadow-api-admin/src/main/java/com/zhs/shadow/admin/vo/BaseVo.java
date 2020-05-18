package com.zhs.shadow.admin.vo;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.zhs.shadow.common.deserializer.LongJsonSerializer;

/**
 * @author Austin
 * 基础返回对象
 */
@Data
@ApiModel(value = "基础返回对象")
public class BaseVo {

    @ApiModelProperty(value = "唯一ID")
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long id;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "是否删除 0否 1是")
    private Short deleted;
}
