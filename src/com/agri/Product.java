package com.agri;

public class Product {
	public Product(String product_name, String product_details, int unit, int price, String seller_name) {
		super();
		this.product_name = product_name;
		this.product_details = product_details;
		this.unit = unit;
		this.price = price;
		this.seller_name = seller_name;
	}
	public Product() {}
	private String product_name;
	private String product_details;
	private int unit;
	private int price;
	private String seller_name;
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
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", product_details=" + product_details + ", unit=" + unit
				+ ", price=" + price + ", seller_name=" + seller_name + "]";
	}
}
