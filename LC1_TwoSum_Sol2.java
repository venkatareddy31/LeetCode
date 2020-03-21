package com.java.practice;

import java.util.HashMap;

public class LC1_TwoSum_Sol2 {

	public int[] twoSum(int a[], int target){
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++){
			map.put(a[i], i);
		}
		
		for(int i=0;i<a.length;i++){
			int complement=target-a[i];
			if(map.containsKey(complement)&&map.get(complement)!=i){
				return new int[]{i,map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}
}
