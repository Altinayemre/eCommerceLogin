package interfaceAbstractDemo.concrete;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstractt.BaseCustomerService;
import interfaceAbstractDemo.abstractt.CustomerCheckService;
import interfaceAbstractDemo.entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerService{

	CustomerCheckService checkService;
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		try {
			if(this.checkService.checkIfRealPerson(customer)) {
				System.out.println("Saved to db : "+customer.getFirstName()+" "+customer.getLastName());
			} else {
				System.out.println("Save operation failed");
			}
		} catch (NumberFormatException | RemoteException e) {
	
			e.printStackTrace();
		}
	}

}
