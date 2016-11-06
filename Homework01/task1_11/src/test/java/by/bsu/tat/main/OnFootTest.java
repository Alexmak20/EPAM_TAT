package by.bsu.tat.main;

<<<<<<< HEAD
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;
=======
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
>>>>>>> master

/**
 * @author Alexey Makovski.
 */
public class OnFootTest {
<<<<<<< HEAD


    ArrayList<Reader> reader;
    OnFoot onFoot;

    @BeforeMethod
    public void setUp() {
        reader = new ArrayList<>();
        onFoot = new OnFoot(5,reader);
    }

    @DataProvider(name = "check")
    public Object[][] getPoints() {
        return new Object[][] {
                {2.0, new Reader(0.0, 0.0), new Reader(2.0, 0.0)},
                {10.0, new Reader(0.0, 0.0), new Reader(10.0, 0.0)},
        };
    }
    @Test(dataProvider = "check")
    public void TestGetDistance(double expected, Reader a, Reader b)throws Exception {
        reader.add(a);
        reader.add(b);
        Assert.assertEquals(onFoot.distance.distance(reader), expected);

=======
    ArrayList<Reader> reader;
    OnFoot onFoot = new OnFoot(5, reader);

    @Before
    public void setUp() {
        reader = new ArrayList<>();
        reader.add(new Reader(1.0, 2.0));
        reader.add(new Reader(4.0, 5.0));
>>>>>>> master
    }

    @Test
    public void movePoint() throws Exception {
<<<<<<< HEAD
        reader.add(new Reader(10.0,0.0));
        reader.add(new Reader(40.0,0.0));
=======
>>>>>>> master
        assertTrue(onFoot.movePoint());
    }

    @Test
<<<<<<< HEAD
    public void testGetTime() throws Exception {
        assertEquals(onFoot.distance.distance(reader),onFoot.getTime(),1000);
=======
    public void getPrice() throws Exception {
        assertEquals(0, onFoot.getPrice(), 1.00);
    }

    @Test
    public void getTime() throws Exception {
        assertEquals(50, onFoot.getTime(), 10);
>>>>>>> master
    }


}