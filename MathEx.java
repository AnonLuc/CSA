public class MathEx {
    public static void main(String[] args) {
        int x = 123;
        int y = swap(x);
        System.out.println(y);
        timeLeft(1, 34, 8, 20);
    }
    public static int swap(int x) {
        int ones = x%100/10;
        int tens = x/10%10;
        int result = ones*100 + tens*10;
        return result;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int curTime = curHour*60 + curMin;
        int depTime = depHour*60 + depMin;
        int waitTime = depTime - curTime;
        int waitHour = waitTime/60;
        int waitMin = waitTime%60;
        System.out.println("You will have to wait " + waitHour + " hours and " + waitMin + " minutes.");
    }
}