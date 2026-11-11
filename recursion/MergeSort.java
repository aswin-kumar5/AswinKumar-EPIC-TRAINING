package recursion;

import java.util.Scanner;

public class MergeSort {
	
	static void mergeSort(int[] arr,int left,int right) {
		
		if(left<right) {
			
			int mid = (left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
			
		}
	}
	
	static void merge(int[] arr,int left,int mid,int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int i=0;i<n1;i++) {
			l[i] = arr[left+i];
		}
		
		for(int i=0;i<n2;i++) {
			r[i] = arr[mid+1+i];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i<n1 && j<n2) {
			
			if(l[i]<r[j]) {
				arr[k] = l[i++];
			}else {
				arr[k] = r[j++];
			}
			k++;
		}
		
		while(i<n1) {
			arr[k++] = l[i++];
		}
		
		while(j<n2) {
			arr[k++] = r[j++];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		mergeSort(arr,0,n-1);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		in.close();
	}
}
