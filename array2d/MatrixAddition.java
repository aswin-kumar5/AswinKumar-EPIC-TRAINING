package array2d;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int row = in.nextInt();
	    int col = in.nextInt();
		int[][] arr = new int[row][col];
		int[][] brr = new int[row][col];
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr[i][j] = in.nextInt();
		    }
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        brr[i][j] = in.nextInt();
		    }
		}
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
                arr[i][j] = arr[i][j] + brr[i][j];	       
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
		in.close();
	}
}
