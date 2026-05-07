package Looping_stmt;

public class Right_tri {

	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++)// print rows i=1,i=2, i=3......i=6false
	      {
			for(int j=1;j<=row-i;j++)// print col i=2,j=1=true, i=2,j=2=true, i=2,j=3=false
			{
				System.out.print(" ");//____*
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	}

}
