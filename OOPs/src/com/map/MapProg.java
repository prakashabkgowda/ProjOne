package com.map;

import java.util.HashMap;
import java.util.TreeMap;

public class MapProg {
	
	public static void main(String[] args) {
		
		/*HashMap map = new HashMap();
		
		System.out.println(map);
		System.out.println(map.size());
		map.put(1, 10);
		map.put(2, 20);
		map.put(2, 20);
		map.put(3, 20);
		map.put(2, 40);//replace the old value by new value for same  key 
		map.put(0, 70);
		map.put(null, 80); // can use null as key
		map.put(7, null); // can add null as value
		map.put(-1, 100);
		map.put("aa", 30);
		map.put('c', 50);
		map.put(9, 50);
		//map.clear();  // it will remove all the key-values in map
		//System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.get(0));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue(20));
		
		System.out.println(map.remove(0)); //valid
		System.out.println(map.remove(99)); //invalid
		System.out.println(map.remove("abc"));//invalid
		System.out.println(map.remove(2, 40));//valid key and value
		System.out.println(map.remove(88, 30)); //invalid key and valid value
		System.out.println(map.remove(77, "mmm")); //invalid key and value
		*/
		/*System.out.println(map);
		System.out.println(map.entrySet()); //
		System.out.println(map.keySet()); //
		System.out.println(map.values()); //
*/		
		/*System.out.println(map);
		System.out.println(map.size());*/
		
		TreeMap map1 = new TreeMap();
		map1.put(10, 10);
		//map1.put("xyz", 10);
		System.out.println(map1);
	}

}
