public class Die {

    int numDots; // number of faces
    
    public void roll() { // rolls the die to randomly get a value between 1 and the number of faces
        numDots = (int) (Math.random() * 6) + 1; 
    }

    public int getNumDots() { // returns number of dots
        return numDots;
    }
    
    public static void main(String[] args) { // main for testing
        Die die = new Die();
        die.roll();
       System.out.println(die.getNumDots());
    }
}
