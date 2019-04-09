package core.java.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		String response = null;
		if (arg1 instanceof String) {
			response = (String) arg1;
		}
		System.out.println("State of Object Changed. New State is : " + response);
	}

}
