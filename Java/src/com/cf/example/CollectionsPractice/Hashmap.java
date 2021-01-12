package com.cf.example.CollectionsPractice;

import java.util.HashMap;
import java.util.Map;
/*NOTE---LinkedHashMap is same as HashMap instead maintains insertion order.
It inherits HashMap class and implements the Map interface.*/
public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(4, "D");
		map.put(3, "B");
		map.put(2, "C");
		//map.remove(3);
		/*int size=map.size();
		System.out.println(size);*/
		//System.out.println(map.containsKey(2));
		System.out.println(map.keySet());
		System.out.println(map);
		for (@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(3);
		System.out.println(map);
		//System.out.println(map.containsValue("D"));
		map.put(null, "junaid");
		System.out.println(map);
		/*map.put(null, "zain");
		System.out.println(map);*/
		
	}

}
