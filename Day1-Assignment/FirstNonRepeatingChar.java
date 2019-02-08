package myproject;

import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int f = 0;
		char sb;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		input = s.nextLine();
		char[] words = input.toCharArray();
		
		for (int i = 0; i < words.length; i++) {
			if (words[i] >= 'a' && words[i] <= 'z') {
				sb = words[i];
				f=0;
				for (int j = i+1 ; j < words.length; j++) {
					if (words[j] >= 'a' && words[j] <= 'z') {
						if (sb == words[j]) {
							f = 1;
							words[j] = '-';
							
						}
					}
					
				}
				if (f == 0) {
					System.out.print(sb + "  ");
					break;
				}s.close();
			}
		}

	}
}