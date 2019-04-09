package core.java.designPattern.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventEmitter extends Observable implements Runnable {

	@Override
	public void run() {

		final InputStreamReader isr = new InputStreamReader(System.in);
		final BufferedReader br = new BufferedReader(isr);
		while (true) {
			String response = null;
			try {
				response = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			setChanged();
			notifyObservers(response);
		}
	}
}
