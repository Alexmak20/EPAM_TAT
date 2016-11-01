package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the car,
 * is the distance, travel time.
 * @author Alexey Makovski.
 */
public class Car extends Mechanic {
    private ArrayList<Reader> point;
    private double speed = 100;
    private int passengers = 1;
    private double priceOfFuel = 0.57;
    private double consumption = 6.5;
    Distance distance = new Distance();


    public Car(ArrayList<Reader> point) {
        this.point = point;
    }

    /**
     * Can car move or not
     * @return boolean, if point can true, if point can't false.
     */
    public boolean movePoint() {
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
        double route = distance.distance(point);
        double value = route * consumption * passengers * priceOfFuel / 100;
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
