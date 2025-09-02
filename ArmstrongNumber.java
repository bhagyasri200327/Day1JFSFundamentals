package com.codegnan.controlstatements;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int count=0, temp=num, originalNum=num, sum=0;
		while(num>0) {
			num/=10;
			count++;
			
		}
		 while (temp!= 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, count);
	            temp /= 10;
	        }

	        // Output result
	        if (sum == originalNum)
	            System.out.println(originalNum + " is an Armstrong number.");
	        else
	            System.out.println(originalNum + " is not an Armstrong number.");
			
		sc.close();
	}

}
