package interfaceAbstractDemo;

import interfaceAbstractDemo.abstractt.*;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concrete.*;
import interfaceAbstractDemo.entites.Customer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerService baseCustomerService = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		
		//you can try
		baseCustomerService.save(new Customer(1,"Emre","Altýnay","12345678900",LocalDate.of(1000,01,10)));
	}

}
