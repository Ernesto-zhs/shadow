package com.zhs.shadow.admin.controller.config;


import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 配置信息的key描述 前端控制器
 * </p>
 * @author zhs
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/admin/configKey")
@Api(value = "/admin/configKey", description = "配置键描述信息")
public class ConfigKeyController {

}
