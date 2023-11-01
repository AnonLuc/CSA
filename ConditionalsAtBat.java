public class ConditionalsAtBat {

    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }

    public boolean negPos(int a, int b, boolean negative){
        if(negative && a * b > 0){
            return a < 0 && b < 0;
        }
        return (!negative && a < 0 ^ b < 0);
    }


    public static void main(String[] args) {
        ConditionalsAtBat conditionals = new ConditionalsAtBat();

        // Question 1
        System.out.println("Question 1: \n");
        System.out.println(conditionals.chimpTrouble(true, true));
        System.out.println(conditionals.chimpTrouble(false, false));
        System.out.println(conditionals.chimpTrouble(true, false));
        System.out.println(conditionals.chimpTrouble(false, true));
        System.out.println("\n");

        // Question 2
        System.out.println("Question 2: \n");
        System.out.println(conditionals.negPos(1, -1, false));
        System.out.println(conditionals.negPos(-1, 1, false));
        System.out.println(conditionals.negPos(1, 1, false));
        System.out.println(conditionals.negPos(-1, -1, false));
        System.out.println(conditionals.negPos(-4, -5, true));
    }
}
