package com.ins.collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	{
		ArrayList<String> oldList = new ArrayList<String>();
		oldList.add("Kyaw Kyaw");
		oldList.add("Maung Maung");

		ArrayList<String> myList = new ArrayList<>();
		myList.add("Kyaw Kyaw");
		myList.add("Maung Maung");
		myList.add("Tun Tun");

		myList.clear();

		System.out.println(myList.size());
		System.out.println(myList);
	}
}
