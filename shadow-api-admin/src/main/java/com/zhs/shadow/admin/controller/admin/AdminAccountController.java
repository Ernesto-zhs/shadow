package com.zhs.shadow.admin.controller.admin;


import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 管理员账户表 前端控制器
 * </p>
 * @author zhs
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/admin/adminAccount")
@Api(value = "/admin/adminAccount", description = "管理员账户控制器")
public class AdminAccountController {

    /**
     * 日志记录工具
     */
    private Logger logger = LoggerFactory.getLogger(AdminAccountController.class);



}
