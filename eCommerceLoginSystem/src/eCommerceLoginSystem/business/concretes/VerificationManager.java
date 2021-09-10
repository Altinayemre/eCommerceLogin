package eCommerceLoginSystem.business.concretes;

import eCommerceLoginSystem.business.abstracts.VerificationService;
import eCommerceLoginSystem.entities.concretes.User;

public class VerificationManager implements VerificationService {
	
	
	
	@Override
	public boolean sendToVerifyEmail(User user) {
			
				return true;
			
	}

	@Override
	public boolean verifyEmail(User user) {

		if (sendToVerifyEmail(user)) {
			return true;
		} else {
			return false;
		}

	}

}
