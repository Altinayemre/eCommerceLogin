package interfaceAbstractDemo.abstractt;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entites.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
