package com.zhs.shadow.admin.controller;

import java.time.LocalDateTime;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import com.zhs.shadow.admin.vo.test.TestVo;
import com.zhs.shadow.common.response.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/index")
@Api(value = "/index", description = "首页控制器")
public class IndexController {

    @ApiOperation(value = "测试接口", httpMethod = "POST", notes = "测试接口")
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public CommonResult test() {
        TestVo vo = new TestVo();
        vo.setId(1L);
        vo.setName("你们好");
        vo.setPassword("123");
        vo.setCreateTime(LocalDateTime.now());
        vo.setUpdateTime(LocalDateTime.now());
        return CommonResult.success(vo);
    }

}
