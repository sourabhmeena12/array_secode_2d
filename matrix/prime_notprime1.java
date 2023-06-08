import java.util.Scanner;
class fact_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  i,j,count=0,n;
		System.out.println("Enter any number");
		n = sc.nextInt();
		for(i=2;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}


/*
import java.util.Scanner;
class fact_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  i=1,j=1,count=0,n;
		System.out.println("Enter any number");
		n = sc.nextInt();
		while(i<=n)
		{
			while(j<=i)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
				if(count==0)
				{
					System.out.print(i);
				}

			}
		}
			
			
		}
		
	}
}
*/