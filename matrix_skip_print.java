import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i,j,k=1;
		int a[][]=new int[5][5];
		System.out.println("elements first colum ");
		int c=sc.nextInt();
		System.out.println("elements row");
		int r=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		int sum=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i==0||i==r-1)
				{
					System.out.print("\t");
					sum=sum+a[i][j];
				}
				else if(j==0||j==c-1)
				{
					System.out.print("\t");
					sum=sum+a[i][j];
				}
				else 
				{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];}
			}
			System.out.println();
		}
		System.out.println("\nsum of this is: "+sum);
		System.out.println("\nMatrix digonal------------\n");
	}
}























		/*for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if((i>1&&i<5)&&(j>1 && j<5))
				{
					System.out.print(" "+k);
				}
				else
				{
					System.out.print(k+" ");
				}
				k++;
			}
			
			System.out.println();
		}
		*/






