package Frequently_Asked_Java.com;

public class Panlindrome_String {

	public static void main(String[] args) {
		String str="ASA";
		String org_String=str;
		String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(rev.equals(org_String))	
	{
		System.out.println("String is palindrome String");
	}
	else
		System.out.println("String is not Palindrome String");

	}

}
