package Conditionals;
public class ConditionalExercise {
    
    // Exercise 1
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) { // check if divisible by 4
            if (year % 100 != 0) // if not divisible by 100
                return true;
            else if (year % 400 == 0) // if divisible by 100, check if divisible by 400
                return true; 
            else
                return false; // if not divisible by 400, not a leap year
        } else
            return false; // if not divisible by 4, not a leap year
    }

    // Exercise 2
    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 < year2) // if year1 is sooner than year2
            return true;
        else if (year1 == year2) { // if year1 is equal to year2
            if (month1 < month2) // if month1 is sooner than month2
                return true;
            else if (month1 == month2) { // if month1 is equal to month2
                if (day1 < day2) // if day1 is sooner than day2
                    return true;
                else if (day1 == day2) // if day1 is equal to day2
                    return true;
                else
                    return false; // if day1 is later than day2
            } else
                return false; // if month1 is later than month2
        } else
            return false; // if year1 is later than year2
    }
    // Exercise 3
    public int findBestFit(int space, int size1, int size2){
        if (size1 + size2 <= space) // if both files fit together
            return 3;
        else if (size1 <= space && size2 > space) // if only file 1 fits
            return 1;
        else if (size2 <= space && size1 > space) // if only file 2 fits
            return 2;
        else if (size1 <= space && size2 <= space) { // if both files fit separately
            if (size1 > size2) // if file 1 is bigger than file 2
                return 1;
            else if (size2 > size1) // if file 2 is bigger than file 1
                return 2;
            else
                return 1; // if both files are the same size
        } else
            return 0; // if neither file fits

    }
        


    public static void main(String[] args) {
        ConditionalExercise ce = new ConditionalExercise();
        // Exercise 1:
        System.out.println("Leap Year: \n");
        System.out.println("2000 " + ce.isLeapYear(2000));
        System.out.println("2004 " + ce.isLeapYear(2004));
        System.out.println("2003 " + ce.isLeapYear(2003));
        System.out.println("2100 " + ce.isLeapYear(2100));
        System.out.println("\n");
        // Exercise 2:
        System.out.println("isSooner: \n");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));
        System.out.println("\n");
        // Exercise 3:
        System.out.println("Best Fit: \n");
        System.out.println("Find Best fit 6 2 3 is " + ce.findBestFit(6,2,3));
        System.out.println("Find Best fit 6 4 3 is " + ce.findBestFit(6,4,3));
        System.out.println("Find Best fit 6 3 4 is " + ce.findBestFit(6,3,4));
        System.out.println("Find Best fit 1 2 3 is " + ce.findBestFit(1,2,3));
        System.out.println("Find Best fit 4 6 3 is " + ce.findBestFit(4,6,3));
        System.out.println("Find Best fit 4 3 6 is " + ce.findBestFit(4,3,6));
        System.out.println("Find Best fit 4 3 3 is " + ce.findBestFit(4,3,3));
        System.out.println("Find Best fit 4 4 3 is " + ce.findBestFit(4,4,3));


    }
}
