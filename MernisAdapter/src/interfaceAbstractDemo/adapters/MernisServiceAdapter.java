package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstractt.CustomerCheckService;
import interfaceAbstractDemo.entites.*;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalIdentity()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
	}

}
