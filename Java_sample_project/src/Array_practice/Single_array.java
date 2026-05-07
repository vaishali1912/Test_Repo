package Array_practice;

import java.util.Scanner;

public class Single_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int row=sc.nextInt();
		System.out.println("Enter coloum size");
		int col=sc.nextInt();
		int[][] a = new int[row][col];

     
        for (int i = 0; i < 4; i++) {// 0, 1
            for (int j = 0; j <= i; j++) {
            	//System.out.print(a[i][j]+"  " );
                a[i][j] = j + 1;//0 j+0=0+1=1
                //                          1 2
            }
            System.out.println();
        }

  
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}//1
//1 2
//1 2 3
//1 1 2 3 5 8 13