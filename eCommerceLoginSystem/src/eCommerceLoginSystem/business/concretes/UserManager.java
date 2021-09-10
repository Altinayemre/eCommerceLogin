package eCommerceLoginSystem.business.concretes;

import eCommerceLoginSystem.business.abstracts.UserCheckService;
import eCommerceLoginSystem.business.abstracts.UserService;
import eCommerceLoginSystem.business.abstracts.VerificationService;
import eCommerceLoginSystem.core.abstracts.JGoogleService;
import eCommerceLoginSystem.dataAccess.abstracts.UserDao;
import eCommerceLoginSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private VerificationService verificationService;
	private UserCheckService checkService;
	private JGoogleService googleService;

	public UserManager() {
		// TODO Auto-generated constructor stub
	}

	public UserManager(UserDao userDao, VerificationService verificationService, UserCheckService checkService,JGoogleService googleService)
	{
		this.userDao = userDao;
		this.verificationService = verificationService;
		this.checkService = checkService;
		this.googleService = googleService;
	}

	@Override
	public void registerWithEmailAndPassword(User user) {

		if (this.checkService.emailPasswordisValid(user)) {
			userDao.addEmailAndPassword(user);
		} else {

			return;
		}

		if (this.verificationService.sendToVerifyEmail(user)) {
			System.out.println("Verification email sended: " + user.getEmail());

		} else {
			System.out.println("Failed to send verification email!");
		}

		if (this.verificationService.verifyEmail(user)) {
			System.out.println("Verification successful!");
		} else {
			System.out.println("Verification failed!");
		}

	}

	@Override
	public void register(User user) {

		try {
			if (this.checkService.isValid(user)) {
				userDao.add(user);
			} else {
				return;
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + ": Please fill in all fields.");
			return;
		}

		if (this.verificationService.sendToVerifyEmail(user)) {
			System.out.println("Verification email sended: " + user.getEmail());

		} else {
			System.out.println("Failed to send verification email!");
		}

		if (this.verificationService.verifyEmail(user)) {
			System.out.println("Verification successful!");
		} else {
			System.out.println("Verification failed!");
		}
	}

	@Override
	public void registerWithGoogle(User user) {
		if (checkService.emailPasswordisValid(user)) {
			userDao.addEmailAndPassword(user);
			this.googleService.googleWithRegister(user);
		}

	}

	@Override
	public void login(User user) {

		if (this.userDao.getEmail(user.getEmail()) && this.userDao.getPassword(user.getPassword())&&this.verificationService.verifyEmail(user)) {
			System.out.println("Login successful: " + user.getEmail());
		} else if (this.verificationService.verifyEmail(user)==false){
			System.out.println("unverified user login failed.");
		} else {
			System.out.println("Login failed!");
		}

	}

}
