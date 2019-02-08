package myproject;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,p,r;
		int sum=0;
		int sn;
		System.out.println("Enter the number:");
		Scanner a= new Scanner (System.in);
		n= a.nextInt();
		sn=n;
		while(n!=0)
		{
			i=1;
			p=1;
			r=n%10;
			while(i<=r)
			{
				p=p*i;
				i++;
			}
			sum=sum+p;
			n=n/10;
		}
		if(sum==sn)
		{
			System.out.println(sn+" is a strong number.");
		}
		else {
			System.out.println(sn+" is not a strong number.");
		}
		a.close();
	}

}
