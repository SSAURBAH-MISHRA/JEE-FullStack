package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		while(true)
		{
		// TODO Auto-generated method stub
		boolean status=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
		String a=sc.next();
		System.out.println("Enter Second String:");
		String b=sc.next();
		if(a.length()==b.length())
		{
			status=false;
		}
		char[] ArrayA= a.toLowerCase().toCharArray();
		char[] ArrayB= b.toLowerCase().toCharArray();
		Arrays.sort(ArrayA);
		Arrays.sort(ArrayB);
		status=Arrays.equals(ArrayA, ArrayB);
		if(status)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		}

}
}