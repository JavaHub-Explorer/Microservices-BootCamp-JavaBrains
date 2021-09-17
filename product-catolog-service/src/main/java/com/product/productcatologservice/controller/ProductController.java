package com.product.productcatologservice.controller;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.productcatologservice.model.Product;
import com.product.productcatologservice.model.ProductInfo;
import com.product.productcatologservice.model.Rating;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/{productId}")
	public List<Product> getProductDetails(@PathVariable("productId") String productId) {
		ResponseEntity<Rating[]> rseponse =restTemplate.getForEntity("http://localhost:8083/ratings/foo",Rating[].class);
		Rating[] ratings=rseponse.getBody();
		/*List<Rating> ratings= Arrays.asList(
				new Rating("1234",4),
				new Rating("3456",3)
				);*/
				
				
		return Arrays.asList(ratings).stream().map(rating->{
			ProductInfo product=restTemplate.getForObject("http://localhost:8082/productinfo/"+rating.getProductId(), ProductInfo.class);
			 return new Product(product.getProductName(),"Blue Denim Shirt",rating.getRating());
		}).collect(Collectors.toList());
		

	}

}
