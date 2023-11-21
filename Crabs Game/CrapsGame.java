// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  
  public int processRoll(int total){
    int result = 0; // 0 = continue, 1 = win, -1 = lose

    if (point == 0){
      if (total == 7 || total == 11){ // win
        result = 1; // win 
      } else if (total == 2 || total == 3 || total == 12){ // lose
        result = -1; // lose
      } else { // continue
        point = total; // save point for next roll
      }
    } else { // point is not 0
      if (total == point){ // win 
        result = 1; // win
        point = 0; // reset point 
      } else if (total == 7){ // lose 
        result = -1; // lose 
        point = 0; // reset point
      }
    }
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

