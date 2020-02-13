package com.capgemini.storemanagement.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.storemanagement.exception.UserNotFoundException;
import com.capgemini.storemanagement.service.impl.AdminServiceImpl;

public class StoreManagementController {

	static Logger log = Logger.getLogger("store");

	public static void main(String[] args) {

		AdminServiceImpl service = new AdminServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {

			int count = 0;
			log.info("\n");
			log.info("\t\tSTORE MANAGEMENT SYSTEM ");
			log.info("\n");

			log.info("\t\t1.Admin");
			log.info("\t\t2.Manufacturer");
			log.info("\t\t3.Dealer");
			log.info("\t\t4.Exit");

			log.info("\t\t------------------------");
			log.info("\t\tEnter Your Choice");
			log.info("\t\t------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:

				if (count < 1) {
					count++;
					while (true) {
						log.info("\n");
						log.info("Enter your Id");
						int id = sc.nextInt();
						log.info("Enter your Name");
						String name = sc.next();
						log.info("Enter the password");
						String password = sc.next();

							boolean flag = service.login(name, password, id);
							if (flag) {
								log.info("Login Succesfull");
								break;
							} else {
								try {
									throw new UserNotFoundException("User Not Found");
								} catch (UserNotFoundException e) {
									log.info(e.getMessage());
								}
							}
					}
				}

				AdminController admin = new AdminController();
				admin.adminTask();

				break;

			case 2:

				ManufacturerController manufacturer = new ManufacturerController();
				manufacturer.manufacturerTask();
				break;

			case 3:

				DealerController dealer = new DealerController();
				dealer.dealerTask();
				break;

			}
		} while (choice != 4);

		log.info("\t\tThankYou for using our Services!!!");

	}
	

}
