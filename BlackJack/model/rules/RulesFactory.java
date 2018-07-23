package model.rules;

import model.rules.interfaces.IHitStrategy;
import model.rules.interfaces.INewGameStrategy;
import model.rules.interfaces.IWinnerOnTie;

public class RulesFactory {

	 public IHitStrategy GetHitRule() {
		    return new Soft17HitStrategy();
		  }

	public INewGameStrategy GetNewGameRule() {
		    return new AmericanNewGameStrategy();
		  }
	
	public IWinnerOnTie GetWinnerOnTie() {
		return new PlayerWinsTie();
	}
}
