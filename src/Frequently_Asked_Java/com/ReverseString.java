package Frequently_Asked_Java.com;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//Scanner s=new Scanner(System.in);
		System.out.println("Please Enter String :");
		//String str=s.next();
		//String rev="";
		/*
		 * int len=str.length(); for(int i=len-1;i>=0;i--) { rev=rev+str.charAt(i); }
		 * System.out.println(rev);
		 */
		String  str="ram singh khillan";
		StringBuffer sb= new StringBuffer(String.valueOf(str));
		StringBuffer rev=sb.reverse();
		
		StringBuffer sssss=rev.reverse();
		
		System.out.println(sssss.toString());
		
		/*
		 * int l= s.length; String sss=" "; for(int i=l-1;i>=0;i--) { sss=sss+s[i]+" ";
		 * } System.out.println("Revrse string :"+sss);
		 */
	}

}
