package by.bsu.tat.main;


/**
 * Class Product has structure of products.
 * @author Alexey Makovski
 */
public class Product {


    private String s1;
    private String s2;
    private int s3;
    private double s4;

    /**
     * Constructor Product create object of product.
     * @param s1 typ product.
     * @param s2 name product.
     * @param s3 quantity product.
     * @param s4 cost of product.
     */

    public Product(String s1, String s2, int s3, double s4) {

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }


    /**
     * Method getS1 returns type of product.
     * @return type of product.
     */
    public String getS1() {
        return s1;
    }

    /**
     * Method getS3 returns quantity of product.
     * @return quantity of product.
     */

    public int getS3() {
        return s3;
    }

    /**
     * Method getS4 returns cost of product.
     * @return cost of product.
     */

    public double getS4() {
        return s4;
    }
}
