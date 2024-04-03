public class Poem {
    private int lines;

    public Poem(int lines) {
        this.lines = lines;
    }

    public int getNumlines() {
        return lines;
    }

    public void printRhythm() {
        for (int i = 0; i < lines; i++) {
            System.out.print("Free Verse! ");
        }
        System.out.println();
    }

}
