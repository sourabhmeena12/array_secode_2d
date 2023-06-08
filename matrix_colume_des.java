import java.util.Scanner;
class thride_min
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int j=0,i=0;
		int a[]=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("colume of decending order");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
