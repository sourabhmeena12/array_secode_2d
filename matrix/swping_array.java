import java.util.Scanner;
class Aadhar

{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int i=0,j=0,temp=0;
		int a[]=new int[10];
		System.out.println("Enter the size of array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Swaping");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
