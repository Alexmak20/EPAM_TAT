package by.bsu.tat.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class looks input data, a string looks only at the numbers.
 *
 * @author Alexey Makovski
 */

public class OnlyNumber extends Rule {
    /**
     * The method takes a String, and is, if the string contains only numbers.
     * @param s1 line with data.
     * @return if there are numbers in a line then "true",
     * if no numbers then "false"
     */
    @Override
    public boolean check(String s1) {

        Pattern p = Pattern.compile("\\d+$");
        Matcher m = p.matcher(s1);
        return m.matches();
    }

    /**
     * Method displays the matching rules.
     * @return String with message.
     */
    @Override
    public String getInfo() {
        return "Matches rule it contains only numbers";
    }
}
