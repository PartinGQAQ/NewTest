package com.example.demo32323.config;


import com.example.demo32323.anno.Myanno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static com.google.common.base.Predicates.not;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        //API的介绍文档
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(
                        new Contact(
                                "马瑞祺", //发布者名称
                                "http://www.baidu.com", //网站地址
                                "17809@qq.com" //文档发布者的电子邮箱📮
                        )
                )
                .title("Swagger学习帮助文档")
                .description("该文档是马瑞祺用来学习Swagger2的测试用的")
                .version("1.2")
                .build();
        docket.apiInfo(apiInfo);
        //配置上下文信息


        //返回
        docket = docket
                    .select()
                    .apis(not(RequestHandlerSelectors.withMethodAnnotation(Myanno.class))).build();




        return docket;
    }
}
