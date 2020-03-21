package com.java.practice;

public class LC1281_SubtractProductAndSum {

	public int subtractProductAndSum(int n) {
		int nProduct=1;
		int nSum=0;
		int nPlace=0;
		while(n!=0){
			nPlace=n%10;
			nProduct=nProduct*nPlace;
			nSum=nSum+nPlace;
			n=n/10;
		}
		return nProduct-nSum;
	}
}
