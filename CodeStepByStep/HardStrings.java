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
    public static String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                result += s.charAt(i);
            }
        }
        return result;
    }
    // Question 3
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 += s1;
        return s1.contains(s2);
    }
    // Question 4
    public static String addCommas(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.length() - i) % 3 == 0) {
                result += ",";
            }
            result += s.charAt(i);
        }
        return result;
    }
    // Question 5
    
    
}
