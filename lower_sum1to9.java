
import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int i,j,sum=0;
		System.out.println("elements first row ");
		int n=sc.nextInt();
		System.out.println("elements colum");
		int n1=sc.nextInt();
		if(n==n1)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					a[i][j]=sc.nextInt();
					
				}
			}
			/*for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(a[i][j]);
					
				}
			}*/
		
			System.out.println("Enter the size of array");
			for(i=0;i<3;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print(" "+a[i][j]);
					sum+=a[i][j];
				}
				System.out.print("\n");
			}
			System.out.print("sum of lower triangle"+sum);
		}
		else
		{
			System.out.print("please row and colum sum of equal of dimension of matrix");
		}
	}
}
