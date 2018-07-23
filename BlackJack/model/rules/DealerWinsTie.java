package model.rules;

import model.Dealer;
import model.Player;
import model.rules.interfaces.IWinnerOnTie;

public class DealerWinsTie implements IWinnerOnTie{

	@Override
	public boolean dealerWins(Player a_player, Dealer a_dealer, int maxScore) {
		
		if(a_player.CalcScore() > maxScore || a_player.CalcScore() >= a_dealer.CalcScore())
			return true;
		return false;
		
	}

	
	
}
