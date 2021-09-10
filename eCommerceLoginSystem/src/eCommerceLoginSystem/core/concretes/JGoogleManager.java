package eCommerceLoginSystem.core.concretes;

import eCommerceLoginSystem.adapters.JGoogleAccount.JGoogleRegisterManager;
import eCommerceLoginSystem.core.abstracts.JGoogleService;
import eCommerceLoginSystem.entities.concretes.User;

public class JGoogleManager implements JGoogleService{

	JGoogleRegisterManager googleRegisterManager;
	
	public JGoogleManager(JGoogleRegisterManager googleRegisterManager) {
		super();
		this.googleRegisterManager = googleRegisterManager;
	}

	@Override
	public void googleWithRegister(User user) {
		
		this.googleRegisterManager.googleRegister(user.getEmail());
		
	}

}
