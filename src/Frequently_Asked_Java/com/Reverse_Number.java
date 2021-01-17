package Frequently_Asked_Java.com;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {

// algoritham 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=s.nextInt();
		/*
		 * int rev=0; while(num!=0) { rev=rev*10 +num%10; //0+1234%0=0+4 // Modules
		 * return reminder num=num/10; //1234/10=123 ( division return quetiant }
		 * System.out.println("Number is reverse :"+rev);
		 */
	
	//approach 2second 
	/*
	 * StringBuffer sb=new StringBuffer(String.valueOf(num)); StringBuffer
	 * rev=sb.reverse(); System.out.println(rev);
	 */
		
	//Approach 3 Second
		
		StringBuilder sbb=new StringBuilder(String.valueOf(num));
		StringBuilder rev=sbb.reverse();
		System.out.println(rev);
	}
}
