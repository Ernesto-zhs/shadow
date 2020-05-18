package com.zhs.shadow.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 管理端启动类
 * @author Austin
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zhs.shadow.dao.mapper")
@ComponentScan(basePackages = {"com.zhs.shadow"})
public class AdminApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
