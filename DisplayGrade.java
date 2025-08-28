//GRADE CALCULATOR- NESTED TERNARY OPERATOR EXAMPLE
package com.codegnan.fundamentals;
import java.util.Scanner;
public class DisplayGrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks= sc.nextInt();
		char grade = (marks >=90)? 'O':
			(marks>=80)?'S':
				(marks >=70)?'A':
					(marks>=60)?'B':
						(marks>=50)?'C':
							(marks>=40)?'D':'F';
		System.out.println("Grade obtained for "+marks+ " marks is : "+ grade);
		sc.close();
	}

}
