package com.java.practice;
import com.java.practice.LC1_TwoSum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

public static void main(String[] args) {
		
		//creating sample Collection
		List<String> myList = new ArrayList<String>();
		 myList.add("Hello");
		 myList.add("Priyanka");
		 myList.add("Hi");
		 myList.add("Venkat");
		
		//traversing using Iterator
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		//forEach with Lambda expression
		myList.forEach(t->System.out.println("ForEach with Lambda::"+t));
		myList.forEach(t->{if("Venkat".equals(t))
			System.out.println("Lambda expression matches with Venkat" + t);
		});
		myList.forEach(System.out::println);
		myList.stream().filter(s->s.contains("Priyanka")).forEach(System.out::println);
		int a[]={2,7,11,15,19};
		final int target=26;
		LC1_TwoSum lc1=new LC1_TwoSum();
		System.out.println(lc1.twoSum(a,target));
	}

	
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<String>{

	public void accept(String t) {
		System.out.println("Consumer impl Value::"+t);
	}
	
	
}
