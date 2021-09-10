package eCommerceLoginSystem.dataAccess.abstracts;


import eCommerceLoginSystem.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void addEmailAndPassword(User user);
	void update(User user);
	void delete(User user);
	
	boolean getByEmail(User user);
	boolean getEmail(String mail);
	boolean getPassword(String password);

}
