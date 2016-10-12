package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Main class is the entry point into the program.
 * @author Alexey Makovski
 */
public class Main {

    /**
     * Method records the commands that are executed in the program.
     * It takes a value to the list of input products.
     * @param args input parameters.
     */

    public static void main(String[] args) {
        ProductInfo pr = new ProductInfo();
        pr.information();
        ArrayList<CommandOperatoin> operation = new ArrayList<>();
        operation.add(new CountAll());
        operation.add(new CountTypes());
        operation.add(new AveragePrice());
        operation.add(new AveragePriceType());
        new Exit(pr.getproducts(), operation);
    }
}
