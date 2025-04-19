package com.BinarySearch;

import java.util.Arrays;

public class RowCalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{10,20,30,44},
				{21,43,65,77},
				{22,54,76,94},
		    	{61,82,95,87}
		};
		System.out.println(Arrays.toString(search(arr, 94)));

	}
	 static int[] search(int[][] matrix, int target) {
		 int r = 0;
		 int c = matrix.length-1;
		 
		 while(r < matrix.length && c>=0) {
			 
			 if(matrix[r][c]  == target) {
				 return new int[] {r,c};
				 
			 }if(matrix[r][c] < target) {
				 r++;
			 }
			 else {
				 c--;
			 }
		 }
		return new int[] {-1,-1};
	 }

}
