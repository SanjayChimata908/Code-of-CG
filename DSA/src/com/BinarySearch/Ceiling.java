package com.BinarySearch;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 10;
		int ans = ceili9mng(arr,target);
		System.out.println(ans);
	}
	
	static int ceili9mng(int[] arr, int target) {
		
      if(target > arr[arr.length-1]) {
    	  return -1;
      }
		
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
		
		return start;
	}

	}

