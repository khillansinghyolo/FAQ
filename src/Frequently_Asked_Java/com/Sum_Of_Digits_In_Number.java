package Frequently_Asked_Java.com;

public class Sum_Of_Digits_In_Number {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			
			num=num/10;
		}
		System.out.println(sum);
	}

}
