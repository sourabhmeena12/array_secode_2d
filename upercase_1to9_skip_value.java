import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int i,j,k;
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
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("Enter the size of array");
		for(i=0;i<n;i++)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}
}

