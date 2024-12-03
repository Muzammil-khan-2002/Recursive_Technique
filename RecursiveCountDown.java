import java.util.*;
public class RecursiveCountDown
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Number?\t");
		int num=xyz.nextInt();
		countDown(num);
	}
	
	public static void countDown(int num)
	{
		if(num>=1)
		{
			System.out.print(num+"  ");
			countDown(--num);
		}
	}
}