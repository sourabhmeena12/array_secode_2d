import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		//int arr[] = {23,45,76,98,99};
		int a[]=new int[10];
		System.out.println("the given array is : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int max = a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		int max2=a[0];
		//int index=0;
		//System.out.println(max);
		for(int i=0;i<n;i++)
		{
			if(max2<a[i]&&max>a[i])
			{
				max2=a[i];
				//index=i;
			}
		}
		
		int max3=a[0];
		//int index=0;
	  //System.out.println(max);
		for(int i=1;i<n;i++)
		{
			if(max3<a[i]&&a[i]<max2)
			{
				max3=a[i];
				//index=i;
			}
		}
		System.out.println("\nthrid largest number is : "+max3);
		//System.out.println("\n largest number is :"+largest);
	}
}