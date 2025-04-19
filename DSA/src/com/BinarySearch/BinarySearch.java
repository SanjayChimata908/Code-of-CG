package com.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,6,9,11,14,21,34,46,};
		int target = 21;
		int ans = binarySearch(arr,target);
		System.out.println(ans);
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start +(end-start)/2;
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid -1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

}