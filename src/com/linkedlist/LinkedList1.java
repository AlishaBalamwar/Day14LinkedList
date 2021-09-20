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
	
	public void insertAtBegining(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		
		linkedList1.insertAtBegining(70);
		linkedList1.insertAtBegining(30);
		linkedList1.insertAtBegining(56);
		linkedList1.displayLinkedList();
	}
}
