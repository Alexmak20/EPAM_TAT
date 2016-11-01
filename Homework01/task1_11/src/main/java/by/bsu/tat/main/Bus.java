package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the bus,
 * is the distance, travel time.
 *
 * @author Alexey Makovski.
 */
public class Bus extends Mechanic {
    private ArrayList<Reader> point;
    private double speed = 80;
    private int passengers = 50;
    private double priceOfFuel = 0.59;
    private double consumption = 24.5;
    Distance distance = new Distance();


    public Bus(ArrayList<Reader> point) {
        this.point = point;
    }

    /**
     * Can bus move or not
     * @return boolean, if point can true, if point can't false.
     */
    @Override
    public boolean movePoint() {
        if (!(point.get(0) == point.get(point.size() - 1))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculating price of passage.
     * @return double price, price of passage
     */
    @Override
    public double getPrice() {
        double route = distance.distance(point);
        double value = route * consumption * priceOfFuel / (100 * passengers);
        return value;
    }

    /**
     * Calculating time of passage.
     * @return double time, time of passage.
     */
    @Override
    public double getTime() {
        double route = distance.distance(point);
        double time = (route / speed) * 60;
        return time;
    }
}
