package com.cf.example.CollectionsPractice;

import java.util.Map;
import java.util.TreeMap;

class PartTime {
	int id;
	String name;

	public PartTime(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class TreemapUserDefClassObj {

	public static void main(String[] args) {
		PartTime pt_e1 = new PartTime(101, "abc");
		PartTime pt_e2 = new PartTime(104, "xyz");
		PartTime pt_e3 = new PartTime(102, "uvw");
		Map<Integer, PartTime> map = new TreeMap<Integer, PartTime>();
		map.put(2, pt_e1);
		map.put(1, pt_e2);
		map.put(3, pt_e3);
		for (Map.Entry<Integer, PartTime> m : map.entrySet()) {
			int key = m.getKey();
			System.out.println(key + " Details");
			PartTime p = m.getValue();
			System.out.println(p.name + " " + p.id);
		}

	}

}
