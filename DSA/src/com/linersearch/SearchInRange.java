package com.linersearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {22,13,24,41,65,88,95};
		int target= 22;
		System.out.println(linearSearch(array,target,1,4));
	}
	static int linearSearch(int[] arr, int target, int start,int end) {
		
		if (arr.length==0) {
			return -1;
		}
		for (int i = start; i <= end; i++) {
			int element = arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
	}

}
