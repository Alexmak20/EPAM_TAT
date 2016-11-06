package by.bsu.tat.main;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;



/**
 * @author Alexey Makovski.
 */
public class DistanceTest {

     Distance distance;

    @DataProvider(name = "correct values")
    public Object[][] getPoints() {
        ArrayList<Reader> reader = new ArrayList<>();
        reader.add(new Reader(0.0, 0.0));
        reader.add(new Reader(50.0, 0.0));
        ArrayList<Reader> reader2 = new ArrayList<>();
        reader2.add(new Reader(25.0, 0.0));
        reader2.add(new Reader(90.0, 0.0));
        ArrayList<Reader> reader3 = new ArrayList<>();
        reader3.add(new Reader(0.0, 90.0));
        reader3.add(new Reader(0.0, 150.0));
        return new Object[][]{
                {50, reader},
                {65, reader2},
                {65, reader2},
        };
    }

    @BeforeTest
    public void setUp() {
        distance = new Distance();
    }

    @Test(dataProvider = "correct values")
    public void positiveTestGetDistance(double expected, ArrayList<Reader> readers) throws Exception {
        assertEquals(distance.distance(readers),expected);
    }
}