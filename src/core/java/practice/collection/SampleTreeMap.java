package core.java.practice.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SampleTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(3, "Harshal");
		map.put(1, "Harshal");
		map.put(2, "Harshal");
		map.put(4, "Harshal");
		map.put(4, "Harshal");
		
		
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();

			System.out.println(next.getKey() + ":" + next.getValue());
		}
	}

}
