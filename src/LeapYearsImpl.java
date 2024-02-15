package src;

import java.time.Year;

public class LeapYearsImpl {

    public static void isLeapYear(int year) {

        boolean leap = Year.of(year).isLeap();

        if(leap){
            System.out.println(year + " is Leap year.");
        } else {
            System.out.println(year + " is NOT Leap year.");
        }
    }
}
