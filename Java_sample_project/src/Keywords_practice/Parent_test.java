package Keywords_practice;
class Parent
{
	int x=100;
	void culture()
	{
		System.out.println("Indian Culture");
	}
	Parent()
	{
		
	}
}
class Child extends Parent
{
	Child()
	{
		super();
	}

	int x=10;
	
	void show()
	{ 
		
		//super.culture();
		System.out.println("Western culture");
//		System.out.println("Child class value of x="+x);
//		System.out.println("Parent class value of x="+super.x);
//		
	}
}

public class Parent_test {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.show();
	}

}
