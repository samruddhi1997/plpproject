package com.capgemini.airlinereservationsystem.service;

import com.capgemini.airlinereservationsystem.dao.JourneyDetailsDaoImpl;
import com.capgemini.airlinereservationsystem.dto.JourneyDetailsDto;

public class JourneyDetailsService {
	public static String journeyDetails(int flight_id) {
		JourneyDetailsDto add = new JourneyDetailsDto();
		add.setFlight_id(flight_id);

		JourneyDetailsDaoImpl jddi = new JourneyDetailsDaoImpl();
		return jddi.journeyDetails();
	}
}
