package p;
import java.util.Scanner;
public class task2claci {
	public static void main(String args[])
	{
		int a,b,c,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		System.out.println("1.+\n2.-\n3.*\n4.%" );
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1:c=a+b;
				  System.out.println("addition is="+c);
				  break;
		case 2:c=a-b;
		  		System.out.println("substraction is="+c);
		  		break;
		case 3:c=a*b;
		  			System.out.println("Multiplication is="+c);
		  			break;
		case 4:c=a%b;
		  			System.out.println("division is="+c);
		  			break;
		}
		}

}
