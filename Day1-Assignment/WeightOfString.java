package myproject;

import java.util.Scanner;

public class WeightOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, s1=0;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner (System.in);
		String a=sc.nextLine();
		char[] ar= a.toUpperCase().toCharArray();
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]>='A' && ar[i]<='Z')
			{
				s1=s1+ar[i]-64;
			}
		}
		System.out.println(s1);
		sc.close();
	}

}
