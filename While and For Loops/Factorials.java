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

        while(currentE - oldE > 0.001){ // while the difference between the currentE and oldE is > 0.001
            oldE = currentE; // oldE is now the currentE
            currentE += (1.0 / calcFactorial(i)); // currentE is now the currentE + 1 / i!
            i++;
        }

        return currentE; 
    }
    // Question 3
    public static double calcEX(int num){
        double currentE = 1; 
        double oldE = 0;

        for(int i = 1; currentE - oldE > 0.001; i++){ // for loop that runs while the difference between the currentE and oldE is > 0.001
            oldE = currentE; // oldE is now the currentE
            currentE += (Math.pow(num, i) / calcFactorial(i)); // currentE is now the currentE + num^i / i!
        }

        return currentE;

    }
    
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1: \n");
        for(int i = 1; i<= 20; i++){ // print out the factorials of 1-20
            System.out.println(calcFactorial(i));
        }
        System.out.println("\n");
        // Question 2:
        System.out.println("Question 2: \n");
        System.out.println(calcE());
        System.out.println("\n");
        // Question 3:
        System.out.println("Question 3: \n");
        for(int i = 1; i<= 5; i++){ // print out the factorials of 1-20
            System.out.printf("e is %2.3f \n", calcEX(i));

        }
       
    }
}
