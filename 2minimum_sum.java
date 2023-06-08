import java.util.Scanner;
class  Min
{
	public static void main(String args[])
	{ 
	    Scanner sc= new Scanner (System.in);
		int i,j,sum=0;
		int a[][]= new int[5][5];
		
		System.out.println("Enter any two dimesion of matrix:");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		
		System.out.println("Enter a size");
		for(i=0 ; i<rows; i++)
		{
		    for(j=0 ; j<column ; j++)
			{
			  a[i][j]=sc.nextInt();
			  
			}
		}
		System.out.println(" A matrix Element are:");
		for(i=0 ; i<rows ; i++)
		{
			for(j=0 ; j<column ; j++)
		    {
				System.out.print("\t"+a[i][j]+" ");
			}
			System.out.println();
		}
		int min=a[0][0];
		for(i=0 ; i<rows; i++)
		{
		    for(j=0 ; j<column ; j++)
			{
			    if(min<=a[i][j])
				{  
			       min=a[i][j];
				}
			}
		}
		System.out.println("Maximum element is  "+min);
		int min2 = a[0][0];
		for(i=0 ; i<rows; i++)
		{
		    for(j=0 ; j<column ; j++)
			{
			    if(min2>=a[i][j])
				{  
			       min2=a[i][j];
				}
			}
		}
		System.out.println("Minimum element is  "+min2);
		int smin=a[0][0];
	    for(i=0 ; i<rows ; i++)
		{
		    for(j=0 ; j<column ; j++)
			{
				if(min>a[i][j] &&min2<a[i][j])
			    {
				  min = a[i][j];
			    }
			}
		}
		
		System.out.print("secondlarge element:" +min);
	}
}
/*import java.util.Scanner;
class MatrixSecMin
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int min=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				a[i][j]=sc.nextInt();
				
				if(a[i][j]<min)
				{
					sec=min;
					min=a[i][j];
				}
				else if(a[i][j]>min&&sec>a[i][j])
				{
					sec=a[i][j];
				}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("   "+a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("Smallest no. in Element is:-"+min);
		System.out.println("Second Smallest no. in Element is:-"+sec);
	}
}*/
/*import java.util.Scanner;
class sec_min_sum
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the size of array : ");
		int n1=sc.nextInt();
		int j=0;
		//int arr[] = {23,45,76,98,99};
		int a[][]=new int[10][10];
		System.out.println("the given array is : ");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			a[i][j]=sc.nextInt();
		}
		System.out.println("Enter a number");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			System.out.println(a[i][j]+"\t");
		}
		int max = a[0][0];
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			if(max>a[i][j])
			{
				max=a[i][j];
			}
		}
		int max2=a[0][0];
		//int index=0;
		//System.out.println(max);
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			if(max2<a[i][j]&&max>a[i][j])
			{
				max2=a[i][j];
				//index=a[i][j];
			}
		}
		System.out.println("\nsecond largest number is : "+max2);
		//System.out.println("\n largest number is :"+largest);
	}
}

/* 3rd minimu
import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the size of array : ");
		int n1=sc.nextInt();
		int min=0,min2=0;
		int j=0;
		//int arr[] = {23,45,76,98,99};
		int a[][]=new int[10][10];
		System.out.println("the given array is : ");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			a[i][j]=sc.nextInt();
		}
		System.out.println("Entered number is");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			System.out.println(a[i][j]+"\t");
		}
		
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(i==0)
				{
					min=a[i][j];
				}
				if(min>a[i][j])
				{
					min2=min;
					min=a[i][j];
				}
				else if(min2>a[i][j]&&min<a[i][j])
				{
					min2=a[i][j];
				}
			}
		}
		System.out.println("\nsecond Smallest number is : "+min2);
		//System.out.println("\n largest number is :"+largest);
	}
}
*/



/*
import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the size of array : ");
		int n1=sc.nextInt();
		int min=0,min2=0;
		int j=0;
		//int arr[] = {23,45,76,98,99};
		int a[][]=new int[10][10];
		System.out.println("the given array is : ");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Entered number is");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			System.out.println(a[i][j]+"\t");
		}
		
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(i==0)
				{
					min=a[i][j];
				}
				if(min>a[i][j])
				{
					min2=min;
					min=a[i][j];
				}
				else if(min2>a[i][j]&&min<a[i][j])
				{
					min2=a[i][j];
				}
			}
		}
		System.out.println("\nsecond Smallest number is : "+min2);
		//System.out.println("\n largest number is :"+largest);
	}
}
*/