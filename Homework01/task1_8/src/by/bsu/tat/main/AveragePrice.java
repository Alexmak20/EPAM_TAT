package by.bsu.tat.main;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Class looks the average cost of goods.
 * @author Alexey Makovski
 */

public class AveragePrice extends CommandOperatoin {

    private static final String f2 = "average price";

    /**
     * Method the average cost of goods.
     * @param list list of product.
     */
    public void averagePrice(ArrayList<Product> list) {
        BigDecimal s4 = new BigDecimal(0);
        double s3 = 0;
        for (Product q : list) {
            s4 = s4.add(BigDecimal.valueOf(q.getS4()));
            s3 += q.getS3();
        }
        System.out.println("Average cost is " + s4.divide(BigDecimal.valueOf(s3)).toString());
    }

    /**
     * Method is verifies input command and perform command
     * @param l command user.
     * @param products list of products.
     */
    @Override
    public void check(String l, ArrayList<Product> products) {
        if (l.equals(f2)) {
            averagePrice(products);
        }
    }
}
