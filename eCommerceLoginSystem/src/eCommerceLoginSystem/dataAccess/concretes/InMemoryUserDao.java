package eCommerceLoginSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceLoginSystem.dataAccess.abstracts.UserDao;
import eCommerceLoginSystem.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	List<String> userEmails = new ArrayList<>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User added: " + user.getFirstName());

	}

	@Override
	public void addEmailAndPassword(User user) {
		users.add(user);
		System.out.println("User added: " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("User updated: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted: " + user.getFirstName());

	}

	@Override
	public boolean getByEmail(User user) {

		boolean result = true;
		if (userEmails.contains(user.getEmail())) {
			System.out.println("Previously used email address. Registration failed!--> "+ user.getEmail());
			result = false;
		} else {
			userEmails.add(user.getEmail());
			result = true;
		}
		return result;

	}

	@Override
	public boolean getEmail(String mail) {
		for (User user : users) {
			if (user.getEmail() == mail) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (User user : users) {
			if (user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
}