package com.linersearch;

public class FindNumbers {

	public static void main(String[] args) {
	int[] nums = {22,3,5,345,7996};
	System.out.println((Numbers(nums)));
	}
	static int Numbers(int[] nums) {
	int count =0;
	for (int num:nums) {
		if(even(num)) {
			count++;
		}
	}
	return count;
	}
	static boolean even(int num) {
		 int noofdigits = Digits(num);
		
		return noofdigits %2==0;
	}
//	static int Digits(int num) {
//		if(num<0) {
//			num = num * -1;
//		}
//		if (num==0) {
//			return -1;
//		}
//		int count =0;
//		while(num>0) {
//			count++;
//			num/=10;
//		}
//		return count;
//		
//	}
	static int Digits(int num) {
		if(num<0) {
			num = num * -1;
		}
		
		return (int)((Math.log10(num))+1);
	}
}
