package by.bsu.tat.main;



/**
 * Abstract class provides data on distance and transition points
 * @author Alexey Makovski.
 */
public abstract class Mechanic implements Moveable {

    @Override
    public abstract boolean moveToPoint();

    @Override
    public abstract double calculateDistance();

}

