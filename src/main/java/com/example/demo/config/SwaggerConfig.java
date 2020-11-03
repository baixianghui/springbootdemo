package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages= {"com.example.demo.controller"})
public class SwaggerConfig {
	@Bean
    public Docket config() {
		 Docket docket =  new Docket(DocumentationType.SWAGGER_2);
         ApiInfo apiInfo =   new ApiInfoBuilder()
	                .title("XXX API")
	                .contact(new Contact("", "http://", ""))
	                .build();
        docket.apiInfo(apiInfo);  
        docket.select().apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).
        apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();  
        return docket;
    }		
}
