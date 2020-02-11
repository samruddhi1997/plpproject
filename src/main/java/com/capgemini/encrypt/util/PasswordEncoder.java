package com.capgemini.encrypt.util;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {
	Logger log = LogManager.getLogger("");
public static String passwordEncoder(String plainPassword) {
	return BCrypt.hashpw(plainPassword, BCrypt.gensalt());//used to generate the password
	
}
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the password");
	String plainPassword = sc.nextLine();
	passwordEncoder(sc.nextLine());
	sc.close();
	
}


}
