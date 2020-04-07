package com.evolvusion.comparators;

import java.util.Comparator;
import java.util.Map.Entry;

public class MapKeyComparator implements Comparator<Entry<String, String>> {

	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		String v1 = o1.getValue();
		String v2 = o2.getValue();

		return v1.compareTo(v2);
	}

}
