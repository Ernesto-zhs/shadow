package com.zhs.shadow.admin.dto.admin;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Austin
 */
@Data
@ApiModel(value = "登录表单")
public class LoginDTO {

    @ApiModelProperty(value = "用户名")
    @NotEmpty(message ="用户名不能为空")
    private String username;

    @ApiModelProperty(value = "登录密码")
    @NotEmpty(message = "登录密码不能为空")
    private String password;
}
