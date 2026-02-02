package AlgorithmAndLogics;
import java.util.*;
public class FibonacciSeries {
	public static void main(String args[]) {
		int first=0;
		int second=1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The entered number is:"+num);
		System.out.print(first+","+second);
		
		
		for(int i=2;i<num;i++)
		{
			int temp=first+second;
			System.out.print(","+temp);
			first=second;
			second=temp;
		}
		
	}

}
