package Control_statements;

public class Nestedif {

	public static void main(String[] args) {
		float per=87f;
		if(per>=75 && per<=100)
		{
			System.out.println("Dist");//level1
			if(per>=85)//level 2
			{
				System.out.println("A+");//
				if(per>=95)// level3
				{
					System.out.println("A++");
				}
				
			}
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
