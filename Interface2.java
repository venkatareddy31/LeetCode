package com.java.practice;

@FunctionalInterface
public interface Interface2 {

	public void method2();
	default void log(String str){
		System.out.println("Interface2 Log value:"+str);
	}
	default void noImplement(String str){
		System.out.println("No need to implement default methods in Java8"+str);
	}
}
