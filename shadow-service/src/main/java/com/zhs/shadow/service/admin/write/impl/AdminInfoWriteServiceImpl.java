package com.zhs.shadow.service.admin.write.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.shadow.dao.mapper.AdminInfoMapper;
import com.zhs.shadow.domain.entity.admin.AdminInfoEntity;
import com.zhs.shadow.service.admin.write.AdminInfoWriteService;
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
public class AdminInfoWriteServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfoEntity> implements AdminInfoWriteService {

}
