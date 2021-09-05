package gameProject.Adapters;

import java.rmi.RemoteException;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth().getYear());
	}

}
