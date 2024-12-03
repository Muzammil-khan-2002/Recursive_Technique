import java.util.*;
public class RecursiveDuckUptoN
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Range?\t");
		int range=xyz.nextInt();
		duckNumber(range,1);
	}
	
	public static void duckNumber(int r,int i)
	{
		if(i<=r)
		{
			checkDuck(i);
			
			duckNumber(r,++i);
		}
	}
	
	
	public static void checkDuck(int num)
	{
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			if(rem==0)
			{
				System.out.println(temp);
				break;
			}
			num=num/10;
		}
	}
}