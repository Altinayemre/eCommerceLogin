package eCommerceLoginSystem;

import eCommerceLoginSystem.adapters.JGoogleAccount.JGoogleRegisterManager;
import eCommerceLoginSystem.business.abstracts.UserService;
import eCommerceLoginSystem.business.concretes.UserCheckManager;
import eCommerceLoginSystem.business.concretes.UserManager;
import eCommerceLoginSystem.business.concretes.VerificationManager;
import eCommerceLoginSystem.core.concretes.JGoogleManager;
import eCommerceLoginSystem.dataAccess.concretes.InMemoryUserDao;
import eCommerceLoginSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Emre","Altinay","emre_altinay@hotmail.com","@emma@");
		
		User user2 = new User();
		user2.setId(2);
		user2.setEmail("emre_altinay@hotmail.com");
		user2.setPassword("123456");
		
		User user3 = new User();
		user2.setId(3);
		user3.setEmail("dasdasd@gmail.com");
		user3.setPassword("654321");
		
		//To-Do Spring IoC 
		UserService userService=new UserManager(
				new InMemoryUserDao(),
				new VerificationManager(),
				new UserCheckManager(new InMemoryUserDao()),
				new JGoogleManager(new JGoogleRegisterManager()));

		
		userService.register(user1);
		System.out.println(" ");
		
		userService.registerWithEmailAndPassword(user2);
		System.out.println(" ");
		
		userService.registerWithGoogle(user3);
		System.out.println(" ");
		
		userService.login(user1);
		userService.login(user2);
		userService.login(user3);

		
		
		
	}

}
