package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Interface comprises moving over the points, time and cost.
 * @author Alexey Makovski.
 */
public interface Moveable {

    /**
     * Check,can transport or man go or no.
     */
    boolean movePoint();
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
