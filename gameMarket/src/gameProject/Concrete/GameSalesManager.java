package gameProject.Concrete;

import gameProject.Abstract.GameSalesService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class GameSalesManager implements GameSalesService{

	@Override
	public void sale(Game game, Player player) {
		System.out.println(player.getFirstName()+": "+game.getName()+" price --> "+game.getUnitPrice()+" he bought!");
		
	}

	@Override
	public void campaignWithSale(Game game, Campaign campaign, Player player) {
	double result=game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscountRate()/100);
	System.out.println(player.getFirstName()+": "+game.getName()+" discount price --> "+result+" he bought!");
		
	}

}
