package eCommerceLoginSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceLoginSystem.business.abstracts.UserCheckService;
import eCommerceLoginSystem.dataAccess.abstracts.UserDao;
import eCommerceLoginSystem.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	UserDao userDao;

	public UserCheckManager(UserDao userDao) {

		this.userDao = userDao;
	}

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().length() < 2) {
			System.out.println("The name must be at least 2 characters.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("The surname must be at least 2 characters.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()) {
			return true;
		}
		System.out.println("invalid email!");
		return false;
	}

	@Override
	public boolean uniqEmail(User user) {

		if (this.userDao.getByEmail(user)) {
			return true;
		}
		return false;

	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Password must be at least 6 characters!");
			return false;
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user) && uniqEmail(user)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean emailPasswordisValid(User user) {
		if (checkEmail(user) && checkPassword(user) && uniqEmail(user)) {
			return true;
		}
		return false;
	}
}
