package com.product.productcatologservice.model;

public class Product {
	private String productName;
	private String productDescription;
	private int rating;
	public Product() {}
	public Product(String productName, String productDescription,int rating) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.rating=rating;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	

}
