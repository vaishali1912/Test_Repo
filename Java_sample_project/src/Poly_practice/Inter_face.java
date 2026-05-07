package Poly_practice;
interface Hospital
{
	void infra();
	void degree();
	default void doc()
	{
		System.out.println("Hello");
	}
}
class Doctor implements Hospital
{

	final public void infra() {
	System.out.println("Ots, wards, doctor cabin");
		
	}
	public void degree() {
		System.out.println("MD Endo");
	}
	public void doc()
	{
		System.out.println("Hello");
	}
}
class Nurse implements Hospital
{
	public void infra() {
	System.out.println("Ots, wards, nurse cabin, general area");
	}
	public void degree() {
		System.out.println("Nurse");
	}
	
}

public class Inter_face {

	public static void main(String[] args) {
		
		

	}

}
