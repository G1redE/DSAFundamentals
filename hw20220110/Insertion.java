package com.dsa.hw20220110;



class Node{
	static Node head;
	int value;
	Node next;
	Node(int val){
		this.value =val;
		this.next = null;
		
	}
	
	public static void delete() {
		Node curr = head;
		Node prev = curr;
		while(curr.next!=null) {
			prev = curr;
			curr=curr.next;
		}
		prev.next=null;
	}
	
	public static void deleteatn(int n) {
		Node curr = head;
		
		
		int Count = 1;
		Node temp=null;
		boolean flag=false;
		if(n==1) {
			curr=curr.next;
			head = curr;
			flag=true;
		}
		Node prev = curr;
		while(curr.next!=null) {
			Count+=1;
			curr=curr.next;
            if(Count==n) {
			    flag=true;
            	break;
			}
		}
		
		
		if(!flag){
			System.out.println("Mentioned index is incorrect");
	}
		else
			prev.next =curr.next;
			
	}
	
	public static void insert(Node n) {
		if(head==null) {
			head=n;
		    return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=n;
	}
	
	public static void insertatn(Node node,int n ) {
		int Count = 1;
		Node temp=null;
		boolean flag=false;
		if(head==null) {
			head=node;
			Count+=1;
		    return;
		}
		Node curr = head;
		if(n==1) {
			temp = head;
			node.next =temp;
			head=node;
			flag=true;
		}
		
		while(curr.next!=null) {
			Count+=1;
			if(Count==n) {
				flag=true;
				temp=curr.next;
				curr.next=node;
				node.next=temp;
				break;
			}
			curr=curr.next;
		}
		if(!flag){
			System.out.println("Mentioned index is incorrect");
		}
	}
		
	public static void print() {
		Node curr = head;
		while(curr.next!=null) {
			System.out.println(curr.value);
			curr=curr.next;
		}
		System.out.println(curr.value);
	}
	
	public static void print(int n) {
		Node curr = head;
		int count = 1;
		while(curr.next!=null) {
			if(count>=n) {
				System.out.println(curr.value);
			}
			count+=1;
			curr=curr.next;
		}
		if(count>=n)
		System.out.println(curr.value);

	}
	
	public static void search(int n) {
		Node curr = head;
		int count = 1;
		boolean flag=false;
		while(curr.next!=null) {
			if(curr.value==n) {
				System.out.println(count);
				flag=true;
			}
			count+=1;
			curr=curr.next;
		}
		if(!flag)
		System.out.println(-1);
	}
}

public class Insertion {
	

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node.insert(n1);
		Node.insert(n2);
		Node.insertatn(n3, 1);
     	Node.insert(n4);
//	    Node.deleteatn(1);
//		Node.search(3);
		Node.print();
		Node.print(5);
	}

}
