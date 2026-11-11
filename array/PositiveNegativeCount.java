package array;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,-4,6,-8,0,-6,7,0};
		int Pcount=0,Ncount=0,Zcount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				Ncount++;
			}else if(arr[i]>0) {
				Pcount++;
			}else {
				Zcount++;
			}
		}
		
		System.out.println("Positive Count: " + Pcount);
		System.out.println("Negative Count: " + Ncount);
		System.out.println("Zero Count: " + Zcount);
		
	}
}
