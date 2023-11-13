package Conditionals;

import java.util.Random;

public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    int result=0;
            Random random = new Random();
            result = random.nextInt((max - min) + 1) + min;
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound(){
            int player1 = spin(1, 10);
            int player2 = spin(1, 10);
            System.out.println("Player 1: " + player1 + " points");
            System.out.println("Player 2: " + player2 + " points");
            if (player1 == player2)
                System.out.println("Draw");
            else if (player1 > player2)
                System.out.println("Player 1 wins \n");
            else
                System.out.println("Player 2 wins \n");
    }

 	public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }

