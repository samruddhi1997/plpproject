package com.capgemini.airlinereservationsystem.controller;

import java.sql.Date;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.exception.InvalidOptionException;
import com.capgemini.airlinereservationsystem.service.CustomerDetailsService;


public class CustomerDetailsController {
	static Logger log = new LogManager().getLogger("user");

	public static void checkCustomer() {
		Scanner sc = new Scanner(System.in);
		
//		long phone_number;
//		Date dob;
//		String nationality;
//		String res = CustomerSearchResultFormService.searchForm(customer_id, customer_name, password, dob, phone_number, email, govt_id, gender, nationality);
//	    log.info("info");
		
		log.info("please enter customerId:");
		
		try {
			int customer_id=sc.nextInt(); 
			log.info(CustomerDetailsService.searchForm(customer_id));
			
		}catch(InvalidOptionException e) {
			log.info(e.getMessage());
		}

	
		
		
		
		
		
//		if(res!=null) {
//			System.out.println("successfully logged in");
//		}else {
//			System.out.println("invalid customer_id");
//		}

	}

}
