package view;

import java.io.IOException;


import model.Card;

public class SpanishView implements IView {

	@Override
	public void DisplayWelcomeMessage() {
		for(int i = 0; i < 50; i++) {System.out.print("\n");}; 
	       System.out.println("Black Jack para Tontos");
	       System.out.println("Escribe 'j' para jugar, 'c' para pedir carta, 'p' para Plantarse o 's' para salir. ");
		
	}

	@Override
	public UserChoice GetInput() {
		try {
			int choice = System.in.read();
			
			while (choice == '\r' || choice =='\n') {
		           choice = System.in.read();
		         }
			
			if (choice == 'j') {
				return UserChoice.PLAY;
			} else if (choice == 'c') {
				return UserChoice.HIT;
			} else if (choice == 'p') {
				return UserChoice.STAND;
			} else if (choice == 's') {
				return UserChoice.QUIT;
			}
			
		}catch(IOException e) {
			System.out.println("" + e);
		}
		
		return null;
	}

	@Override
	public void DisplayCard(Card a_card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayPlayerHand(Iterable<Card> a_hand, int a_score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayDealerHand(Iterable<Card> a_hand, int a_score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayGameOver(boolean a_dealerIsWinner) {
		// TODO Auto-generated method stub
		
	}

}
