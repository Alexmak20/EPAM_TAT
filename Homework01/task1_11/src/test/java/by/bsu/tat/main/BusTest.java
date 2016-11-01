package by.bsu.tat.main;


import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author Alexey Makovski.
 */
public class BusTest {
    ArrayList<Reader> reader;
    Bus bus = new Bus(reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0, 2.0));
        reader.add(new Reader(4.0, 5.0));
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(40, bus.getPrice(), 40.00);
    }

    @Test
    public void getTime() throws Exception {
        assertEquals(0, bus.getTime(), 100.0);
    }

    @Test
    public void movePoint() throws Exception {
        assertTrue(bus.movePoint());
    }
}