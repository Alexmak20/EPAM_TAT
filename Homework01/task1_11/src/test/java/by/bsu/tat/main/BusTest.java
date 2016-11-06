package by.bsu.tat.main;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import static org.testng.Assert.*;


/**
 * @author Alexey Makovski.
 */
public class BusTest {

    private ArrayList<Reader> reader;
    private Bus bus;


    @BeforeMethod
    public void setUp() {
        reader = new ArrayList<>();
        bus = new Bus();
    }
    @DataProvider(name = "check")
    public Object[][] getPoints() {
        return new Object[][] {
                {10.0, new Reader(0.0, 0.0), new Reader(10.0, 0.0)},
                {40.0, new Reader(0.0, 0.0), new Reader(40.0, 0.0)},
        };
    }
    @Test(dataProvider = "check")
    public void TestGetDistance(double expected, Reader a, Reader b)throws Exception {
            reader.add(a);
            reader.add(b);
            Assert.assertEquals(bus.distance.distance(reader), expected);
    }

    @Test
    public void getPrice() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
        assertEquals(24.5*0.59,bus.getPrice(),20);
    }

    @Test
    public void getTime() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
        assertEquals(50,bus.getTime(),50);
    }

    @Test
    public void movePoint() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
        assertTrue(bus.movePoint());
    }
}