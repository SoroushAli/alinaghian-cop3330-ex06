/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/*
Example Output

What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints

Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.

Challenge

Handle situations where the program returns a negative number by stating that the user can already retire.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        String firstInput = readAge();
        String secondInput = readAge();
        int currentAge = getAge(firstInput);
        int retireAge = getAge(secondInput);
        int yearsLeft = remainingYears(retireAge, currentAge);
        int currentYear = findYear();
        int retireYear = findRetireYear(currentYear, yearsLeft);
        generateOutput(currentAge, retireAge, yearsLeft, currentYear, retireYear);

    }

    private static int findRetireYear(int currentYear, int yearsLeft) {
        return currentYear + yearsLeft;
    }

    private static int findYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private static void generateOutput(int currentAge, int retireAge, int yearsLeft, int currentYear, int retireYear) {
        System.out.println("What is your current age? " + currentAge +
                "\nAt what age would you like to retire? " + retireAge +
                "\nYou have " + yearsLeft + " years left until you can retire." +
                "\nIt's " + currentYear + ", so you can retire in " + retireYear + ".");
    }

    private static int remainingYears(int retireAge, int currentAge) {
        return retireAge - currentAge;
    }

    private static int getAge(String input) {
        return Integer.parseInt(input);
    }

    private static String readAge() {
        return in.next();
    }
}