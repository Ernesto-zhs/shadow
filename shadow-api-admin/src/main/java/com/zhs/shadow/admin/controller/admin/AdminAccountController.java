package com.zhs.shadow.admin.controller.admin;


import java.util.List;

import io.swagger.annotations.ApiOperation;

import com.zhs.shadow.common.response.CommonResult;
import com.zhs.shadow.domain.entity.city.GdCityEntity;
import com.zhs.shadow.service.city.read.GdCityReadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 管理员账户表 前端控制器
 * </p>
 * @author zhs
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/admin/adminAccount")
public class AdminAccountController {

    /**
     * 日志记录工具
     */
    private Logger logger = LoggerFactory.getLogger(AdminAccountController.class);

    @Autowired
    private GdCityReadService gdCityReadService;

    @RequestMapping(value = "queryCityInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    Object queryCityInfo() {
        List<GdCityEntity> list = gdCityReadService.list();
        return CommonResult.success(list);
    }

}
