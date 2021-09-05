package gameProject.Abstract;

import gameProject.Entities.*;

public interface GameSalesService {
	void sale(Game game,Player player);
	void campaignWithSale(Game game,Campaign campaign,Player player );
}
