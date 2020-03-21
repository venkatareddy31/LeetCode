package com.java.practice;

public class LinkedListEx {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static LinkedListEx insert(LinkedListEx list, int data){
		
		Node new_node = new Node(data); 
        new_node.next = null; 
        
        if(list.head==null){
        	list.head=new_node;
        }
        else{
        	Node last=list.head;
        	while(last.next!=null){
        		last=last.next;
        	}
        	last.next=new_node;
        }
        return list;
	}
	
	// Method to print the LinkedList. 
    public static void printList(LinkedListEx list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListEx list = new LinkedListEx(); 
		  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
	}

}