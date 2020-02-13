package com.capgemini.controller.module;

import java.util.Scanner;

import com.capgemini.dao.CommonDaoImpl;
import com.capgemini.service.CommonService;

public class StoreManagementController {
	static CommonService service;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		

		Thread.sleep(1000);

		//log.trace("1.Admin");
		System.out.println("2.Manufacture");
		System.out.println("3.Dealer");
		System.out.println("4.Exit");

		int count = 0;

		do {

			System.out.println("------------------------");
			System.out.println("Enter Your Choice");
			System.out.println("------------------------");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				if(count<1) {
					count++;
					System.out.println("Enter Your Username:");
					String name = sc.next();
					System.out.println("Enter Your Password:");
					String password = sc.next();
					service.login(name, password);
					System.out.println("Successfully Login");
				}
				CommonDaoImpl common = new CommonDaoImpl();
				common.login("Soumadip", "hello");

				break;

			case 2:

				//Something there
			}
		}while(choice!=4);

		System.out.println("ThankYou for using our Services!!!");

	}

}
