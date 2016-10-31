package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the bus,
 * is the distance, travel time.
 * @author Alexey Makovski.
 */
public class Bus extends Mechanic {
    private double speed = 80;
    private int passengers = 50;
    private double priceOfFuel = 0.59;
    private double consumption = 24.5;


    /**
     * Can bus move or not
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
     * calculating price of passage
     * @return double price, price of passage
     */
    @Override
    public double getPrice() {
        double distance;
        distance = calculateDistance();
        double value = distance * consumption * priceOfFuel / (100 * passengers);
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
