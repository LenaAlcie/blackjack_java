package model.rules;

import model.Card;
import model.Player;
import model.Card.Value;

/*
 * Soft 17 requires the dealer to hit on soft 17
 * Example: Ace + 3 + 3
 * 
 * if (total score < 17)
 * 	r: true
 * 
 * if(total score == 17)
 *  	if (has an ace)
 *  		r: true
 * else
 * 	r: false
 * 
 * */

public class Soft17HitStrategy implements IHitStrategy{

	private final int g_hitLimit = 17;

	@Override
	public boolean DoHit(Player a_dealer) {
		int dealerScore = a_dealer.CalcScore();
		
		if(dealerScore == g_hitLimit) {
			for (Card card : a_dealer.GetHand()) {
				if(card.GetValue() == Value.Ace) {
					return true;
				}
			}
		}		
		return dealerScore < g_hitLimit;		
	}

}
 