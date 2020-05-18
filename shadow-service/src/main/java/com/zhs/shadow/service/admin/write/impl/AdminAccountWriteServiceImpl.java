package com.zhs.shadow.service.admin.write.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.AdminAccountMapper;
import com.zhs.shadow.domain.entity.admin.AdminAccountEntity;
import com.zhs.shadow.service.admin.write.AdminAccountWriteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员账户表 服务实现类
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Service
public class AdminAccountWriteServiceImpl extends ServiceImpl<AdminAccountMapper, AdminAccountEntity> implements AdminAccountWriteService {

}
