package com.java.practice;

public class LC1365_SmallerNumThanCurrNum {
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        	int count=0;
        	for(int j=0;j<nums.length;j++){
        		if(nums[i]>nums[j]){
        			count++;
        		}
        		b[i]=count;
        	}
        }
		return b;
	}
}
