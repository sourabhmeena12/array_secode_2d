import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int i=0,j=0;
		int a[][]=new int[2][2];
		System.out.println("Enter the size of array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//System.out.print("matrix = ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print("matrix="+a[i][j]);
			}
			System.out.println();
		}
	}
}
