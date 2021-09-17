package com.product.productratingservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.productratingservice.model.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@RequestMapping("/{productId}")
	public List<Rating> getRatings(@PathVariable String productId) {
		List<Rating> list=new ArrayList<Rating>();
		list.add(new Rating("1234",4));
		list.add(new Rating("3456",3));
		return list;
	}

}
