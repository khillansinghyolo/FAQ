package Frequently_Asked_Java.com;

public class NumberOfDigitInNumber {

	public static void main(String[] args) {
		int num=13;
		int count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digit in Number :"+count);

	}

}
