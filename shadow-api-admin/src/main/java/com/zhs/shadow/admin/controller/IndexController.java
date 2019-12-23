package com.zhs.shadow.admin.controller;

import com.zhs.shadow.admin.vo.TestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/index")
@Api(value = "/index", description = "首页控制器")
public class IndexController {

    @ApiOperation(value = "/get", httpMethod = "GET", notes = "测试接口")
    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    public Object get() {
        return "Hello World!";
    }

}
