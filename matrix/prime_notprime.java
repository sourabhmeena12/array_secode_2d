//(1)
/*import java.util.Scanner;
class fact_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  i=1,count=0,n;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2||count==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}

 */
 //(2)
 /*
 import java.util.Scanner;
class fact_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  i=2,n;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(i==2||i==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}
*/

//(3)

 import java.util.Scanner;
class fact_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  i=2,n,flug=1;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		while(i<n)
		{
			if(n%i==0)
			{
				flug=0;
				break;
			}
			i++;
		}
		if(flug==1)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print("not prime");
		}
	}
}
