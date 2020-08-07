package com.zhs.shadow.admin;

import java.time.LocalDateTime;

import com.zhs.shadow.domain.entity.admin.AdminInfoEntity;
import com.zhs.shadow.redis.AdminUserInfoRedis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AdminApplication.class)
public class RedisTest {

    @Autowired
    private AdminUserInfoRedis adminUserInfoRedis;

    @Test
    public void setTest(){
        AdminInfoEntity entity = new AdminInfoEntity(){{
            setId(1L);
            setAdminNo("hh");
            setCreateTime(LocalDateTime.now());
            setUpdateTime(LocalDateTime.now());
        }};
        adminUserInfoRedis.setAdminInfo(entity);
    }

    @Test
    public void getTest(){
        AdminInfoEntity entity = adminUserInfoRedis.getAdminInfo(1L);
        System.out.println(entity);
    }
}
