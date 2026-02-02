package Day2;

public class FibonacciSeries {
	public static void main(String args[])
	{
		int a=0,b=1;
		System.out.print(a+","+b);
		for(int i=2;i<8;i++)
		{
			int next=a+b;
			System.out.print(","+next);
			a=b;
			b=next;
		}
	}

}
