package p;
import java.util.Scanner;
public class task2facto {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int temp=1;
		int n;
		System.out.println("Enter no. of elements");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			temp=i*temp;
			System.out.println(temp);
			
		}
		
	}
}
