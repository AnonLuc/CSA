public class WhileEx {

    // Question 1

    public static int addOdds(int n) {
    int sum = 0; 
    int i = 1; 

    while (i <= n) { // Loop until the counter is > n
        sum += i; // Add the current value of i to the sum
        i += 2; // Increment i by 2 to get the next odd number
    }

    return sum;  
}
    // Question 2
    
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit to the sum
            n /= 10; // Remove the last digit from n (Divide by 10)
        }
        return sum;
    }

    // Question 3 
    
    public static int howManyYears(double startpop, double endpop) {
        int years = 0;
        while (startpop < endpop) { // Loop until startpop is > endpop
            startpop *= 1.0113; // Increase startpop by 1.13%
            years++; // Add years by 1
        }
        return years;
    }

    // Question 4
    public static void printSum(int n) {
        int sum = 0; 
        int i = 1; 
        while (i <= n) { // Loop until the counter is > n
            sum += i; // Add the current value of i to the sum
            System.out.print(i); // Print the numbers with a + sign
            if (i < n) {
                System.out.print(" + ");
            }
            i++; // Add by one
        }
        System.out.println(" = " + sum); // Print the final sum
    }
    // Question 5
    public static boolean isPerfectSquare(int n) {
        int sum = 0; 
        int i = 1; 
        while (sum < n) {
            sum += i; // Add the current value of i to the sum
            i += 2; // Increment i by 2 to get the next odd number
        }
        return sum == n; // Check if the sum is equal to n
    }

    // Main
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1: \n");
        System.out.println(addOdds(5));
        System.out.println(addOdds(10));
        System.out.println(addOdds(15));
        System.out.println("\n");
        // Question 2:
        System.out.println("Question 2: \n");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(12345));
        System.out.println("\n");
        // Question 3:
        System.out.println("Question 3: \n");
        System.out.println(howManyYears(120, 150));
        System.out.println(howManyYears(120, 200));
        System.out.println(howManyYears(120, 500));
        System.out.println("\n");
        // Question 4:
        System.out.println("Question 4: \n");
        printSum(6);
        printSum(8);
        System.out.println("\n");
        // Question 5:
        System.out.println("Question 5: \n");
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(49));
        System.out.println("\n");
    }

}
