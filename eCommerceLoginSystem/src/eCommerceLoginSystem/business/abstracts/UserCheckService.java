package eCommerceLoginSystem.business.abstracts;

import eCommerceLoginSystem.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean isValid(User user);
	boolean uniqEmail(User user);
	boolean emailPasswordisValid(User user);
}
