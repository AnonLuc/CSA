public class Die {

    private int numDots;  // number of dots on the die's face
    private int numFaces; // number of faces on the die

    public Die(int faces) { // constructor, sets number of dots to 1 and number of faces to the given value
        numDots = 1;
        numFaces = faces;
    }

    public Die() {
        numDots = 1;
        numFaces = 6;
    }

    public void roll() { // rolls the die to randomly get a value between 1 and the number of faces
        numDots = (int) (Math.random() * numFaces) + 1;
    }

    public int getNumDots() { // returns number of dots
        return numDots;
    }

    public int getNumFaces() { // returns number of faces
        return numFaces;
    }
    
    public static void main(String[] args) { // main for testing
        Die die = new Die();
        die.roll();
       System.out.println(die.getNumDots());
    }
}
