public class Factorials {
    
    // Question 1

    public static long calcFactorial(int num) { // long is used to store large numbers
        long result = 1; 
        for (int i = 1; i <= num; i++) { // i starts at 1 and goes up to num
            result *= i; // result = result * i 
        }
        return result; 
    }

    // Question 2
    public static double calcE(){
        double currentE = 1; 
        double oldE = 0;
        int i = 1;

        while(currentE - oldE > 0.001){ // while the difference between the currentE and oldE is greater than 0.001
            oldE = currentE; // oldE is now the currentE
            currentE += (1.0 / calcFactorial(i)); // currentE is now the currentE + 1 / i!
            i++; // increment 1
        }

        return currentE; 
    }

    
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1: \n");
        System.out.println(calcFactorial(1));
        System.out.println(calcFactorial(2));
        System.out.println(calcFactorial(3));
        System.out.println(calcFactorial(4));
        System.out.println(calcFactorial(5));
        System.out.println(calcFactorial(6));
        System.out.println(calcFactorial(7));
        System.out.println(calcFactorial(8));
        System.out.println(calcFactorial(9));
        System.out.println(calcFactorial(10));
        System.out.println(calcFactorial(11));
        System.out.println(calcFactorial(12));
        System.out.println(calcFactorial(13));
        System.out.println(calcFactorial(14));
        System.out.println(calcFactorial(15));
        System.out.println(calcFactorial(16));
        System.out.println(calcFactorial(17));
        System.out.println(calcFactorial(18));
        System.out.println(calcFactorial(19));
        System.out.println(calcFactorial(20));
        System.out.println("\n");
        // Question 2:
        System.out.println("Question 2: \n");
        System.out.println(calcE());

    }
}
