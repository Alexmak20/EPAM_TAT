package by.bsu.tat.main;


import java.util.ArrayList;

/**
 * Class in which the parameters are specified for the bicycle,
 * is the distance, travel time.
 * @author Alexey Makovski.
 */
public class Bicycle implements Moveable {

    private ArrayList<Reader> point;
    private double speed = 20;
    Distance distance = new Distance();
<<<<<<< HEAD


    /**
     * Creating speed of bicycle.
     */
    public Bicycle(double speed, ArrayList<Reader> point) {
        this.speed = speed;
        this.point = point;
    }

=======


    /**
     * Creating speed of bicycle.
     */
    public Bicycle(double speed, ArrayList<Reader> point) {
        this.speed = speed;
        this.point = point;
    }
>>>>>>> master

    /**
     * Can bicycle move or not.
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
