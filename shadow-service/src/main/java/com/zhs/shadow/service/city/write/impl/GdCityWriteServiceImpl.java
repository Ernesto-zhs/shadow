package com.zhs.shadow.service.city.write.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.domain.entity.city.GdCityEntity;
import com.zhs.shadow.dao.mapper.GdCityMapper;
import com.zhs.shadow.service.city.write.GdCityWriteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 高德地图城市数据信息表 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Service
public class GdCityWriteServiceImpl extends ServiceImpl<GdCityMapper, GdCityEntity> implements GdCityWriteService {

}
