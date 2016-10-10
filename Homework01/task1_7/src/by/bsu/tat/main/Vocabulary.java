package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class looks at a string in the word that we have created.
 *
 * @author Alexey Makovski
 */

public class Vocabulary extends Rule {

    /**
     * It creates a list of the words.
     */
    public ArrayList<String> vocabulary;

    /**
     * Constructor initialize several words.
     */
    public Vocabulary() {
        vocabulary = new ArrayList<>();
        vocabulary.add("hello");
        vocabulary.add("privet");
        vocabulary.add("mother");
        vocabulary.add("weather");
        vocabulary.add("void");
    }

    /**
     * The method checks for the presence of a string
     * of similar words is asked.
     * @param s1 line with data.
     * @return true if the word is in line,
     * false if the word is not in line.
     */
    @Override
    public boolean check(String s1) {
        for (String word : vocabulary) {
            if (s1.contains(word)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method displays the matching rules.
     * @return String with message.
     */
    @Override
    public String getInfo() {
        return "Matches rule it contains a dictionary word";
    }
}



