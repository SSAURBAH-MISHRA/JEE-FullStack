package myproject;
import java.util.Scanner;

public class StartWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner a= new Scanner (System.in);
		String str=a.nextLine();
		String[] w=str.split(" ");
		for(int i=0; i<w.length;i++)
		{
			char[] b=w[i].toCharArray();
			if(b[0]=='S'||b[0]=='s') {
				System.out.println(w[i]);
			
		}
		}a.close();
	}

}
