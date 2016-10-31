package by.bsu.tat.main;


import java.util.HashMap;
import java.util.Map;

/**
 * Class main executes program entry point.
 * @author Alexey Makovski.
 */

public class Main {

    /**
     * Class creates a list with other classes
     * and displays information about them.
     * @param args start a command line.
     */

    public static void main(String[] args) {
        HashMap<String, Moveable> transport = new HashMap<>();
        transport.put("Car", new Car());
        transport.put("Bus", new Bus());
        transport.put("Bicycle", new Bicycle());
        transport.put("OnFoot", new OnFoot());
        for (Map.Entry<String, Moveable> tr : transport.entrySet()) {
            System.out.println("Transport : " + tr.getKey());
            System.out.println("Time = " + tr.getValue().getTime());
            System.out.println("Price(EURO) = " + tr.getValue().getPrice());
        }
    }

}
