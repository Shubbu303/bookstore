package com.project.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket bookStoreApiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().paths(PathSelectors.any())
				.build().apiInfo(getInfo());
	}
	
	private ApiInfo getInfo() {
		return new ApiInfoBuilder().title("Book store").description("Book store ").build();
	}

}
