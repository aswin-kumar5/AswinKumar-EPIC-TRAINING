package recursion;

import java.util.Scanner;

public class NQueens {
	
	public void placeQueen(int[][] board,int row) {
		for(int col=0;col<4;col++) {
			if(checkSafe(board,row,col)) {
				board[row][col] = 1;
				placeQueen(board,row+1);
				board[row][col] = 0;
				
			}
		}
	}
	
	
	public boolean checkSafe(int[][] board, int row, int col) {
		
		return false;
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] board = new int[n][n];
		
		
		
		in.close();

	}

}
