package myproject;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		int a, m=0, flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=s.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" is not prime number");
		}
		else {
			for(a=2;a<=m;a++)
			{
				if(n%a==0)
				{
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(n+" is prime number");
			}
		}
	}

}
