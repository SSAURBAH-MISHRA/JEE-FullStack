package myproject;

import java.util.*;

public class PowOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int number =in.nextInt();
		in.close();
		if(isPowOfTwo(number))
		{
			System.out.println("power of 10");
		}
		else {
			System.out.println("Nor power of 10");
		}
	}
	private static boolean isPowOfTwo(int number)
	{
		if(number%10!=0)
		{
			return false;
		}
		else {
			for(int i=0; i<=number;i++) {
				if(Math.pow(10,i)==number)
					return true;
			}
		}
		return false;
	}
	}