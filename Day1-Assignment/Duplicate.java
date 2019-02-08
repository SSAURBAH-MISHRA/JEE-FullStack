package myproject;

import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string with duplicate words:");
		Scanner a= new Scanner (System.in);
		String str =a.nextLine();
		String[] w=str.split(" ");
		for(int i=0;i<w.length;i++)
		{
			if(w[i]!=null)
			{
				for(int j=i+1;j<w.length;j++)
				{
					if(w[i].equals(w[j])) {
						w[j]=null;
					}
				}
			}
		}
			for(int k=0;k<w.length;k++)
			{
				if(w[k]!=null)
				{
					System.out.print(w[k]+" ");
				}a.close();
			}
		}

	}
