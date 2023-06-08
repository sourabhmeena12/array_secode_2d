import java.util.Scanner;
class lar_sum
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the size of array : ");
		int n1=sc.nextInt();
		int i=0,j=0;
		int a[][]=new int[10][10];
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
				System.out.println("\ta["+i+"]="+a[i][j]);
			}
			
		}
		int max=a[0][0];
		for(i=1;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
