package myproject;

import java.util.Scanner;

public class fibSeries {

	public static void main(String[] args) {
		int i, a=0, b=0, c=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of i:");
		i=s.nextInt();
		System.out.println("Fibonacci Series:");
		for(int j=1; j<=i; j++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
		
	}

}