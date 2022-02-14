package p;

import java.util.Scanner;

public class task2reverseString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(reverse(str));
				
	}
	public static String reverse(String s)
	{
		if(s.length()<=1||s==null)
		{
			return s;
		}	
		return reverse(s.substring(1))+s.charAt(0);
	}
}
