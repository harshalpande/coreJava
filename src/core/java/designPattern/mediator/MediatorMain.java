package core.java.designPattern.mediator;

public class MediatorMain {
	
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "Harshal");
		User user2 = new UserImpl(mediator, "Shankarlal");
		User user3 = new UserImpl(mediator, "Jatin");
		User user4 = new UserImpl(mediator, "Adee");
		User user5 = new UserImpl(mediator, "Anuj");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		
		user1.sendMessage("Hello All");
		user1.sendMessage("Good Evening");
	}
}
