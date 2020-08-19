package com.ins.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	{
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Maung Maung");
		hashSet.add("Kyaw Kyaw");
		hashSet.add("Tun Tun");
		hashSet.add("Aye Aye");

		Iterator<String> list = hashSet.iterator();

		while (list.hasNext()) {
			System.out.println(list.next());
		}

		System.out.println(hashSet);
	}
}
