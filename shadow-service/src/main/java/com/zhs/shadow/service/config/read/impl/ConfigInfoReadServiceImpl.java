package com.zhs.shadow.service.config.read.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.ConfigInfoMapper;
import com.zhs.shadow.domain.entity.config.ConfigInfoEntity;
import com.zhs.shadow.service.config.read.ConfigInfoReadService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置信息 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Service
public class ConfigInfoReadServiceImpl extends ServiceImpl<ConfigInfoMapper, ConfigInfoEntity> implements ConfigInfoReadService {

}
