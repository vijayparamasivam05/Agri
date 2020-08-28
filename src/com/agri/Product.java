package com.agri;

public class Product {
	
	private String product_name;
	private String product_details;
	private int unit;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String product_name, String product_details, int unit, int price) {
		super();
		this.product_name = product_name;
		this.product_details = product_details;
		this.unit = unit;
		this.price = price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_details() {
		return product_details;
	}

	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", product_details=" + product_details + ", unit=" + unit
				+ ", price=" + price + "]";
	}


}
