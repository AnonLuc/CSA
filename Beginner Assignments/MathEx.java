public class MathEx {
    public static void main(String[] args) {
        int x = 123;
        int y = swap(x);
        System.out.println(y);
        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));
    }
    public static int swap(int x) {
        int ones   = x%100/10;
        int tens   = x/10%10;
        int result = ones*100 + tens*10;
        return result;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int curTime  = curHour*60 + curMin;
        int depTime  = depHour*60 + depMin;
        int waitTime = depTime - curTime;
        int waitHour = waitTime/60;
        int waitMin  = waitTime%60;
        System.out.println("You will have to wait " + waitHour + " hours and " + waitMin + " minutes.");
    }
    public static int dayOfWeek(int jan1DayOfWeek, int date) {
        int days = (date - 1) % 7;
        return (days + jan1DayOfWeek) % 7;
    }
}