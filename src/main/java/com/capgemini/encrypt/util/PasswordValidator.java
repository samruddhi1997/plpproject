package com.capgemini.encrypt.util;

import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordValidator {
public static void passwordValidator(String plainPassword,String hashedPassword) {
	BCrypt.checkpw(plainPassword,hashedPassword);
	
}
//public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter password");
	String plainPassword = sc.nextLine();
	String hashedPassword = PasswordEncoder.passwordEncoder(sc.nextLine());
	System.out.println(hashedPassword);
	System.out.println("enter password to matched");
	String password = sc.nextLine();
	if(passwordValidator(password,hashedPassword)) {	
	System.out.println("password matches");
	}else {
		System.out.println("invalid password");
	}
	passwordValidator(plainPassword,hashedPassword);
	sc.close();
	
}
//}
