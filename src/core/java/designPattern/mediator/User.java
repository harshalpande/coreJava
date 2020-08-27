package core.java.designPattern.mediator;

public abstract class User {

	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	abstract void sendMessage(String Message);

	abstract void receiveMessage(String Message);

}
