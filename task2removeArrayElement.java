package p;
import java.util.*;
public class task2removeArrayElement {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int[] arr = new int[]{1,2,3,4,5};
	        int[] arr_new = new int[arr.length-1];
	        System.out.println(Arrays.toString(arr));
	        System.out.println("Enter index of no to be removed=");
	        int j=sc.nextInt();
	        for(int i=0, k=0;i<arr.length;i++){
	            if(i!=j){
	                arr_new[k]=arr[i];
	                k++;
	            }
	        }
	        System.out.println("Before deletion :" + Arrays.toString(arr));
	        System.out.println("After deletion :" + Arrays.toString(arr_new));

	    }
}
