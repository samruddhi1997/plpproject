package com.capgemini.airlinereservationsystem.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.airlinereservationsystem.dto.CustomerDetailsDto;


public class CustomerDetailsDaoImpl implements CustomerDetailsDao {
	static Connection conn = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	public  String searchForm() {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl = "jdbc:mysql://localhost:3306/airline_reservation_system_db";
			conn = DriverManager.getConnection(dburl, "root", "system");

			String query = "select * from customer_details where customer_id=?";
			ps= conn.prepareStatement(query);
			ps.setInt(1, CustomerDetailsDto.getCustomer_id());//change the names
			
			rs = ps.executeQuery();
			String result =" ";
			while (rs.next()) {
			  
				
				
				
				result = result +"\n" + "customer_id ="+rs.getInt("customer_id") +"\n" + rs.getString("customer_name") +
						"\t\t" + rs.getString("password") + "\t\t" +rs.getLong("phone_number") + "\t\t" +   rs.getString("email")
						+"\t\t" +rs.getString("govt_id") +"\t\t" + rs.getString("gender") +"\t\t"
						+  rs.getString("nationality");
                    
			}
			return result;

		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return null;
	}

}
