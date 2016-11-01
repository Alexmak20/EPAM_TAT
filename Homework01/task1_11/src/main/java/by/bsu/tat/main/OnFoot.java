package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Class considers the distance and time,
 * that a person need to go the distance.
 * @author Alexey Makovski.
 */
public class OnFoot implements Moveable {

    private ArrayList<Reader> point;
    private double speed = 5;
    Distance distance = new Distance();

    /**
     * Creating object of onFoot.
     */
    public OnFoot(double speed, ArrayList<Reader> point) {

        this.speed = speed;
        this.point = point;
    }


    /**
     * Can onfoot move or not.
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
     * @return double price.
     */
    @Override
    public double getPrice() {
        return 0;
    }

    /**
     * Calculating time of passage
     * @return double time, time of passage.
     */
    @Override
    public double getTime() {
        double route = distance.distance(point);
        double time = (route / speed) * 60;
        return time;
    }
}
