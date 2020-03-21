package com.java.practice;

public class LC1_TwoSum {

	public static void main(String[] args) {
		
		int a[]={2,7,11,15,19};
		int target=26;
		int t[]=twoSum(a,target);
		System.out.println(a);
		for(int i=0;i<2;i++)
			System.out.println(t[i]);
	}

public static  int[] twoSum(int[] a, int target) {
	 for(int i=0;i<a.length-2;i++){
		 for(int j=i+1;j<=a.length-1;j++){
			 if(a[i]+a[j]==target)
			 {
				 return new int[] { i, j };
			 }
		 }
	 }
	 throw new IllegalArgumentException("No two sum solution");
   }
}