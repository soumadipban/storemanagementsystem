package com.capgemini.storemanagement.dto;

public class DealerSellingStockInfomation {

	private int productId;
	private int quantity;
	private int toalPrice;
	
	

	public DealerSellingStockInfomation() {
		super();
	}

	public DealerSellingStockInfomation(int productId, int quantity, int toalPrice) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.toalPrice = toalPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getToalPrice() {
		return toalPrice;
	}

	public void setToalPrice(int toalPrice) {
		this.toalPrice = toalPrice;
	}
}
