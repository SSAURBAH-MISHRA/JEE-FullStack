package myproject;
import java.util.Arrays;
import java.util.Scanner;

public class PangramDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       String n=sc.nextLine().replaceAll(" ","").toLowerCase().trim();
	       char a[]=n.toCharArray();
	       Arrays.sort(a);
	       int ar[]=new int[26];
	       for(int i=0;i<26;i++) {
	    	  ar[i]=0; 
	       }
	       for(int i=0;i<a.length;i++) {
	    	   ar[a[i]-97]+=1;
	       }
	       for(int i=0;i<26;i++) {
	    	   if(ar[i]==0) {
	    		   System.out.print((char)(i+97)+",");
	    	   }sc.close();
	       }	   

	}

}