import java.util.*;
public class RecursiveFactorial
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Integer Number?\t");
		int num=xyz.nextInt();
		
		System.out.println(fact(num));
	
	}
	static int f=1,i=1;
	public static int fact(int num)
	{
		if(i<=num)
		{
			f=f*i;
			++i;
			fact(num);
		}
		return f;
	}
}