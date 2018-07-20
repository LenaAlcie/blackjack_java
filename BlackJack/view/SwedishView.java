package view;

import java.io.IOException;

import model.Card;

public class SwedishView implements IView{

	  public void DisplayWelcomeMessage()
      {
       
          for(int i = 0; i < 50; i++) {System.out.print("\n");};

          System.out.println("Hej Black Jack V�rlden");
          System.out.println("----------------------");
          System.out.println("Skriv 'p' f�r att Spela, 'h' f�r nytt kort, 's' f�r att stanna 'q' f�r att avsluta\n");
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
  			
  		}catch(IOException e) {
  			System.out.println("" + e);
  		}  		
  		return null;
      }
      
      public void DisplayCard(Card a_card)
      {
          if (a_card.GetColor() == Card.Color.Hidden)
          {
              System.out.println("Dolt Kort");
          }
          else
          {
              String colors[] = 
                  { "Hj�rter", "Spader", "Ruter", "Kl�ver" };
              String values[] =  
                  { "tv�", "tre", "fyra", "fem", "sex", "sju", "�tta", "nio", "tio", "knekt", "dam", "kung", "ess" };
              System.out.println("" + colors[a_card.GetColor().ordinal()] + " " + values[a_card.GetValue().ordinal()]);
          }
      }
      public void DisplayPlayerHand(Iterable<Card> a_hand, int a_score)
      {
          DisplayHand("Spelare", a_hand, a_score);
      }
      public void DisplayDealerHand(Iterable<Card> a_hand, int a_score)
      {
          DisplayHand("Croupier", a_hand, a_score);
      }
      public void DisplayGameOver(boolean a_dealerIsWinner)
      {
          System.out.println("Slut: ");
          if (a_dealerIsWinner)
          {
              System.out.println("Croupiern Vann!");
          }
          else
          {
              System.out.println("Du vann!");
          }
      }

      private void DisplayHand(String a_name, Iterable<Card> a_hand, int a_score)
      {
          System.out.println(a_name + " Har: " + a_score);
          for(Card c : a_hand)
          {
              DisplayCard(c);
          }
          System.out.println("Po�ng: " + a_score);
          System.out.println("");
      }
}
