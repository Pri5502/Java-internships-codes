package p;
import java.util.*;
public class task2tranp {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows:");
	int row=sc.nextInt();
	System.out.println("Enter number of columns:");
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	System.out.println("Enter elements of matrix:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Your matrix");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			
			System.out.println(arr[i][j]);
		}
		System.out.println();
	}
	System.out.println("transposed matrix");	
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<row;j++)
		{
			
			System.out.println(arr[j][i]);
		}
		System.out.println();
	}
	}
}

