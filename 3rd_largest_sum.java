import java.util.Scanner;
class thride
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
			if(max<a[i][j])
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
				//index=i;
			}
		}
		
		int max3=a[0][0];
	  //System.out.println(max);
		for(int i=1;i<n;i++)
		{
			for(j=0;j<n1;j++)
			if(max3<a[i][j]&&a[i][j]<max2)
			{
				max3=a[i][j];
				//index=i;
			}
		}
		System.out.println("\nsecond largest number is : "+max3);
		//System.out.println("\n largest number is :"+largest);
	}
}