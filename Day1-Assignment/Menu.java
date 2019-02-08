package myproject;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose a number: \n 1:addition \n 2:Substraction \n 3:Multi \n 4:division \n 5:Exit");
			int n=s.nextInt();
			System.out.println("Enter value of a:");
			int a=s.nextInt();
			System.out.println("Enter value of b:");
			int b=s.nextInt();
			switch(n)
			{
			case 1:
				int c=a+b;
				System.out.println("addition of two number is:"+c);
				break;
			case 2:
				int d=a-b;
				System.out.println("substraction of two number is:"+d);
				break;
			case 3:
				int e=a*b;
				System.out.println("Multiplication of two number is:"+e);
				break;
			case 4:
				float f=(float)a/b;
				System.out.println("Division of two number is:"+f);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Chosen Option is not valid");
				return;
			}

		}
	}

}
