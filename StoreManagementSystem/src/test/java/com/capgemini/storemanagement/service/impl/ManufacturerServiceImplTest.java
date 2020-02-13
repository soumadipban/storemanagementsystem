package com.capgemini.storemanagement.service.impl;

import org.junit.jupiter.api.Test;

import com.capgemini.storemanagement.dto.ProductInformation;
import com.capgemini.storemanagement.dto.UserInformation;
import com.capgemini.storemanager.util.PasswordEncoder;

class ManufacturerServiceImplTest {

	ManufacturerServiceImpl manufacturer = new ManufacturerServiceImpl();

	@Test
	void addDealerTest() {
		String password = PasswordEncoder.passwordEncoder("soumadip@123Ban");
		manufacturer.addDealerDetail(
				new UserInformation(13, "george", password, "8017740129", "Germany", "george@gmail.com", "dealer"));
	}

	@Test
	void removeDealerTest() {
		manufacturer.removeDealerDetail(2);
	}

	@Test
	void modifyDealerTest() {
		String password = PasswordEncoder.passwordEncoder("soumadip@123Ban");
		manufacturer.updateDealerDetail(3,
				new UserInformation(3, "george", password, "8017740129", "Germany", "george@gmail.com", "dealer"));
	}

	@Test
	void viewAllDealers() {
		manufacturer.showDealerDetail();
	}

	@Test
	void addProductTest() {
		manufacturer.addProductDetail(new ProductInformation(12, "shoe", "addidas", 12, 500, 0));
	}

	@Test
	void modifyProductTest() {
		manufacturer.updateProductDetai(12, new ProductInformation(12, "shoe", "addidas", 12, 500, 0));
	}

	@Test
	void removeProduct() {
		manufacturer.removeProductDetai(12);
	}

	void showProduct() {
		manufacturer.showProductDetai();
	}
}
