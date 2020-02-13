package com.capgemini.storemanagement.service;


import com.capgemini.storemanagement.dto.DealerSellingStockInfomation;
import com.capgemini.storemanagement.dto.OrderInformation;
import com.capgemini.storemanagement.dto.ProductInformation;

public interface DealerService {

	public void orderProduct(OrderInformation order);
	public void changePriceOfProduct(int productId,ProductInformation product);
	public int returnProductId(String productName);
	public String showOrderDetail();
	public void addStorage(DealerSellingStockInfomation stock);
	public int quantityChecker(int id);
	public int returnCostPrice(int id);
	public void updateProduct(int id, int remainingQuantity);
	public boolean checkProductId(int id);
}
