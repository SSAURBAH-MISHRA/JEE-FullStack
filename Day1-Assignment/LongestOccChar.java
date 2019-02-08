package myproject;
import java.util.Scanner;

public class LongestOccChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		 Scanner b=new Scanner(System.in);
	        String a=b.next().toLowerCase();
	        int max=-1;
	        int i=1;
	        int c=1;
	        int[] ar=new int[26];
	        for(i=0;i<26;i++)
	        	ar[i]=1;
	        i=1;
	        while(i!=a.length()) {
	        	if(a.charAt(i)==a.charAt(i-1))
	        	{
	        		ar[a.charAt(i)-97]+=1;
	        		
	        	}
	        	i++;
	        }
	        int ind=0;;
	        for(i=0;i<26;i++)
	        {
	        	if(max<ar[i])
	        	{
	        		max=ar[i];
	        	    ind=i;
	        	}
	        }
        System.out.println("Longest occrence character is: "+(char)(ind+97)+" and length is: "+max);
        b.close();
	}

}