public class Haiku {
    private int lines = 3;

    public int getNumlines() {
        return lines;
    }

    public int getSyllables(int line) {
        if (line == 1 || line == 3) {
            return 5;
        } 
        else {
            return 7;
        }
    }
    // make printRhythm
    public void printRhythm() {
        System.out.println("Fee fi fo fum");
    } 

}
