

import controller.PlayGame;
import model.Game;
import model.rules.American_Soft17_DealerOnTie;
import model.rules.interfaces.IRulesFactory;
import view.IView;
import view.RulesVisitor;
import view.SimpleView;

public class Program {
	public static void main(String[] a_args)
	  {
		IRulesFactory rules = new  American_Soft17_DealerOnTie();
		RulesVisitor visitor = new RulesVisitor();
	    rules.accept(visitor);
	    
	    
		Game g = new Game(rules);		
	    IView v = new SimpleView(); 
	    PlayGame ctrl = new PlayGame(g,v);
	    
	    
	    while (ctrl.Play());
	  }
}
