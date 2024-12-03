import java.util.*;
public class RecursivePrimeUptoN
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Range to find prime number?\t");
		int range=xyz.nextInt();
		
		prime(range);
	}
	public static void prime(int r)
	{	
		for(int i=1;i<=r;i++)
		{	boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
				System.out.println(i);
		}
	}
}