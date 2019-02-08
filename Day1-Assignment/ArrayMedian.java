package myproject;
import java.util.Scanner;

public class ArrayMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int[] res=new int[a1+b1];
		for(int i=0;i<a1;i++) {
			a[i]=sc.nextInt();
			res[i]=a[i];
		}
		for(int i=0;i<b1;i++) {
			b[i]=sc.nextInt();
			res[i+a1]=b[i];
		}
		int temp;
		int sum=a1+b1;
		for(int i=0; i < (a1+b1); i++){  
            for(int j=1; j < ((a1+b1)-i); j++){  
                     if(a[j-1] > a[j]){ 
                            temp = a[j-1];  
                            a[j-1] = a[j];  
                            a[j] = temp;  
                    }  
                     
            }
        }
		if(sum%2!=0) {
			System.out.println("Median is: "+res[(sum+1)/2]);
		}
		else
		{
			int x=res[sum/2];
			int y=res[(sum/2)-1];
			System.out.println("Median is: "+(x+y)/2);
		}sc.close();

	}

}