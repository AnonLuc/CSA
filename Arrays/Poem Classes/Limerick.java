public class Limerick {
    
    private int lines = 5;

    public int getNumlines() {
        return lines;
    }

    public int getSyllables(int line) {
        if (line == 1 || line == 2 || line == 5) {
            return 8;
        } 
        else {
            return 5;
        }
    }
    // make printRhythm
    public void printRhythm() {
        System.out.println("");
    }

}
