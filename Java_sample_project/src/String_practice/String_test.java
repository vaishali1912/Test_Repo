package String_practice;

public class String_test {

	public static void main(String[] args) {
    String str="Hellohakfvhav,jhoooo";
    String str1="welwcomeocomecomecomecomecome";
    System.out.println(str);
    System.out.println(str.charAt(1));
    System.out.println(str.indexOf('H'));
    System.out.println(str.codePointAt(2));
    System.out.println(str.codePointBefore(1));
    System.out.println(str1.compareTo(str));//72-104=32
    System.out.println(str.compareToIgnoreCase(str1));
    System.out.println(str.concat(" Nisha"));// Hello Nisha
//    str=str.concat(" Nisha");//
//    System.out.println(str);// Hello
    System.out.println(str1.contains("come"));
    System.out.println(str.equals(str1));
    System.out.println(str.equalsIgnoreCase(str1));
    System.out.println(str1.isBlank());
    System.out.println(str1.isEmpty());
    System.out.println(str.lastIndexOf('o'));
    System.out.println(str1.lastIndexOf("com"));
    //System.out.println(str1.);

	}

}
