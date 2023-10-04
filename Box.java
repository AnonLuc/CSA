public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasLid;
    // constructor - method that creates/initialize an initializes an instance of a class
    public Box(double l, double w, double h, String c, boolean lid) {
        length = l;
        width = w;
        height = h;
        color = c;
        hasLid = lid;
    }
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        color = "white";
        hasLid = false;
    }
    public static void main(String[] args) {
       Box b1 = new Box(5.6, 2.5 , 3.7, "purple", true);

       Box b2 = new Box(3.4, 1.2, 2.3);
    }
}
