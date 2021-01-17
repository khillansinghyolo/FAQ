package Frequently_Asked_Java.com;

public class Number_Of_Even_Odd_In_Number {

	public static void main(String[] args) {
int num =3814;
int rev=0;
int odd_count=0;
int even_count=0;
while(num!=0)
{
	rev=rev*10+num%10;
	if(rev%2==0)
	{
		//System.out.println("Number is Even ");
		even_count++;	
	}
	else
	{
		//System.out.println("Number is odd");
		odd_count++;
	}
		
	num=num/10;
	
	}
System.out.println("Odd Number count :"+odd_count+"-------even Number count :"+even_count);


	}
}
