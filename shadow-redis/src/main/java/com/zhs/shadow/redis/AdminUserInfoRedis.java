package com.zhs.shadow.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInfoRedis {

    private Logger logger = LoggerFactory.getLogger(AdminUserInfoRedis.class);

    @Autowired
    private RedisTemplate<String, String> redisTemplate;



}
