package by.bsu.tat.main;

/**
 * Interface comprises moving over the points, time and cost.
 * @author Alexey Makovski.
 */
public interface Moveable {

    /**
     * Calculate distance.
     * @return traversed path.
     */
   double calculateDistance();

    /**
     * Check,can transport or man go or no.
     */
    boolean moveToPoint();
    /**
     * Price of passage.
     * @return price of passage.
     */
     double getPrice();

    /**
     * Time of passage.
     * @return time of passage.
     */
    double getTime();



}
