package by.bsu.tat.main;



import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author Alexey Makovski.
 */

public class BicycleTest {
    ArrayList<Reader> reader;
    Bicycle bicycle = new Bicycle(20,reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0 , 2.0));
        reader.add(new Reader(4.0 , 5.0));

    }

    @Test
    public void movePoint() throws Exception {
        assertTrue(bicycle.movePoint());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(0, bicycle.getPrice(), 1.00);
    }

    @Test
    public void getTime() throws Exception {
        assertEquals(0, bicycle.getTime(), 150);
    }
}