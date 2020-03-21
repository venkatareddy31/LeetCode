package com.java.practice;

public class LinkdList {

	public static ListNode getListNode1(){
		
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		
		return l1;
	}
	
	public static ListNode getListNode2(){
		
		ListNode l1=new ListNode(4);
		ListNode l2=new ListNode(5);
		ListNode l3=new ListNode(6);
		
		l2=l1.next=l2;
		l1.next.next=l3;
		l3.next=null;
		
		return l1;
	}
	
	public static String printListNode(ListNode l1){
		
		StringBuilder result=new StringBuilder();
		while(l1!=null){
			result=result.append(l1.val + " -> ");
			l1=l1.next;
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
