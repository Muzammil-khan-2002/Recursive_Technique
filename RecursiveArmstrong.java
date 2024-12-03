import java.util.*;
public class RecursiveArmstrong{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Range to Finde Armstrong number?\t");
		int range=xyz.nextInt();
			armstrong(range,1);
	}
	
	public static void armstrong(int r,int i)
	{
		if(i<=r)
		{
			checkArmstrong(i);
			
			armstrong(r,++i);
		}
	}
	
	public static void checkArmstrong(int num)
	{
		int temp=num;
		int count=0;
		int arms=0;
		while(num!=0)
		{
			++count;
			num/=10;
		}
		
		num=temp;

		while(num!=0)
		{
			int rem=num%10;
			arms=arms+(int)Math.pow(rem,count);
			num/=10;
		}
		if(arms==temp)
			System.out.println(temp);
		
			
			
	}
}