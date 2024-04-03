public class Poem {
    private int lines;

    public Poem(int lines) {
        this.lines = lines;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public void display() {
        System.out.println("Poem has " + lines + " lines.");
    }

    public static void main(String[] args) {
        Poem poem = new Poem(10);
        poem.display();
    }

    
}
