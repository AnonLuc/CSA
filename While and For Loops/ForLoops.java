public class ForLoops {
    // Question 1
    public static int addEvens(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    // Question 2
    public static void printSquaresBack(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
    // Question 3
    public static void sillyNumbers(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    // Question 4
    public static void sillyNumbers2(){
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j >= 1; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    public static void dollarAndStars(){
        for(int i = 7; i > 0; i--){
            for(int s = 0; s < 2 * (7 - i); s++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print("$");
            }
            for(int z = 0; z < i * 2; z++){
                System.out.print("*");
            }
            for(int a = 0; a < i; a++){
                System.out.print("$");
            }
            for(int b = 0; b < 2 * (7 - i); b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1 \n");
        System.out.println(addEvens(10));
        System.out.println(addEvens(100));
        System.out.println(addEvens(1000));
        System.out.println("\n");
        // Question 2:
        System.out.println("Question 2: \n");
        printSquaresBack(10);
        printSquaresBack(20);
        printSquaresBack(30);
        System.out.println("\n");
        // Question 3:
        System.out.println("Question 3: \n");
        sillyNumbers();
        System.out.println("\n");
        // Question 4:
        System.out.println("Question 4: \n");
        sillyNumbers2();
        System.out.println("\n");
        // Question 5:
        System.out.println("Question 5: \n");
        dollarAndStars();
        System.out.println("\n");
    }

}
