package Looping_stmt;

public class Each_for {

	public static void main(String[] args) {
		int[] arr= {6,7,4,3,1,9};
		for(int a:arr)
		{
			System.out.println(a);// 6, 7, 4 ,3,1,9
		}//
		System.out.println("***********************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);// 6,7, 3
		}

	}

}
