public class Haiku extends Poem{
    
    public Haiku() {
        super(3);
    }

    public int getSyllables(int line) {
        if (line == 1 || line == 3) {
            return 5;
        } 
        else {
            return 7;
        }
    }
    
    public void printRhythm() {
        System.out.println("Haiku! Haiku! Haiku!");
        System.out.println("Haiku! Haiku!");
        System.out.println("Haiku! Haiku! Haiku!");
    }
}
