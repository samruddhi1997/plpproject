package com.capgemini.airlinereservationsystem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;

import com.capgemini.airlinereservationsystem.service.ScheduleDetailsService;

public class ScheduleDetailsController {
	static org.apache.log4j.Logger log = LogManager.getLogger("customer");
	

	public static void schedule() {

		Scanner scan = new Scanner(System.in);

		log.info("Please enter below details\n");
		log.info("Flight ID: ");
		int flight_id = scan.nextInt();
		
		
		String result = ScheduleDetailsService.scheduleFlight(flight_id);
		log.info(result);
		if(result != null) {
			System.out.println("Flight successfully added");
		}
		else {
			System.out.println("oops.. check back with details");
		}
	}

}
