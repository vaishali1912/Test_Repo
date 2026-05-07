package String_practice;

import java.util.Scanner;
import java.util.*;
public class Convert_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("Hello ");
		System.out.println(sb);
		//sb.append(" Nisha");
		System.out.println(sb);
		System.out.println(sb.capacity());// return default length
		System.out.println(sb.length());
		System.out.println(sb.substring(3));
		System.out.println(sb.insert(5, " Nisha"));
		
		// length=index+1
		//index=len-1

	}

}
