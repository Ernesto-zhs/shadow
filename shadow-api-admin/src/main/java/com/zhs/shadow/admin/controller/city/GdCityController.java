package com.zhs.shadow.admin.controller.city;


import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.zhs.shadow.admin.annotation.SystemControllerLog;
import com.zhs.shadow.admin.vo.city.GdCityVo;
import com.zhs.shadow.common.response.CommonResult;
import com.zhs.shadow.common.util.BeanUtils;
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

    @SystemControllerLog(description = "查询所有城市信息")
    @ApiOperation(value = "查询所有城市信息", httpMethod = "POST")
    @RequestMapping(value = "/queryCityInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    CommonResult<List<GdCityVo>> queryCityInfo() {
        try {
            List<GdCityVo> voList = new ArrayList<GdCityVo>();
            List<GdCityEntity> list = gdCityReadService.list();
            for (GdCityEntity entity : list) {
                GdCityVo vo = new GdCityVo();
                BeanUtils.copyProperties(entity, vo);
                voList.add(vo);
            }
            return CommonResult.success(voList);
        } catch (Exception e) {
            logger.error("查询失败", e);
            return CommonResult.failed("查询所有城市信息失败");
        }
    }

}
