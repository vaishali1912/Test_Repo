package Looping_stmt;

public class Test_while {

	public static void main(String[] args) {
		// while(condition)
//		{
//			System.out.println();
//		}
		int a=23;//a=22,21,...11, 10
		while(a<10)// false
		{ 
			System.out.println("a="+a);//23, 22.. 11
			a--;// 
		}
		System.out.println("End");
		do {
			System.out.println("a="+a);
			a--;
		   }while(a<10);

	}

}
// 1. initialization, 2.check condition, 3. statement execution, 4.increment /decrement 
