package by.bsu.tat.main;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author Alexey Makovski.
 */
public class OnFootTest {
    ArrayList<Reader> reader;
    OnFoot onFoot = new OnFoot(5, reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0, 2.0));
        reader.add(new Reader(4.0, 5.0));
    }

    @Test
    public void movePoint() throws Exception {
        assertTrue(onFoot.movePoint());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(0, onFoot.getPrice(), 1.00);
    }

    @Test
    public void getTime() throws Exception {
        assertEquals(50, onFoot.getTime(), 10);
    }


}