package Frequently_Asked_Java.com;

import java.util.Scanner;

public class Largest_Number_3Number {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please First Number");
	int a=	scan.nextInt();
	System.out.println("Please Second Number");
	int b=	scan.nextInt();
	System.out.println("Please Third Number");
	int c=	scan.nextInt();	
		
		if(a>b && a>c)
		{
		System.out.println("A is largest Number ");	
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest Number ");	
		}
		else
		{
			System.out.println("C is largest Number ");	
		}	
	}
}
