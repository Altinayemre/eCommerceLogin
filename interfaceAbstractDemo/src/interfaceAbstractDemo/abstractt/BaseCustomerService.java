package interfaceAbstractDemo.abstractt;

import interfaceAbstractDemo.entites.Customer;

public abstract class BaseCustomerService implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName()+" "+customer.getLastName());
		
	}
	 
	
	
}
