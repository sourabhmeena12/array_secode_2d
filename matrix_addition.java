import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		System.out.println("Enter a number matrix: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i,j;
		System.out.println(" enter the first  eliment");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
	
			}
			System.out.println("");
		}
		System.out.println(" enter the second  eliment");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("second matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("sum of matrix matrix");
		if(n==m&&m==n)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					//System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		
		}
		else
		{
			System.out.print("not sum of value");
		}

	}
}

