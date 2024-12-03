import java.util.*;
public class RecursionSLargNo
{	
	static	int max =0;
	static	int smax=0;
		
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size?\t");
		int size=xyz.nextInt();
		int a[]=new int[size];
		int tempArr[]=a;
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
			a[i]=xyz.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		max=a[0];
		
		
		System.out.println("Second Largest : "+findMax(a,0));
	}
	
	public static int findMax(int arr[],int i)
	{
		
		if(i<arr.length)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			findMax(arr,++i);
		}
		return smax;
	}
	
}