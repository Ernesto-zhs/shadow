package com.zhs.shadow.admin.dto;

import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "测试的DTO对象")
public class BaseQueryDTO {

    @ApiModelProperty(value = "对象")
    private Map<String, Object> map;

}
