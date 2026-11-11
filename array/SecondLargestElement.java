package array;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1000,-10000};
		int largest=Integer.MIN_VALUE,second_largest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>second_largest && arr[i]!=largest) {
				second_largest=arr[i];
			}
		}
		
		if(second_largest==Integer.MIN_VALUE) {
			System.out.println("There is No Second Largest Element");
		}else {
			System.out.println("Second Largest Element: "+second_largest);
		}
	}
}
