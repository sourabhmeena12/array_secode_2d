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
		int s = 1000000;
		int ss = 100000;
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
		for(int i=0;i<n;i++)
		{
			
			if(a[i]==s)
			{
				ss = s;
			}else if(a[i]<s)
			{
				ss = s;
				s = a[i];
			}
			else if(a[i] < ss)
			{
				ss = a[i];
				
			}
		}
		System.out.println("\nsecond largest number is : "+ss);
		//System.out.println("\n largest number is :"+largest);
	}
}
