package com.zhs.shadow.admin.vo.test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.zhs.shadow.admin.vo.BaseVo;

/**
 * @author Austin
 * @date 200-03-26
 */
@Data
@ApiModel(value = "测试返回对象")
public class TestVo extends BaseVo {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

}
