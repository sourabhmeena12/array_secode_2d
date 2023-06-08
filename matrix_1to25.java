import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int i,j,k,sum=0;
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
		System.out.println("\nMatrix is------------\n");
		sum=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]+"\t");
				sum=sum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("\nsum of this is: "+sum);
		System.out.println("\nMatrix without in is------------\n");
	}
}

/*		if(r==c&&r%2!=0)
		{
			System.out.println("\nMatrix is------------\n");
			sum=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"\t");
					sum=sum+a[i][j];
				}
				System.out.println();
			}
			System.out.println("\nsum of this is: "+sum);
			System.out.println("\nMatrix without in is------------\n");
*/