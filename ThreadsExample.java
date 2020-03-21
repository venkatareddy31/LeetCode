package com.java.practice;
import java.util.Random;

public class ThreadsExample extends Thread {
	static Random gRandom = new Random();
	static int gSharedNumber = 0;
	private int gID;
	
	public ThreadsExample(int id) {
		this.gID = id;
	}

	public void run() {
		for(int i=0;i<20;i++) {
			int number = gSharedNumber;
			System.out.println("SharedData["+gID+"](i="+i+") = "+gSharedNumber);
			try { 
				Thread.sleep(gRandom.nextInt(1000));
			} catch (InterruptedException e) { /* ignore */ }
			if(gID == 0) 
				gSharedNumber = number + 1;
			else gSharedNumber = number + 1000;
		}
	}

	public static void main(String args[]) throws Exception {
		ThreadsExample sd1 = new ThreadsExample(0);
		ThreadsExample sd2 = new ThreadsExample(1);
		sd1.start(); sd2.start();
		sd1.join(); sd2.join();
	}
}
