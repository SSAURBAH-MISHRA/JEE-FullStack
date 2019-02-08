package myproject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int number=s.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);

	}

}
