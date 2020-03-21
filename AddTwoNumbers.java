package com.java.practice;

public class AddTwoNumbers {

	static Node head1, head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	Node addTwoLists(Node list1, Node list2){
		
		Node res=null;
		Node prev=null;
		Node temp=null;
		
		int carry=0, sum;
		
		while(list1!=null || list2!=null){
			
			sum=carry+(list1!=null?list1.data:0)+
					(list2!=null?list2.data:0);
			carry=(sum>=10)?1:0;
			sum=sum%10;
			
			temp=new Node(sum);
			
			if(res==null){
				res=temp;
			}
			else
			{
				prev.next=temp;
			}
			
			prev=temp;
			
			if(list1!=null){
				list1=list1.next;
			}
			if(list2!=null){
				list2=list2.next;
			}
			
			if(carry>0){
				temp.next=new Node(carry);
			}
		}
		return res;
	}
	
	void printList(Node head){
		while(head!=null){
			System.out.println(head.data+" ");
			head=head.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddTwoNumbers list = new AddTwoNumbers(); 
		  
        // creating first list 
        list.head1 = new Node(7); 
        list.head1.next = new Node(5); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(4); 
        list.head1.next.next.next.next = new Node(6); 
        System.out.print("First List is "); 
        list.printList(head1); 
  
        // creating seconnd list 
        list.head2 = new Node(8); 
        list.head2.next = new Node(4); 
        System.out.print("Second List is "); 
        list.printList(head2); 
  
        // add the two lists and see the result 
        Node rs = list.addTwoLists(head1, head2); 
        System.out.print("Resultant List is "); 
        list.printList(rs); 

	}

}
