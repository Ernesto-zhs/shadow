package com.zhs.shadow.admin.dto.admin;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Austin
 */
@Data
@ApiModel(value = "注册表单")
public class RegistrationDTO {

    @ApiModelProperty(value = "用户名")
    @NotEmpty(message ="手机号码不能为空")
    private String username;

    @ApiModelProperty(value = "登录密码")
    @NotEmpty(message = "登录密码不能为空")
    private String password;

    @ApiModelProperty(value = "验证码")
    @NotEmpty(message = "验证码不能为空")
    private String verifyCode;

}
