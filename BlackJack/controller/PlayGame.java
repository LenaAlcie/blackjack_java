package controller;


import model.Game;
import model.IObserver;
import view.IView;
import view.IView.UserChoice;

public class PlayGame implements IObserver {
	
	
	private Game game;
	private IView view;
	
	/*CONSTRUCTOR*/
	public PlayGame(Game game, IView view) {
		this.game = game;
		this.view = view;
	}
	
	public boolean Play() {
		    view.DisplayWelcomeMessage();
		    
		    view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
		    view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());

		    if (game.IsGameOver())
		    {
		        view.DisplayGameOver(game.IsDealerWinner());
		    }

		    UserChoice input = view.GetInput();
		    
		    switch(input) {
		    case PLAY:
		    	game.NewGame();
		    	break;
		    case STAND:
		    	game.Stand();
		    	break;
		    case HIT:
		    	game.Hit();
		    	break;
		    case QUIT:
		    	return false;
		    default:
		    	break;
		    
		    }
			return true;	    
		    
		  }

	@Override
	public void playerCardsUpdated() {
		// TODO Auto-generated method stub
		
		try {
			
			
			view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
			view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());

			if(game.IsGameOver()) {
				view.DisplayGameOver(game.IsDealerWinner());
			}
			
			Thread.sleep(2500);
			
		}catch(InterruptedException e) {
			System.out.println("Problem in thread ->" + e.getMessage());
		}
		 
	}
	
	
}
