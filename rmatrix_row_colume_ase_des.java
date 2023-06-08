/*import java.util.Scanner;
class thride_min
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the row acending: ");
		int n=sc.nextInt();
		System.out.print("Enter the colume dcending: ");
		int n1=sc.nextInt();
		int j=0,i=0,k=0;
		int a[][]=new int[10][10];
		for(i=0;i<n;i++)
		{
			for(k=0;k<n1;k++)
			a[i][k]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			//for(k=0;k<n1;k++)
			
				for(k=i+1;k<n1;k++)
				{
					if(a[i][k]<a[j][k])
					{
						int temp=a[i][k];
						a[i][k]=a[j][k];
						a[j][k]=temp;
					}
				}
			
		}
		System.out.println("row of acending order");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i][k]+" ");
		}
		//hjdbcbjdnc
		for(i=0;i<n;i++)
		{
			//for(k=0;k<n1;k++)
			
				for(k=i+1;k<n1;k++)
				{
					if(a[i][k]>a[j][k])
					{
						int temp=a[i][k];
						a[i][k]=a[j][k];
						a[j][k]=temp;
					}
				}
			
		}
		System.out.println("colume of decending order");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i][k]+" ");
		}
	}
}
*/

/*
import java.util.Scanner;
class thride_min
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int j=0,i=0;
		int a[]=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("row acending order");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("colume of decending order");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
*/


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
		
		for(i=0;i<n;i++)
		{
			
				for(j=0;j<n1;j++)
				{
					for(k=1;k<n1;k++)
					{
						if(a[i][k-1]<a[i][k])
						{
							int temp=a[i][k];
							a[i][k]=a[i][k-1];
							a[i][k-1]=temp;
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


