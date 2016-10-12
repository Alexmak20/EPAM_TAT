package by.bsu.tat.main;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Class looks at the average cost of each type of product.
 * @author Alexey Makovski
 */

public class AveragePriceType extends CommandOperatoin {

    /**
     * Method finds the average cost of each type of product.
     * @param s1 type product.
     * @param list list command.
     */

    public void getAveragePriceType(String s1, ArrayList<Product> list) {
        double s3 = 0;
        int apt = 0;
        BigDecimal s4 = new BigDecimal(0);
        for (Product q : list) {
            if (q.getS1().equals(s1)) {
                s3 += q.getS3();
                s4 = s4.add(BigDecimal.valueOf(q.getS4()));
            } else {
                apt++;
            }
        }
        if (apt == list.size()) {
            System.out.println("There is no such type of products");
            return;
        }
        System.out.println("Average price of " + s1 + " = " + s4.divide(BigDecimal.valueOf(s3)).toString());
    }

    /**
     * Method check overridden by inheritors.
     * @param l command of user.
     * @param products list of products.
     */
    @Override
    public void check(String l, ArrayList<Product> products) {
        if (l.matches("^average price\\s\\w+$")) {
            String[] params = l.split(" ");
            getAveragePriceType(params[2], products);
        }
    }
}