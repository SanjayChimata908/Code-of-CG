package com.linersearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int[][] arr = {
				{66,75},
				{12,23,54},
				{64,73,65,45},
				{94,76}
		};
		int target = 23;
		int[] ans = Search(arr,target);
		System.out.println(Arrays.toString(ans));
		
		System.out.println(Min(arr));

	}
	static int[] Search(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	static int Min(int[][] arr) {
		int Max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > Max ) {
					Max = arr[i][j];
				}
			}
		}
		return Max;
	}
}
		