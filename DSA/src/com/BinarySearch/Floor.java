package com.BinarySearch;

public class Floor {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {2, 3, 5, 9, 14, 16, 18};
			int target = 8;
			int ans = floor(arr,target);
			System.out.println(ans);
		}
		
		static int floor(int[] arr, int target) {
			
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
			
			return end;
		}

	}
