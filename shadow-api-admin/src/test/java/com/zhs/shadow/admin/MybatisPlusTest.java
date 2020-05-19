package com.zhs.shadow.admin;

import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhs.shadow.domain.entity.city.GdCityEntity;
import com.zhs.shadow.service.admin.write.AdminUserAccountWriteService;
import com.zhs.shadow.service.city.write.GdCityWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AdminApplication.class)
public class MybatisPlusTest {

    @Autowired
    private AdminUserAccountWriteService adminUserAccountWriteService;
    @Autowired
    private GdCityWriteService gdCityWriteService;

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
}
