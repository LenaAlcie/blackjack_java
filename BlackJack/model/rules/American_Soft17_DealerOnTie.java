package model.rules;

import model.rules.interfaces.IHitStrategy;
import model.rules.interfaces.INewGameStrategy;
import model.rules.interfaces.IRulesFactory;
import model.rules.interfaces.IWinnerOnTie;
import view.IVisitor;

public class American_Soft17_DealerOnTie implements IRulesFactory {

	@Override
	public INewGameStrategy getNewGameStrategy() {
		return new AmericanNewGameStrategy();
	}

	@Override
	public IHitStrategy getHitStrategy() {
		return new Soft17HitStrategy();
	}

	@Override
	public IWinnerOnTie getWinnerOnTie() {
		return new DealerWinsTie();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}

}
