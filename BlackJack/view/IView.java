package view;

import model.Card;

public interface IView {
	 void DisplayWelcomeMessage();
	 UserChoice GetInput();
	 void DisplayCard(Card a_card);
	 void DisplayPlayerHand(Iterable<Card> a_hand, int a_score);
	 void DisplayDealerHand(Iterable<Card> a_hand, int a_score);
	 void DisplayGameOver(boolean a_dealerIsWinner);
	 public enum UserChoice{PLAY, HIT, STAND, QUIT, OTHER}
}
