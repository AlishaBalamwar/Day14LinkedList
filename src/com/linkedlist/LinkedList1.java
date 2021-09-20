package com.linkedlist;

import java.util.*;

public class LinkedList1 {
	
	private ListNode head;
	
	private static class ListNode{
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
	
	public ListNode popLast() {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		
		linkedList1.insert( 1,56);
		linkedList1.insert( 2,70);
		linkedList1.insert( 2,30);
		linkedList1.displayLinkedList();
		
		System.out.println(linkedList1.popLast().data);
		linkedList1.displayLinkedList();
	}
}