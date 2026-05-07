package Test_package;

import java.util.Scanner;

public class Sc_test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for driving");
		}
		else
			System.out.println("not Eligible for driving");

	}

}
