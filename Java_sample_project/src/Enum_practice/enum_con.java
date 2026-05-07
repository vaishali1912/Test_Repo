package Enum_practice;
enum Color {
	  RED("#FF0000"), GREEN("#00FF00");
	  private String code;
	  Color(String code) 
	  { this.code = code; }
	  public String getCode() 
	  { return code; }
	}


public class enum_con {

	public static void main(String[] args) {
		Color co=Color.GREEN;
		System.out.println(co);
		co.getCode();
	try {	
		//expression1
		//expression2- ex
		//expression3
		//expression4--> 
	}
	catch(Exception e)
	{
		
	}

	}

}
