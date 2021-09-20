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
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		linkedList1.head = new ListNode(56);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(70);
		
		linkedList1.head.next = second;
		second.next = third;
		third.next = null;
		
		linkedList1.displayLinkedList();
	}
}
