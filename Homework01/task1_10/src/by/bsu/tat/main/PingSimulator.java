package by.bsu.tat.main;

import java.util.Random;

/**
 * Class that simulates a ping to ip addresses.
 *
 * @author Alexey Makovski
 */
public class PingSimulator {
    /**
     * Models for ping ip address.
     *
     * @return a random value in the range from 10 to 500.
     */
    public int pingServer() {
        return new Random().nextInt(491) + 10;
    }

}
