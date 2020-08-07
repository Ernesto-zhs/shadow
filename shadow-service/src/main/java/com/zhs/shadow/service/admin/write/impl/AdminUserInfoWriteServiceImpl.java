package com.zhs.shadow.service.admin.write.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.AdminUserInfoMapper;
import com.zhs.shadow.domain.entity.admin.AdminUserInfoEntity;
import com.zhs.shadow.service.admin.write.AdminUserInfoWriteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员信息表 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-19
 */
@Service
public class AdminUserInfoWriteServiceImpl extends ServiceImpl<AdminUserInfoMapper, AdminUserInfoEntity> implements AdminUserInfoWriteService {

}
