package myproject;

import java.util.Scanner;

public class StringManipulation {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner a = new Scanner(System.in);
			System.out.println("Enter a String : ");
			String b = a.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
			int[] arr = new int[26];
			for(int i=0;i<26;i++) {
				arr[i]=0;
			}
			for(int i=0;i<b.length();i++) {
				int index = (b.charAt(i)-97);
				arr[index]++;
			}
			for(int i=0;i<26;i++) {
				if(arr[i]!=0) {
					char temp = (char)(97+i);
					System.out.print(temp+"="+arr[i]+",");
				}
			}
			
			a.close();
		}


	}

