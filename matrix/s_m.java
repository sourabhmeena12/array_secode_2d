import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the size of array : ");
		//int n=sc.nextInt();
		int a[] = {23,45,76,98,99};
		//int a[]=new int[10];
		int min=a[0];
		int sl=0;
		//System.out.println("the given array is : ");
		/*for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}*/
		//System.out.println("Enter a number");
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				sl = min;
				min=a[i];
			}
			else if(sl>a[i])
			{
				sl = a[i];
			}
		}
		System.out.println("\nsecond largest number is : "+sl);
		//System.out.println("\n largest number is :"+largest);
	}
}
