package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class considers class takes a number of product.
 * @author Alexey Makovski
 */
public class CountAll extends CommandOperatoin {

    /**
     * Command to perform an action.
     */

    private static final String f1 = "count all";

    /**
     * Method receives and counts the total number of product.
     * @param products list of products.
     */

    public void count2(ArrayList<Product> products) {
        int s2 = 0;
        for (Product pro : products) {
            s2 += pro.getS3();
        }
        System.out.println("Count of all products is " + s2);
    }

    /**
     * It receives and processes the command.
     * @param l command of user.
     * @param products list of product.
     */
    @Override
    public void check(String l, ArrayList<Product> products) {
        if (l.equals(f1)) {
            count2(products);
        }
    }
}
