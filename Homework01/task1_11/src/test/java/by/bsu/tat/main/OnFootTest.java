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
public class OnFootTest {
    ArrayList<Reader> reader;
    OnFoot onFoot;

    @BeforeMethod
    public void setUp() {
        reader = new ArrayList<>();
        onFoot = new OnFoot(5, reader);
    }

    @DataProvider(name = "check")
    public Object[][] getPoints() {
        return new Object[][]{
                {2.0, new Reader(0.0, 0.0), new Reader(2.0, 0.0)},
                {10.0, new Reader(0.0, 0.0), new Reader(10.0, 0.0)},
        };
    }

    @Test(dataProvider = "check")
    public void TestGetDistance(double expected, Reader a, Reader b) throws Exception {
        reader.add(a);
        reader.add(b);
        Assert.assertEquals(onFoot.distance.distance(reader), expected);
    }

    @Test
    public void movePoint() throws Exception {
        reader.add(new Reader(10.0, 0.0));
        reader.add(new Reader(40.0, 0.0));
        assertTrue(onFoot.movePoint());
    }

    @Test
    public void testGetTime() throws Exception {
        assertEquals(onFoot.distance.distance(reader), onFoot.getTime(), 1000);
    }
}