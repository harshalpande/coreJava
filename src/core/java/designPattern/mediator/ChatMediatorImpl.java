package core.java.designPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	List<User> listUser;

	public ChatMediatorImpl() {
		listUser = new ArrayList<>();
	}

	@Override
	public void sendMessage(User user, String message) {
		listUser.forEach(u -> {
			if (u != user) {
				u.receiveMessage(message);
			}
		});
	}

	@Override
	public void addUser(User user) {
		listUser.add(user);
	}

}
