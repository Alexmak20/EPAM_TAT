package by.bsu.tat.main;


import java.util.Scanner;

/**
 * This class does finding the roots of a quadratic equation.
 * @author Alexey Makovskiy
 */

public class Discriminant {
    /**
     * This method finds the square roots.
     * Checks on the correct introduction of the coefficients.
     * Checks on the discriminant is less than zero
     * @param args array with command line launch parameters.
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
            if (check(a) && check(b) && check(c)) {
                solve(a, b, c);
            }
        } catch (Exception e) {
            System.out.println("You entered not a number!");
        }
    }

    /**
     * In this method, there is a check on the maximum and minimum input number
     * @param arg check parameter for correctness.
     * @return tree if arg is corrected and false otherwise.
     */
    public static boolean check(double arg) {
        if (!(Double.isInfinite(arg))) {
            return true;
        } else {
            System.out.println("Warring! You have entered a very large number!");
            return false;
        }
    }

    /**
     * In this method, a test is performed to zero the discriminant,
     * as well as finding the roots of the equation.
     * @param a the parameters of the quadratic equation.
     * @param b the parameters of the quadratic equation.
     * @param c the parameters of the quadratic equation.
     */
    public static void solve(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (Double.isInfinite(1 / d)) {
            System.out.println("x1,2 = " + (-b + Math.sqrt(d)) / (2 * a));
        } else if (d > 0) {
                System.out.println("x1 = " + (-b + Math.sqrt(d)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));
            } else {
                System.out.println("Error! Discriminant is less than zero!");
            }
        }
    }
}