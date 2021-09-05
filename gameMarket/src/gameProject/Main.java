package gameProject;

import java.time.LocalDate;

import gameProject.Abstract.*;
import gameProject.Adapters.*;
import gameProject.Concrete.*;
import gameProject.Entities.*;

public class Main {

	public static void main(String[] args) {
		
		Player player1= new Player(1,"Ahmet","Demir","12345678900",LocalDate.of(1000, 01, 10));
		Player player2= new Player(1,"Emre","Altinay","12345678900",LocalDate.of(1000, 01, 10));
		Game game1 = new Game(1,"Battlefield V",399,"Action-War");
		Campaign campaign1= new Campaign(1,"Christmas sale",30);
		
		
		PlayerService playerService = new PlayerManager(new MernisServiceAdapter());
		playerService.register(player1);
		playerService.register(player2);
	
		

		GameSalesService gameSalesService= new GameSalesManager();
		gameSalesService.sale(game1, player1);
		gameSalesService.campaignWithSale(game1, campaign1, player2);
	}
	
}
