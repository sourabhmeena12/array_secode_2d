/*import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int sum[][]=new int[5][5];
		System.out.println("Enter a size of array: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int i,j,k;
		System.out.println(" elements of array");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the size of array");
		int m=sc.nextInt();
		int m1=sc.nextInt();
		System.out.println("elements of array");
		for(i=0;i<m;i++)
		{
			for(j=0;j<m1;j++)
			{
				b[i][j]=sc.nextInt();
	
			}
		}
		System.out.println("sum of array");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m1;j++)
			{
				for(k=0;k<m1;k++)
				{
					sum[i][j]+=b[i][k]*a[k][j];
					//sum[i][j]=sum[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m1;j++)
			{
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println("");
		}

	}
}
*/

import java.util.Scanner;
class Test
 {
  public static void main(String args[])
    {
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter  row1 dimension of matrix");
	  int m=sc.nextInt();
	  System.out.println("Enter  coloum1 dimension of matrix");
	  int n=sc.nextInt();
	  System.out.println("Enter row2 dimension2 of matrix");
	  int p=sc.nextInt();
	  System.out.println("Enter coloum2 dimension2 of matrix");
	  int q=sc.nextInt();
	  int a[][]=new int [5][5];
	  int a1[][]=new int [5][5];
	  int sum[][]=new int [5][5];
	  int i,j;
	  if(n==p)
	  {	  
	  System.out.println("Enter the  elements matrix");
	  for(i=0;i<m;i++)
	   {
		 for(j=0;j<n;j++)	 
	      a[i][j]=sc.nextInt();
	     
	   }
       System.out.println("Enter the elements matrix");	   
	   for(i=0;i<p;i++)
	   {
         for(j=0;j<q;j++)
          a1[i][j]=sc.nextInt();		  
         
	   }	   
	   System.out.println("Matrix multiplication");
       for(i=0;i<m;i++)
		{
         for(j=0;j<q;j++)
		 {
           sum[i][j]=0;
           for(int k=0;k<m;k++)
		   {				
	         sum[i][j]+=a[i][k]*a1[k][j];	 	   
	       }	 
	        System.out.print("\t"+sum[i][j]);
	      }
		  System.out.println();
	    }
      }
       else 
        System.out.print("not multiply");		   
	}
 }