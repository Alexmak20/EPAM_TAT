package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class considers types of products.
 * @author Alexey Makovski
 */
public class CountTypes extends CommandOperatoin {
    /**
     * Command to perform an action.
     */
    private static final String f = "count types";

    /**
     * Method takes the value of the type of goods and considers the number of.
     * @param products list of product.
     */

    public static void count(ArrayList<Product> products) {
        int q = 0;
        Product[] p1 = new Product[products.size()];
        for (int i = 0; i < p1.length; i++) {
            p1[i] = products.get(i);
        }

        for (int i = 0; i < p1.length; i++) {
            for (int j = i + 1; j < p1.length; j++) {
                if (p1[i].getS1().equals(p1[j].getS1())) {
                    q++;
                }
            }
        }
        System.out.println("Count of types is " + (p1.length - q));
    }

    /**
     * It receives and processes the command.
     * @param l command of user.
     * @param products list of product.
     */
    @Override
    public void check(String l, ArrayList<Product> products) {
        if (l.equals(f)) {
            count(products);
        }
    }
}