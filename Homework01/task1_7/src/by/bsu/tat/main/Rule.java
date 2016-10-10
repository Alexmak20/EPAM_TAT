package by.bsu.tat.main;

/**
 * An abstract class is adopted in which the line for data
 *
 * @author Alexey Makovski
 */

public abstract class Rule {
    /**
     * The method which is inherited from other classes.
     *
     * @param s2 Data line
     * @return prints or true or false.
     */
    public abstract boolean check(String s2);

    /**
     * Method displays the matching rules.
     * @return String with message.
     */
    public abstract String getInfo();


}
