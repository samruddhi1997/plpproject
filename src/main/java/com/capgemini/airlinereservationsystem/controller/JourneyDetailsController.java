package com.capgemini.airlinereservationsystem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;

import com.capgemini.airlinereservationsystem.service.JourneyDetailsService;
import com.capgemini.airlinereservationsystem.service.ScheduleDetailsService;

public class JourneyDetailsController {
	static org.apache.log4j.Logger log = LogManager.getLogger("customer");

	public static void journey() {

		Scanner scan = new Scanner(System.in);

		log.info("Please enter below details\n");
		log.info("Flight ID: ");
		int flight_id = scan.nextInt();
          JourneyDetailsService.journeyDetails(flight_id);
	}

}
