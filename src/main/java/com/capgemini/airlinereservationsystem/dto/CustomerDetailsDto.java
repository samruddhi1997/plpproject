package com.capgemini.airlinereservationsystem.dto;

import java.sql.Date;

public class CustomerDetailsDto {
	static private int customer_id;
	static private String customer_name;
	static private String password;
	static private Date dob;
	static private long phone_number;
	static private String email;
	static private String govt_id;
	static private String gender;
	static private String nationality;

	public static int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		CustomerDetailsDto.customer_id = customer_id;
	}

	public static String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		CustomerDetailsDto.customer_name = customer_name;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		CustomerDetailsDto.password = password;
	}

	public static Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		CustomerDetailsDto.dob = dob;
	}

	public static long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		CustomerDetailsDto.phone_number = phone_number;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		CustomerDetailsDto.email = email;
	}

	public static String getGovt_id() {
		return govt_id;
	}

	public void setGovt_id(String govt_id) {
		CustomerDetailsDto.govt_id = govt_id;
	}

	public static String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		CustomerDetailsDto.gender = gender;
	}

	public static String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		CustomerDetailsDto.nationality = nationality;
	}

}
