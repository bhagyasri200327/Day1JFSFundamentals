package com.codegnan.controlstatements;
import java.util.Scanner;
public class WelcomeMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city Name : ");
		String city = sc.next();
		if(city.equalsIgnoreCase("hyderabad")) {
			System.out.println("Hello Hyderabadi......Aadaab");
		}else {
			if(city.equalsIgnoreCase("banglore")) {
				System.out.println("Hello Kannadiga......Namaskara");
			}else {
				if(city.equalsIgnoreCase("chennai")) {
					System.out.println("Hello Madrasi..... Vanakkam");
				}else {
					System.out.println("Enter Valid City Name!");
				}
			}
			
		}
	sc.close();
	}

}
