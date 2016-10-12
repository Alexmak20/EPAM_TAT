package by.bsu.tat.main;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class information of product.
 * @author Alexey Makovski
 */

public class ProductInfo {


    /**
     * Creating sheet products
     */
    private ArrayList<Product> list = new ArrayList<>();

    /**
     * Method in which to enter all the information about the product
     */

    public void information() {
        String s1, s2, s5;
        int s3;
        double s4;
        do {
            try {
                Scanner sr = new Scanner(System.in);
                System.out.println("Product type = ");
                s1 = sr.next();
                System.out.println("Name of product = ");
                s2 = sr.next();
                System.out.println("Quantity of product = ");
                s3 = sr.nextInt();
                System.out.println("Price of one unit of product = ");
                s4 = sr.nextDouble();
                list.add(new Product(s1, s2, s3, s4));
            } catch (Exception e) {
                e.getMessage();
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to add more product? If 'yes', " +
                    "then enter 'yes', if 'no', then enter 'no' ");
            s5 = sc.next();
        } while (s5.equals("yes"));
    }

    /**
     * Method returns a list of products.
     * @return the returned list.
     */
    public ArrayList<Product> getproducts() {
        return list;
    }
}

