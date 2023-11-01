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

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isMorning && isMom && !isAsleep){
            return true;
        }
        return !(isMorning || isAsleep);
    }


    public static void main(String[] args) {
        ConditionalsAtBat condition = new ConditionalsAtBat();

        // Question 1
        System.out.println("Question 1: \n");
        System.out.println(condition.chimpTrouble(true, true));
        System.out.println(condition.chimpTrouble(false, false));
        System.out.println(condition.chimpTrouble(true, false));
        System.out.println(condition.chimpTrouble(false, true));
        System.out.println("\n");

        // Question 2
        System.out.println("Question 2: \n");
        System.out.println(condition.negPos(1, -1, false));
        System.out.println(condition.negPos(-1, 1, false));
        System.out.println(condition.negPos(1, 1, false));
        System.out.println(condition.negPos(-1, -1, false));
        System.out.println(condition.negPos(-4, -5, true));
        System.out.println(condition.negPos(-4, 5, true));
        System.out.println(condition.negPos(4, 5, true));
        System.out.println(condition.negPos(4, -5, true));
        System.out.println("\n");

        // Question 3
        System.out.println("Question 3: \n");
        System.out.println(condition.pickUpPhone(false, false, true));
        System.out.println(condition.pickUpPhone(true, true, true));
        System.out.println(condition.pickUpPhone(true, true, false));
        System.out.println(condition.pickUpPhone(false, true, false));
        System.out.println(condition.pickUpPhone(true, false, false));
        System.out.println(condition.pickUpPhone(false, false, false));
        System.out.println("\n");

        // Question 4
        

    }
}
