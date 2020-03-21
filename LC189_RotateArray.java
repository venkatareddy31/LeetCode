package com.java.practice;

import java.util.Arrays;

public class LC189_RotateArray {

	public void rotate(int[] nums, int k){
		int size=nums.length-1;
		int resize=nums.length-k;
		int i=0;
		int b[]=new int [nums.length];
		for(i=k-1;i>=0;i--){
			b[i]=nums[size];
			size--;
		}
		
		int blength=k;
		
		for(int j=0;j<resize;j++){
			b[blength]=nums[j];
			blength++;
		}
		
		//for(int l=0;l<nums.length;l++){
			System.out.println(Arrays.toString(b));
		//}
	}
}
