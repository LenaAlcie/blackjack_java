package view;

import model.rules.AmericanNewGameStrategy;
import model.rules.BasicHitStrategy;
import model.rules.DealerWinsTie;
import model.rules.interfaces.IHitStrategy;
import model.rules.interfaces.INewGameStrategy;
import model.rules.interfaces.IRulesFactory;
import model.rules.interfaces.IWinnerOnTie;

public class RulesVisitor implements IVisitor {
	INewGameStrategy game;
	IHitStrategy hit;
	IWinnerOnTie win;

	@Override
	public void visit(IRulesFactory rules) {
		System.out.println("~~Rules played~~");
		
		game = rules.getNewGameStrategy();
		hit = rules.getHitStrategy();
		win = rules.getWinnerOnTie();
		
		System.out.print("Game: ");
		visitGame();
		System.out.print("Hit Rules: ");
		visitHit();
		System.out.print("Winner on Tie: ");
		visitWinner();
	}

	@Override
	public void visitGame() {
		if(game.getClass().equals(AmericanNewGameStrategy.class))
			System.out.print("American.\n");
		else
			System.out.print("International\n");
		
	}

	@Override
	public void visitHit() {
		if(hit.getClass().equals(BasicHitStrategy.class))
			System.out.print("Basic Hit Strategy.\n");
		else
			System.out.print("Soft 17 Hit Strategy.\n");
	}

	@Override
	public void visitWinner() {
		if(win.getClass().equals(DealerWinsTie.class))
			System.out.print("Dealer has advantage.\n");
		else
			System.out.print("Player has advantage.§\n");
	}


}
