package LabAssignment;
import java.util.Scanner;

public class First {
	Scanner sc=new Scanner(System.in);
	
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
	public static void main(String[] args)
	{
		First f=new First();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for #, 2 for duplicate, 3 for upperCase ");
		int i=sc.nextInt();
		
		switch(i)
		{
			case 1:
				f.replaceHash();
				break;
			case 2:
				f.replaceDuplicate();
				break;
			case 3:
				f.replaceLowerOdd();
				break;
			case 4:
				System.exit(0);
		}
		}
	
	public void replaceHash()
	{
		
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]='#';
		
				
	}
			System.out.print(ch[i]);
}
		
}
	public void replaceDuplicate()
	{
		String str = "";
		int i,j;
		for(i=(ch.length)-1;i>0;i--)
		{
			for(j=i-1;j>=0;j--)
			{
				if(ch[j]==ch[i])
				{
					ch[i]='0';	
				}
				
			}
		
		}
		for(j=0;j<ch.length;j++)
		{
			if(ch[j]!='0')
			{
				str=str+ch[j];	
			}
			
		}
		
		System.out.println(str);
		
		
	}
	
	
	public void replaceLowerOdd()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]=(char) (ch[i]-32);
		
				
	}
			System.out.print(ch[i]);
}
		
	}
}