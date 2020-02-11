package com.capgemini.airlinereservationsystem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dao.ScheduleDetailsDaoImpl;
import com.capgemini.airlinereservationsystem.exception.InvalidOptionException;
import com.capgemini.airlinereservationsystem.validation.CustomerDetailsValidation;

public class UserMainController {
	static Logger log = new LogManager().getLogger("user");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		log.info("Welcome to Airline Reservation System...");
		// log.info("\nMenu");
		log.info("Please Enter your choice");
		//log.info("press 1 for Customer Details");
		//int x = sc.nextInt();
		//CustomerDetailsController.checkCustomer();
		//CustomerDetailsValidation.customerValidation();
//		log.info("please press 2 to get Schedule Details");
//		 int y = sc.nextInt();
//		 ScheduleDetailsController.schedule();
		log.info("please press 3 to get Journey Deatails");
		 int z = sc.nextInt();
		 JourneyDetailsController.journey();

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			CustomerDetailsController.checkCustomer();

			break;
		case 2:
			ScheduleDetailsController.schedule();
			break;
		case 3:
			JourneyDetailsController.journey();
		default:
			log.info("invalid choice");
			break;
		}
		sc.close();

	}

}
