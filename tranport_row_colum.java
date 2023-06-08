import java.util.Scanner;
class test
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i,j;
		System.out.println("Enter the element in array");		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(" actual matrix element are ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("");
		}
		int b[][]=new int[5][5];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[j][i]=a[i][j];
			}	
		}
		System.out.println("transpose");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println("");
		}
		
		
		
	}
}

