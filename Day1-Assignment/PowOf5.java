package myproject;

import java.util.Scanner;

public class PowOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int number =in.nextInt();
		in.close();
		if(isPowOfTwo(number))
		{
			System.out.println("power of 5");
		}
		else {
			System.out.println("not power of 5");
		}
	}
	private static boolean isPowOfTwo(int number)
	{
		if(number%5!=0)
		{
			return false;
		}
		else {
			for(int i=0; i<=number;i++) {
				if(Math.pow(5,i)==number)
					return true;
			}
		}
		return false;
	}

	}
