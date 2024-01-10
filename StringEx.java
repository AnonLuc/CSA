public class StringEx {
    //  Question 1
    public static String scroll(String s){
        return s.substring(1) + s.charAt(0);
    }
    // Question 2
    public static String convertName(String s){
        int comma = s.indexOf(",");
        String lastName = s.substring(0, comma);
        String firstName = s.substring(comma + 1);
        return firstName + " " + lastName;
    }
    // Main
    public static void main(String[] args){
        // Question 1
        System.out.println("Question 1: \n");
        System.out.println(scroll("Coding!"));
        System.out.println("\n");
        // Question 2
        System.out.println("Question 2: \n");
        System.out.println(convertName("Doe, John"));
        System.out.println("\n");
    }
}
