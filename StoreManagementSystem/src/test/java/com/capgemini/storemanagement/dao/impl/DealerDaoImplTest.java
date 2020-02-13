package com.capgemini.storemanagement.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.storemanagement.dto.DealerSellingStockInfomation;
import com.capgemini.storemanagement.dto.ProductInformation;
import com.capgemini.storemanagement.service.impl.DealerServiceImpl;

class DealerDaoImplTest {
	DealerServiceImpl dealer = new DealerServiceImpl();
	
	@Test
	void changePriceOfProductTest() {
		dealer.changePriceOfProduct(4,new ProductInformation(4,300));
	}
	
	@Test
	void showOrderDetailTest() {
		dealer.showOrderDetail();
	}
	
	@Test
	void returnProductIdTest() {
		dealer.returnProductId("deo");
	}
	
	@Test
	void addStorageTest() {
		dealer.addStorage(new DealerSellingStockInfomation(5,30,5000));
	}
	
	@Test
	void updateProductTest() {
		dealer.updateProduct(4, 50);
	}
	@Test
	void returnCostPriceTest() {
		dealer.returnCostPrice(4);
	}
	@Test
	void checkProductIdTest() {
		dealer.checkProductId(4);
	}
	@Test
	void updateQuantityTest() {
		dealer.updateQuantity(4,33);
	}
	@Test
	void dealerQuantityTest() {
		dealer.dealerQuantity(4);
	}
	
	
}
