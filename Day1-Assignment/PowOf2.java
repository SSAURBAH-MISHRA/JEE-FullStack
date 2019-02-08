package myproject;

import java.util.*;

public class PowOf2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int number =in.nextInt();
		in.close();
		if(isPowOfTwo(number))
		{
			System.out.println("power of 2");
		}
		else {
			System.out.println("not power of 2");
		}
	}
	private static boolean isPowOfTwo(int number)
	{
		if(number%2!=0)
		{
			return false;
		}
		else {
			for(int i=0; i<=number;i++) {
				if(Math.pow(2,i)==number)
					return true;
			}
		}
		return false;
	}
	}

