package model.rules;

import model.Dealer;
import model.Player;

public class PlayerWinsTie implements IWinnerOnTie{

	@Override
	public boolean dealerWins(Player a_player, Dealer a_dealer, int maxScore) {
		
		 if(a_dealer.CalcScore() > maxScore || a_dealer.CalcScore() >= a_player.CalcScore())
			 return false;
		 return true;
					
	}

}
