public class Complex {

    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this(real, 0.0);
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(0.0, 2.0);
        Complex c2 = new Complex(3.0);
        Complex c3 = new Complex(-3.0, 5.0);
        Complex c4 = new Complex(4.0, -2.0);
        Complex c5 = new Complex(3.0, 5.0);
        Complex c6 = new Complex(4.0, -2.0);
        System.out.println(c1.add(c2));
        System.out.println(c3.add(c4));
        System.out.println(c5.add(c6));


    }

    
}
