package core.java.designPattern.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		System.out.println("Enter Text >");
		 
        // create an event emitter - console
        final EventEmitter emitter = new EventEmitter();
 
        // create first observer
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();
 
        // subscribe the observer to the event source
        emitter.addObserver(responseHandler1);
        
        
        // create second observer
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();
 
        // subscribe the observer to the event source
        emitter.addObserver(responseHandler2);
 
        // starts the event thread
        Thread thread = new Thread(emitter);
        thread.start();
	}

}
