package com.zhs.shadow.service.config.read.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.ConfigKeyMapper;
import com.zhs.shadow.entity.config.ConfigKeyEntity;
import com.zhs.shadow.service.config.read.ConfigKeyReadService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置信息的key描述 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Service
public class ConfigKeyReadServiceImpl extends ServiceImpl<ConfigKeyMapper, ConfigKeyEntity> implements ConfigKeyReadService {

}
