package Object_class_method;

public class Animal {
	
	void sound(String animalname, String sound)// parameterized method
	{
		System.out.println("Animal name "+animalname);
		System.out.println("Animal sound "+sound);
	}
	void show()//no argument method
	{
		System.out.println("Nothing to say");
	}
	public static void main(String[] args) {
		Animal dog=new Animal();// this used to initialize an object
		dog.sound("MAx", "Barking");
		System.out.println("*******************************");
		Animal cat=new Animal();
		cat.sound("Kitty", "Meowww");
		
 
	}

}// class-Property(function, identity, State)
// dog= function- barking, identity- name(Max), State= other function
// Fruits-->Apple, banana, Kiwi
// Domestic animal= class
//dog, cat , cow=objects
//sound, eat, sleep= method