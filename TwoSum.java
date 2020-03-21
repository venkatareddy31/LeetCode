package com.java.practice;

public class TwoSum {

	public static void main(String[] args) {
		int a[]={2,7,11,15,19};
		final int target=26;
		boolean isTarget=false;
		 for(int i=0;i<a.length-2;i++){
			 for(int j=i+1;j<=a.length-1;j++){
				 if(a[i]+a[j]==target)
				 {
					 isTarget=true;
					 System.out.println("["+i+","+j+"]");
					 break;
				 }
			 }
		 }
		 if(!isTarget){
			 System.out.println("Target value cannot be summed up with given list");
		 }
	 }
}
