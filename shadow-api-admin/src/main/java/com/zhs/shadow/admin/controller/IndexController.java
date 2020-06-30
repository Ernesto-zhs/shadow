package com.zhs.shadow.admin.controller;

import java.time.LocalDateTime;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.alibaba.fastjson.JSON;
import com.zhs.shadow.admin.dto.BaseQueryDTO;
import com.zhs.shadow.admin.dto.TestDTO;
import com.zhs.shadow.admin.dto.TestDTOV1;
import com.zhs.shadow.admin.vo.test.TestVo;
import com.zhs.shadow.common.response.CommonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/index")
@Api(value = "/index", description = "首页控制器")
public class IndexController extends BaseController {

    @ApiOperation(value = "测试接口", httpMethod = "POST", notes = "测试接口")
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public CommonResult test(@RequestBody TestDTOV1 dto) {
        System.out.println(JSON.toJSONString(dto));
        return CommonResult.success(dto);
    }

}
