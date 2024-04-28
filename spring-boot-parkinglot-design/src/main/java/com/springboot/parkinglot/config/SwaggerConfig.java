package com.springboot.parkinglot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
//	@Bean
//	public Docket parkingLotApi() {
//		return new Docket (DocumentationType.SWAGGER_2).groupName("ParkingLot-api").apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.
//				basePackage("com.springboot.parkinglot.controller")).build();
//	}
	 @Bean
	  public Docket parkingLotApi() {
	    return new Docket(DocumentationType.SWAGGER_2).select()
	        .apis(RequestHandlerSelectors.basePackage("com.springboot.parkinglot.controller")).build();
	  }
	
//	
//	private ApiInfo apiInfo() {		
//		return new ApiInfoBuilder().title("Parking Lot API")
//				.description("API Development Reference for Developers")
//				.termsOfServiceUrl("http://ParkingLot.com")
//				.license("BakeryLicense")
//				.licenseUrl("parkinglot@xxxxxx.com").version("1.0").build();
//				
//	}
	
	//localhost:8080/swagger-ui.html
		

}
