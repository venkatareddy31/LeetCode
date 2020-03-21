package com.java.practice;

public class LC1342_numOfStepsToZero {

	 public int numberOfSteps (int num) {
	        
		 int count=0;
		 
		 while(num!=0){
			 if(num==0)
				 break;
			 if(num%2==0){
				 count++;
				 num=num/2;
			 }
			 else
			 {
				 num=num-1;
				 count++;
			 }
		 }
		 return count;
	    }
}
