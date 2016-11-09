package by.bsu.tat.main;

/**
 * Class looks at the entered parameters,
 * check for correct input,
 * determines the type of triangle.
 *
 * @author Alexey Makovski.
 */
public class Check {


    private double a;
    private double b;
    private double c;

    public Check(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Check() {

    }

    /**
     * Method determines the type of triangle.
     */

    public String sideTriangle() throws Exception {
        check();
        if (((a + b) > c) || ((a + c) > b) || ((c + b) > a)) {
            if ((a == b) && (b == c) && (a == c)) {
                return "This  Equilateral triangle";
            } else if ((a == b) || (b == c)) {
                return "This Isosceles triangle";
            } else {
                return "This Simple triangle";
            }
        }
        return null;
    }


    /**
     * Method "check" looks at the variables in the zeros,
     * that is, the variable does not contain zero.
     */
    public void check() throws Exception {
        if (new Double(1.0 / a).isInfinite() || new Double(1.0 / b).isInfinite() ||
                new Double(1.0 / c).isInfinite()) {
            throw new Exception("Not a triangular");
        }
        if (((a + b) < c) || ((b + c) < a) || ((c + a) < b)) {
            throw new Exception("Not a triangular");
        }
        if (new Double(Double.MIN_VALUE / a).isInfinite() || new Double(Double.MIN_VALUE / b).isInfinite() ||
                new Double(Double.MIN_VALUE / c).isInfinite()) {
            throw new Exception("Not a triangular");
        }
    }
}

