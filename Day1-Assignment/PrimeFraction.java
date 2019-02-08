package myproject;
import java.util.Scanner;

public class PrimeFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      n = sc.nextInt();
	      
	      for(int i = 2; i< n; i++) {
	         while(n%i == 0) {
	            System.out.println(i+" ");
	            n = n/i;
	         }
	      }
	      if(n >2) {
	         System.out.println(n);
	      }sc.close();

	}

}
