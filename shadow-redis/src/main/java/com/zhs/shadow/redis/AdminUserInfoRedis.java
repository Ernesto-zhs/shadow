package com.zhs.shadow.redis;

import com.alibaba.fastjson.JSON;
import com.zhs.shadow.domain.entity.admin.AdminInfoEntity;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 管理员信息redis
 * @author Austin
 */
@Component
public class AdminUserInfoRedis {

    private Logger logger = LoggerFactory.getLogger(AdminUserInfoRedis.class);

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private final static String USER_DETAIL_REDIS_PREFIXX = "SHADOW:AdminInfo:";

    /**
     * 得到管理员信息Key
     * @param id
     * @return
     */
    private String getUserDetailKey(Long id) {
        return USER_DETAIL_REDIS_PREFIXX + id;
    }

    /**
     * 设置管理员信息
     * @param entity
     */
    public void setAdminInfo(AdminInfoEntity entity) {
        redisTemplate.opsForValue().set(getUserDetailKey(entity.getId()), JSON.toJSONString(entity));
    }

    /**
     * 获取管理员信息
     * @param id
     * @return
     */
    private AdminInfoEntity getAdminInfo(Long id) {
        AdminInfoEntity entity = null;
        String s = redisTemplate.opsForValue().get(getUserDetailKey(id));
        if (StringUtils.isNotEmpty(s)) {
            entity = JSON.parseObject(s, AdminInfoEntity.class);
        }
        return entity;
    }
}
