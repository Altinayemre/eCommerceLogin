package gameProject.Abstract;

import java.rmi.RemoteException;

import gameProject.Entities.Player;

public interface PlayerCheckService {
	boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException ;
}
