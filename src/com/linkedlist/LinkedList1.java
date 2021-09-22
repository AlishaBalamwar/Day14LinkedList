package com.linkedlist;  

public class LinkedList1 {
	
	public ListNode head;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next =  null;
		}
	}
	
	public void displayLinkedList() {
		ListNode current = head;
		while(current!= null) {
			System.out.print(current.data+ "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if(position == 1) {
			node.next = head;
			head = node;
		}else {
			ListNode previous = head;
			int count =1;
			while(count<position-1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	
	public boolean find(int searchKey) {
		if(head==null) {
			return false;
		}
		
		ListNode current = head;
		while(current != null){
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		
		linkedList1.insert( 1,56);
		linkedList1.insert( 2,70);
		linkedList1.insert( 2,30);
		linkedList1.displayLinkedList();
		
		linkedList1.find(30);
	}
}