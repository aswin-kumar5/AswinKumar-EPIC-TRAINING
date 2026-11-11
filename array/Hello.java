package array;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,2,4,3,1};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i+1];
					arr[++i]=temp;
				}
			}
		}
		
		for(int i :arr) {
			System.out.print(i);
		}
	}

}
