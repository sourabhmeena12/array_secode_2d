import java.util.Scanner;
class fact_1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int m,n,i=0,j=0,sum=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[5][5];
		System.out.println("Enter the element in array");		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix element are ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("\t"+a[i][j]);
				sum+=a[i][j];
			}
			System.out.println(" ="+sum);
		}
	}
}

