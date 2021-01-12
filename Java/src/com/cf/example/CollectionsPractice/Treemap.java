package com.cf.example.CollectionsPractice;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer, String>();
		map.put(0, "A");
		map.put(2, "B");
		map.put(1, "C");
		System.out.println(map);
		 for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		//System.out.println(map.get(1));
		//map.replace(1, "Y");
		//System.out.println(map);
		/*Map<Integer,String> map1=new TreeMap<Integer, String>();
		map1.put(1, "X");
		map1.put(3, "Z");
		System.out.println(map1);
		map1.putAll(map);
		System.out.println(map1);*/
		 
	}

}
