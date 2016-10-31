package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the bicycle,
 * is the distance, travel time.
 * @author Alexey Makovski.
 */
public class Bicycle implements Moveable {

    private double speed;

    /**
     * Creating speed of bicycle.
     */
    public Bicycle() {
        this.speed = 20;
    }

    /**
     * Calculating distance.
     * @return double distance.
     */
    @Override
    public double calculateDistance() {
        double distance = 0;
        double X;
        double Y;
        ArrayList<Reader> point = Reader.read();
        for (int i = 1; i < point.size(); i++) {
            X = (point.get(i).x - point.get(i - 1).x);
            Y = (point.get(i).y - point.get(i - 1).y);
            distance += Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        }
        return distance;
    }

    /**
     * Can bicycle move or not.
     * @return boolean, if can-true, if can't-false
     */
    @Override
    public boolean moveToPoint() {
        ArrayList<Reader> point = Reader.read();
        if (!(point.get(0) == point.get(point.size() - 1))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * calculating price of passage.
     * @return double price.
     */
    @Override
    public double getPrice() {
        return 0;
    }

    /**
     * Calculating time of passage.
     * @return double time, time of passage.
     */
    @Override
    public double getTime() {
        double distance;
        distance = calculateDistance();
        double time = (distance / speed) * 60;
        return time;
    }
}
