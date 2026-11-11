package array2d;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int rowA = in.nextInt();
	    int colA = in.nextInt();
	    
	    int rowB = in.nextInt();
	    int colB = in.nextInt();
	    int[][] arr = new int[rowA][colA];
	    int[][] brr = new int[rowB][colB];
	    int[][] crr = new int[rowA][colB];
	    
	     if(colA!=rowB){
	        System.out.println("Matrix Multiplication cannot be performed");
	        in.close();
	        return;
	    }
	    
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colA;j++){
	            arr[i][j] = in.nextInt();
	        }
	    }
	    
	    for(int i=0;i<rowB;i++){
	        for(int j=0;j<colB;j++){
	            brr[i][j] = in.nextInt();
	        }
	    }
	    
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colB;j++){
	            for(int k=0;k<colA;k++){
	            
	             crr[i][j] +=  arr[i][k] * brr[k][j];
	            }
	            System.out.print(crr[i][j] + " ");
	        }
	        System.out.println();
	    }

	    in.close();
	}
}
