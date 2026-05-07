package Object_class_method;

public class Vehicle {
	Vehicle()
	{
		System.out.println("Default constructor");
	}
	Vehicle(String name)
	{
		System.out.println(name);
	}
	Vehicle(String name, String type)
	{
		System.out.println(name);
		System.out.println(type);
	}

	public static void main(String[] args) {
		Vehicle vc=new Vehicle("Baleno car");
		System.out.println("***********************");
		Vehicle vc1=new Vehicle("Baleno car", "Petrol car");

	}

}
