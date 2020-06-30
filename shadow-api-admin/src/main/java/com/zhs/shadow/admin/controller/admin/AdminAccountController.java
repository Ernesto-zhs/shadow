package com.zhs.shadow.admin.controller.admin;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import com.alibaba.fastjson.JSON;
import com.zhs.shadow.admin.dto.admin.LoginDTO;
import com.zhs.shadow.admin.dto.admin.RegistrationDTO;
import com.zhs.shadow.common.response.CommonResult;
import com.zhs.shadow.common.response.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 管理员账户表 前端控制器
 * </p>
 * @author zhs
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/admin/account")
@Api(value = "/admin/account", description = "管理员账户控制器")
@Valid
public class AdminAccountController {

    /**
     * 日志记录工具
     */
    private Logger logger = LoggerFactory.getLogger(AdminAccountController.class);

    @ApiOperation(value = "用户注册", httpMethod = "POST")
    @RequestMapping(value = "/registration", method = {RequestMethod.POST})
    public @ResponseBody
    CommonResult registration(@RequestBody RegistrationDTO dto) {

        return CommonResult.success(new HashMap<>(8));
    }

    @ApiOperation(value = "用户登录", httpMethod = "POST")
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public @ResponseBody
    CommonResult login(@RequestBody LoginDTO dto) {
        try {
            Map<String, Object> data = new HashMap<>(8);
            return CommonResult.success(data);
        } catch (Exception e) {
            logger.error("用户登录失败dto={}", JSON.toJSONString(dto), e);
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

    @ApiOperation(value = "修改密码", httpMethod = "POST")
    @RequestMapping(value = "/updatePassword", method = {RequestMethod.POST})
    public @ResponseBody
    CommonResult updatePassword() {
        return CommonResult.success(new HashMap<>(8));
    }

}
