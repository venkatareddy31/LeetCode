package com.java.practice;

public class LC1295_FindNumbers {

	public int numOfIntegers(int a[]){
		int num=0;
		int oddeven=0;
		int count=0;
		for(int i=0; i<a.length;i++){
			num=a[i];
			while(num>0){
				num=num/10;
				oddeven++;
			}
			if(oddeven%2==0)
				count++;
		}
		return count;
	}
}
