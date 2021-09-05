package gameProject.Abstract;

import gameProject.Entities.Player;

public interface PlayerService {
	void register(Player player);
	void update(Player player);
	void delete(Player player);
}
