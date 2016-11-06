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
public class CarTest {
    ArrayList<Reader> reader;
    Car car;

    @BeforeMethod
    public void setUp() {
        reader = new ArrayList<>();
        car = new Car(reader);
    }

    @DataProvider(name = "check")
    public Object[][] getPoints() {
        return new Object[][] {
                {10.0, new Reader(0.0, 0.0), new Reader(10.0, 0.0)},
                {40.0, new Reader(0.0, 0.0), new Reader(40.0, 0.0)},
        };
    }
    @Test(dataProvider = "check")
    public void TestGetDistance(double expected, Reader a, Reader b) {
        reader.add(a);
        reader.add(b);
        Assert.assertEquals(car.distance.distance(reader), expected);
    }


    @Test
    public void getPrice() throws Exception {
       reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        assertEquals(6.5*0.57,car.getPrice(),10);
    }

    @Test
    public void getTime() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Car car = new Car(reader);
        assertEquals(car.getTime(),20,5);
    }

    @Test
    public void movePoint() throws Exception {
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
        Car car = new Car(reader);
        assertTrue(car.movePoint());
    }

}