import java.util.*;
public class RecursionFabonacci
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Number?\t");
		int num=xyz.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+"  ");
		System.out.print(b+"  ");
		
		recFab(num,a,b);	
	}
	static int i=1;
	public static void recFab(int num,int k,int m)
	{
		if(i<=num)
		{	
			int next=k+m;
			System.out.print(next+"  ");
			k=m;
			m=next;
			i++;
			recFab(num,k,m);
		}
	}
}