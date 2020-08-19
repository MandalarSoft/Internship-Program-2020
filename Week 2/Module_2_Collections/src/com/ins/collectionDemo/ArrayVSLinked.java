package com.ins.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSLinked {
	{
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		listInit(arrayList);
		listInit(linkedList);

		System.out.println(performanceMeeter(arrayList));
		System.out.println(performanceMeeter(linkedList));
	}

	public static long performanceMeeter(List<String> list) {
		long currentTimeA = System.nanoTime();
		list.remove(700000);
		long currentTimeB = System.nanoTime();
		long exeTime = currentTimeB - currentTimeA;
		return exeTime;
	}

	public static void listInit(List<String> list) {
		for (int i = 0; i < 800000; i++) {
			list.add("Element : " + i);
		}
	}
}
