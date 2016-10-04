package Task3;

/**
 * This class performs mathematical operations with the introduction of
 * values through the command line.
 * @author Alexey Makovskiy
 */
public class Calculator {
	/**
	 * The method allows you to perform mathematical operations.
	 * Checks on the accuracy of the entered numbers.
	 * Checking the division by zero. Check the introduction letters.
	 * @param args
	 */
    public static void main(String[] args) {
        if(args.length == 2) {
            try {
                double arg1 = Double.parseDouble(args[0]);
                double arg2 = Double.parseDouble(args[1]);
                double sum = arg1 + arg2;
                System.out.println("Summa = " + sum);
                double dif = arg1 - arg2;
                System.out.println("Difference = " + dif);
                double mul = arg1 * arg2;
                System.out.println("Multiplication = " + mul);
                double div = arg1 / arg2;
                if (new Double(1.0 / arg2).isInfinite()) {
                    System.out.println("Attention! Division by zero is not allowed!");
                } else {
                    System.out.println("Division = " + div);
		    	}
            } catch (Exception e) {
    	        System.out.println("You entered not a number!");
            }
        } else {
            System.out.println("Incorrect number of arguments was entered!");
        }
    }
}



