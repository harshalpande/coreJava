package core.java.practice.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class SampleTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();
		
		table.put(23, "harshal");
		table.put(17, "harshal");
		table.put(39, "harshal");
		table.put(21, "harshal");
		
		Iterator<Entry<Integer, String>> iterator = table.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();

			System.out.println(next.getKey() + ":" + next.getValue());
		}

	}

}
