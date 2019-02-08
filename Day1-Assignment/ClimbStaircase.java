package myproject;
import java.util.Scanner;

public class ClimbStaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner (System.in);
		System.out.println("Enter the number of stairs:");
		int s=a.nextInt();
		System.out.println("Number of different ways =" + countWays(s));
	a.close();
		}
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	static int countWays(int s) {
		return fib(s+1);
	}

}
