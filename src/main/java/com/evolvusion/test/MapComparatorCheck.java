package com.evolvusion.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.evolvusion.comparators.MapKeyComparator;

public class MapComparatorCheck {
	public static void main(String[] args) {
		
		MapKeyComparator mkc = new MapKeyComparator();
		
		Map<String,String> mp= new HashMap<>();
		
		
		
		mp.put("1", "one");
		mp.put("2", "two");
		mp.put("3", "three");
		
		Set<Entry<String, String>> ent= mp.entrySet();
		
		for(Entry<String, String> en:ent) {
			System.out.println(en.getKey());
		}
		
		mp.entrySet().forEach(System.out::println);
		
	}
}
