public class AdvancedForLoops {
    // Question 1
    public static void eights() { 
        int num = 8;
        int spaces = 0;
    
        for (int i = 4; i >= 0; i--) { // make 5 rows
            for (int j = 0; j < spaces; j++) { 
                System.out.print(" "); // print spaces
            }
            for (int k = 0; k < num; k++) { // numbers
                System.out.print(num); // print numbers
            }
            System.out.println(); // new line
            num -= 2; // - by 2
            spaces += 1; // + by 1
        }
    }
    // Question 2
    
    public static void alternate(int num){
        for(int i = 0; i <= num; i++){ // make "num" rows
            for(int j = 0; j < i; j++){ // print numbers
                System.out.print(i);
            }
        }
    }
            

    // Main
    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1: \n"); eights();
        // Question 2
        System.out.println("\nQuestion 2: \n");  
        alternate(5);
    }
}
