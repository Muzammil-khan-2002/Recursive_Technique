import java.util.*;
public class RecursivePerfect
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);

		System.out.println("Enter Range to find Perfect number?\t");
		int range=xyz.nextInt();
		perfect(range,1);
	}
	
	public static void perfect(int r,int i)
	{
		if(i<=r)
		{	int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(i==sum)
				System.out.println(i);
			
			perfect(r,++i);
		}
	}
}