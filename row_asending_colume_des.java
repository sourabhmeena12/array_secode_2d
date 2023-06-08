


import java.util.Scanner;
class thride_min
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=sc.nextInt();
		System.out.print("Enter the colume : ");
		int n1=sc.nextInt();
		int j=0,i=0,k=0;
		int a[][]=new int[10][10];
		for(i=0;i<n;i++)

			for(j=0;j<n1;j++)
			a[i][j]=sc.nextInt();
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
		      System.out.print(a[i][j]);
		    }
			System.out.println("");
		}
		
		
		for(i=0;i<n1;i++)
		{
			
				for(j=0;j<n;j++)
				{
					for(k=j+1;k<n;k++)
					{
						if(a[j][i]>a[k][i])
						{
							int temp=a[j][i];
							a[j][i]=a[k][i];
							a[k][i]=temp;
						}
					}
				}
			
		}
		System.out.println("row acending order");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<n1;i++)
		{
			
				for(j=0;j<n;j++)
				{
					for(k=j+1;k<n;k++)
					{
						if(a[j][i]>a[k][i])
						{
							int temp=a[j][i];
							a[j][i]=a[k][i];
							a[k][i]=temp;
						}
					}
				}
			
		}
		System.out.println("row decending order");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}


/*
import java.util.Scanner;
class thride_min
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=sc.nextInt();
		System.out.print("Enter the colume : ");
		int n1=sc.nextInt();
		int j=0,i=0,k=0;
		int a[][]=new int[10][10];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			a[i][j]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
				for(j=0;j<n1;j++)
				{
					for(k=1;k<n1;k++)
					{
						if(a[i][k-1]>a[i][k])
						{
							int temp=a[i][k];
							a[i][k]=a[i][k-1];
							
							a[i][k-1]=temp;
		                }
						if(a[k][i]>a[k-1][i])
						{
							int temp=a[k][i];
							a[k][i]=a[k-1][i];
							a[k-1][i]=temp;
						}
					}
				}
			
		}
		System.out.println("Row in ascending order & column in decending order");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}   
}*/