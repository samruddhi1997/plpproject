package com.capgemini.airlinereservationsystem.service;

import java.sql.Date;

import com.capgemini.airlinereservationsystem.dao.CustomerDetailsDaoImpl;

import com.capgemini.airlinereservationsystem.dto.CustomerDetailsDto;

public class CustomerDetailsService {
	public static String searchForm(int customer_id) {
		CustomerDetailsDto add = new CustomerDetailsDto();
		add.setCustomer_id(customer_id);

		CustomerDetailsDaoImpl cdd = new CustomerDetailsDaoImpl();
		String res = cdd.searchForm();

		return res;
	}

}
