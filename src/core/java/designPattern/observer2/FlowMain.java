package core.java.designPattern.observer2;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class FlowMain {

	public static void main(String args[]) {
		List<Integer> items = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
		publisher.subscribe(new MySubscriber<>());
		items.forEach(s -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			publisher.submit(s);
		});
		publisher.close();
	}
}
