package com.product.productinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.productinfoservice.model.ProductInfo;

@RestController
@RequestMapping("/productinfo")
public class ProductInfoController {
	@RequestMapping("/{productId}")
	public ProductInfo getProductInfo(@PathVariable String productId) {
    return new ProductInfo("1234","Test Product");
	}

}
