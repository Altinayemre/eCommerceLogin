package eCommerceLoginSystem.business.abstracts;

import eCommerceLoginSystem.entities.concretes.User;

public interface VerificationService {
	boolean sendToVerifyEmail(User user);
	boolean verifyEmail(User user);
}
