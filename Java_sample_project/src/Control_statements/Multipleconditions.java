package Control_statements;

public class Multipleconditions {

	public static void main(String[] args) {
		float per=108f;
		if(per>=75)
		{
			System.out.println("Dist");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("pass class");
		}
		else
			System.out.println("Fail");

	}

}
