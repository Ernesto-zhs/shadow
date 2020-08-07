package com.zhs.shadow.admin.config.resolve;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger在线文档配置<br>
 * 项目启动后可通过地址：http://host:ip/swagger-ui.html 查看在线文档
 * @author Austin
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket adminDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("admin")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhs.shadow.admin.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("shadow-admin API")
                .description("shadow-admin管理后台API")
                .termsOfServiceUrl("https://github.com/Ernesto-zhs/shadow.git")
                .contact("https://github.com/Ernesto-zhs/shadow.git")
                .version("1.0")
                .build();
    }
}
