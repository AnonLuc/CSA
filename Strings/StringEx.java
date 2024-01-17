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
        return firstName + " " + lastName; 
    }
    // Question 3
    public static String negative(String s){
        return s.replace("0", "2").replace("1", "0").replace("2", "1"); // replaces 0 with 2, 1 with 0, and 2 with 1, since 2 is not in the string, it will not be replaced
    }
    // Question 4
    public static String convertDate(String s){
        int slash1 = s.indexOf("/"); // finds first slash
        int slash2 = s.indexOf("/", slash1 + 1); // finds second slash
        String month = s.substring(0, slash1); // finds month
        String day = s.substring(slash1 + 1, slash2); // finds day
        String year = s.substring(slash2 + 1); // finds year
        return day + "-" + month + "-" + year; 
    }
    // Question 5
    public static String convertDate2(String s){
        int slash1 = s.indexOf("/"); // finds first slash
        int slash2 = s.indexOf("/", slash1 + 1); // finds second slash
        String month = s.substring(0, slash1); // finds month
        String day = s.substring(slash1 + 1, slash2); // finds day
        String year = s.substring(slash2 + 1); // finds year
        if (month.length() == 1){ 
            month = "0" + month; // adds 0 to the front of month
        }
        if (day.length() == 1){ 
            day = "0" + day; // adds 0 to the front of day
        }
        return day + "-" + month + "-" + year; 
    }
    // Question 6
    public static boolean startsWith(String s, String prefix){
        if (s.length() < prefix.length()){ // if length of s < length of prefix
            return false; // returns false
        }
        for (int i = 0; i < prefix.length(); i++){ // for loop that goes through each character in prefix
            if (s.charAt(i) != prefix.charAt(i)){ // if character in s != character in prefix
                return false; // returns false
            }
        }
        return true; 
    }
    // Question 7
    public static boolean endsWith(String s, String suffix){
        if (s.length() < suffix.length()){ // if  length of s < the length of suffix
            return false; 
        }
        for (int i = 0; i < suffix.length(); i++){ // loop that goes through each character in suffix
            if (s.charAt(s.length() - 1 - i) != suffix.charAt(suffix.length() - 1 - i)){ // if  character in s != character in suffix
                return false; // returns false
            }
        }
        return true; 
    }
    // Question 8
    public static String removeTag(String s, String tag) {
        int tag1 = s.indexOf("<" + tag + ">"); // finds first opening tag
        int tag2 = s.indexOf("</" + tag + ">", tag1 + 1); // finds first closing tag after the opening tag

        if (tag1 == -1 || tag2 == -1 || tag2 < tag1) { // if either tag is not found or closing tag is before opening tag
            return s; // returns original string
        }

        return s.substring(tag1 + tag.length() + 2, tag2); // returns string between tags
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
        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        System.out.println("\n");
        // Question 5
        System.out.println("Question 5: \n");
        System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));
        System.out.println("\n");
        // Question 6
        System.out.println("Question 6: \n");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        System.out.println("\n");
        // Question 7
        System.out.println("Question 7: \n");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        System.out.println("\n");
        // Question 8
        System.out.println("Question 8: \n");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday","title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
        System.out.println("\n");
    }
}
