package com.java.practice;
public class ExecutorImpl {

	public static void main(String[] args) {
		
		int a[]={1,8,6,2,5,4,3,8,7};
		String address="140.78.1.4";
		int nums[]={8,1,2,2,3};
		/*LC1295_FindNumbers lc1295=new LC1295_FindNumbers();
		int numOfInt=lc1295.numOfIntegers(a);
		
		System.out.println("Num of even Integers:"+numOfInt);
		
		LC121_StockMaxPrice lc121=new LC121_StockMaxPrice();
		int maxPrice=lc121.maxProfit(a);
		System.out.println("Max Stock Price:"+maxPrice);
		
		LC189_RotateArray lc189=new LC189_RotateArray();
		lc189.rotate(a, 3);
		
		LC1342_numOfStepsToZero lc1342=new LC1342_numOfStepsToZero();
		System.out.println("Number of steps to reduce to zero: " + lc1342.numberOfSteps(123));
		
		LC1281_SubtractProductAndSum lc1281=new LC1281_SubtractProductAndSum();
		System.out.println("Subtracted result of product and sum of Int: " + lc1281.subtractProductAndSum(100));*/
		
		LC11_ContainerWithMostWater lc11=new LC11_ContainerWithMostWater();
		System.out.println("Max Area in a container: " + lc11.maxArea(a));
		
		LC1108_DefangIpAddress lc1108=new LC1108_DefangIpAddress();
		System.out.println("Defanged Ip Address: " + lc1108.defangIPaddr(address));
		LC1365_SmallerNumThanCurrNum lc1365=new LC1365_SmallerNumThanCurrNum();
		//System.out.println("Numbers less than current number: " + lc1365.smallerNumbersThanCurrent(nums));
		int b[]=lc1365.smallerNumbersThanCurrent(nums);
		for(int k:b){
			System.out.println(k +" ");
		}
		/*int a[]={2,7,11,15};
		int target=9;
		LC1_TwoSum_Sol2 lc1=new LC1_TwoSum_Sol2();
		lc1.twoSum(a, target);*/
		/*int a[]={2,7,11,15,19};
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
		 }*/
	}

}
