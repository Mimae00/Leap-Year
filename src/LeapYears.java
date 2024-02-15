package src;


import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter valid year: ");
        int year = Integer.parseInt(scanner.nextLine());

        if (isFourCharacters(String.valueOf(year))) {
            LeapYearsImpl.isLeapYear(year);
        } else {
            System.out.println("Enter valid year!");
        }
    }

    private static boolean isFourCharacters(String str) {
        return str.length() == 4;
    }


}

