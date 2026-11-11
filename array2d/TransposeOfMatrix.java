package array2d;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int row = in.nextInt();
	    int col = in.nextInt();
	    int[][] arr = new int[row][col];
	    int[][] brr = new int[col][row];
	    
	    
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            arr[i][j] = in.nextInt();
	            brr[j][i] = arr[i][j];
	        }
	    }
	    
	    for(int i=0;i<col;i++){
	        for(int j=0;j<row;j++){
	            System.out.print(brr[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    in.close();
	}
}
