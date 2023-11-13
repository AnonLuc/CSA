package Conditionals;

public class TwoSpinners {
    /**
     * Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */

    int i = 0;

    public int spin(int min, int max) { // Chooses a random number between min and max
        int result = 0;
        result = (int) (Math.random()*(max-min))+min;
        return result;
    }

    /**
     * Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int player = spin(1,10); // Declare the spinners
        int computer = spin(1,10);

        if(player > computer){ // If the player's spinner is > than the computer's spinner
            System.out.println("Player Won: " + (player - computer) + " points \n"); // Print the difference between the two 
        } else if(player < computer){ // If the computer's spinner is > than the player's spinner
            System.out.println("Computer Won: " + (player - computer) + " points \n "); // Print the difference again
        } else if (player == computer){ // If the player's spinner is = to the computer's spinner
            if(i < 2){ // If the round is less than 2
                i++; // Increment the round
                playRound(); // Play another round
            } else { // If the round is greater than 2
                System.out.println("Draw"); // Print "Draw" 
            } 

        }
    }

    public static void main(String[] args) { // Main method
        TwoSpinners ds = new TwoSpinners();
        for (int i = 0; i < 10; i++) {
            ds.playRound();
        }
    }
}
