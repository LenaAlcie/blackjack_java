package view;

import model.rules.interfaces.IRulesFactory;

public interface IVisitor {
	void visit(IRulesFactory rules);
	void visitGame();
	void visitHit();
	void visitWinner();
}
