package by.bsu.tat.main;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexey Makovski.
 */
public class CheckTest {
    private Check check;

    @BeforeTest
    public void setUp() throws Exception {
        check = new Check();
    }

    @DataProvider(name = "positive of Equilateral")
    public Object[][] getNumber() {
        return new Object[][]{
                {1.0, 1.0, 1.0},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {10.0, 10.0, 10.0},
                {156.3, 156.3, 156.3},
                {1765.67, 1765.67, 1765.67},
        };
    }

    @Test(dataProvider = "positive of Equilateral")
    public void testEquilateralType(double a, double b, double c) throws Exception {
        check = new Check(a, b, c);
        assertEquals(check.sideTriangle(), "This  Equilateral triangle");
    }

    @DataProvider(name = "positive of Isosceles ")
    public Object[][] getIsoscelesNumber() {
        return new Object[][]{
                {3.0, 5.0, 5.0},
                {Double.MAX_VALUE, Double.MAX_VALUE, 10000000},
                {10000000, Double.MAX_VALUE, Double.MAX_VALUE},
                {10.0, 10.0, 15},
                {150, 156.3, 156.3},
                {1500, 1765.67, 1765.67},
                {135, 135, 134.99999},
                {1765.67406, 1765.67456, 1765.67456},

        };
    }

    @Test(dataProvider = "positive of Isosceles ")
    public void testIsoscelesType(double a, double b, double c) throws Exception {
        check = new Check(a, b, c);
        assertEquals(check.sideTriangle(), "This Isosceles triangle");
    }

    @DataProvider(name = "positive of Simple")
    public Object[][] getSimpleNumber() {
        return new Object[][]{
                {10.0, 45.0, 37.0},
                {45.4, 65.8, 32.6},
                {130.6, 234.0, 124.7},
                {1.0, 2.0, 3.0},
                {1.75, 2.55, 3.25},
        };
    }

    @Test(dataProvider = "positive of Simple")
    public void testSimpleType(double a, double b, double c) throws Exception {
        check = new Check(a, b, c);
        assertEquals(check.sideTriangle(), "This Simple triangle");
    }

    @DataProvider(name = "un correct values")
    public Object[][] negativeValues() throws Exception {
        return new Object[][]{
                {0, 5, 5},
                {-5, 5, 0},
                {10, Double.NEGATIVE_INFINITY, 1},
                {10, Double.NaN, 23},
                {45, Double.POSITIVE_INFINITY, 7},
                {45, 7, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, 7, 45},
                {Double.NaN, 23, 10},
                {10, 23, Double.NaN},
                {10, 1, Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, 1, 10},
                {"oifjroe", "ofhwfo", "oiwhfwiohf"},
                {"ioejiofwj 834982", "847239847 jdhfwefhw", "ofwhi 897 wioefh"},
                {"8932749823 89472983 jdhfoiwefh", "owhiefwo 9098098 90384092",
                        "0934850934 jofijeofw 9046085"},
                {"34534.34534", "3453453.3535", "435345.4535"},
                {0.0, 0.0, 0.0},
                {Double.MIN_VALUE, 1000000.0000, Double.MIN_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE, 1000000.0000},
                {1000000.0000, Double.MIN_VALUE, Double.MIN_VALUE}
        };
    }

    @Test(dataProvider = "un correct values", expectedExceptions = Exception.class)
    public void testSideTriangle(double a, double b, double c) throws Exception {
        check = new Check(a, b, c);
        Assert.assertEquals(check.sideTriangle(), "Not a triangular");
    }

}