package com.zhs.shadow.service.config.write.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.ConfigInfoMapper;
import com.zhs.shadow.domain.entity.config.ConfigInfoEntity;
import com.zhs.shadow.service.config.write.ConfigInfoWriteService;
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
public class ConfigInfoWriteServiceImpl extends ServiceImpl<ConfigInfoMapper, ConfigInfoEntity> implements ConfigInfoWriteService {

}
