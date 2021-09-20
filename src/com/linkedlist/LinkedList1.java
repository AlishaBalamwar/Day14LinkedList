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
	
	/*public void insertAtBegining(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}*/
	
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
	/*public void insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode current =head;
		while(current.next!= null) {
			current = current.next;
		}
		current.next = newNode;
	}*/
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		
		linkedList1.insert( 1,56);
		linkedList1.insert( 2,70);
		linkedList1.insert( 2,30);
		linkedList1.displayLinkedList();
	}
}