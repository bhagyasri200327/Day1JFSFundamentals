package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance=60000;
		int pin=1234; //original pin
		System.out.println("Enter your pin: ");
		int enteredPin = sc.nextInt();
		if (enteredPin != pin) {
			System.out.println("Incorrect Pin. Existing");
			
		}
		int choice;
		do {
			System.out.println("||=============================||");
			System.out.println("||==========ATM MENU===========||");
			System.out.println("||=======1.Check Balance=======||");
			System.out.println("||==========2.Deposit==========||");
			System.out.println("||=========3.WithDrawl=========||");
			System.out.println("||============4.Exit===========||");
			System.out.println("||=============================||");
			System.out.println("Enter your choice : ");
			choice= sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Your Balance is : "+balance);
			break;
			case 2: 
				System.out.println(" Enter Deposit amount : ");
				double depositAmount=sc.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please Deposit multiples" + " Hundred like  [100,400,700]");
				}else {
					if(depositAmount<500) {
						System.out.println("Please Deposit more than 500 rupees." + "minimum deposit is 500");
					}else {
						balance+=depositAmount;
						System.out.println("Deposit $"+ depositAmount + "amount successfully.New Balance is : $"+ balance);
					}
				break;
				}
			case 3:
				System.out.println("Enter Withdrawl Amount :");
				double withdrawAmount=sc.nextDouble();
				if(withdrawAmount%100!=0) {
					System.out.println("Please withdraw multiples" + " Hundred like  [100,400,700]");
				}else {
					if(withdrawAmount<500) {
						System.out.println("Please withdraw more than 500 rupees." + "minimum deposit is 500");
					}else {
						if(withdrawAmount<=balance) {
						balance-=withdrawAmount;
						System.out.println("Withdraw $"+ withdrawAmount + "amount successfully.New Balance is : $"+ balance);
					}else {
						System.out.println("Insufficient Funds!");
					}
				}
				break;
				}
			case 4:	
				
				System.out.println("Existing....Thank you for using ATM machine!");
				break;
			default :
				System.out.println("Invalid Request!");
				break;
			} }while(choice!=4);
			sc.close();
			
		}
}