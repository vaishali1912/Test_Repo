package Control_statements;

import java.util.Scanner;

public class Vowels_Check {

	public static void main(String[] args) {
//		char ch='h';// || is use for logical or
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
//				||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//		{
//			System.out.println("This is Vowel");
//		}
//		else 
//		{
//			System.out.println("This is consonant");
//		}
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please use this format for day , firstletter should be capital");
		String day=sc.next().intern();
		
		
if(day=="Monday"||day=="Tuesday"||day=="monday")
{
	System.out.println("Weekday");
}
else if (day=="Saturday"||day=="Sunday")
{
	System.out.println("Weekend");
}
else
{
	System.out.println("invalid day format");
}


	}

}
