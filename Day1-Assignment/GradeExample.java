package myproject;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of student:");
		int i=s.nextInt();
		if(i>=50 && i<=60)
		{
			System.out.println("Pass");
		}
		else if (i>=60 && i<=74)
		{
			System.out.println("First Class");
		}
		else if (i>=75)
		{
			System.out.println("Distinction");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}
