/*import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j,k;
		System.out.println("elements of array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Enter number in pocket["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the size of array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}
}
*/

import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int i,j;
		System.out.println("elements first row ");
		int n=sc.nextInt();
		System.out.println("elements colum");
		int n1=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]);
				
			}
		}
	
		System.out.println("Enter the size of array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
	}
}

/*
import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i,j,count=0;
		System.out.println("elements of array");
		int n=sc.nextInt();
		for(i=0;i<3;i++)
		{
			for(j=1;j<=3;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
*/
