package com.zhs.shadow.service.admin.read.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.admin.dao.mapper.AdminInfoMapper;
import com.zhs.shadow.domain.entity.admin.AdminInfoEntity;
import com.zhs.shadow.admin.service.admin.read.AdminInfoReadService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员信息表 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Service
public class AdminInfoReadServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfoEntity> implements AdminInfoReadService {

}
