package com.student.examination;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Sets;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
    @Bean

    public Docket productApi() {

        return new Docket(DocumentationType.SWAGGER_2)
        .select()
         .apis(RequestHandlerSelectors.any())
         .paths(PathSelectors.ant("/**"))
           .build().apiInfo(swaggerStaticApiInfo())
           .consumes(Sets.newHashSet("application/json"))
           .produces(Sets.newHashSet("application/json"));

    }
    
    private ApiInfo swaggerStaticApiInfo(){
    	return new ApiInfoBuilder()
    			.description("StudentRequest REstful Api will provide APi content in JSON format")
    			.title("Student API").build();
    }
    

}
