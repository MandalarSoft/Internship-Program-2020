package com.ins.collectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {
	{
		LinkedList<String> myLinkedList = new LinkedList<String>();
		myLinkedList.add("Kyaw Kyaw");
		myLinkedList.add("Maung Maung");
		myLinkedList.add("Tun Tun");

		myLinkedList.remove(1);

		myLinkedList.clear();

		System.out.println(myLinkedList);
	}
}
