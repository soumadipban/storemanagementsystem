package com.capgemini.storemanagement.service;

import com.capgemini.storemanagement.dto.ProductInformation;
import com.capgemini.storemanagement.dto.UserInformation;

public interface ManufacturerService {
	public void addDealerDetail(UserInformation user);
	public boolean removeDealerDetail(int dealerId);
	public boolean updateDealerDetail(int dealerId,UserInformation user);
	public String showDealerDetail();
	public void addProductDetail(ProductInformation product);
	public boolean removeProductDetai(int productId);
	public boolean updateProductDetai(int productId,ProductInformation product);
	public String showProductDetai();
}
