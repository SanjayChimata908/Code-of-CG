package com.BinarySearch;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5,6,7,0,1,2,3 };
		System.out.println(countRotations(nums));
	}
	public static int countRotations(int[] arr) {
		int pivot = findpivot(arr);
		return pivot + 1;
	}

	public int search(int[] nums, int target) {
		int pivot = findpivot(nums);

		if (pivot == -1) {
			return binarySearch(nums, target, 0, nums.length - 1);
		}
		if (nums[pivot] == target) {
			return pivot;
		}
		if (target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}

		return binarySearch(nums, target, pivot + 1, nums.length - 1);
	}

	int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	static int findpivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= start) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
