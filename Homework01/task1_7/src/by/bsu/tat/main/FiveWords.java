package by.bsu.tat.main;

/**
 * Class line to check the number of words entered in a row.
 *
 * @author Alexey Makovski
 */

public class FiveWords extends Rule {
    /**
     * Constant that specifies the number of words to perform the rules.
     */
    private static final int WORD_SCAN = 5;

    /**
     * This method looks at the word line, there should be at least five.
     * @param s1 line with data.
     * @return if you have entered five or more words "true",
     * if less than five words that "false".
     */
    @Override
    public boolean check(String s1) {
        String a[] = s1.split(" |. |, |-| ");
        int length = a.length;
        return (length > WORD_SCAN);
    }

    /**
     * Method displays the matching rules.
     * @return String with message.
     */
    @Override
    public String getInfo() {
        return "Matches rule containing more than 5 words";
    }
}
