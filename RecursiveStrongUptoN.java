import java.util.*;
public class RecursiveStrongUptoN
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Range?\t");
		int range=xyz.nextInt();
		strongN(range,1);
		
	}
	
	public static void strongN(int r,int i)
	{
		if(i<=r)
		{
			checkStrongN(i);
			
			strongN(r,++i);
		}
		
	}
	
	
	
	public static void checkStrongN(int num)
	{
		int temp=num;
		
		int sum=0;
		while(num!=0)
		{
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp);
	}
	
}