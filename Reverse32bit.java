package com.java.practice;

public class Reverse32bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse=reverseInteger(-2147483647);
		System.out.println("reverse of an integer is:" + reverse);
		//System.out.println("Range is true/false:"+range);
		
/*		while((num>0) && range){
			h=num%10;
			r=(r*10)+h;
			num=num/10;
		}
		h=num%10;
		num=-1*(num/10);
		System.out.println("Percentile:"+h);
		System.out.println("Division of negative integer:"+num);
		while((num<0) && range){
			h=num%10;
			r=-(r*10)+h;
			num=-1*(num/10);
		}
		System.out.println("Reverse of an integer:"+r);
		if(b==r){
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}*/
	}
	
	public static int reverseInteger(int number){
		int lastDigit=0;
		int reverse=0;
		boolean range=false;
		int maxInt=(int)Math.pow(2,31)-1;
		int minInt=-maxInt-1;
		
		if(number<=maxInt && number>=minInt){
			range=true;
		}
		boolean isNegative=number<0 ? true : false; 
		if(isNegative){
			number=number*-1;
		}
		if(!range){
			System.out.println("Integer not in range of 32 bit");
		}
		if(number==0)
		{
			return 0;
		}
		else{
				while(number>0){
					lastDigit=number%10;
					reverse=(reverse*10)+lastDigit;
					number=number/10;
			}
		}
		return isNegative==true? reverse*-1:reverse;
	}
}
