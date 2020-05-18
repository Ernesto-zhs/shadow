package com.zhs.shadow.admin.controller.city;


import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.zhs.shadow.common.response.CommonResult;
import com.zhs.shadow.common.response.ResultCode;
import com.zhs.shadow.domain.entity.city.GdCityEntity;
import com.zhs.shadow.service.city.read.GdCityReadService;
import com.zhs.shadow.service.city.write.GdCityWriteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 高德地图城市数据信息表 前端控制器
 * </p>
 * @author zhs
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/admin/gdCity")
@Api(value = "/admin/gdCity", description = "城市信息控制器")
public class GdCityController {

    /**
     * 日志记录器
     */
    private Logger logger = LoggerFactory.getLogger(GdCityController.class);

    @Autowired
    private GdCityReadService gdCityReadService;
    @Autowired
    private GdCityWriteService gdCityWriteService;

    @ApiOperation(value = "/queryCityInfo", httpMethod = "POST")
    @RequestMapping(value = "/queryCityInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    Object queryCityInfo() {
        try {
            List<GdCityEntity> list = gdCityReadService.list();
            return CommonResult.success(list);
        } catch (Exception e) {
            logger.error("查询失败", e);
            return CommonResult.failed(ResultCode.FAILED);
        }
    }

}
