package by.bsu.tat.main;


<<<<<<< HEAD
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

=======

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;
>>>>>>> master

/**
 * @author Alexey Makovski.
 */

public class BicycleTest {
<<<<<<< HEAD

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
=======
    ArrayList<Reader> reader;
    Bicycle bicycle = new Bicycle(20,reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0 , 2.0));
        reader.add(new Reader(4.0 , 5.0));
>>>>>>> master

    }

    @Test
<<<<<<< HEAD
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
=======
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
>>>>>>> master
    }
}