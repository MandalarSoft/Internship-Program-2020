package com.ins.collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Maung Maung");
		linkedHashSet.add("Kyaw Kyaw");
		linkedHashSet.add("Tun Tun");
		linkedHashSet.add("Aye Aye");

		Iterator<String> it = linkedHashSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(linkedHashSet);
	}
}
