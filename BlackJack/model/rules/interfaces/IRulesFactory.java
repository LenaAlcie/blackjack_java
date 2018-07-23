package model.rules.interfaces;

import view.IVisitor;

public interface IRulesFactory {
	INewGameStrategy getNewGameStrategy();
	IHitStrategy getHitStrategy();
	IWinnerOnTie getWinnerOnTie();
	void accept(IVisitor visitor);
}
