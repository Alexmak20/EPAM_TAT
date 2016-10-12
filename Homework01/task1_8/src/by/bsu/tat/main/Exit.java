package by.bsu.tat.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for entering commands.
 * @author Alexey Makovski
 */

public class Exit {

    /**
     * Method receives a command from the list with the commands
     * and displays the value of goods or if you type 'exit' out of the program.
     * @param products list of product.
     * @param commands list of command.
     */
    public Exit(ArrayList<Product> products, ArrayList<CommandOperatoin> commands) {
        Scanner scanner = new Scanner(System.in);
        String s2;
        do {
            System.out.println("Set command (input 'exit' to exit):");
            s2 = scanner.nextLine();
            for (CommandOperatoin m : commands) {
                m.check(s2, products);
            }
        } while (!(s2.equals("exit")));
        System.out.println("Good Bye!");
        scanner.close();
    }
}
