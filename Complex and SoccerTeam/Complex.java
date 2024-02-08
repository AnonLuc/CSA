public class Complex {

    private double real; 
    private double imag;

    public Complex(double real, double imag) {
        this.real = real; // this is used to refer to the current object
        this.imag = imag; 
    }

    public Complex(double real) {
        this(real, 0.0); 
    }

    public String toString() {
        return real + " + " + imag + "i"; // i is the imaginary unit
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag); // sqrt == square root
    }

    public Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag); // adding the real and imaginary parts of the two complex numbers
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(0.0, 2.0); // 0 + 2i
        Complex c2 = new Complex(3.0); // 3 + 0i
        Complex c3 = new Complex(-3.0, 5.0); // -3 + 5i
        Complex c4 = new Complex(4.0, -2.0); // 4 - 2i
        Complex c5 = new Complex(3.0, 5.0); // 3 + 5i
        Complex c6 = new Complex(4.0, -2.0); // 4 - 2i
        System.out.println(c1.add(c2)); // 3 + 2i (output)
        System.out.println(c3.add(c4)); // 1 + 3i (output)
        System.out.println(c5.add(c6)); // 7 + 3i (output)


    }

    
}
