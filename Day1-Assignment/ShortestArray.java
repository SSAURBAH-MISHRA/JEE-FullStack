package myproject;

public class ShortestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= { {1,2,3,4},{0,2,7},{4,12},{1,2,5,6}};
		int l[]=new int[a.length];
		int min=999,ind = 0;
		for(int i=0;i<a.length;i++) {
			if(min>a[i].length)
			{
				ind=i;
				min=a[i].length;
			}
		}
		System.out.print("Shortest Array is: ");
		System.out.print("{");
		for(int i=0;i<min;i++) {
			System.out.print(a[ind][i]+",");
		}
		System.out.print("}\nHaving length: "+min);
	}
}