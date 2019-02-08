package myproject;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter a String:");
		Scanner a= new Scanner (System.in);
		str= a.nextLine();
		boolean[] alphalist= new boolean[26];
		int index=0;
		int flag=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				index=str.charAt(i)-'A';
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				index=str.charAt(i)-'a';
			}
			alphalist[index]=true;
		}
		for(int i=0;i<=25;i++) {
			if(alphalist[index]==false) {
				flag=0;}
		}
		System.out.println("String:" + str);
		if (flag==1)
		{
			System.out.println("\n The above string is a pangram.");
		}else {
			System.out.println("\n The above string is not a pangram.");}a.close();
	}
}
