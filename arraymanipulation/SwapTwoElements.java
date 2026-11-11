package arraymanipulation;

public class SwapTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,4,7,2,1};
		int pos1 = 2,pos2 = 4;
		
		if(pos1<0 || pos1>arr.length-1 || 
		   pos2<0 ||	pos2>arr.length-1) {
			System.out.println("Invalid Positions");
			return;
		}
		
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		
		for(int n : arr)
			System.out.print(n + " ");
		
	}
}
