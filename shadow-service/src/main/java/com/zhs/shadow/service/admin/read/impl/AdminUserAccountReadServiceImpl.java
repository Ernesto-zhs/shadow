package com.zhs.shadow.service.admin.read.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.AdminUserAccountMapper;
import com.zhs.shadow.domain.entity.admin.AdminUserAccountEntity;
import com.zhs.shadow.service.admin.read.AdminUserAccountReadService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员账户表 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-19
 */
@Service
public class AdminUserAccountReadServiceImpl extends ServiceImpl<AdminUserAccountMapper, AdminUserAccountEntity> implements AdminUserAccountReadService {

}
