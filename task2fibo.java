package p;
import java.util.Scanner;
public class task2fibo {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=1,a=0,b=0;
		int n;
		System.out.println("Enter no. of elements");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			
		}
		
	}
}
