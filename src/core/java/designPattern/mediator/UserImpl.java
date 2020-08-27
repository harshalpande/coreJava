package core.java.designPattern.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	void sendMessage(String message) {
		System.out.println(this.name + " Sending Message " + message);
		mediator.sendMessage(this, message);
	}

	@Override
	void receiveMessage(String message) {
		System.out.println(this.name + " Receiving Message " + message);
	}
}
