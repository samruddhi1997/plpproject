package com.capgemini.airlinereservationsystem.dto;

public class JourneyDetailsDto {
	static int flight_id;
	static private String flight_day;
	static private  String source;
	static private String destination;
	static private String departure_time;
	static  private String arrival_time;
	public static int getFlight_id() {
		return flight_id;
	}
	public  void setFlight_id(int flight_id) {
		JourneyDetailsDto.flight_id = flight_id;
	}
	public static String getFlight_day() {
		return flight_day;
	}
	public void setFlight_day(String flight_day) {
		JourneyDetailsDto.flight_day = flight_day;
	}
	public static String getSource() {
		return source;
	}
	public void setSource(String source) {
		JourneyDetailsDto.source = source;
	}
	public static String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		JourneyDetailsDto.destination = destination;
	}
	public static String getDeparture_time() {
		return departure_time;
	}
	public static void setDeparture_time(String departure_time) {
		JourneyDetailsDto.departure_time = departure_time;
	}
	public static String getArrival_time() {
		return arrival_time;
	}
	public static void setArrival_time(String arrival_time) {
		JourneyDetailsDto.arrival_time = arrival_time;
	}

	
}
