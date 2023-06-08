import java.util.Scanner;
class Aadhar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]={{1,2,3,4}{2,3,9,6}{3,4,5,7}};
		System.out.println("Enter the size of array : ");
		//int n=sc.nextInt();
		//System.out.println("Enter the size of array : ");
		//int n1=sc.nextInt();
		int i=0,j=0;
		//int a[][]=new int[5][5];
		//System.out.println("Enter the size of array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				System.out.print(a[i][j]);
		}
		/*for(var x:a)
		{
			System.out.println(x);
		}*/
		for(int x[]:a)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}



