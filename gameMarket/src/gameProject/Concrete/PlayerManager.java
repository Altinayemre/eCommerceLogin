package gameProject.Concrete;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Abstract.PlayerService;
import gameProject.Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckService checkService;
	
	public PlayerManager(PlayerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void register(Player player) {
		
			try {
				if(this.checkService.checkIfRealPlayer(player)) {
					System.out.println("Player added! "+player.getFirstName()+" "+player.getLastName());
				} else {
					throw new Exception("Not valid a player!");
				}
			} catch (Exception e) {
				
				System.out.println("Exception type: "+e);
			}
		
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player updated! "+player.getFirstName()+" "+player.getLastName());
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player deleted! "+player.getFirstName()+" "+player.getLastName());
		
	}

}


