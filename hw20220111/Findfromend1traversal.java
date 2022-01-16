package com.dsa.hw20220111;
public class Findfromend1traversal {
	public static void findelementfromend(Node head,int k) {
		Node curr = head;
		for(int i=0;curr!=null&&i<k;i++) {
			curr =curr.next;
			if(curr==null & i!=k-1)
				return;
		}
		while(curr!=null) {
			head=head.next;
			curr=curr.next;
		}
		System.out.println(head.value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		int input[] = {1,2,3,4,5};
		for(int i=input.length-1;i>=0;i--) {
			head = new Node(input[i],head);
		}
		int k = 5;
		findelementfromend(head,k);

	}

}
