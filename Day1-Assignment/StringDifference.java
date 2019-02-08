package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class StringDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter new String: ");
		 Scanner sc=new Scanner(System.in);
	       String n=sc.nextLine().replaceAll(" ","").toLowerCase().trim();
	       char a[]=n.toCharArray();
	       Arrays.sort(a);
	       char[] g_string="abcdefghijklmnopqrstuvwxyz".trim().toLowerCase().toCharArray();
	       Arrays.sort(g_string);
	       int m[]=new int[26];
	       int o[]=new int[26];
	       for(int i=0;i<26;i++) {
	    	   m[i]=0;
	    	   o[i]=0;
	       }
	       for(int i=0;i<g_string.length;i++) {
	    	   m[g_string[i]-97]+=1;
	       }
	       
	       for(int i=0;i<a.length;i++) {
	    	   o[a[i]-97]+=1;
	       }
	       for(int i=0;i<26;i++) {
	    	   if(m[i]!=o[i] && o[i]==0) {
	    		   System.out.print((char)(i+97)+",");
	    	   }sc.close();
	       }	   

	}

}