package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstractt.CustomerCheckService;
import interfaceAbstractDemo.entites.Customer;

//fake(test) check service
public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
