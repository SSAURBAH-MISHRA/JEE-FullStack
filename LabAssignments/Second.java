package LabAssignment;
import java.util.Scanner;
public class Second {
	public static void main(String[] args)
	{
		int f=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=(ch.length)-1;i>0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(ch[i]<ch[j])
				{
					f=1;
					break;
				}
				
			}
		}
		if(f==1)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
	}

	
}
