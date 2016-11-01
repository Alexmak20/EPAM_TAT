package by.bsu.tat.main;


import java.util.ArrayList;
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
        ArrayList<Reader> point = Reader.read();
        HashMap<String, Moveable> transport = new HashMap<>();
        transport.put("Car", new Car(point));
        transport.put("Bus", new Bus(point));
        transport.put("Bicycle", new Bicycle(20,point));
        transport.put("OnFoot", new OnFoot(5,point));
        for (Map.Entry<String, Moveable> tr : transport.entrySet()) {
            System.out.println("Transport : " + tr.getKey());
            System.out.println("Time = " + tr.getValue().getTime());
            System.out.println("Price(EURO) = " + tr.getValue().getPrice());
        }
    }

}
