package core.java.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String response = null;
		if (arg instanceof String) {
			response = (String) arg;
		}
		System.out.println("State of Object Changed. New State is : " + response);

	}

}
