package by.bsu.tat.main;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class checks whether there is a line of numbers.
 *
 * @author Alexey Makovski
 */

public class NotNumber extends Rule {
    /**
     * The method checks for the presence of a string of letters and numbers.
     * @param s1 line with data.
     * @return If the line is filled with letters then "true",
     * if other parameters "false".
     */
    @Override
    public boolean check(String s1) {
        Pattern p = Pattern.compile("\\D+$");
        Matcher m = p.matcher(s1);
        return m.matches();
    }

    /**
     * Method displays the matching rules.
     * @return String with message.
     */
    @Override
    public String getInfo() {
        return "Matches rule it does not contain numbers";
    }
}





