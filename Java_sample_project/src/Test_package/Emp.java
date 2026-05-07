package Test_package;

public class Emp {
	//global/ instance variable
	int id,age;
	String name;
	static String companyname="Wipro";//
	double salary;
	//local
	void department(int dptid, String dptname)
	{	
		String str="";
		System.out.println("companyname="+companyname);// name= prashant
		System.out.println("Department id="+dptid);
		System.out.println("Department name="+dptname);
	}
	void team(int teamid, String teamname)
	{
		System.out.println("companyname="+companyname);// name= prashant
		System.out.println("Team id="+teamid);
		System.out.println("Team name="+teamname);
	}

	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.department(101, "Development");
		emp.team(1001, "Asura");
		
	}

}
