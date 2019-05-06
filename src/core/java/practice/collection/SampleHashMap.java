package core.java.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SampleHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(null, "harshal");
		map.put(null, "Suraj");
		map.put(1, "Shankarlal");
		map.put(1, "Shaila");

		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();

			System.out.println(next.getKey() + ":" + next.getValue());
		}

	}

}
