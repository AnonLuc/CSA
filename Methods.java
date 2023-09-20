public class Methods {
    public static void main(String[] args) {
        method1(5);
        method1(92);
        int y = method2("Bob", 7);
        System.out.println(y);
        int z = method2("Lucas", 16);
        System.out.println(z);
    }

    public static int method2(String name, int x) {
        System.out.println("Hello " + name);
        int y = x%2;
        return y;
    }

    public static void method1(int x) {
        int y = x +1;
        System.out.println("One more than " + y);
    }
}
