package array;

public class TwoArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,3,9,7};
		int[] brr = {9,8,6,4};
		int m = arr.length, n = brr.length;
		
		int[] crr = new int[m+n];
		int k=0;
		
		int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
		
		for(int i=0;i<2*arr.length;i++) {
			
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			
			for(int j=0;j<m;j++) {
				if(arr[j]<min1 && arr[j]!=a)
					min1=arr[j];
			}
			
			for(int j=0;j<n;j++) {
				if(brr[j]<min2 && brr[j]!=b)
					min2=brr[j];
			}
			
			if(min1<=min2) {
				crr[k++]=min1;
				a=min1;
			}else {
				crr[k++]=min2;
				b=min2;
			}
						
		}
		
		for(int num:crr) {
			System.out.print(num + " ");
		}
		
		
		
/*
 
 		// To sort two sorted arrays of different length

		int[] arr = {1,3,5,7,9};
		int[] brr = {2,4,6,8};
		int m = arr.length, n = brr.length;
		
		int[] crr = new int[m+n];
		
		int i=0,j=0,k=0;
		
		while(i<m && j<n) {
			if(arr[i]<brr[j]) {
				crr[k++]=arr[i++];
			}else {
				crr[k++]=brr[j++];
			}
		}
		
		while(i<m) {
			crr[k++]=arr[i++];
		}
		
		while(j<n) {
			crr[k++]=brr[j++];
		}
		
		for(int num:crr) {
			System.out.print(num + " ");
		}
			
*/
		
/*
 		
 		// To Sort two sorted arrays of equal length
 	 
		int[] arr = {1,3,5,7,9};
		int[] brr = {1,4,6,8,10};
		
		int[] crr = new int[2*arr.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<brr[i]) {	
				crr[k++] = arr[i];
				crr[k++] = brr[i];
			}
			else {
				crr[k++]=brr[i];
				crr[k++]=arr[i];
			}
			
		}
		
		for(int num:crr) {
			System.out.print(num + " ");
		}
*/
		
	}

}
