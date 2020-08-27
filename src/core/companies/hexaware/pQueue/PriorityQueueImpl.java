package core.companies.hexaware.pQueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class PriorityQueueImpl {
	
	static Queue<Integer> pQueue;
	
	public static void main(String[] args) {
		
		pQueue = new PriorityQueue<>();
		pQueue.add(10);
		pQueue.add(2);
		pQueue.add(5);
		pQueue.add(15);
		
		callPrintLine();

		// 1. The one which gets added first gets removed first
		pQueue.remove();
		pQueue.remove();
		pQueue.remove();
		pQueue.remove();

		// 2. pQueue.poll() method removes the last element added without NoSuchElementException unlike remove()
		pQueue.poll();
		
		
		callPrintLine();
	}
	
	private static void callPrintLine() {
		pQueue.stream().forEach(p -> System.out.print(p + ", "));
		System.out.println();
		String collect = pQueue.stream().map(p -> String.valueOf(p)).collect(Collectors.joining(", "));
		System.out.println(collect);
	}

}
