public class HardStrings {
    // Question 1
    public static String switchPairs(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                result += s.charAt(i + 1);
            }
            result += s.charAt(i);
        }
        return result;
    }
    // Question 2

    public static void main(String[] args) {
        System.out.println(switchPairs("hello there"));
    }
}
