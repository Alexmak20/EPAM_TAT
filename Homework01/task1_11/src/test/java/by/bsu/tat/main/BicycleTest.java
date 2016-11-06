package by.bsu.tat.main;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Alexey Makovski.
 */

public class BicycleTest {
    ArrayList<Reader> reader;
    Bicycle bicycle;

    @BeforeMethod
    public void setUp() {
        reader = new ArrayList<>();
        bicycle = new Bicycle(20,reader);
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
        assertEquals(bicycle.distance.distance(reader), expected);
    }

    @Test
    public void testMovePoint() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bicycle bicycle = new Bicycle(20,reader);
        assertTrue(bicycle.movePoint());
    }

    @Test
    public void TestGetTime() throws Exception {
        reader.add(new Reader(0.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Bicycle bicycle = new Bicycle(20,reader);
        assertEquals(bicycle.getTime(),120.0);
    }
}