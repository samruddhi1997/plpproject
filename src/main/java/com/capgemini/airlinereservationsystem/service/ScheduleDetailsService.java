package com.capgemini.airlinereservationsystem.service;

import com.capgemini.airlinereservationsystem.dao.ScheduleDetailsDaoImpl;
import com.capgemini.airlinereservationsystem.dto.ScheduleDetailsDto;

public class ScheduleDetailsService {
	public static String scheduleFlight(int flight_id) {

		ScheduleDetailsDto add = new ScheduleDetailsDto();
		add.setFlight_id(flight_id);

		ScheduleDetailsDaoImpl daoImpl = new ScheduleDetailsDaoImpl();
		return daoImpl.scheduleFlight();
	}
}
