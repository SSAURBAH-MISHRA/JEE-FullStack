package myproject;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner s= new Scanner (System.in);
		String str=s.nextLine();
			   
	        char[] inputArray = str.toCharArray();  
	        char[] result = new char[inputArray.length];  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
	   
	        int j = result.length - 1;  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] != ' ') {  
	                if (result[j] == ' ') {  
	                    j--;  
	                }  
	                result[j] = inputArray[i];  
	                j--;  
	            }  
	        }  
	        System.out.println(str + " --> " + String.valueOf(result)); 
	        s.close();
	    }

	}
