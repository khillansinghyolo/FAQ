package Frequently_Asked_Java.com;

public class Swapping_Two_number {

	public static void main(String[] args) {
	//Swaping with third variable
	/*
	 * int a=30; int b=40;
	 * System.out.println("Before Swaping Two are :"+a+"-----"+b); int temp =a; a=b;
	 * b=temp; System.out.println("After Swaping Two value are :"+a+"----------"+b);
	 * //
	 */	
		
	//Swaping two value with out third variable 
	
		int a=30;
		int b=40;
		System.out.println("Before Swaping Two are :"+a+"-----"+b);
		
		a=a+b;//30+40;
		b=a-b;//30-40=-10;
		a=a-b;
		
		System.out.println("After Swaping Two value are :"+a+"----------"+b);
	}

}
