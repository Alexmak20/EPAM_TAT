package by.bsu.tat.main;

import java.util.Scanner;

/**
 * Class takes the value from the command line.
 * @author Alexey Makovskiy
 */
public class Main {

    /**
     * Method takes the value from the command line.
     * @param args received parameters.
     */
    public static void main(String[] args) {
        try {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter a = ");
            double a = sr.nextDouble();
            System.out.println("Enter b = ");
            double b = sr.nextDouble();
            System.out.println("Enter c = ");
            double c = sr.nextDouble();
            Check check = new Check(a, b, c);
            check.sideTriangle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}