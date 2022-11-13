package com.bosch.dynamicform.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

/*@Configuration
@EnableAutoConfiguration
@EnableSwagger2*/
public class SwaggerConfig {

   /* @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.bosch.dynamic_form")).paths(PathSelectors.any())
                .build().apiInfo(apiInfo()).securitySchemes(Arrays.asList(apiKey()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Dynamic form Controller").description("Mobility solution space controllers").build();
    }

    private ApiKey apiKey() {
        return new ApiKey("Authorization", "api_key", "header");
    }*/
}
