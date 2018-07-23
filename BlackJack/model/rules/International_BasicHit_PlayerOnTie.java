package model.rules;

import model.rules.interfaces.IHitStrategy;
import model.rules.interfaces.INewGameStrategy;
import model.rules.interfaces.IRulesFactory;
import model.rules.interfaces.IWinnerOnTie;
import view.IVisitor;
/*
 * Example class of possible game modes using the IRulesFactory
 * */
public class International_BasicHit_PlayerOnTie implements IRulesFactory {

	@Override
	public INewGameStrategy getNewGameStrategy() {
		return new InternationalNewGameStrategy();
	}

	@Override
	public IHitStrategy getHitStrategy() {
		return new BasicHitStrategy();
	}

	@Override
	public IWinnerOnTie getWinnerOnTie() {
		return new PlayerWinsTie();
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
