package array2d;

import java.util.Scanner;

public class ArrayTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int row = in.nextInt();
	    int col = in.nextInt();
	    int[][] arr = new int[row][col];
	    
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            arr[i][j] = in.nextInt();
	        }
	    }
	    
	    System.out.println("Array Elements:");
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    in.close();
	}
}
