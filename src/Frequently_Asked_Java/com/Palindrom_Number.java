package Frequently_Asked_Java.com;

public class Palindrom_Number {

	public static void main(String[] args) {

		/*Defination : the number is palindrome number which we reverse the number that number is same 
		 * as original number 
		 * or the number is palindrome number that remains the same when we reverse the digits of the numbers
		 * */
		int num =414;
		int temp=num;
		int rev=0;
		
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if(rev==num)
		{
		System.out.println("Number is penlidrom number");		
		}
		else 
		System.out.println("Number is not palidrome number ");	
		}

}
