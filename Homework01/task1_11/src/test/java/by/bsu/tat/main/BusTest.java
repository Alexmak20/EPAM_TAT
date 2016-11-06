package by.bsu.tat.main;


<<<<<<< HEAD


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
=======
import org.junit.Before;
import org.junit.Test;
>>>>>>> master


import java.util.ArrayList;

<<<<<<< HEAD
import static org.testng.Assert.*;

=======
import static org.junit.Assert.*;
>>>>>>> master

/**
 * @author Alexey Makovski.
 */
public class BusTest {
<<<<<<< HEAD
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
=======
    ArrayList<Reader> reader;
    Bus bus = new Bus(reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0, 2.0));
        reader.add(new Reader(4.0, 5.0));
>>>>>>> master
    }

    @Test
    public void getPrice() throws Exception {
<<<<<<< HEAD
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
        assertEquals(24.5*0.59,bus.getPrice(),20);
=======
        assertEquals(40, bus.getPrice(), 40.00);
>>>>>>> master
    }

    @Test
    public void getTime() throws Exception {
<<<<<<< HEAD
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
        assertEquals(50,bus.getTime(),50);
=======
        assertEquals(0, bus.getTime(), 100.0);
>>>>>>> master
    }

    @Test
    public void movePoint() throws Exception {
<<<<<<< HEAD
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bus bus = new Bus(reader);
=======
>>>>>>> master
        assertTrue(bus.movePoint());
    }
}