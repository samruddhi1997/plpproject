package com.capgemini.airlinereservationsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dto.ScheduleDetailsDto;

public class ScheduleDetailsDaoImpl implements ScheduleDetailsDao {

	static Logger log = new LogManager().getLogger("customer");

	@Override
	public String scheduleFlight() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl = "jdbc:mysql://localhost:3306/airline_reservation_system_db";
			con = DriverManager.getConnection(dburl, "root", "system");

			String query = "select*  from flight_details where flight_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 3);

			ResultSet rs = pstmt.executeQuery();

			String result = "";
			while (rs.next()) {


				result = result +"\n" + "flight_id = "+rs.getInt("flight_id")+"\n"+rs.getString("flight_day") + "\t\t" + rs.getString("source") +
						"\t\t" + rs.getString("destination") + "\t\t" +rs.getTime("departure_time") + 
						"\t\t" +   rs.getTime("arrival_time");
					
						

			}

			log.info(result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {

			}
		}
		return null;

	}

}
