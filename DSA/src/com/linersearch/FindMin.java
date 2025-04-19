package com.linersearch;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,5,7,13,22,4,54};
		
		System.out.println(min(nums));
	}
	static int min(int[] arr) {
		int ans = arr[1];
		
		for(int i=1; i<arr.length; i++) {
			if (arr[i]<ans) {
				ans = arr[i];
			}
		}
		return ans;
		}

}
