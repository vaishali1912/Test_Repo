package Object_class_method;

public class Hospital {
	// default constructor// compiler
	// no parameter constructor// Hospital(){}
	// parameterized constructor // Hospital(String hname){}
	void show(String name) {}// method is used to write object function

	Hospital(String hname)// used to write object state(other properties)
	{
		
	}
	public static void main(String[] args) {
		Hospital hp=new Hospital("HP");
		Hospital hp1=new Hospital("HP1");
		hp.show("HP");
		hp.show("HP1");
		
		
	}

}
