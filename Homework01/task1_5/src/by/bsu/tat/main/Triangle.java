package by.bsu.tat.main;

import java.util.Scanner;

/**
 * This class shows a triangle with the input variables obtained
 * @author Alexey Makovskiy
 */
public class Triangle {

	/**
	 * The first method "Main" checks the validity of entered data.
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
			check(a);
			check(b);
			check(c);
			if (check(a) && check(b) && check(c)) {
				solve(a, b, c);
			} else {
				System.out.println(" warring");
			}
		} catch (Exception e) {
			System.out.println("You entered not a number!");
		}
	}

	/**
	 * The second method "solve" compares the values and displays the triangle
	 * to which these variables fit.
	 * @param a One side of the triangle.
	 * @param b One side of the triangle.
	 * @param c One side of the triangle.
	 */
	private static void solve(double a, double b, double c) {
		if (((a + b) > c) || ((a + c) > b) || ((c + b) > a)) {
			if ((a == b) && (b == c) && (a == c)) {
				System.out.println("This  Equilateral triangle");
			} else if ((a == b) || (b == c)) {
				System.out.println("This Isosceles triangle");
			} else if (((a + b) < c) || ((b + c) < a) || ((c + a) < b)) {
				System.out.println("Not a triangular");
			} else {
				System.out.println("Simple triangular");
			}
		}
	}

	/**
	 * The third method "check" looks at the variables in the zeros,
	 * that is, the variable does not contain zero.
	 * @param arg check parameter for correctness.
	 * @return tree if arg is corrected and false otherwise.
	 */
	private static boolean check(double arg) {
		if (new Double(1.0 / arg).isInfinite()) {
			return false;
		}
		return true;
	}
}
