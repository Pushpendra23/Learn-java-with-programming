//program to  use jagged array
import java.util.Scanner;
class Jagged{

	public static void main(String args[])
	{
	
		System.out.println("please enter the rows in an array that you want");
	/*	Scanner sc=new Sacnner(System.in);
		int row=sc.nextInt();
		String arr=new arr[row][];
		int col=new col[row];
		
		/*for(int i=0;i<row;i++)
		{
			System.out.println("the array has been created now enter the number  of columns that you want in "+i+" row");
			int a=sc.nextInt();
			col[i]=a;
		}
		
		System.out.println("enter the pattern that you want on screen");
		String s=sc.nextLine();
		for(int i=0;i<row;i++)
		{
			/*arr[i]=new String[col[i]];
				int c= col[i];
				for(int j=0;j<c;j++)
				{
					arr[i][j]=s;
				}
		}
		System.out.println("the pattern is as followed");
		for(int i=0;i<row;i++)*/
		int arr [][]=new int [4][];
		arr[0]=new int[0];
		arr[1]=new int[1];
	    arr[0]=new int[2];
		arr[0]=new int[3];
		for(int i=0;i<4;i++)
			arr[i][]=1;
		for(int i=0;i<4;i++)
            System.out.println(arr[i]);


	}

}