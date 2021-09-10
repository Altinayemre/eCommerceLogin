package eCommerceLoginSystem.business.abstracts;

import eCommerceLoginSystem.entities.concretes.User;

public interface UserService {
	void register(User user);
	void registerWithEmailAndPassword(User user);
	void registerWithGoogle(User user);
	void login(User user);
	
}
