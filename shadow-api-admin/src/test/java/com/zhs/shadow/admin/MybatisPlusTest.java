package com.zhs.shadow.admin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhs.shadow.common.enums.Constants;
import com.zhs.shadow.domain.entity.city.GdCityEntity;
import com.zhs.shadow.domain.entity.config.ConfigInfoEntity;
import com.zhs.shadow.service.admin.write.AdminUserAccountWriteService;
import com.zhs.shadow.service.city.write.GdCityWriteService;
import com.zhs.shadow.service.config.write.ConfigInfoWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AdminApplication.class)
public class MybatisPlusTest {

    /**
     * 开始
     */
    private Logger logger = LoggerFactory.getLogger(MybatisPlusTest.class);

    @Autowired
    private AdminUserAccountWriteService adminUserAccountWriteService;
    @Autowired
    private GdCityWriteService gdCityWriteService;
    @Autowired
    private ConfigInfoWriteService configInfoWriteService;

    @Test
    public void listTest() {
        List<GdCityEntity> list = gdCityWriteService.list();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            GdCityEntity entity = list.get(i);
            entity.setId(Long.valueOf(i + 1));
            // entity.setAdcode(entity.getId().intValue());
            entity.setUpdateTime(LocalDateTime.now());
            UpdateWrapper<GdCityEntity> wrapper = new UpdateWrapper<>();
            wrapper.eq("adcode", entity.getAdcode());
            gdCityWriteService.updateById(entity);
        }
    }

    @Test
    public void insertTest() {
        List<ConfigInfoEntity> entityList = new ArrayList<ConfigInfoEntity>();
        for (int i = 10; i < 30; i++) {
            logger.info("第count={}次,time={}", i - 9, new Date());
            logger.info("生成开始time={}", System.currentTimeMillis());
            for (int j = i * 1000000; j < (i + 1) * 1000000; j++) {
                ConfigInfoEntity entity = new ConfigInfoEntity();
                entity.setConfigKey("key");
                entity.setConfigValue("key:" + i);
                entity.setState(0);
                entity.setCreateTime(LocalDateTime.now());
                entity.setUpdateTime(LocalDateTime.now());
                entity.setDeleted(Constants.DeleteState.NORMAL);
                entityList.add(entity);
            }
            logger.info("生成结束time={}", System.currentTimeMillis());
            logger.info("插入开始time={}", System.currentTimeMillis());
            configInfoWriteService.saveBatch(entityList);
            logger.info("插入结束time={}", System.currentTimeMillis());
        }
    }

}
