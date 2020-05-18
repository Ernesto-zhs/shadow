package com.zhs.shadow.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Austin
 */
@Data
@ApiModel(value = "测试的DTO对象")
public class BaseQueryDTO {

    @ApiModelProperty(value = "页码")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "每页显示的条数")
    private Integer pageSize = 10;


}
