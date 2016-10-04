package by.bsu.tat.main;

/**
 * Main class of application. Displays the accepted
 * arguments in reverse order
 * @author Alexey Makovskiy
 */
public class CommandLineParams {
    /**
     * Main class which contained entry point.
     * In this class, printing the input parameters
     * accepted and displayed in reverse order.
     * Each option displayed on a new line.
     */
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Argument " + i + "=" + args[i]);
        }
    }
}
