package com.java.practice;

public class LC121_StockMaxPrice {

	public int maxProfit(int[] prices) {
        
		int transaction=0;
		//int profit=0;
		int maxProfit=0;
		for(int i=0;i<prices.length-1;i++){
			for(int j=i+1;j<prices.length;j++){
				transaction=prices[j]-prices[i];
				if(transaction>0 && transaction>maxProfit)
				{
					maxProfit=transaction;
				}
				/*if(diffVal>0){
					profit=diffVal;
				}
				else
					continue;
				if(profit>maxProfit){
					maxProfit=profit;
				}
				else
					continue;*/
			}
		}
		return maxProfit;
    	}
}
