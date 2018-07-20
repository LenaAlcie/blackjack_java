package model.rules;

import model.Dealer;
import model.Player;

public class DealerWinsTie implements IWinnerOnTie{

	@Override
	public boolean dealerWins(Player a_player, Dealer a_dealer, int maxScore) {
		int playerScore = a_player.CalcScore();
		
		if(playerScore > maxScore || playerScore >= a_dealer.CalcScore())
			return true;
		return false;
		
	}

	
	
}
