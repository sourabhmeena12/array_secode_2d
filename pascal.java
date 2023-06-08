import java.util.*;
class Test
{
	
	public static void main(String args[])
    {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the value");
	  int n=sc.nextInt();
	  int i,j,k,num=1;
	  for(i=0;i<=n;i++)
	   {
	     for(j=1;j<=n-i;j++)
		  {
		   System.out.print(" ");
		  } 
		   num=1;
		   for(k=0;k<=i;k++)
            {
             System.out.print(num+" ");			
		      num=num*(i-k)/(k+1);
			}
         System.out.print("\n");						
	   }
    }
}
  
  