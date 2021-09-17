package com.product.productcatologservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ProductCatologServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatologServiceApplication.class, args);
	}

	@Bean("restTemplate")
	public RestTemplate getObject() {
		return new RestTemplate();
	}
}
