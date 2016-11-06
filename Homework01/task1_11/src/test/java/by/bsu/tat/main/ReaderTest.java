package by.bsu.tat.main;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Alexey Makovski.
 */
public class ReaderTest {
    @DataProvider(name = "uncorrect values")
    public Object[][] negativeGetValues() {
        return new Object[][]{
                {Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY},
                {Double.NaN, 1},
                {Double.NaN, Double.POSITIVE_INFINITY},


                {Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, 1},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},

                {1, Double.NaN},
                {1, Double.NEGATIVE_INFINITY},
                {1, Double.POSITIVE_INFINITY},

                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY, 1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };
    }

    @Test(dataProvider = "uncorrect values")
    public void negativeGetValues(double x, double y) throws Exception {
        new Reader(x, y);
    }
}