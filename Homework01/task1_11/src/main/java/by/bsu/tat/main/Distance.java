package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class that consider distance.
 * @author Alexey Makovski.
 */
public class Distance {

    /**
     * Method that consider distance.
     * @return distance.
     */

    public double distance(ArrayList<Reader> point) {
        double distance = 0;
        double x;
        double y;
        for (int i = 1; i < point.size(); i++) {
            x = (point.get(i).x - point.get(i - 1).x);
            y = (point.get(i).y - point.get(i - 1).y);
            distance += Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        return distance;
    }
}
