package com.linersearch;

import java.util.Arrays;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {12, 33, 23, 43, 53, 66, 74, 12};
		int target = 53;
		int index = linearSearch22(nums,target);
		System.out.println(index);
		
		String name = "KUNAL";
		char c = 'U';
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}
	static int linearSearch(int[] arr, int target) {
		
		if (arr.length==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
	}
	
   static int linearSearch22(int[] arr, int target) {
		
		if (arr.length==0) {
			return -1;
		}
		for (int element:arr) {
		if	(element == target) {
			return element;
		}
		}
		
		return -1;
   }
   
   static boolean searchInStrings(String str, char target) {
	   if(str.length()==0) {
		   return false;
	   }
	   for (char ch:str.toCharArray()) {
		   if(ch==target) {
			   return true;
		   }
	   }
	return false;
	   
   }
   }
