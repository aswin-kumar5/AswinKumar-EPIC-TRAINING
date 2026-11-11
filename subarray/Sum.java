package subarray;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,10,15,20,25,30,35,40,45};
		int target = 70;
		int prev=0,next=0,n=arr.length;
		
		while(prev<n) {
			for(int i=prev;i<n;i++) {
				next = i;
				int sum=0;
			
				for(int j=prev;j<=next;j++) {
					sum+=arr[j];
				}
			
				for(int k=next+1;k<n;k++) {
					if(sum+arr[k]==target) {
						for(int j=prev;j<=next;j++) {
							System.out.print(arr[j] + " ");
						}
						System.out.print(arr[k] + " ");
						System.out.println("");
					}
				}
				next++;
				
			}
			prev++;
		}
		
	}
}
