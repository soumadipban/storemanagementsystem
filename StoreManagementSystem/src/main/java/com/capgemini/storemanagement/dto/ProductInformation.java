package com.capgemini.storemanagement.dto;


public class ProductInformation {

	private int productId;
	private String productName;
	private String productBrand;
	private int quantity;
	private int costPrice;
	private int sellingPrice;
	
	
	
	public ProductInformation() {
		super();
	}
	
	
	
	public ProductInformation(int productId, int sellingPrice) {
		super();
		this.productId = productId;
		this.sellingPrice = sellingPrice;
	}



	public ProductInformation(int productId, String productName, String productBrand, int quantity, int costPrice,
			int sellingPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.quantity = quantity;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	
	
	
}
