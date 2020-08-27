package core.java.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T>{

	private Node first;
	private Node last;
	int N;

	/**
	 * Node Class
	 * 
	 * @author pandehar
	 */
	private class Node {
		private T data;
		private Node next;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public LinkedList() {
		first = null;
		last = null;
		N = 0;
	}

	public void addItem(T item) {
		if (item == null)
			throw new NullPointerException("Null can't be added.");
		if (isEmpty()) {
			last = new Node(item, null);
			first = last;
		} else {
			Node prev = last;
			last = new Node(item, null);
			prev.next = last;
		}
		N++;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int getSize() {
		return N;
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addItem("Harshal");
		ll.addItem("Shankarlal");
		ll.addItem("Pande");
		
		Iterator<String> iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>();
	}
	
	class LinkedListIterator<T> implements Iterator<T> {
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current.next != null;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			T item = (T) current.data;
			current = current.next;
			return item;
		}
	}
}