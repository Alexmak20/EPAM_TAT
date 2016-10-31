package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the car,
 * is the distance, travel time.
 * @author Alexey Makovski.
 */
public class Car extends Mechanic {
    private double speed = 100;
    private int passengers = 1;
    private double priceOfFuel = 0.57;
    private double consumption = 6.5;


    /**
     * Calculating distance.
     * @return traversed path.
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
     * Can car move or not
     * @return boolean, if can-true, if can't-false
     */
    public boolean moveToPoint() {
        ArrayList<Reader> point = Reader.read();
        if (!(point.get(0) == point.get(point.size() - 1))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculating price of passage
     * @return double value, value of passage
     */
    @Override
    public double getPrice() {
        double distance;
        distance = calculateDistance();
        double value = distance * consumption * passengers * priceOfFuel / 100;
        return value;
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
