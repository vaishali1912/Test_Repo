package Advance_code;
interface Calculator{
	int ope(int a, int b);
}
public class Calci {

	public static void main(String[] args) {
		
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		Calculator div=(a,b)->a/b;
		int a=20,b=10;
		System.out.println("Addition= "+add.ope(a, b));
		System.out.println("Substraction= "+sub.ope( a,b));
		System.out.println("Multiplication= "+mul.ope(a, b));
		System.out.println("Division= "+div.ope(a,b));
	}

}
