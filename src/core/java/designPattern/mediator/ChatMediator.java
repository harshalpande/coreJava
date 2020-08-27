package core.java.designPattern.mediator;

public interface ChatMediator {

	void sendMessage(User user, String message);

	void addUser(User user);

}
