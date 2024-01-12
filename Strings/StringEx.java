public class StringEx {
    //  Question 1
    public static String scroll(String s){
        return s.substring(1) + s.charAt(0); 
    }
    // Question 2
    public static String convertName(String s){
        int comma = s.indexOf(","); // finds comma
        String lastName = s.substring(0, comma); // finds last name
        String firstName = s.substring(comma + 1); // finds first name
        return firstName + " " + lastName; // returns first name and last name
    }
    // Question 3
    public static String negative(String s){
        return s.replace("0", "2").replace("1", "0").replace("2", "1"); // replaces 0 with 2, 1 with 0, and 2 with 1, since 2 is not in the string, it will not be replaced
    }
    // Question 4
    public static String dateString(String s){
        int slash1 = s.indexOf("/"); // finds first slash
        int slash2 = s.indexOf("/", slash1 + 1); // finds second slash
        String month = s.substring(0, slash1); // finds month
        String day = s.substring(slash1 + 1, slash2); // finds day
        String year = s.substring(slash2 + 1); // finds year
        return day + "-" + month + "-" + year; // returns day, month, and year
    }
    // Main
    public static void main(String[] args){
        // Question 1
        System.out.println("Question 1: \n");
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        System.out.println("\n");
        // Question 2
        System.out.println("Question 2: \n");
        System.out.println(convertName("Reubenstein,Lori Renee"));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown,Bozo"));
        System.out.println("\n");
        // Question 3
        System.out.println("Question 3: \n");
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        System.out.println("\n");
        // Question 4
        System.out.println("Question 4: \n");
        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
        System.out.println("\n");
    }
}
