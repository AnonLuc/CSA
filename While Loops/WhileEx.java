public class WhileEx {

    // Question 1

    public static int addOdds(int n) {
    int sum = 0; 
    int i = 1; 

    while (i <= n) { // Loop until the counter is > than n
        sum += i; // Add the current value of i to the sum
        i += 2; // Increment i by 2 to get the next odd number
    }

    return sum; // Return the sum
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
    // how many years it will take to reach a particular population level.  Use a while loop.  Test your method using 120 million and 150 million and end populations.
    public static int howManyYears(double startpop, double endpop){
        
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
    }

}
