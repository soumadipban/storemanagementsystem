package com.capgemini.storemanagement.service.impl;

import com.capgemini.storemanagement.dao.impl.ManufacturerDaoImpl;
import com.capgemini.storemanagement.dto.ProductInformation;
import com.capgemini.storemanagement.dto.UserInformation;
import com.capgemini.storemanagement.service.ManufacturerService;
public class ManufacturerServiceImpl implements ManufacturerService {
	
	ManufacturerDaoImpl manufacturer = new ManufacturerDaoImpl();

	public void addDealerDetail(UserInformation user) {
		manufacturer.addDealerDetail(user);
		
	}

	public boolean removeDealerDetail(int dealerId) {
		return manufacturer.removeDealerDetail(dealerId);
		
	}

	public boolean updateDealerDetail(int dealerId, UserInformation user) {
		return manufacturer.updateDealerDetail(dealerId, user);
		
	}

	public String showDealerDetail() {
		String result = manufacturer.showDealerDetail();
		return result;
	}

	public void addProductDetail(ProductInformation product) {
		manufacturer.addProductDetail(product);
		
	}

	public boolean removeProductDetai(int productId) {
		return manufacturer.removeProductDetai(productId);
	}

	public boolean updateProductDetai(int productId, ProductInformation product) {
		return manufacturer.updateProductDetai(productId, product);
	}

	public String showProductDetai() {
		String result = manufacturer.showProductDetai();
		return result;
	}
	
	

}
