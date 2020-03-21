package com.java.practice;

import java.util.HashMap; 

  
// Driver class 
public class HashMapExample { 
    public static void main(String[] args) 
    { 
        HashMap map = new HashMap(); 
        map.put(new HashMapKey("vignesh"), 20); 
        map.put(new HashMapKey("sachin"), 30); 
        map.put(new HashMapKey("vaibhav"), 40); 
        map.put(new HashMapKey("sachin"),60);
  
        System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new HashMapKey("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new HashMapKey("vaibhav"))); 
    } 
} 