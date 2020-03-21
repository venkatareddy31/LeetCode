package com.java.practice;

@FunctionalInterface
public interface Interface1 {

	public void method1(String str);
	default void log(String str){
		System.out.println("Interface1 Log value:"+str);
	}
	static void print(String str){
		System.out.println("Printing String in I1:"+str);
	}
}
