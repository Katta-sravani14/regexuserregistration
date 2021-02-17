package com.regexday9.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
;

public class regex {
	// UC4 - Mobile Format
	public static boolean mobile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
		String m = sc.nextLine();
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m) == true)
			System.out.println("Valid Mobile");
		else {
			System.out.println("Invalid Mobile");
		}
		
		//boolean t=Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m);
		//System.out.println(t);
		return Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m);
		
	}
	public static void main(String[] args) {
		new regex().mobile();
	}
}