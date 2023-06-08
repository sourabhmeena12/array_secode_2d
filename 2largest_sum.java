import java.util.Scanner;
class sec_largest
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row : ");
		int n=sc.nextInt();
		System.out.println("elements colum");
		int n1=sc.nextInt();
		int j;
		int max=0,max2=0;
		//int arr[] = {23,45,76,98,99};
		int a[][]=new int[10][10];
		System.out.println("the given array is : ");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a number");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.println(a[i][j]+"\t");
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
		}
		//System.out.println(max);
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(max2<a[i][j]&&max>a[i][j])
				{
					max2=a[i][j];
					//index=a[i][j];
				}
			}
		}
		System.out.println("\nsecond largest number is : "+max2);
		
		//System.out.println("\n largest number is :"+largest);
	}
}
