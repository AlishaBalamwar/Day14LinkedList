package com.linkedlist;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.linkedlist.*;
import static org.junit.Assert.*;

public class LinkedList1Test {

	@Test
	public void testFind() {
		LinkedList1 linkedList2 = new LinkedList1();
		//linkedList2.find(head,30);
		linkedList2.insert( 1,56);
		linkedList2.insert( 2,70);
		linkedList2.insert( 2,30);
		Assertions.assertTrue(linkedList2.find(30));
	}
}