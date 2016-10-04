package by.bsu.tat.main;

/**
 * Main class of application.
 * @author Alexey Makovskiy
 */
public class Hello {
    /**
     * Main class which contained entry point.
     * Introduced a variable (name) and is displayed in the console, example "Hello User!"
     */
    public static void main(String[] args) {
        String user = " ";
        if (args.length != 0) {
            user = args[0];
        }
        System.out.println("Hello "  + user + "!");
    }
}
