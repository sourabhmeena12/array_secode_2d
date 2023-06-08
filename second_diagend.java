import java.util.Scanner;
class Mx5
//row major matrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int sum=0;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				if(j==c/2)
				{	System.out.print(a[i][j]+"\t");sum=sum+a[i][j];	}
				else
				{	System.out.print(" \t");	}
			}
			System.out.println();
		}
		System.out.println("\nsum of this is: "+sum);
		System.out.println("\nMatrix RHS digonal------------\n");
	}
}































/*import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in) ;
		System.out.println("enter size of aray");
		int n=obj.nextInt();
		int m=obj.nextInt();
		int a[][]=new int[5][5];
		int i,j,k;
		for (i=0;i<n;i++)
		 {
		    for(j=0;j<m;j++)
		     {
		        a[i][j]=obj.nextInt();
		      }
		     
	    }
	    	for (i=0;i<n;i++)
		 {
		    for(j=m-1;j>=0;j--)
		     {
		        for (k=0;k<=m-1;k++)
		             {System.out.print(" ");}
		        if(k==0&&j==m-1||i==j)
		       System.out.print(a[i][j]);
		      else
		      System.out.print("  ");
		      }
		     System.out.println();
	        
		 }
		
	}
}*/