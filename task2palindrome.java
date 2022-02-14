package p;
import java.util.Scanner;
public class task2palindrome {
public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		int l=0,h=str.length()-1;
		int temp=0;
		if(l<h)
		{
			if(str.charAt(l)!=str.charAt(h))
			{
				
				temp=1;
				l++;
				h--;
			}
			
		}
		if(temp==1)
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");	
		
}
}
