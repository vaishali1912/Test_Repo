package Exception_handling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		String str="Hello";
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		//System.out.println(1/0);
//		try {
//			System.out.println(1/0);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		//System.out.println(2/0);// infinity
//		//File file="C:\\Users\\dell\\Desktop\\SDET April B3 -";// 
//		Test t=new Test();// declaration and initialization of an object
//		Test t1;// declaration
//		t1=new Test();// initialization of an object
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");//120
		int a=sc.nextInt();
		int b=88;
		try {
			//Arithmetic exception
			int c=b/a;
			System.out.println("Division ="+ c);
			//NullPointerException 
			String str=null;
			System.out.println(str.charAt(1));//
			
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		
		System.out.println("End");
		// io excepection,number format exception, null pointer exception, indexoutofbound exception(String, Array), Arithmetic exception
		//sql exception, class not found exception,file not found exception
		

	}

}
