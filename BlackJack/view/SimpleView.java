package view;

import java.io.IOException;

import model.Card;

public class SimpleView implements IView{
	 public void DisplayWelcomeMessage()
     {
       for(int i = 0; i < 50; i++) {System.out.print("\n");}; 
       System.out.println("Hello Black Jack World");
       System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
     }

     public UserChoice GetInput()
     {
    	 try {
 			int choice = System.in.read();

 			while (choice == '\r' || choice =='\n') {
 		           choice = System.in.read();
 		         }
 			
 			if (choice == 'p') {
 				return UserChoice.PLAY;
 			} else if (choice == 'h') {
 				return UserChoice.HIT;
 			} else if (choice == 's') {
 				return UserChoice.STAND;
 			} else if (choice == 'q') {
 				return UserChoice.QUIT;
 			}
 			else {return UserChoice.OTHER;}
 			
 		}catch(IOException e) {
 			System.out.println("" + e);
 		}
 		
 		return null;
     }

     public void DisplayCard(Card a_card)
     {
         System.out.println("" + a_card.GetValue() + " of " + a_card.GetColor());
     }

     public void DisplayPlayerHand(Iterable<Card> a_hand, int a_score)
     {
         DisplayHand("Player", a_hand, a_score);
     }

     public void DisplayDealerHand(Iterable<Card> a_hand, int a_score)
     {
         DisplayHand("Dealer", a_hand, a_score);
     }

     private void DisplayHand(String a_name, Iterable<Card> a_hand, int a_score)
     {
         System.out.println(a_name + " Has: ");
         for(Card c : a_hand)
         {
             DisplayCard(c);
         }
         System.out.println("Score: " + a_score);
         System.out.println("");
     }

     public void DisplayGameOver(boolean a_dealerIsWinner)
     {
         System.out.println("GameOver: ");
         if (a_dealerIsWinner)
         {
             System.out.println("Dealer Won!");
         }
         else
         {
             System.out.println("You Won!");
         }
         
     }
}
