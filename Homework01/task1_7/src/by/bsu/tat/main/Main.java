package by.bsu.tat.main;

import java.util.Scanner;

/**
 * The main class that contains the entry point.
 * It reads input from the command line, and transmits it to the other classes.
 *
 * @author Alexey Makovski
 */

public class Main {
    /**
     * In the method of the input string with variable.
     * @param args is the name of the array String.
     */
    public static void main(String[] args) {
        try {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter the string: ");
            String s1 = sr.nextLine();
            ValidationRule validationRule = new ValidationRule();
            validationRule.add(new NotNumber());
            validationRule.add(new OnlyNumber());
            validationRule.add(new FiveWords());
            validationRule.add(new Vocabulary());
            validationRule.validate(s1);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}